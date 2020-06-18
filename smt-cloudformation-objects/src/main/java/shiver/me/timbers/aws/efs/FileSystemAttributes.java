
package shiver.me.timbers.aws.efs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FileSystemAttributes {

    FILE_SYSTEM_ID("FileSystemId");
    private final String value;
    private final static Map<String, FileSystemAttributes> CONSTANTS = new HashMap<String, FileSystemAttributes>();

    static {
        for (FileSystemAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private FileSystemAttributes(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static FileSystemAttributes fromValue(String value) {
        FileSystemAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
