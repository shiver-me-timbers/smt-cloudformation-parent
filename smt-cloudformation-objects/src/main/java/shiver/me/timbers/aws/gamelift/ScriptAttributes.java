
package shiver.me.timbers.aws.gamelift;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ScriptAttributes {

    ID("Id"),
    ARN("Arn");
    private final String value;
    private final static Map<String, ScriptAttributes> CONSTANTS = new HashMap<String, ScriptAttributes>();

    static {
        for (ScriptAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ScriptAttributes(String value) {
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
    public static ScriptAttributes fromValue(String value) {
        ScriptAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
