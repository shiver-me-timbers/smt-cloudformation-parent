
package shiver.me.timbers.aws.ec2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LocalGatewayRouteTableVPCAssociationAttributes {

    LOCAL_GATEWAY_ID("LocalGatewayId"),
    LOCAL_GATEWAY_ROUTE_TABLE_VPC_ASSOCIATION_ID("LocalGatewayRouteTableVpcAssociationId"),
    STATE("State");
    private final String value;
    private final static Map<String, LocalGatewayRouteTableVPCAssociationAttributes> CONSTANTS = new HashMap<String, LocalGatewayRouteTableVPCAssociationAttributes>();

    static {
        for (LocalGatewayRouteTableVPCAssociationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private LocalGatewayRouteTableVPCAssociationAttributes(String value) {
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
    public static LocalGatewayRouteTableVPCAssociationAttributes fromValue(String value) {
        LocalGatewayRouteTableVPCAssociationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
