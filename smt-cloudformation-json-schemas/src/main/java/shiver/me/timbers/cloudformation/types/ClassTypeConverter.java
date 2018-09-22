package shiver.me.timbers.cloudformation.types;

import shiver.me.timbers.cloudformation.files.FileNames;

public class ClassTypeConverter {

    private final TypeNameFinder nameFinder;
    private final FileNames fileNames;

    public ClassTypeConverter(TypeNameFinder nameFinder, FileNames fileNames) {
        this.nameFinder = nameFinder;
        this.fileNames = fileNames;
    }

    public String convert(String resourceName, String propertyType) {
        return fileNames.parse(nameFinder.find(resourceName, propertyType));
    }
}
