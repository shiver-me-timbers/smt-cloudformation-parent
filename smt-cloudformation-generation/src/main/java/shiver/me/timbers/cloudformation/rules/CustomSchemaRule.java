package shiver.me.timbers.cloudformation.rules;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JClassContainer;
import com.sun.codemodel.JType;
import org.jsonschema2pojo.Schema;
import org.jsonschema2pojo.rules.RuleFactory;
import org.jsonschema2pojo.rules.SchemaRule;

public class CustomSchemaRule extends SchemaRule {

    private final RuleFactory ruleFactory;

    protected CustomSchemaRule(RuleFactory ruleFactory) {
        super(ruleFactory);
        this.ruleFactory = ruleFactory;
    }

    @Override
    public JType apply(String nodeName, JsonNode schemaNode, JClassContainer generatableType, Schema schema) {
        final JType type = super.apply(nodeName, schemaNode, generatableType, schema);
        final String name = type.fullName();
        if (name.startsWith("java.lang") || name.startsWith("java.util")) {
            return type;
        }
        if (schemaNode.has("javaType")) {
            return ruleFactory.getTypeRule().apply(nodeName, schemaNode, generatableType, schema);
        }
        return type;
    }
}
