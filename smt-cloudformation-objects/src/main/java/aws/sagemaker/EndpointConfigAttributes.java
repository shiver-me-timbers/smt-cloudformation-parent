
package aws.sagemaker;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EndpointConfigAttributes {

    ENDPOINT_CONFIG_NAME("EndpointConfigName");
    private final String value;
    private final static Map<String, EndpointConfigAttributes> CONSTANTS = new HashMap<String, EndpointConfigAttributes>();

    static {
        for (EndpointConfigAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private EndpointConfigAttributes(String value) {
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
    public static EndpointConfigAttributes fromValue(String value) {
        EndpointConfigAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
