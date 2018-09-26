
package aws.config;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ConfigRuleAttributes {

    ARN("Arn"),
    COMPLIANCE_TYPE("Compliance.Type"),
    CONFIG_RULE_ID("ConfigRuleId");
    private final String value;
    private final static Map<String, ConfigRuleAttributes> CONSTANTS = new HashMap<String, ConfigRuleAttributes>();

    static {
        for (ConfigRuleAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ConfigRuleAttributes(String value) {
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
    public static ConfigRuleAttributes fromValue(String value) {
        ConfigRuleAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
