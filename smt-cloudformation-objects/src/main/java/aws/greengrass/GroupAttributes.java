
package aws.greengrass;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GroupAttributes {

    ROLE_ATTACHED_AT("RoleAttachedAt"),
    LATEST_VERSION_ARN("LatestVersionArn"),
    ID("Id"),
    ARN("Arn"),
    ROLE_ARN("RoleArn"),
    NAME("Name");
    private final String value;
    private final static Map<String, GroupAttributes> CONSTANTS = new HashMap<String, GroupAttributes>();

    static {
        for (GroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private GroupAttributes(String value) {
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
    public static GroupAttributes fromValue(String value) {
        GroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
