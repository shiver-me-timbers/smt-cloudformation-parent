
package aws.amplify;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DomainAttributes {

    DOMAIN_NAME("DomainName"),
    STATUS_REASON("StatusReason"),
    ARN("Arn"),
    DOMAIN_STATUS("DomainStatus"),
    CERTIFICATE_RECORD("CertificateRecord");
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
