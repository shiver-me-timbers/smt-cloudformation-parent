
package shiver.me.timbers.aws.detective;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GraphAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, GraphAttributes> CONSTANTS = new HashMap<String, GraphAttributes>();

    static {
        for (GraphAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private GraphAttributes(String value) {
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
    public static GraphAttributes fromValue(String value) {
        GraphAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
