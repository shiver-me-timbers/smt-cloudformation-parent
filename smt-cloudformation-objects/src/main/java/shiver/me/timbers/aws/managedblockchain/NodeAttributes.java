
package shiver.me.timbers.aws.managedblockchain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NodeAttributes {

    MEMBER_ID("MemberId"),
    NODE_ID("NodeId"),
    ARN("Arn"),
    NETWORK_ID("NetworkId");
    private final String value;
    private final static Map<String, NodeAttributes> CONSTANTS = new HashMap<String, NodeAttributes>();

    static {
        for (NodeAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private NodeAttributes(String value) {
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
    public static NodeAttributes fromValue(String value) {
        NodeAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
