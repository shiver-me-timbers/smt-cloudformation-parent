
package aws.ssm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ParameterAttributes {

    TYPE("Type"),
    VALUE("Value");
    private final String value;
    private final static Map<String, ParameterAttributes> CONSTANTS = new HashMap<String, ParameterAttributes>();

    static {
        for (ParameterAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ParameterAttributes(String value) {
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
    public static ParameterAttributes fromValue(String value) {
        ParameterAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
