
package aws.iam;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UserAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, UserAttributes> CONSTANTS = new HashMap<String, UserAttributes>();

    static {
        for (UserAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private UserAttributes(String value) {
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
    public static UserAttributes fromValue(String value) {
        UserAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
