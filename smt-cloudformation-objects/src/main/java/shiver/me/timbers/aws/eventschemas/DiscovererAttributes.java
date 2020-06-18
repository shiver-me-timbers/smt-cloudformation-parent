
package shiver.me.timbers.aws.eventschemas;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DiscovererAttributes {

    DISCOVERER_ARN("DiscovererArn"),
    DISCOVERER_ID("DiscovererId");
    private final String value;
    private final static Map<String, DiscovererAttributes> CONSTANTS = new HashMap<String, DiscovererAttributes>();

    static {
        for (DiscovererAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DiscovererAttributes(String value) {
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
    public static DiscovererAttributes fromValue(String value) {
        DiscovererAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
