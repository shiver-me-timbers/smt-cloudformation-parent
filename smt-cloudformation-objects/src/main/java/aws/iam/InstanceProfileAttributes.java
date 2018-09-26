
package aws.iam;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum InstanceProfileAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, InstanceProfileAttributes> CONSTANTS = new HashMap<String, InstanceProfileAttributes>();

    static {
        for (InstanceProfileAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private InstanceProfileAttributes(String value) {
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
    public static InstanceProfileAttributes fromValue(String value) {
        InstanceProfileAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
