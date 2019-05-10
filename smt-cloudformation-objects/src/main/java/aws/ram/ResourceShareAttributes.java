
package aws.ram;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum ResourceShareAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, ResourceShareAttributes> CONSTANTS = new HashMap<String, ResourceShareAttributes>();

    static {
        for (ResourceShareAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ResourceShareAttributes(String value) {
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
    public static ResourceShareAttributes fromValue(String value) {
        ResourceShareAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
