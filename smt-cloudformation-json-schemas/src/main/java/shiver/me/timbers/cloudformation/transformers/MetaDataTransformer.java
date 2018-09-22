package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.Map;

public class MetaDataTransformer extends AbstractTypeTransformer {

    private final FileNames fileNames;
    private final JavaTypes javaTypes;

    public MetaDataTransformer(FileNames fileNames, JavaTypes javaTypes) {
        this.fileNames = fileNames;
        this.javaTypes = javaTypes;
    }

    @Override
    protected void transform(String resourceName, CloudformationType type, Map<String, Object> schema) {
        schema.put("$schema", "http://json-schema.org/draft-07/schema#");
        schema.put("$id", fileNames.parse(resourceName));
        schema.put("title", javaTypes.extractClassName(resourceName));
        schema.put("description", type.getDocumentation());
        schema.put("type", "object");
    }
}
