
package shiver.me.timbers.aws.eventschemas;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RegistryAttributes {

    REGISTRY_NAME("RegistryName"),
    REGISTRY_ARN("RegistryArn");
    private final String value;
    private final static Map<String, RegistryAttributes> CONSTANTS = new HashMap<String, RegistryAttributes>();

    static {
        for (RegistryAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RegistryAttributes(String value) {
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
    public static RegistryAttributes fromValue(String value) {
        RegistryAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
