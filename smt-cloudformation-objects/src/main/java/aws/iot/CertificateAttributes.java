
package aws.iot;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CertificateAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, CertificateAttributes> CONSTANTS = new HashMap<String, CertificateAttributes>();

    static {
        for (CertificateAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CertificateAttributes(String value) {
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
    public static CertificateAttributes fromValue(String value) {
        CertificateAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
