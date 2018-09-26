
package aws.cloudfront;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DistributionAttributes {

    DOMAIN_NAME("DomainName");
    private final String value;
    private final static Map<String, DistributionAttributes> CONSTANTS = new HashMap<String, DistributionAttributes>();

    static {
        for (DistributionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DistributionAttributes(String value) {
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
    public static DistributionAttributes fromValue(String value) {
        DistributionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
