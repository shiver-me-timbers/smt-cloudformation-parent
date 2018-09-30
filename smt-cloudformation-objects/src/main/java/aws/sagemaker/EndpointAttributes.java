
package aws.sagemaker;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EndpointAttributes {

    ENDPOINT_NAME("EndpointName");
    private final String value;
    private final static Map<String, EndpointAttributes> CONSTANTS = new HashMap<String, EndpointAttributes>();

    static {
        for (EndpointAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private EndpointAttributes(String value) {
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
    public static EndpointAttributes fromValue(String value) {
        EndpointAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
