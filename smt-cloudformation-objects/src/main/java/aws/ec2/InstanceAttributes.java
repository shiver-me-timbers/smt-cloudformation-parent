
package aws.ec2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum InstanceAttributes {

    AVAILABILITY_ZONE("AvailabilityZone"),
    PRIVATE_DNS_NAME("PrivateDnsName"),
    PRIVATE_IP("PrivateIp"),
    PUBLIC_DNS_NAME("PublicDnsName"),
    PUBLIC_IP("PublicIp");
    private final String value;
    private final static Map<String, InstanceAttributes> CONSTANTS = new HashMap<String, InstanceAttributes>();

    static {
        for (InstanceAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private InstanceAttributes(String value) {
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
    public static InstanceAttributes fromValue(String value) {
        InstanceAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
