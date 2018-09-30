
package aws.neptune;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DBClusterAttributes {

    CLUSTER_RESOURCE_ID("ClusterResourceId"),
    ENDPOINT("Endpoint"),
    PORT("Port"),
    READ_ENDPOINT("ReadEndpoint");
    private final String value;
    private final static Map<String, DBClusterAttributes> CONSTANTS = new HashMap<String, DBClusterAttributes>();

    static {
        for (DBClusterAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DBClusterAttributes(String value) {
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
    public static DBClusterAttributes fromValue(String value) {
        DBClusterAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
