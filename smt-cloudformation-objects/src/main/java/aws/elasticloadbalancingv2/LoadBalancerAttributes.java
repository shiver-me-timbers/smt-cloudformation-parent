
package aws.elasticloadbalancingv2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LoadBalancerAttributes {

    CANONICAL_HOSTED_ZONE_ID("CanonicalHostedZoneID"),
    DNS_NAME("DNSName"),
    LOAD_BALANCER_FULL_NAME("LoadBalancerFullName"),
    LOAD_BALANCER_NAME("LoadBalancerName"),
    SECURITY_GROUPS("SecurityGroups");
    private final String value;
    private final static Map<String, LoadBalancerAttributes> CONSTANTS = new HashMap<String, LoadBalancerAttributes>();

    static {
        for (LoadBalancerAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private LoadBalancerAttributes(String value) {
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
    public static LoadBalancerAttributes fromValue(String value) {
        LoadBalancerAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
