
package aws.iam;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RoleAttributes {

    ARN("Arn"),
    ROLE_ID("RoleId");
    private final String value;
    private final static Map<String, RoleAttributes> CONSTANTS = new HashMap<String, RoleAttributes>();

    static {
        for (RoleAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RoleAttributes(String value) {
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
    public static RoleAttributes fromValue(String value) {
        RoleAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
