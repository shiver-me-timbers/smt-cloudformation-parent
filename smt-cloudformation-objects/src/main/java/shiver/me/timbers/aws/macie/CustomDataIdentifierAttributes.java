
package shiver.me.timbers.aws.macie;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CustomDataIdentifierAttributes {

    ID("Id"),
    ARN("Arn"),
    CREATED_AT("CreatedAt"),
    DELETED("Deleted");
    private final String value;
    private final static Map<String, CustomDataIdentifierAttributes> CONSTANTS = new HashMap<String, CustomDataIdentifierAttributes>();

    static {
        for (CustomDataIdentifierAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CustomDataIdentifierAttributes(String value) {
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
    public static CustomDataIdentifierAttributes fromValue(String value) {
        CustomDataIdentifierAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
