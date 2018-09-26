
package aws.appsync;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ApiKeyAttributes {

    API_KEY("ApiKey"),
    ARN("Arn");
    private final String value;
    private final static Map<String, ApiKeyAttributes> CONSTANTS = new HashMap<String, ApiKeyAttributes>();

    static {
        for (ApiKeyAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ApiKeyAttributes(String value) {
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
    public static ApiKeyAttributes fromValue(String value) {
        ApiKeyAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
