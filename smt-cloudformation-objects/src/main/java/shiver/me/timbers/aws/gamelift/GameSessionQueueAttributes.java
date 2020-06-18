
package shiver.me.timbers.aws.gamelift;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GameSessionQueueAttributes {

    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, GameSessionQueueAttributes> CONSTANTS = new HashMap<String, GameSessionQueueAttributes>();

    static {
        for (GameSessionQueueAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private GameSessionQueueAttributes(String value) {
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
    public static GameSessionQueueAttributes fromValue(String value) {
        GameSessionQueueAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
