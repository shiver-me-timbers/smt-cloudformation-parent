
package aws.cloudfront;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CloudFrontOriginAccessIdentityAttributes {

    S_3_CANONICAL_USER_ID("S3CanonicalUserId");
    private final String value;
    private final static Map<String, CloudFrontOriginAccessIdentityAttributes> CONSTANTS = new HashMap<String, CloudFrontOriginAccessIdentityAttributes>();

    static {
        for (CloudFrontOriginAccessIdentityAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CloudFrontOriginAccessIdentityAttributes(String value) {
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
    public static CloudFrontOriginAccessIdentityAttributes fromValue(String value) {
        CloudFrontOriginAccessIdentityAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
