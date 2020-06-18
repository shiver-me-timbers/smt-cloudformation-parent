
package shiver.me.timbers.aws.synthetics;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CanaryAttributes {

    ID("Id"),
    STATE("State");
    private final String value;
    private final static Map<String, CanaryAttributes> CONSTANTS = new HashMap<String, CanaryAttributes>();

    static {
        for (CanaryAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CanaryAttributes(String value) {
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
    public static CanaryAttributes fromValue(String value) {
        CanaryAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
