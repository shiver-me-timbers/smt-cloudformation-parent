
package shiver.me.timbers.aws.networkmanager;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LinkAttributes {

    LINK_ARN("LinkArn"),
    LINK_ID("LinkId");
    private final String value;
    private final static Map<String, LinkAttributes> CONSTANTS = new HashMap<String, LinkAttributes>();

    static {
        for (LinkAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private LinkAttributes(String value) {
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
    public static LinkAttributes fromValue(String value) {
        LinkAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
