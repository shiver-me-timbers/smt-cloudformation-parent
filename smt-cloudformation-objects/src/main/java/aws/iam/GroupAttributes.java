
package aws.iam;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GroupAttributes {

    ARN("Arn");
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
