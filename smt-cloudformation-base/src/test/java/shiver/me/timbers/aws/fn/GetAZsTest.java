package shiver.me.timbers.aws.fn;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static shiver.me.timbers.aws.fn.Functions.fnGetAZs;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class GetAZsTest {

    @Test
    public void Can_create_a_GetAZs_function() {

        // Given
        final String region = someString();

        // When
        final GetAZs actual = fnGetAZs(region);

        // Then
        assertThat(actual, hasField("region", region));
    }

    @Test
    public void GetAZs_has_equality() {
        EqualsVerifier.forClass(GetAZs.class).usingGetClass().withIgnoredFields("string").verify();
    }
}