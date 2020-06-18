
package shiver.me.timbers.aws.macie;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FindingsFilterAttributes {

    ID("Id"),
    ARN("Arn"),
    FINDINGS_FILTER_LIST_ITEMS("FindingsFilterListItems");
    private final String value;
    private final static Map<String, FindingsFilterAttributes> CONSTANTS = new HashMap<String, FindingsFilterAttributes>();

    static {
        for (FindingsFilterAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private FindingsFilterAttributes(String value) {
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
    public static FindingsFilterAttributes fromValue(String value) {
        FindingsFilterAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
