package shiver.me.timbers.cloudformation.files;

import java.io.InputStream;

public class Resources {

    public static InputStream toInputStream(String path) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
    }
}
