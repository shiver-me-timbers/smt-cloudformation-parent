
package shiver.me.timbers.aws.acmpca;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CertificateAuthorityActivationAttributes {

    COMPLETE_CERTIFICATE_CHAIN("CompleteCertificateChain");
    private final String value;
    private final static Map<String, CertificateAuthorityActivationAttributes> CONSTANTS = new HashMap<String, CertificateAuthorityActivationAttributes>();

    static {
        for (CertificateAuthorityActivationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CertificateAuthorityActivationAttributes(String value) {
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
    public static CertificateAuthorityActivationAttributes fromValue(String value) {
        CertificateAuthorityActivationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
