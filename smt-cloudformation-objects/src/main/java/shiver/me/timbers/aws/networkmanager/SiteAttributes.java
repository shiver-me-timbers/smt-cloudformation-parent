
package shiver.me.timbers.aws.networkmanager;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SiteAttributes {

    SITE_ARN("SiteArn"),
    SITE_ID("SiteId");
    private final String value;
    private final static Map<String, SiteAttributes> CONSTANTS = new HashMap<String, SiteAttributes>();

    static {
        for (SiteAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private SiteAttributes(String value) {
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
    public static SiteAttributes fromValue(String value) {
        SiteAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
