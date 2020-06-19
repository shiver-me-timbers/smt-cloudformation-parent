package shiver.me.timbers.aws;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Before;
import org.junit.Test;

import static java.util.Collections.singletonMap;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static shiver.me.timbers.data.random.RandomIntegers.someIntegerBetween;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PrimitivePropertyTest {

    private String string;
    private PrimitiveProperty property;

    @Before
    public void setUp() {
        string = someString();
        property = new PrimitiveProperty(string);
    }

    @Test
    public void Can_to_string_a_string_property() {

        // When
        final String actual = property.toString();

        // Then
        assertThat(actual, equalTo(string));
    }

    @Test
    public void Can_get_the_length_of_a_string_property() {

        // When
        final int actual = property.length();

        // Then
        assertThat(actual, equalTo(string.length()));
    }

    @Test
    public void Can_get_a_char_of_a_string_property() {

        // Given
        final int index = someIntegerBetween(0, string.length() - 1);

        // When
        final char actual = property.charAt(index);

        // Then
        assertThat(actual, equalTo(string.charAt(index)));
    }

    @Test
    public void Can_get_a_subsequence_of_a_string_property() {

        // Given
        final int start = someIntegerBetween(0, string.length() - 1);
        final int length = string.length();

        // When
        final CharSequence actual = property.subSequence(start, length);

        // Then
        assertThat(actual, equalTo(string.subSequence(start, length)));
    }

    @Test
    public void Can_serialise_primitive_property_type_as_object() throws JsonProcessingException {

        // Given
        final String value = someString();

        // When
        final String actual = toJson(new PrimitiveProperty(someString()) {

            @JsonProperty
            private final String one = value;
        });

        // Then
        assertThat(actual, equalTo(toJson(singletonMap("one", value))));
    }

    @Test
    public void PrimitiveProperty_has_equality() {
        EqualsVerifier.forClass(PrimitiveProperty.class).usingGetClass().verify();
    }

    private static String toJson(Object object) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(object);
    }
}