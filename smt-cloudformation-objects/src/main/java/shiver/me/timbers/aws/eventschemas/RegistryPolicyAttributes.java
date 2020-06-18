
package shiver.me.timbers.aws.eventschemas;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RegistryPolicyAttributes {

    ID("Id");
    private final String value;
    private final static Map<String, RegistryPolicyAttributes> CONSTANTS = new HashMap<String, RegistryPolicyAttributes>();

    static {
        for (RegistryPolicyAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RegistryPolicyAttributes(String value) {
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
    public static RegistryPolicyAttributes fromValue(String value) {
        RegistryPolicyAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
