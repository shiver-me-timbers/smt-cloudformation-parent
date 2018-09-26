package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.Map;

public class MetaDataTransformer extends AbstractTypeTransformer {

    private final FileNames fileNames;
    private final JavaTypes javaTypes;
    private final MetaDataApplier metaDataApplier;

    public MetaDataTransformer(FileNames fileNames, JavaTypes javaTypes, MetaDataApplier metaDataApplier) {
        this.fileNames = fileNames;
        this.javaTypes = javaTypes;
        this.metaDataApplier = metaDataApplier;
    }

    @Override
    protected void transform(String resourceName, CloudformationType type, Map<String, Object> schema) {
        metaDataApplier.apply(
            fileNames.parse(resourceName),
            javaTypes.extractClassName(resourceName),
            type.getDocumentation(),
            schema
        );
    }
}
