
package aws.ec2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EIPAttributes {

    ALLOCATION_ID("AllocationId");
    private final String value;
    private final static Map<String, EIPAttributes> CONSTANTS = new HashMap<String, EIPAttributes>();

    static {
        for (EIPAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private EIPAttributes(String value) {
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
    public static EIPAttributes fromValue(String value) {
        EIPAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
