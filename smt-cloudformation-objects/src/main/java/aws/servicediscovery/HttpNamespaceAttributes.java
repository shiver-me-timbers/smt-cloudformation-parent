
package aws.servicediscovery;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum HttpNamespaceAttributes {

    ID("Id"),
    ARN("Arn");
    private final String value;
    private final static Map<String, HttpNamespaceAttributes> CONSTANTS = new HashMap<String, HttpNamespaceAttributes>();

    static {
        for (HttpNamespaceAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private HttpNamespaceAttributes(String value) {
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
    public static HttpNamespaceAttributes fromValue(String value) {
        HttpNamespaceAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
