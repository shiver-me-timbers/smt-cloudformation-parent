package shiver.me.timbers.cloudformation.rules;

import com.sun.codemodel.JClassContainer;
import com.sun.codemodel.JType;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.Rule;

public class RuleFactory extends org.jsonschema2pojo.rules.RuleFactory {

    public RuleFactory() {
        this(new DefaultGenerationConfig(), new Jackson2Annotator(new DefaultGenerationConfig()), new SchemaStore());
    }

    public RuleFactory(GenerationConfig generationConfig, Annotator annotator, SchemaStore schemaStore) {
        super(generationConfig, annotator, schemaStore);
    }

    @Override
    public Rule<JClassContainer, JType> getSchemaRule() {
        return new CustomSchemaRule(this);
    }
}
