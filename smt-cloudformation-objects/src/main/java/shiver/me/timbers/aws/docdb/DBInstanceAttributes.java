
package shiver.me.timbers.aws.docdb;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DBInstanceAttributes {

    ENDPOINT("Endpoint"),
    PORT("Port");
    private final String value;
    private final static Map<String, DBInstanceAttributes> CONSTANTS = new HashMap<String, DBInstanceAttributes>();

    static {
        for (DBInstanceAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DBInstanceAttributes(String value) {
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
    public static DBInstanceAttributes fromValue(String value) {
        DBInstanceAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
