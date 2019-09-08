
package shiver.me.timbers.aws.route53resolver;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ResolverEndpointAttributes {

    RESOLVER_ENDPOINT_ID("ResolverEndpointId"),
    IP_ADDRESS_COUNT("IpAddressCount"),
    ARN("Arn"),
    DIRECTION("Direction"),
    HOST_VPC_ID("HostVPCId"),
    NAME("Name");
    private final String value;
    private final static Map<String, ResolverEndpointAttributes> CONSTANTS = new HashMap<String, ResolverEndpointAttributes>();

    static {
        for (ResolverEndpointAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ResolverEndpointAttributes(String value) {
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
    public static ResolverEndpointAttributes fromValue(String value) {
        ResolverEndpointAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
