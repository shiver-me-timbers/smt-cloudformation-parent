
package shiver.me.timbers.aws.athena;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NamedQueryAttributes {

    NAMED_QUERY_ID("NamedQueryId");
    private final String value;
    private final static Map<String, NamedQueryAttributes> CONSTANTS = new HashMap<String, NamedQueryAttributes>();

    static {
        for (NamedQueryAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private NamedQueryAttributes(String value) {
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
    public static NamedQueryAttributes fromValue(String value) {
        NamedQueryAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
