
package shiver.me.timbers.aws.medialive;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum InputAttributes {

    DESTINATIONS("Destinations"),
    ARN("Arn"),
    SOURCES("Sources");
    private final String value;
    private final static Map<String, InputAttributes> CONSTANTS = new HashMap<String, InputAttributes>();

    static {
        for (InputAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private InputAttributes(String value) {
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
    public static InputAttributes fromValue(String value) {
        InputAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
