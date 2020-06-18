
package shiver.me.timbers.aws.mediaconvert;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PresetAttributes {

    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, PresetAttributes> CONSTANTS = new HashMap<String, PresetAttributes>();

    static {
        for (PresetAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PresetAttributes(String value) {
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
    public static PresetAttributes fromValue(String value) {
        PresetAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
