
package aws.logs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LogGroupAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, LogGroupAttributes> CONSTANTS = new HashMap<String, LogGroupAttributes>();

    static {
        for (LogGroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private LogGroupAttributes(String value) {
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
    public static LogGroupAttributes fromValue(String value) {
        LogGroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
