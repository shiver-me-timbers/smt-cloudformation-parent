package shiver.me.timbers.aws.fn;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import java.util.Map;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.aws.fn.Functions.fnSub;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class SubTest {

    @Test
    public void Can_create_a_Sub_function() {

        // Given
        final String string = someString();

        // When
        final Sub actual = fnSub(string);

        // Then
        assertThat(actual, hasField("value", string));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_create_a_Sub_function_with_variables() {

        // Given
        final String string = someString();
        final Map<String, CharSequence> variables = mock(Map.class);

        // When
        final Sub actual = fnSub(string, variables);

        // Then
        assertThat(actual, hasField("value", asList(string, variables)));
    }

    @Test
    public void Sub_has_equality() {
        EqualsVerifier.forClass(Sub.class).usingGetClass().withIgnoredFields("string").verify();
    }
}