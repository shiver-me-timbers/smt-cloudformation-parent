
package aws.route53;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum HostedZoneAttributes {

    NAME_SERVERS("NameServers");
    private final String value;
    private final static Map<String, HostedZoneAttributes> CONSTANTS = new HashMap<String, HostedZoneAttributes>();

    static {
        for (HostedZoneAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private HostedZoneAttributes(String value) {
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
    public static HostedZoneAttributes fromValue(String value) {
        HostedZoneAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
