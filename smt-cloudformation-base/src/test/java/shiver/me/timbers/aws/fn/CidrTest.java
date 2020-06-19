package shiver.me.timbers.aws.fn;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static shiver.me.timbers.aws.fn.Functions.fnCidr;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class CidrTest {

    @Test
    public void Can_create_a_cidr_function() {

        // Given
        final String ipBlock = someString();
        final String count = someString();
        final String cidrBits = someString();

        // When
        final Cidr actual = fnCidr(ipBlock, count, cidrBits);

        // Then
        assertThat(actual, hasFieldThat("values", contains(ipBlock, count, cidrBits)));
    }

    @Test
    public void Cidr_has_equality() {
        EqualsVerifier.forClass(Cidr.class).usingGetClass().withIgnoredFields("string").verify();
    }
}