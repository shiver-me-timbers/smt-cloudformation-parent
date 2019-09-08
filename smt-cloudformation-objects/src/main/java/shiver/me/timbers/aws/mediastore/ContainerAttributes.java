
package shiver.me.timbers.aws.mediastore;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ContainerAttributes {

    ENDPOINT("Endpoint");
    private final String value;
    private final static Map<String, ContainerAttributes> CONSTANTS = new HashMap<String, ContainerAttributes>();

    static {
        for (ContainerAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ContainerAttributes(String value) {
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
    public static ContainerAttributes fromValue(String value) {
        ContainerAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
