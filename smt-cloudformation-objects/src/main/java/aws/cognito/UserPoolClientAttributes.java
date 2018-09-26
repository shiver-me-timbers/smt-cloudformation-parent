
package aws.cognito;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UserPoolClientAttributes {

    CLIENT_SECRET("ClientSecret"),
    NAME("Name");
    private final String value;
    private final static Map<String, UserPoolClientAttributes> CONSTANTS = new HashMap<String, UserPoolClientAttributes>();

    static {
        for (UserPoolClientAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private UserPoolClientAttributes(String value) {
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
    public static UserPoolClientAttributes fromValue(String value) {
        UserPoolClientAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
