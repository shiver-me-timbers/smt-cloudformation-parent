
package aws.ec2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum VPCAttributes {

    CIDR_BLOCK("CidrBlock"),
    CIDR_BLOCK_ASSOCIATIONS("CidrBlockAssociations"),
    DEFAULT_NETWORK_ACL("DefaultNetworkAcl"),
    DEFAULT_SECURITY_GROUP("DefaultSecurityGroup"),
    IPV_6_CIDR_BLOCKS("Ipv6CidrBlocks");
    private final String value;
    private final static Map<String, VPCAttributes> CONSTANTS = new HashMap<String, VPCAttributes>();

    static {
        for (VPCAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private VPCAttributes(String value) {
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
    public static VPCAttributes fromValue(String value) {
        VPCAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
