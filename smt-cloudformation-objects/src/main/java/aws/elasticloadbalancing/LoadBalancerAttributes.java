
package aws.elasticloadbalancing;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LoadBalancerAttributes {

    CANONICAL_HOSTED_ZONE_NAME("CanonicalHostedZoneName"),
    CANONICAL_HOSTED_ZONE_NAME_ID("CanonicalHostedZoneNameID"),
    DNS_NAME("DNSName"),
    SOURCE_SECURITY_GROUP_GROUP_NAME("SourceSecurityGroup.GroupName"),
    SOURCE_SECURITY_GROUP_OWNER_ALIAS("SourceSecurityGroup.OwnerAlias");
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
