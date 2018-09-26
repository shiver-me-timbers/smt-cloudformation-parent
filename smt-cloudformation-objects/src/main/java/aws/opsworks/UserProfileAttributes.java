
package aws.opsworks;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UserProfileAttributes {

    SSH_USERNAME("SshUsername");
    private final String value;
    private final static Map<String, UserProfileAttributes> CONSTANTS = new HashMap<String, UserProfileAttributes>();

    static {
        for (UserProfileAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private UserProfileAttributes(String value) {
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
    public static UserProfileAttributes fromValue(String value) {
        UserProfileAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
