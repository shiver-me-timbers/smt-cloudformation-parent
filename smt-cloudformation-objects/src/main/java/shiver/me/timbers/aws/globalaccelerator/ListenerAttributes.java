
package shiver.me.timbers.aws.globalaccelerator;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ListenerAttributes {

    LISTENER_ARN("ListenerArn");
    private final String value;
    private final static Map<String, ListenerAttributes> CONSTANTS = new HashMap<String, ListenerAttributes>();

    static {
        for (ListenerAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ListenerAttributes(String value) {
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
    public static ListenerAttributes fromValue(String value) {
        ListenerAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
