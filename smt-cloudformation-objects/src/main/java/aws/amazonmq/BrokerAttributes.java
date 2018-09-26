
package aws.amazonmq;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrokerAttributes {

    BROKER_ID("BrokerId");
    private final String value;
    private final static Map<String, BrokerAttributes> CONSTANTS = new HashMap<String, BrokerAttributes>();

    static {
        for (BrokerAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private BrokerAttributes(String value) {
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
    public static BrokerAttributes fromValue(String value) {
        BrokerAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
