
package shiver.me.timbers.aws.ecs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TaskSetAttributes {

    ID("Id");
    private final String value;
    private final static Map<String, TaskSetAttributes> CONSTANTS = new HashMap<String, TaskSetAttributes>();

    static {
        for (TaskSetAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TaskSetAttributes(String value) {
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
    public static TaskSetAttributes fromValue(String value) {
        TaskSetAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
