
package shiver.me.timbers.aws.athena;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum WorkGroupAttributes {

    CREATION_TIME("CreationTime");
    private final String value;
    private final static Map<String, WorkGroupAttributes> CONSTANTS = new HashMap<String, WorkGroupAttributes>();

    static {
        for (WorkGroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private WorkGroupAttributes(String value) {
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
    public static WorkGroupAttributes fromValue(String value) {
        WorkGroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
