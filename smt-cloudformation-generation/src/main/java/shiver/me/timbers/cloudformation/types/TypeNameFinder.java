package shiver.me.timbers.cloudformation.types;

import shiver.me.timbers.cloudformation.PropertyType;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.lang.String.format;

public class TypeNameFinder {

    private final Set<String> propertyNames;
    private final JavaTypes javaTypes;

    public TypeNameFinder(Map<String, PropertyType> properties, JavaTypes javaTypes) {
        this.propertyNames = properties.keySet();
        this.javaTypes = javaTypes;
    }

    public String find(String resourceName, String propertyType) {
        final String propertyTypeName = propertyNames.stream()
            .filter(matches(resourceName, propertyType))
            .findFirst().orElse(null);
        if (propertyTypeName == null) {
            return propertyNames.stream()
                .filter(propertyType::equals)
                .findFirst().orElseThrow(() -> new TypeException(
                    format("Could not find type for resource (%s) and property (%s),", resourceName, propertyType)
                ));
        }
        return propertyTypeName;
    }

    private Predicate<String> matches(String resourceName, String propertyType) {
        return propertyName -> propertyName.startsWith(javaTypes.extractPackage(resourceName))
            && propertyName.endsWith(propertyType);
    }
}
