
package aws.kinesis;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum StreamConsumerAttributes {

    CONSUMER_CREATION_TIMESTAMP("ConsumerCreationTimestamp"),
    CONSUMER_NAME("ConsumerName"),
    CONSUMER_ARN("ConsumerARN"),
    CONSUMER_STATUS("ConsumerStatus"),
    STREAM_ARN("StreamARN");
    private final String value;
    private final static Map<String, StreamConsumerAttributes> CONSTANTS = new HashMap<String, StreamConsumerAttributes>();

    static {
        for (StreamConsumerAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private StreamConsumerAttributes(String value) {
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
    public static StreamConsumerAttributes fromValue(String value) {
        StreamConsumerAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
