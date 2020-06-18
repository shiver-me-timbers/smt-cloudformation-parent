package shiver.me.timbers.cloudformation.types;

import shiver.me.timbers.aws.Property;
import shiver.me.timbers.cloudformation.files.FileNames;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class ClassTypeConverter {

    private final TypeNameFinder nameFinder;
    private final FileNames fileNames;
    private final JavaTypes javaTypes;

    public ClassTypeConverter(TypeNameFinder nameFinder, FileNames fileNames, JavaTypes javaTypes) {
        this.nameFinder = nameFinder;
        this.fileNames = fileNames;
        this.javaTypes = javaTypes;
    }

    public String toJavaType(String resourceName, String type) {
        final String typeName = nameFinder.find(resourceName, type);
        return toJavaTypeFromTypeName(typeName, resourceName, type);
    }

    public Map<String, String> toTypeMap(String resourceName, String type) {
        final Map<String, String> typeMape = new HashMap<>();
        final String typeName = nameFinder.find(resourceName, type);
        typeMape.put("$ref", fileNames.parse(typeName));
        typeMape.put("javaType", toJavaTypeFromTypeName(typeName, resourceName, type));
        return typeMape;
    }

    private String toJavaTypeFromTypeName(String typeName, String resourceName, String type) {
        return format(
            "%s<%s.%s>",
            Property.class.getName(),
            javaTypes.parsePackage(typeName),
            "Tag".equals(type) ? type : javaTypes.extractResourceClassName(resourceName) + type
        );
    }
}
