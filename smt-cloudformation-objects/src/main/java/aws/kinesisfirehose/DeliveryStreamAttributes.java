
package aws.kinesisfirehose;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DeliveryStreamAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, DeliveryStreamAttributes> CONSTANTS = new HashMap<String, DeliveryStreamAttributes>();

    static {
        for (DeliveryStreamAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DeliveryStreamAttributes(String value) {
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
    public static DeliveryStreamAttributes fromValue(String value) {
        DeliveryStreamAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
