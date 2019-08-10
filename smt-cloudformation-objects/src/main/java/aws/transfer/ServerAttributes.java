
package aws.transfer;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ServerAttributes {

    SERVER_ID("ServerId"),
    ARN("Arn");
    private final String value;
    private final static Map<String, ServerAttributes> CONSTANTS = new HashMap<String, ServerAttributes>();

    static {
        for (ServerAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ServerAttributes(String value) {
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
    public static ServerAttributes fromValue(String value) {
        ServerAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
