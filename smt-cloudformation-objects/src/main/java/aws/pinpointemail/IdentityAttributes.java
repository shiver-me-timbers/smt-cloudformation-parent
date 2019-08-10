
package aws.pinpointemail;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum IdentityAttributes {

    IDENTITY_DNS_RECORD_NAME_3("IdentityDNSRecordName3"),
    IDENTITY_DNS_RECORD_NAME_1("IdentityDNSRecordName1"),
    IDENTITY_DNS_RECORD_NAME_2("IdentityDNSRecordName2"),
    IDENTITY_DNS_RECORD_VALUE_3("IdentityDNSRecordValue3"),
    IDENTITY_DNS_RECORD_VALUE_2("IdentityDNSRecordValue2"),
    IDENTITY_DNS_RECORD_VALUE_1("IdentityDNSRecordValue1");
    private final String value;
    private final static Map<String, IdentityAttributes> CONSTANTS = new HashMap<String, IdentityAttributes>();

    static {
        for (IdentityAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private IdentityAttributes(String value) {
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
    public static IdentityAttributes fromValue(String value) {
        IdentityAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
