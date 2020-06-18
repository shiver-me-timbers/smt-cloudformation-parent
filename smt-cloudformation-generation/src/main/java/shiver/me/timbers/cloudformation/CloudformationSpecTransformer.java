package shiver.me.timbers.cloudformation;

import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.transformers.property.*;
import shiver.me.timbers.cloudformation.transformers.type.*;
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
        String basePackage,
        String defaultPackageName,
        Map<String, Map<String, Object>> typeMap,
        Map<String, PropertyType> properties
    ) {
        final JavaTypes javaTypes = new JavaTypes(basePackage, defaultPackageName);
        final FileNames fileNames = new FileNames();
        final MetaDataApplier metaDataApplier = new MetaDataApplier();
        final PrimitiveTypeConverter primitiveTypeConverter = new PrimitiveTypeConverter(typeMap);
        final ClassTypeConverter classTypeConverter = new ClassTypeConverter(
            new TypeNameFinder(properties, javaTypes),
            fileNames,
            javaTypes
        );
        return new CloudformationSpecTransformer(new TypesTransformer(asList(
            new MetaDataTransformer(fileNames, javaTypes, metaDataApplier),
            new JavaTypeTransformer(javaTypes),
            new InterfacesTransformer(javaTypes),
            new PropertiesTransformer(asList(
                new DescriptionTransformer(),
                new PrimitiveTypeTransformer(primitiveTypeConverter),
                new ClassTypeTransformer(classTypeConverter),
                new ListTransformer(primitiveTypeConverter, classTypeConverter),
                new MapTransformer(primitiveTypeConverter, classTypeConverter)
            )),
            new ResourceTransformer(fileNames, javaTypes, metaDataApplier),
            new AttributesTransformer(fileNames, javaTypes, metaDataApplier),
            new PrimitiveTypeResourceTransformer(primitiveTypeConverter)
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
