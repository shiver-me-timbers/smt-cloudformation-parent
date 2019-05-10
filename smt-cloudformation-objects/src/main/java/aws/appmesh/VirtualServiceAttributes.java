
package aws.appmesh;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum VirtualServiceAttributes {

    UID("Uid"),
    MESH_NAME("MeshName"),
    VIRTUAL_SERVICE_NAME("VirtualServiceName"),
    ARN("Arn");
    private final String value;
    private final static Map<String, VirtualServiceAttributes> CONSTANTS = new HashMap<String, VirtualServiceAttributes>();

    static {
        for (VirtualServiceAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private VirtualServiceAttributes(String value) {
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
    public static VirtualServiceAttributes fromValue(String value) {
        VirtualServiceAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
