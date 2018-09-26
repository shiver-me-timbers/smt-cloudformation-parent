
package aws.ecs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ServiceAttributes {

    NAME("Name");
    private final String value;
    private final static Map<String, ServiceAttributes> CONSTANTS = new HashMap<String, ServiceAttributes>();

    static {
        for (ServiceAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ServiceAttributes(String value) {
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
    public static ServiceAttributes fromValue(String value) {
        ServiceAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
