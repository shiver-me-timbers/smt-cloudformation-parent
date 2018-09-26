package shiver.me.timbers.cloudformation;

import org.junit.Before;
import org.junit.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSettersExcluding;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomBooleans.someBoolean;

public class CloudformationPropertyTest {

    private CloudformationProperty property;

    @Before
    public void setUp() {
        property = new CloudformationProperty();
    }

    @Test
    public void CloudformationProperty_is_a_valid_bean() {
        assertThat(CloudformationProperty.class, hasValidGettersAndSettersExcluding("duplicatesAllowed"));
    }

    @Test
    public void Can_get_duplicates_allowed() {

        final Boolean expected = someBoolean();

        // Given
        property.setDuplicatesAllowed(expected);

        // When
        final boolean actual = property.getDuplicatesAllowed();

        // Then
        assertThat(actual, is(expected));
    }

    @Test
    public void Can_check_if_duplicates_are_allowed_because_the_value_is_null() {

        // Given
        property.setDuplicatesAllowed(null);

        // When
        final boolean actual = property.isDuplicatesAllowed();

        // Then
        assertThat(actual, is(true));
    }

    @Test
    public void Can_check_if_duplicates_are_allowed_because_the_value_is_true() {

        // Given
        property.setDuplicatesAllowed(true);

        // When
        final boolean actual = property.isDuplicatesAllowed();

        // Then
        assertThat(actual, is(true));
    }

    @Test
    public void Can_check_if_duplicates_are_not_allowed() {

        // Given
        property.setDuplicatesAllowed(false);

        // When
        final boolean actual = property.isDuplicatesAllowed();

        // Then
        assertThat(actual, is(false));
    }
}