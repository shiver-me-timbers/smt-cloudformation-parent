
package aws.cloudformation;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum WaitConditionAttributes {

    DATA("Data");
    private final String value;
    private final static Map<String, WaitConditionAttributes> CONSTANTS = new HashMap<String, WaitConditionAttributes>();

    static {
        for (WaitConditionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private WaitConditionAttributes(String value) {
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
    public static WaitConditionAttributes fromValue(String value) {
        WaitConditionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
