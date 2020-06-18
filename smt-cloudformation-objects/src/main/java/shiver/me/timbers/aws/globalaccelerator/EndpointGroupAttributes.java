
package shiver.me.timbers.aws.globalaccelerator;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EndpointGroupAttributes {

    ENDPOINT_GROUP_ARN("EndpointGroupArn");
    private final String value;
    private final static Map<String, EndpointGroupAttributes> CONSTANTS = new HashMap<String, EndpointGroupAttributes>();

    static {
        for (EndpointGroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private EndpointGroupAttributes(String value) {
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
    public static EndpointGroupAttributes fromValue(String value) {
        EndpointGroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
