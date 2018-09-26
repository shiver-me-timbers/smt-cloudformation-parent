
package aws.s3;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BucketAttributes {

    ARN("Arn"),
    DOMAIN_NAME("DomainName"),
    DUAL_STACK_DOMAIN_NAME("DualStackDomainName"),
    WEBSITE_URL("WebsiteURL");
    private final String value;
    private final static Map<String, BucketAttributes> CONSTANTS = new HashMap<String, BucketAttributes>();

    static {
        for (BucketAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private BucketAttributes(String value) {
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
    public static BucketAttributes fromValue(String value) {
        BucketAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
