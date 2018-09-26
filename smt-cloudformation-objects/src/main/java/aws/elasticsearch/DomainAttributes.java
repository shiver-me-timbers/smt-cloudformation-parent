
package aws.elasticsearch;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DomainAttributes {

    ARN("Arn"),
    DOMAIN_ARN("DomainArn"),
    DOMAIN_ENDPOINT("DomainEndpoint");
    private final String value;
    private final static Map<String, DomainAttributes> CONSTANTS = new HashMap<String, DomainAttributes>();

    static {
        for (DomainAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DomainAttributes(String value) {
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
    public static DomainAttributes fromValue(String value) {
        DomainAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
