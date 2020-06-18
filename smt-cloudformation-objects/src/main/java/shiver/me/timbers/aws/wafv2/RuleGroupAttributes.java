
package shiver.me.timbers.aws.wafv2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RuleGroupAttributes {

    ARN("Arn"),
    ID("Id");
    private final String value;
    private final static Map<String, RuleGroupAttributes> CONSTANTS = new HashMap<String, RuleGroupAttributes>();

    static {
        for (RuleGroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RuleGroupAttributes(String value) {
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
    public static RuleGroupAttributes fromValue(String value) {
        RuleGroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
