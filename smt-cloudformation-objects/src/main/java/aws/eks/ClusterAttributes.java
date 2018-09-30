
package aws.eks;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ClusterAttributes {

    ENDPOINT("Endpoint"),
    ARN("Arn"),
    CERTIFICATE_AUTHORITY_DATA("CertificateAuthorityData");
    private final String value;
    private final static Map<String, ClusterAttributes> CONSTANTS = new HashMap<String, ClusterAttributes>();

    static {
        for (ClusterAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ClusterAttributes(String value) {
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
    public static ClusterAttributes fromValue(String value) {
        ClusterAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
