
package shiver.me.timbers.aws.ec2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LocalGatewayRouteAttributes {

    STATE("State"),
    TYPE("Type");
    private final String value;
    private final static Map<String, LocalGatewayRouteAttributes> CONSTANTS = new HashMap<String, LocalGatewayRouteAttributes>();

    static {
        for (LocalGatewayRouteAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private LocalGatewayRouteAttributes(String value) {
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
    public static LocalGatewayRouteAttributes fromValue(String value) {
        LocalGatewayRouteAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
