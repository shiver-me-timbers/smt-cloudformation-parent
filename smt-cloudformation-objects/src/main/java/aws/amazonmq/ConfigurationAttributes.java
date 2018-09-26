
package aws.amazonmq;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ConfigurationAttributes {

    REVISION("Revision"),
    ID("Id"),
    ARN("Arn");
    private final String value;
    private final static Map<String, ConfigurationAttributes> CONSTANTS = new HashMap<String, ConfigurationAttributes>();

    static {
        for (ConfigurationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ConfigurationAttributes(String value) {
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
    public static ConfigurationAttributes fromValue(String value) {
        ConfigurationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
