
package shiver.me.timbers.aws.robomaker;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RobotApplicationAttributes {

    CURRENT_REVISION_ID("CurrentRevisionId"),
    ARN("Arn");
    private final String value;
    private final static Map<String, RobotApplicationAttributes> CONSTANTS = new HashMap<String, RobotApplicationAttributes>();

    static {
        for (RobotApplicationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RobotApplicationAttributes(String value) {
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
    public static RobotApplicationAttributes fromValue(String value) {
        RobotApplicationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
