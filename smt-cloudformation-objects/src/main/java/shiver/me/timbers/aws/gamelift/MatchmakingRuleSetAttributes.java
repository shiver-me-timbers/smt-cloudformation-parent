
package shiver.me.timbers.aws.gamelift;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MatchmakingRuleSetAttributes {

    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, MatchmakingRuleSetAttributes> CONSTANTS = new HashMap<String, MatchmakingRuleSetAttributes>();

    static {
        for (MatchmakingRuleSetAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private MatchmakingRuleSetAttributes(String value) {
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
    public static MatchmakingRuleSetAttributes fromValue(String value) {
        MatchmakingRuleSetAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
