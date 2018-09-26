
package aws.events;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RuleAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, RuleAttributes> CONSTANTS = new HashMap<String, RuleAttributes>();

    static {
        for (RuleAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RuleAttributes(String value) {
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
    public static RuleAttributes fromValue(String value) {
        RuleAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
