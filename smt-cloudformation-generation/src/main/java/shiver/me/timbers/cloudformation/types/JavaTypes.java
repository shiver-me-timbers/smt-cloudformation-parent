package shiver.me.timbers.cloudformation.types;

import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

public class JavaTypes {

    private final String basePackage;
    private final String defaultPackageName;

    public JavaTypes(String basePackage, String defaultPackageName) {
        this.basePackage = basePackage;
        this.defaultPackageName = defaultPackageName;
    }

    public String extractClassName(String resourceName) {
        final String className = takeLast(resourceName, "::");
        if (className.contains(".")) {
            return className.replaceAll("\\.", "");
        }
        return className;
    }

    public String extractResourceClassName(String resourceName) {
        final String className = takeLast(resourceName, "::");
        if (className.contains(".")) {
            return className.split("\\.")[0];
        }
        return className;
    }

    public String parsePackage(String key) {
        final String resourcePackage = extractPackage(key);
        if (resourcePackage.isEmpty()) {
            return addBasePackage(defaultPackageName);
        }
        return addBasePackage(resourcePackage.replaceAll("::", ".").toLowerCase());
    }

    public String extractPackage(String key) {
        final String[] split = key.split("::");
        return IntStream.range(0, split.length - 1).mapToObj(index -> split[index]).collect(joining("::"));
    }

    private String takeLast(String string, String delimiter) {
        final String[] split = string.split(delimiter);
        return split[split.length - 1];
    }

    private String addBasePackage(String packageName) {
        return basePackage + "." + packageName;
    }
}
