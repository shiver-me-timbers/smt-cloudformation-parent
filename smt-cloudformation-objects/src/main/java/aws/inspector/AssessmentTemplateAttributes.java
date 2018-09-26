
package aws.inspector;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AssessmentTemplateAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, AssessmentTemplateAttributes> CONSTANTS = new HashMap<String, AssessmentTemplateAttributes>();

    static {
        for (AssessmentTemplateAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private AssessmentTemplateAttributes(String value) {
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
    public static AssessmentTemplateAttributes fromValue(String value) {
        AssessmentTemplateAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
