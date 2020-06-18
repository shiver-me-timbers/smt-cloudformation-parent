
package shiver.me.timbers.aws.cloudwatch;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CompositeAlarmAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, CompositeAlarmAttributes> CONSTANTS = new HashMap<String, CompositeAlarmAttributes>();

    static {
        for (CompositeAlarmAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CompositeAlarmAttributes(String value) {
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
    public static CompositeAlarmAttributes fromValue(String value) {
        CompositeAlarmAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
