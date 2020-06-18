
package shiver.me.timbers.aws.chatbot;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SlackChannelConfigurationAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, SlackChannelConfigurationAttributes> CONSTANTS = new HashMap<String, SlackChannelConfigurationAttributes>();

    static {
        for (SlackChannelConfigurationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private SlackChannelConfigurationAttributes(String value) {
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
    public static SlackChannelConfigurationAttributes fromValue(String value) {
        SlackChannelConfigurationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
