
package aws.iot;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PolicyAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, PolicyAttributes> CONSTANTS = new HashMap<String, PolicyAttributes>();

    static {
        for (PolicyAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PolicyAttributes(String value) {
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
    public static PolicyAttributes fromValue(String value) {
        PolicyAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
