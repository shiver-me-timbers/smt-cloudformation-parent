package shiver.me.timbers.cloudformation.annotator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;

public class CloudformationAnnotator extends Jackson2Annotator {

    public CloudformationAnnotator(GenerationConfig generationConfig) {
        super(generationConfig);
    }

    @Override
    public void propertyField(JFieldVar field, JDefinedClass clazz, String propertyName, JsonNode propertyNode) {
        if ("aws.Named".equals(clazz.fullName()) && "name".equalsIgnoreCase(propertyName)) {
            field.annotate(JsonIgnore.class);
            return;
        }
        super.propertyField(field, clazz, propertyName, propertyNode);
    }

    @Override
    public void propertyGetter(JMethod getter, String propertyName) {
    }

    @Override
    public void propertySetter(JMethod setter, String propertyName) {
    }
}
