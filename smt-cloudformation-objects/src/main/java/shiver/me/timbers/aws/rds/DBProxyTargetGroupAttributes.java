
package shiver.me.timbers.aws.rds;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DBProxyTargetGroupAttributes {

    TARGET_GROUP_ARN("TargetGroupArn"),
    TARGET_GROUP_NAME("TargetGroupName");
    private final String value;
    private final static Map<String, DBProxyTargetGroupAttributes> CONSTANTS = new HashMap<String, DBProxyTargetGroupAttributes>();

    static {
        for (DBProxyTargetGroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DBProxyTargetGroupAttributes(String value) {
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
    public static DBProxyTargetGroupAttributes fromValue(String value) {
        DBProxyTargetGroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
