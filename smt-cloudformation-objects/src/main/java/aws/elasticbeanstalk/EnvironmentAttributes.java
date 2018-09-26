
package aws.elasticbeanstalk;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EnvironmentAttributes {

    ENDPOINT_URL("EndpointURL");
    private final String value;
    private final static Map<String, EnvironmentAttributes> CONSTANTS = new HashMap<String, EnvironmentAttributes>();

    static {
        for (EnvironmentAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private EnvironmentAttributes(String value) {
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
    public static EnvironmentAttributes fromValue(String value) {
        EnvironmentAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
