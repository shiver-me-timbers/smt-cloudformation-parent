
package aws.sqs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum QueueAttributes {

    ARN("Arn"),
    QUEUE_NAME("QueueName");
    private final String value;
    private final static Map<String, QueueAttributes> CONSTANTS = new HashMap<String, QueueAttributes>();

    static {
        for (QueueAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private QueueAttributes(String value) {
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
    public static QueueAttributes fromValue(String value) {
        QueueAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
