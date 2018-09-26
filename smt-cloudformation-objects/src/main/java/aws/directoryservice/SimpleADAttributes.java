
package aws.directoryservice;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SimpleADAttributes {

    ALIAS("Alias"),
    DNS_IP_ADDRESSES("DnsIpAddresses");
    private final String value;
    private final static Map<String, SimpleADAttributes> CONSTANTS = new HashMap<String, SimpleADAttributes>();

    static {
        for (SimpleADAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private SimpleADAttributes(String value) {
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
    public static SimpleADAttributes fromValue(String value) {
        SimpleADAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
