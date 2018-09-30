
package aws.stepfunctions;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StateMachineAttributes {

    NAME("Name");
    private final String value;
    private final static Map<String, StateMachineAttributes> CONSTANTS = new HashMap<String, StateMachineAttributes>();

    static {
        for (StateMachineAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private StateMachineAttributes(String value) {
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
    public static StateMachineAttributes fromValue(String value) {
        StateMachineAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
