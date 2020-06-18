
package shiver.me.timbers.aws.cloudwatch;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum InsightRuleAttributes {

    ARN("Arn"),
    RULE_NAME("RuleName");
    private final String value;
    private final static Map<String, InsightRuleAttributes> CONSTANTS = new HashMap<String, InsightRuleAttributes>();

    static {
        for (InsightRuleAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private InsightRuleAttributes(String value) {
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
    public static InsightRuleAttributes fromValue(String value) {
        InsightRuleAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
