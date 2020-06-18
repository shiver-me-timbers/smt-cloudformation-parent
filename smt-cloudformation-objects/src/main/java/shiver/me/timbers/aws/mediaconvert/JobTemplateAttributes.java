
package shiver.me.timbers.aws.mediaconvert;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JobTemplateAttributes {

    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, JobTemplateAttributes> CONSTANTS = new HashMap<String, JobTemplateAttributes>();

    static {
        for (JobTemplateAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private JobTemplateAttributes(String value) {
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
    public static JobTemplateAttributes fromValue(String value) {
        JobTemplateAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
