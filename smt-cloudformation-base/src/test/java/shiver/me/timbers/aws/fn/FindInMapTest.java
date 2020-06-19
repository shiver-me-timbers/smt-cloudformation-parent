package shiver.me.timbers.aws.fn;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static shiver.me.timbers.aws.fn.Functions.fnFindInMap;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class FindInMapTest {

    @Test
    public void Can_create_a_cidr_function() {

        // Given
        final String mapName = someString();
        final String topLevelKey = someString();
        final String secondLevelKey = someString();

        // When
        final FindInMap actual = fnFindInMap(mapName, topLevelKey, secondLevelKey);

        // Then
        assertThat(actual, hasFieldThat("values", contains(mapName, topLevelKey, secondLevelKey)));
    }

    @Test
    public void FindInMap_has_equality() {
        EqualsVerifier.forClass(FindInMap.class).usingGetClass().withIgnoredFields("string").verify();
    }
}