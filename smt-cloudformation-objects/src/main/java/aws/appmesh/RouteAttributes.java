
package aws.appmesh;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum RouteAttributes {

    UID("Uid"),
    MESH_NAME("MeshName"),
    VIRTUAL_ROUTER_NAME("VirtualRouterName"),
    ROUTE_NAME("RouteName"),
    ARN("Arn");
    private final String value;
    private final static Map<String, RouteAttributes> CONSTANTS = new HashMap<String, RouteAttributes>();

    static {
        for (RouteAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RouteAttributes(String value) {
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
    public static RouteAttributes fromValue(String value) {
        RouteAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
