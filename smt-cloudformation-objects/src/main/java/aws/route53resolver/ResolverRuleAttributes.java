
package aws.route53resolver;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum ResolverRuleAttributes {

    RESOLVER_ENDPOINT_ID("ResolverEndpointId"),
    DOMAIN_NAME("DomainName"),
    RESOLVER_RULE_ID("ResolverRuleId"),
    ARN("Arn"),
    TARGET_IPS("TargetIps"),
    NAME("Name");
    private final String value;
    private final static Map<String, ResolverRuleAttributes> CONSTANTS = new HashMap<String, ResolverRuleAttributes>();

    static {
        for (ResolverRuleAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ResolverRuleAttributes(String value) {
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
    public static ResolverRuleAttributes fromValue(String value) {
        ResolverRuleAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
