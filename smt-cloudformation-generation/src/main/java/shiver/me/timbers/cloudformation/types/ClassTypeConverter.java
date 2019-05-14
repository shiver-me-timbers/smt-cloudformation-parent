package shiver.me.timbers.cloudformation.types;

import aws.Property;
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

    public String toJavType(String resourceName, String type) {
        final String typeName = nameFinder.find(resourceName, type);
        return toJavTypeFromTypeName(typeName, type);
    }

    public Map<String, String> toTypeMap(String resourceName, String type) {
        final Map<String, String> typeMape = new HashMap<>();
        final String typeName = nameFinder.find(resourceName, type);
        typeMape.put("$ref", fileNames.parse(typeName));
        typeMape.put("javaType", toJavTypeFromTypeName(typeName, type));
        return typeMape;
    }

    private String toJavTypeFromTypeName(String typeName, String type) {
        return format("%s<%s.%s>", Property.class.getName(), javaTypes.parsePackage(typeName), type);
    }
}
