
package aws.directoryservice;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MicrosoftADAttributes {

    ALIAS("Alias"),
    DNS_IP_ADDRESSES("DnsIpAddresses");
    private final String value;
    private final static Map<String, MicrosoftADAttributes> CONSTANTS = new HashMap<String, MicrosoftADAttributes>();

    static {
        for (MicrosoftADAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private MicrosoftADAttributes(String value) {
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
    public static MicrosoftADAttributes fromValue(String value) {
        MicrosoftADAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
