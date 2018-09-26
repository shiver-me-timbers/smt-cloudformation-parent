
package aws.cloudwatch;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AlarmAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, AlarmAttributes> CONSTANTS = new HashMap<String, AlarmAttributes>();

    static {
        for (AlarmAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private AlarmAttributes(String value) {
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
    public static AlarmAttributes fromValue(String value) {
        AlarmAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
