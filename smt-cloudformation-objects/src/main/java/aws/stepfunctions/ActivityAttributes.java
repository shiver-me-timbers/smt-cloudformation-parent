
package aws.stepfunctions;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ActivityAttributes {

    NAME("Name");
    private final String value;
    private final static Map<String, ActivityAttributes> CONSTANTS = new HashMap<String, ActivityAttributes>();

    static {
        for (ActivityAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ActivityAttributes(String value) {
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
    public static ActivityAttributes fromValue(String value) {
        ActivityAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
