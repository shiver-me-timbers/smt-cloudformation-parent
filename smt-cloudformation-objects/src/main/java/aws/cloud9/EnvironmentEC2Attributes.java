
package aws.cloud9;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EnvironmentEC2Attributes {

    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, EnvironmentEC2Attributes> CONSTANTS = new HashMap<String, EnvironmentEC2Attributes>();

    static {
        for (EnvironmentEC2Attributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private EnvironmentEC2Attributes(String value) {
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
    public static EnvironmentEC2Attributes fromValue(String value) {
        EnvironmentEC2Attributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
