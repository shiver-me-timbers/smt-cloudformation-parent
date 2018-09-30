
package aws.servicediscovery;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PrivateDnsNamespaceAttributes {

    ID("Id"),
    ARN("Arn");
    private final String value;
    private final static Map<String, PrivateDnsNamespaceAttributes> CONSTANTS = new HashMap<String, PrivateDnsNamespaceAttributes>();

    static {
        for (PrivateDnsNamespaceAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PrivateDnsNamespaceAttributes(String value) {
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
    public static PrivateDnsNamespaceAttributes fromValue(String value) {
        PrivateDnsNamespaceAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
