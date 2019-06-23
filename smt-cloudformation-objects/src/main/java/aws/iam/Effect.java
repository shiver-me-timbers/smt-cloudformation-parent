
package aws.iam;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Effect {

    ALLOW("Allow"),
    DENY("Deny");
    private final String value;
    private final static Map<String, Effect> CONSTANTS = new HashMap<String, Effect>();

    static {
        for (Effect c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private Effect(String value) {
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
    public static Effect fromValue(String value) {
        Effect constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
