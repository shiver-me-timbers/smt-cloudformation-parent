
package shiver.me.timbers.aws.pinpoint;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EmailTemplateAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, EmailTemplateAttributes> CONSTANTS = new HashMap<String, EmailTemplateAttributes>();

    static {
        for (EmailTemplateAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private EmailTemplateAttributes(String value) {
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
    public static EmailTemplateAttributes fromValue(String value) {
        EmailTemplateAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
