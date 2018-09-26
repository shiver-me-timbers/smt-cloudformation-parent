
package aws.cognito;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UserPoolAttributes {

    PROVIDER_NAME("ProviderName"),
    PROVIDER_URL("ProviderURL"),
    ARN("Arn");
    private final String value;
    private final static Map<String, UserPoolAttributes> CONSTANTS = new HashMap<String, UserPoolAttributes>();

    static {
        for (UserPoolAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private UserPoolAttributes(String value) {
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
    public static UserPoolAttributes fromValue(String value) {
        UserPoolAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
