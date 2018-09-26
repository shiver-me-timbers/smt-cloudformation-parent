
package aws.dynamodb;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TableAttributes {

    ARN("Arn"),
    STREAM_ARN("StreamArn");
    private final String value;
    private final static Map<String, TableAttributes> CONSTANTS = new HashMap<String, TableAttributes>();

    static {
        for (TableAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TableAttributes(String value) {
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
    public static TableAttributes fromValue(String value) {
        TableAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
