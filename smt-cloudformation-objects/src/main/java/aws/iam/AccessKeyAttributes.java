
package aws.iam;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AccessKeyAttributes {

    SECRET_ACCESS_KEY("SecretAccessKey");
    private final String value;
    private final static Map<String, AccessKeyAttributes> CONSTANTS = new HashMap<String, AccessKeyAttributes>();

    static {
        for (AccessKeyAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private AccessKeyAttributes(String value) {
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
    public static AccessKeyAttributes fromValue(String value) {
        AccessKeyAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
