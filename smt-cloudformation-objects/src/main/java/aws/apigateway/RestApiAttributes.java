
package aws.apigateway;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RestApiAttributes {

    ROOT_RESOURCE_ID("RootResourceId");
    private final String value;
    private final static Map<String, RestApiAttributes> CONSTANTS = new HashMap<String, RestApiAttributes>();

    static {
        for (RestApiAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RestApiAttributes(String value) {
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
    public static RestApiAttributes fromValue(String value) {
        RestApiAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
