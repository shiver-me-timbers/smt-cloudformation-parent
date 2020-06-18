
package shiver.me.timbers.aws.rds;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DBProxyAttributes {

    DB_PROXY_ARN("DBProxyArn"),
    ENDPOINT("Endpoint");
    private final String value;
    private final static Map<String, DBProxyAttributes> CONSTANTS = new HashMap<String, DBProxyAttributes>();

    static {
        for (DBProxyAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DBProxyAttributes(String value) {
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
    public static DBProxyAttributes fromValue(String value) {
        DBProxyAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
