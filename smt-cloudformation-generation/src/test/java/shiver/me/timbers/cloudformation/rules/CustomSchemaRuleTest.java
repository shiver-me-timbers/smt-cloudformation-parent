package shiver.me.timbers.cloudformation.rules;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JClassContainer;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.JType;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Schema;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.Rule;
import org.jsonschema2pojo.rules.RuleFactory;
import org.jsonschema2pojo.rules.SchemaRule;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.data.random.RandomThings.someThing;

public class CustomSchemaRuleTest {

    private RuleFactory ruleFactory;
    private Rule<JClassContainer, JType> schemaRule;

    @Before
    public void setUp() {
        ruleFactory = mock(RuleFactory.class);
        schemaRule = new CustomSchemaRule(ruleFactory);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_have_the_java_type_take_precedence_over_a_ref() {

        final String nodeName = someString();
        final JsonNode schemaNode = mock(JsonNode.class);
        final JClassContainer generatableType = mock(JClassContainer.class);
        final Schema schema = mock(Schema.class);

        final Rule<JClassContainer, JType> rule = mock(Rule.class);
        final JPackage jPackage = mock(JPackage.class);
        final JType refType = mock(JType.class);

        final JType expected = mock(JType.class);

        // Given
        given(schemaNode.has("javaType")).willReturn(true);
        given(ruleFactory.getTypeRule()).willReturn(rule);
        given(generatableType.getPackage()).willReturn(jPackage);
        given(rule.apply(nodeName, schemaNode, jPackage, schema)).willReturn(refType);
        given(rule.apply(nodeName, schemaNode, generatableType, schema)).willReturn(expected);
        given(refType.fullName()).willReturn(someString());

        // When
        final JType actual = schemaRule.apply(nodeName, schemaNode, generatableType, schema);

        // Then
        assertThat(actual, is(expected));
    }

    @Test
    public void Can_still_handle_refs() {

        final RuleFactory ruleFactory = mock(RuleFactory.class);
        final String nodeName = someString();
        final JsonNode schemaNode = mock(JsonNode.class);
        final JClassContainer generatableType = mock(JClassContainer.class);
        final Schema schema = mock(Schema.class);

        final JsonNode refNode = mock(JsonNode.class);
        final String refText = someString();
        final SchemaStore schemaStore = mock(SchemaStore.class);
        final GenerationConfig config = mock(GenerationConfig.class);
        final String refDelimiters = someString();
        final Schema childSchema = mock(Schema.class);

        final JType expected = mock(JType.class);

        // Given
        given(schemaNode.has("javaType")).willReturn(false);
        given(schemaNode.has("$ref")).willReturn(true);
        given(schemaNode.get("$ref")).willReturn(refNode);
        given(refNode.asText()).willReturn(refText);
        given(ruleFactory.getSchemaStore()).willReturn(schemaStore);
        given(ruleFactory.getGenerationConfig()).willReturn(config);
        given(config.getRefFragmentPathDelimiters()).willReturn(refDelimiters);
        given(schemaStore.create(schema, refText, refDelimiters)).willReturn(childSchema);
        given(childSchema.isGenerated()).willReturn(true);
        given(childSchema.getJavaType()).willReturn(expected);
        given(expected.fullName()).willReturn(someString());

        // When
        final JType actual = new CustomSchemaRule(ruleFactory).apply(nodeName, schemaNode, generatableType, schema);

        // Then
        assertThat(actual, is(expected));
    }

    @Test
    public void Will_use_refs_for_java_base_types() {

        final RuleFactory ruleFactory = mock(RuleFactory.class);
        final String nodeName = someString();
        final JsonNode schemaNode = mock(JsonNode.class);
        final JClassContainer generatableType = mock(JClassContainer.class);
        final Schema schema = mock(Schema.class);

        final JsonNode refNode = mock(JsonNode.class);
        final String refText = someString();
        final SchemaStore schemaStore = mock(SchemaStore.class);
        final GenerationConfig config = mock(GenerationConfig.class);
        final String refDelimiters = someString();
        final Schema childSchema = mock(Schema.class);

        final JType expected = mock(JType.class);

        // Given
        given(schemaNode.has("javaType")).willReturn(true);
        given(schemaNode.has("$ref")).willReturn(true);
        given(schemaNode.get("$ref")).willReturn(refNode);
        given(refNode.asText()).willReturn(refText);
        given(ruleFactory.getSchemaStore()).willReturn(schemaStore);
        given(ruleFactory.getGenerationConfig()).willReturn(config);
        given(config.getRefFragmentPathDelimiters()).willReturn(refDelimiters);
        given(schemaStore.create(schema, refText, refDelimiters)).willReturn(childSchema);
        given(childSchema.isGenerated()).willReturn(true);
        given(childSchema.getJavaType()).willReturn(expected);
        given(expected.fullName()).willReturn(someThing(
            String.class.getName(),
            Number.class.getName(),
            Integer.class.getName(),
            Float.class.getName(),
            Boolean.class.getName()
        ));

        // When
        final JType actual = new CustomSchemaRule(ruleFactory).apply(nodeName, schemaNode, generatableType, schema);

        // Then
        assertThat(actual, is(expected));
    }

    @Test
    public void Will_use_refs_for_java_collection_types() {

        final RuleFactory ruleFactory = mock(RuleFactory.class);
        final String nodeName = someString();
        final JsonNode schemaNode = mock(JsonNode.class);
        final JClassContainer generatableType = mock(JClassContainer.class);
        final Schema schema = mock(Schema.class);

        final JsonNode refNode = mock(JsonNode.class);
        final String refText = someString();
        final SchemaStore schemaStore = mock(SchemaStore.class);
        final GenerationConfig config = mock(GenerationConfig.class);
        final String refDelimiters = someString();
        final Schema childSchema = mock(Schema.class);

        final JType expected = mock(JType.class);

        // Given
        given(schemaNode.has("javaType")).willReturn(true);
        given(schemaNode.has("$ref")).willReturn(true);
        given(schemaNode.get("$ref")).willReturn(refNode);
        given(refNode.asText()).willReturn(refText);
        given(ruleFactory.getSchemaStore()).willReturn(schemaStore);
        given(ruleFactory.getGenerationConfig()).willReturn(config);
        given(config.getRefFragmentPathDelimiters()).willReturn(refDelimiters);
        given(schemaStore.create(schema, refText, refDelimiters)).willReturn(childSchema);
        given(childSchema.isGenerated()).willReturn(true);
        given(childSchema.getJavaType()).willReturn(expected);
        given(expected.fullName()).willReturn(someThing(
            Collection.class.getName(),
            List.class.getName(),
            Set.class.getName(),
            Map.class.getName()
        ));

        // When
        final JType actual = new CustomSchemaRule(ruleFactory).apply(nodeName, schemaNode, generatableType, schema);

        // Then
        assertThat(actual, is(expected));
    }
}