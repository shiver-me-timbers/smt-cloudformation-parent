
package aws;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DeletionPolicy {

    DELETE("Delete"),
    RETAIN("Retain"),
    SNAPSHOT("Snapshot");
    private final String value;
    private final static Map<String, DeletionPolicy> CONSTANTS = new HashMap<String, DeletionPolicy>();

    static {
        for (DeletionPolicy c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DeletionPolicy(String value) {
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
    public static DeletionPolicy fromValue(String value) {
        DeletionPolicy constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
