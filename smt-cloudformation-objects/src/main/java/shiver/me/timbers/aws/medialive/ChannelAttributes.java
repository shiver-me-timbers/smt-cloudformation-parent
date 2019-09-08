
package shiver.me.timbers.aws.medialive;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ChannelAttributes {

    ARN("Arn"),
    INPUTS("Inputs");
    private final String value;
    private final static Map<String, ChannelAttributes> CONSTANTS = new HashMap<String, ChannelAttributes>();

    static {
        for (ChannelAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ChannelAttributes(String value) {
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
    public static ChannelAttributes fromValue(String value) {
        ChannelAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
