
package shiver.me.timbers.aws.gamelift;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MatchmakingConfigurationAttributes {

    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, MatchmakingConfigurationAttributes> CONSTANTS = new HashMap<String, MatchmakingConfigurationAttributes>();

    static {
        for (MatchmakingConfigurationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private MatchmakingConfigurationAttributes(String value) {
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
    public static MatchmakingConfigurationAttributes fromValue(String value) {
        MatchmakingConfigurationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
