
package aws.servicediscovery;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PublicDnsNamespaceAttributes {

    ID("Id"),
    ARN("Arn");
    private final String value;
    private final static Map<String, PublicDnsNamespaceAttributes> CONSTANTS = new HashMap<String, PublicDnsNamespaceAttributes>();

    static {
        for (PublicDnsNamespaceAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PublicDnsNamespaceAttributes(String value) {
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
    public static PublicDnsNamespaceAttributes fromValue(String value) {
        PublicDnsNamespaceAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
