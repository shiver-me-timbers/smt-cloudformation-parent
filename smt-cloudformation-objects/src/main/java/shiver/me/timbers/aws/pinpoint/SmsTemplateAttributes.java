
package shiver.me.timbers.aws.pinpoint;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SmsTemplateAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, SmsTemplateAttributes> CONSTANTS = new HashMap<String, SmsTemplateAttributes>();

    static {
        for (SmsTemplateAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private SmsTemplateAttributes(String value) {
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
    public static SmsTemplateAttributes fromValue(String value) {
        SmsTemplateAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
