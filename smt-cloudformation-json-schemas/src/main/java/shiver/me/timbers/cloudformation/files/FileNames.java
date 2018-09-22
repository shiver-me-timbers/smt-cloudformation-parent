package shiver.me.timbers.cloudformation.files;

public class FileNames {

    public static FileNames instance() {
        return new FileNames();
    }

    public String parse(String resourceName) {
        return resourceName.replaceAll("::", "_") + ".schema.json";
    }
}
