
package aws.elasticloadbalancingv2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TargetGroupAttributes {

    LOAD_BALANCER_ARNS("LoadBalancerArns"),
    TARGET_GROUP_FULL_NAME("TargetGroupFullName"),
    TARGET_GROUP_NAME("TargetGroupName");
    private final String value;
    private final static Map<String, TargetGroupAttributes> CONSTANTS = new HashMap<String, TargetGroupAttributes>();

    static {
        for (TargetGroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TargetGroupAttributes(String value) {
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
    public static TargetGroupAttributes fromValue(String value) {
        TargetGroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
