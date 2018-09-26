
package aws.sns;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TopicAttributes {

    TOPIC_NAME("TopicName");
    private final String value;
    private final static Map<String, TopicAttributes> CONSTANTS = new HashMap<String, TopicAttributes>();

    static {
        for (TopicAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TopicAttributes(String value) {
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
    public static TopicAttributes fromValue(String value) {
        TopicAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
