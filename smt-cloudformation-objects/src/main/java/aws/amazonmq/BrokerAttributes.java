
package aws.amazonmq;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrokerAttributes {

    IP_ADDRESSES("IpAddresses"),
    OPEN_WIRE_ENDPOINTS("OpenWireEndpoints"),
    CONFIGURATION_REVISION("ConfigurationRevision"),
    STOMP_ENDPOINTS("StompEndpoints"),
    MQTT_ENDPOINTS("MqttEndpoints"),
    AMQP_ENDPOINTS("AmqpEndpoints"),
    ARN("Arn"),
    CONFIGURATION_ID("ConfigurationId"),
    WSS_ENDPOINTS("WssEndpoints");
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
