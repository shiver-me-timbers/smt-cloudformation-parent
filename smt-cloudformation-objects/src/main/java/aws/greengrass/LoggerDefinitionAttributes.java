
package aws.greengrass;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LoggerDefinitionAttributes {

    LATEST_VERSION_ARN("LatestVersionArn"),
    ID("Id"),
    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, LoggerDefinitionAttributes> CONSTANTS = new HashMap<String, LoggerDefinitionAttributes>();

    static {
        for (LoggerDefinitionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private LoggerDefinitionAttributes(String value) {
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
    public static LoggerDefinitionAttributes fromValue(String value) {
        LoggerDefinitionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
