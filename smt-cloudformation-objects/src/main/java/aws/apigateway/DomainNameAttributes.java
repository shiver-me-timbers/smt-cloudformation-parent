
package aws.apigateway;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DomainNameAttributes {

    DISTRIBUTION_DOMAIN_NAME("DistributionDomainName"),
    DISTRIBUTION_HOSTED_ZONE_ID("DistributionHostedZoneId"),
    REGIONAL_DOMAIN_NAME("RegionalDomainName"),
    REGIONAL_HOSTED_ZONE_ID("RegionalHostedZoneId");
    private final String value;
    private final static Map<String, DomainNameAttributes> CONSTANTS = new HashMap<String, DomainNameAttributes>();

    static {
        for (DomainNameAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DomainNameAttributes(String value) {
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
    public static DomainNameAttributes fromValue(String value) {
        DomainNameAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
