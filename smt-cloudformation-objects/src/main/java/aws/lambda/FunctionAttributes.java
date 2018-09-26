
package aws.lambda;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FunctionAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, FunctionAttributes> CONSTANTS = new HashMap<String, FunctionAttributes>();

    static {
        for (FunctionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private FunctionAttributes(String value) {
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
    public static FunctionAttributes fromValue(String value) {
        FunctionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
