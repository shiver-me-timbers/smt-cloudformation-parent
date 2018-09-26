
package aws.kinesis;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StreamAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, StreamAttributes> CONSTANTS = new HashMap<String, StreamAttributes>();

    static {
        for (StreamAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private StreamAttributes(String value) {
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
    public static StreamAttributes fromValue(String value) {
        StreamAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
