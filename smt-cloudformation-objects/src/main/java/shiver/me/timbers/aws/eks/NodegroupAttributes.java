
package shiver.me.timbers.aws.eks;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NodegroupAttributes {

    NODEGROUP_NAME("NodegroupName"),
    CLUSTER_NAME("ClusterName"),
    ARN("Arn");
    private final String value;
    private final static Map<String, NodegroupAttributes> CONSTANTS = new HashMap<String, NodegroupAttributes>();

    static {
        for (NodegroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private NodegroupAttributes(String value) {
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
    public static NodegroupAttributes fromValue(String value) {
        NodegroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
