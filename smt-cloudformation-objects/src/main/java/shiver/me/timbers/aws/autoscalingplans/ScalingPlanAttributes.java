
package shiver.me.timbers.aws.autoscalingplans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ScalingPlanAttributes {

    SCALING_PLAN_NAME("ScalingPlanName"),
    SCALING_PLAN_VERSION("ScalingPlanVersion");
    private final String value;
    private final static Map<String, ScalingPlanAttributes> CONSTANTS = new HashMap<String, ScalingPlanAttributes>();

    static {
        for (ScalingPlanAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ScalingPlanAttributes(String value) {
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
    public static ScalingPlanAttributes fromValue(String value) {
        ScalingPlanAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
