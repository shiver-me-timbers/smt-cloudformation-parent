
package aws.apigatewayv2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum DomainNameAttributes {

    REGIONAL_HOSTED_ZONE_ID("RegionalHostedZoneId"),
    REGIONAL_DOMAIN_NAME("RegionalDomainName");
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
