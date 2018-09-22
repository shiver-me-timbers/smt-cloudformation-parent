package shiver.me.timbers.cloudformation;

import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.transformers.ClassTypeTransformer;
import shiver.me.timbers.cloudformation.transformers.DescriptionTransformer;
import shiver.me.timbers.cloudformation.transformers.JavaTypeTransformer;
import shiver.me.timbers.cloudformation.transformers.ListTransformer;
import shiver.me.timbers.cloudformation.transformers.MapTransformer;
import shiver.me.timbers.cloudformation.transformers.MetaDataTransformer;
import shiver.me.timbers.cloudformation.transformers.PrimitiveTypeTransformer;
import shiver.me.timbers.cloudformation.transformers.PropertiesTransformer;
import shiver.me.timbers.cloudformation.transformers.TypesTransformer;
import shiver.me.timbers.cloudformation.types.ClassTypeConverter;
import shiver.me.timbers.cloudformation.types.JavaTypes;
import shiver.me.timbers.cloudformation.types.PrimitiveTypeConverter;
import shiver.me.timbers.cloudformation.types.TypeNameFinder;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Map.Entry;
import static java.util.stream.Collectors.toMap;

public class CloudformationSpecTransformer {

    public static CloudformationSpecTransformer instance(
        String defaultPackageName,
        Map<String, String> typeMap,
        Map<String, CloudformationType> properties
    ) {
        final JavaTypes javaTypes = new JavaTypes(defaultPackageName);
        final FileNames fileNames = new FileNames();
        final PrimitiveTypeConverter primitiveTypeConverter = new PrimitiveTypeConverter(typeMap);
        final ClassTypeConverter classTypeConverter = new ClassTypeConverter(
            new TypeNameFinder(properties, javaTypes),
            fileNames
        );
        return new CloudformationSpecTransformer(new TypesTransformer(asList(
            new MetaDataTransformer(fileNames, javaTypes),
            new JavaTypeTransformer(javaTypes),
            new PropertiesTransformer(asList(
                new DescriptionTransformer(),
                new PrimitiveTypeTransformer(primitiveTypeConverter),
                new ClassTypeTransformer(classTypeConverter),
                new ListTransformer(primitiveTypeConverter, classTypeConverter),
                new MapTransformer()
            ))
        )));
    }

    private final TypesTransformer transformer;

    public CloudformationSpecTransformer(TypesTransformer transformer) {
        this.transformer = transformer;
    }

    public Map<String, Object> transform(CloudFormationResourceSpecification specification) {
        return Stream.of(specification.getPropertyTypes(), specification.getResourceTypes())
            .map(transformer::transform)
            .flatMap(map -> map.entrySet().stream())
            .collect(toMap(Entry::getKey, Entry::getValue));
    }
}
