
package aws.ec2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SubnetNetworkAclAssociationAttributes {

    ASSOCIATION_ID("AssociationId");
    private final String value;
    private final static Map<String, SubnetNetworkAclAssociationAttributes> CONSTANTS = new HashMap<String, SubnetNetworkAclAssociationAttributes>();

    static {
        for (SubnetNetworkAclAssociationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private SubnetNetworkAclAssociationAttributes(String value) {
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
    public static SubnetNetworkAclAssociationAttributes fromValue(String value) {
        SubnetNetworkAclAssociationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
