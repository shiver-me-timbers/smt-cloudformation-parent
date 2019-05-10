
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum VPCEndpointAttributes {

    CREATION_TIMESTAMP("CreationTimestamp"),
    DNS_ENTRIES("DnsEntries"),
    NETWORK_INTERFACE_IDS("NetworkInterfaceIds");
    private final String value;
    private final static Map<String, VPCEndpointAttributes> CONSTANTS = new HashMap<String, VPCEndpointAttributes>();

    static {
        for (VPCEndpointAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private VPCEndpointAttributes(String value) {
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
    public static VPCEndpointAttributes fromValue(String value) {
        VPCEndpointAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
