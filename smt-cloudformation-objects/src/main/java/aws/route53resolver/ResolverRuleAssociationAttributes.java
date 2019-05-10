
package aws.route53resolver;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum ResolverRuleAssociationAttributes {

    VPC_ID("VPCId"),
    RESOLVER_RULE_ID("ResolverRuleId"),
    RESOLVER_RULE_ASSOCIATION_ID("ResolverRuleAssociationId"),
    NAME("Name");
    private final String value;
    private final static Map<String, ResolverRuleAssociationAttributes> CONSTANTS = new HashMap<String, ResolverRuleAssociationAttributes>();

    static {
        for (ResolverRuleAssociationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ResolverRuleAssociationAttributes(String value) {
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
    public static ResolverRuleAssociationAttributes fromValue(String value) {
        ResolverRuleAssociationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
