
package shiver.me.timbers.aws.acmpca;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CertificateAuthorityAttributes {

    ARN("Arn"),
    CERTIFICATE_SIGNING_REQUEST("CertificateSigningRequest");
    private final String value;
    private final static Map<String, CertificateAuthorityAttributes> CONSTANTS = new HashMap<String, CertificateAuthorityAttributes>();

    static {
        for (CertificateAuthorityAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CertificateAuthorityAttributes(String value) {
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
    public static CertificateAuthorityAttributes fromValue(String value) {
        CertificateAuthorityAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
