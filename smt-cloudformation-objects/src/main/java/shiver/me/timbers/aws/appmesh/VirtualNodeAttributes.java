
package shiver.me.timbers.aws.appmesh;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum VirtualNodeAttributes {

    UID("Uid"),
    MESH_NAME("MeshName"),
    ARN("Arn"),
    VIRTUAL_NODE_NAME("VirtualNodeName");
    private final String value;
    private final static Map<String, VirtualNodeAttributes> CONSTANTS = new HashMap<String, VirtualNodeAttributes>();

    static {
        for (VirtualNodeAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private VirtualNodeAttributes(String value) {
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
    public static VirtualNodeAttributes fromValue(String value) {
        VirtualNodeAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
