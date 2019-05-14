package shiver.me.timbers.cloudformation.rules;

import com.sun.codemodel.JClassContainer;
import com.sun.codemodel.JType;
import org.jsonschema2pojo.Annotator;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.Rule;
import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class RuleFactoryTest {

    @Test
    public void Instantiation_for_coverage() {
        new RuleFactory();
    }

    @Test
    public void Can_get_the_custom_schema_rule() {

        // Given
        final RuleFactory ruleFactory = new RuleFactory(
            mock(GenerationConfig.class),
            mock(Annotator.class),
            mock(SchemaStore.class)
        );

        // When
        final Rule<JClassContainer, JType> actual = ruleFactory.getSchemaRule();

        // Then
        assertThat(actual, instanceOf(CustomSchemaRule.class));
        assertThat(actual, hasField("ruleFactory", ruleFactory));
    }
}