
package aws.ec2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NetworkInterfaceAttributes {

    PRIMARY_PRIVATE_IP_ADDRESS("PrimaryPrivateIpAddress"),
    SECONDARY_PRIVATE_IP_ADDRESSES("SecondaryPrivateIpAddresses");
    private final String value;
    private final static Map<String, NetworkInterfaceAttributes> CONSTANTS = new HashMap<String, NetworkInterfaceAttributes>();

    static {
        for (NetworkInterfaceAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private NetworkInterfaceAttributes(String value) {
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
    public static NetworkInterfaceAttributes fromValue(String value) {
        NetworkInterfaceAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
