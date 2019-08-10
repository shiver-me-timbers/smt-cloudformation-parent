
package aws.medialive;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum InputSecurityGroupAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, InputSecurityGroupAttributes> CONSTANTS = new HashMap<String, InputSecurityGroupAttributes>();

    static {
        for (InputSecurityGroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private InputSecurityGroupAttributes(String value) {
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
    public static InputSecurityGroupAttributes fromValue(String value) {
        InputSecurityGroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
