
package shiver.me.timbers.aws.ec2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GatewayRouteTableAssociationAttributes {

    ASSOCIATION_ID("AssociationId");
    private final String value;
    private final static Map<String, GatewayRouteTableAssociationAttributes> CONSTANTS = new HashMap<String, GatewayRouteTableAssociationAttributes>();

    static {
        for (GatewayRouteTableAssociationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private GatewayRouteTableAssociationAttributes(String value) {
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
    public static GatewayRouteTableAssociationAttributes fromValue(String value) {
        GatewayRouteTableAssociationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
