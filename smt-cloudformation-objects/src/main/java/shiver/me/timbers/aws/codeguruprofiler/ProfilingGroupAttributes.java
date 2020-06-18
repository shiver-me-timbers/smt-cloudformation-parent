
package shiver.me.timbers.aws.codeguruprofiler;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ProfilingGroupAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, ProfilingGroupAttributes> CONSTANTS = new HashMap<String, ProfilingGroupAttributes>();

    static {
        for (ProfilingGroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ProfilingGroupAttributes(String value) {
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
    public static ProfilingGroupAttributes fromValue(String value) {
        ProfilingGroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
