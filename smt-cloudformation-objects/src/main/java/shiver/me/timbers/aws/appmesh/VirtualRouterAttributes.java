
package shiver.me.timbers.aws.appmesh;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum VirtualRouterAttributes {

    UID("Uid"),
    MESH_NAME("MeshName"),
    VIRTUAL_ROUTER_NAME("VirtualRouterName"),
    MESH_OWNER("MeshOwner"),
    RESOURCE_OWNER("ResourceOwner"),
    ARN("Arn");
    private final String value;
    private final static Map<String, VirtualRouterAttributes> CONSTANTS = new HashMap<String, VirtualRouterAttributes>();

    static {
        for (VirtualRouterAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private VirtualRouterAttributes(String value) {
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
    public static VirtualRouterAttributes fromValue(String value) {
        VirtualRouterAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
