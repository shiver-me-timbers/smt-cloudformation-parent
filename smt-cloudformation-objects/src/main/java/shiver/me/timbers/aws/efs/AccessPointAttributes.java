
package shiver.me.timbers.aws.efs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AccessPointAttributes {

    ACCESS_POINT_ID("AccessPointId"),
    ARN("Arn");
    private final String value;
    private final static Map<String, AccessPointAttributes> CONSTANTS = new HashMap<String, AccessPointAttributes>();

    static {
        for (AccessPointAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private AccessPointAttributes(String value) {
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
    public static AccessPointAttributes fromValue(String value) {
        AccessPointAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
