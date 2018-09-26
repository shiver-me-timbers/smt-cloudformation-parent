
package aws.cloudtrail;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TrailAttributes {

    ARN("Arn"),
    SNS_TOPIC_ARN("SnsTopicArn");
    private final String value;
    private final static Map<String, TrailAttributes> CONSTANTS = new HashMap<String, TrailAttributes>();

    static {
        for (TrailAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TrailAttributes(String value) {
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
    public static TrailAttributes fromValue(String value) {
        TrailAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
