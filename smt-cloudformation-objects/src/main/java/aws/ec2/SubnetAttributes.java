
package aws.ec2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SubnetAttributes {

    AVAILABILITY_ZONE("AvailabilityZone"),
    IPV_6_CIDR_BLOCKS("Ipv6CidrBlocks"),
    NETWORK_ACL_ASSOCIATION_ID("NetworkAclAssociationId"),
    VPC_ID("VpcId");
    private final String value;
    private final static Map<String, SubnetAttributes> CONSTANTS = new HashMap<String, SubnetAttributes>();

    static {
        for (SubnetAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private SubnetAttributes(String value) {
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
    public static SubnetAttributes fromValue(String value) {
        SubnetAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
