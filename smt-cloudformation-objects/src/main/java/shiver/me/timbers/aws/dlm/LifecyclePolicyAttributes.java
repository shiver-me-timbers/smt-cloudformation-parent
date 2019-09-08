
package shiver.me.timbers.aws.dlm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LifecyclePolicyAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, LifecyclePolicyAttributes> CONSTANTS = new HashMap<String, LifecyclePolicyAttributes>();

    static {
        for (LifecyclePolicyAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private LifecyclePolicyAttributes(String value) {
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
    public static LifecyclePolicyAttributes fromValue(String value) {
        LifecyclePolicyAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
