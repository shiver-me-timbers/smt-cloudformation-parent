
package aws.iot;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TopicRuleAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, TopicRuleAttributes> CONSTANTS = new HashMap<String, TopicRuleAttributes>();

    static {
        for (TopicRuleAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TopicRuleAttributes(String value) {
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
    public static TopicRuleAttributes fromValue(String value) {
        TopicRuleAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
