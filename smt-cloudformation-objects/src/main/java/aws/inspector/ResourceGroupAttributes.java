
package aws.inspector;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ResourceGroupAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, ResourceGroupAttributes> CONSTANTS = new HashMap<String, ResourceGroupAttributes>();

    static {
        for (ResourceGroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ResourceGroupAttributes(String value) {
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
    public static ResourceGroupAttributes fromValue(String value) {
        ResourceGroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
