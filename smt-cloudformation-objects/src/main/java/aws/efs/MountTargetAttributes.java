
package aws.efs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MountTargetAttributes {

    IP_ADDRESS("IpAddress");
    private final String value;
    private final static Map<String, MountTargetAttributes> CONSTANTS = new HashMap<String, MountTargetAttributes>();

    static {
        for (MountTargetAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private MountTargetAttributes(String value) {
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
    public static MountTargetAttributes fromValue(String value) {
        MountTargetAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
