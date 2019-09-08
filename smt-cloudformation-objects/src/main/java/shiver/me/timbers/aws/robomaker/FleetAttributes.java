
package shiver.me.timbers.aws.robomaker;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FleetAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, FleetAttributes> CONSTANTS = new HashMap<String, FleetAttributes>();

    static {
        for (FleetAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private FleetAttributes(String value) {
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
    public static FleetAttributes fromValue(String value) {
        FleetAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
