
package aws.appmesh;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MeshAttributes {

    UID("Uid"),
    MESH_NAME("MeshName"),
    ARN("Arn");
    private final String value;
    private final static Map<String, MeshAttributes> CONSTANTS = new HashMap<String, MeshAttributes>();

    static {
        for (MeshAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private MeshAttributes(String value) {
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
    public static MeshAttributes fromValue(String value) {
        MeshAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
