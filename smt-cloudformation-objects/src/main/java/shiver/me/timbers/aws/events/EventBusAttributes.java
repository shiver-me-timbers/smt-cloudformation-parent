
package shiver.me.timbers.aws.events;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EventBusAttributes {

    POLICY("Policy"),
    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, EventBusAttributes> CONSTANTS = new HashMap<String, EventBusAttributes>();

    static {
        for (EventBusAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private EventBusAttributes(String value) {
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
    public static EventBusAttributes fromValue(String value) {
        EventBusAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
