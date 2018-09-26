
package aws.logs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, DestinationAttributes> CONSTANTS = new HashMap<String, DestinationAttributes>();

    static {
        for (DestinationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DestinationAttributes(String value) {
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
    public static DestinationAttributes fromValue(String value) {
        DestinationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
