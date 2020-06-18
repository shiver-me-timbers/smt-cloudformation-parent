
package shiver.me.timbers.aws.pinpoint;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PushTemplateAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, PushTemplateAttributes> CONSTANTS = new HashMap<String, PushTemplateAttributes>();

    static {
        for (PushTemplateAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PushTemplateAttributes(String value) {
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
    public static PushTemplateAttributes fromValue(String value) {
        PushTemplateAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
