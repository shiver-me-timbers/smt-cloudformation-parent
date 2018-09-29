package aws.fn;

import aws.HasAttributes;
import aws.HasName;
import org.junit.Test;

import static aws.fn.Functions.fnGetAtt;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomEnums.someEnum;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class GetAttTest {

    @Test
    public void Can_create_a_GetAtt() {

        // Given
        final String name = someString();
        final TestAttributes attribute = someEnum(TestAttributes.class);

        // When
        final GetAtt actual = fnGetAtt(new TestResource(name), attribute);

        // Then
        assertThat(actual, hasFieldThat("values", contains(name, attribute)));
    }

    private static class TestResource implements HasAttributes<TestAttributes>, HasName {

        private final String name;

        private TestResource(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    private static enum TestAttributes {
        ONE,
        Two,
        THREE
    }
}