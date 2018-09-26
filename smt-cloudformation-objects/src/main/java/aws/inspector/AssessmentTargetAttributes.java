
package aws.inspector;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AssessmentTargetAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, AssessmentTargetAttributes> CONSTANTS = new HashMap<String, AssessmentTargetAttributes>();

    static {
        for (AssessmentTargetAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private AssessmentTargetAttributes(String value) {
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
    public static AssessmentTargetAttributes fromValue(String value) {
        AssessmentTargetAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
