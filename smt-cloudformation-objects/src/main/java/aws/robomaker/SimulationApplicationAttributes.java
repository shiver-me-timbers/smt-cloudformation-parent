
package aws.robomaker;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum SimulationApplicationAttributes {

    CURRENT_REVISION_ID("CurrentRevisionId"),
    ARN("Arn");
    private final String value;
    private final static Map<String, SimulationApplicationAttributes> CONSTANTS = new HashMap<String, SimulationApplicationAttributes>();

    static {
        for (SimulationApplicationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private SimulationApplicationAttributes(String value) {
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
    public static SimulationApplicationAttributes fromValue(String value) {
        SimulationApplicationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
