
package aws.cloudfront;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StreamingDistributionAttributes {

    DOMAIN_NAME("DomainName");
    private final String value;
    private final static Map<String, StreamingDistributionAttributes> CONSTANTS = new HashMap<String, StreamingDistributionAttributes>();

    static {
        for (StreamingDistributionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private StreamingDistributionAttributes(String value) {
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
    public static StreamingDistributionAttributes fromValue(String value) {
        StreamingDistributionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
