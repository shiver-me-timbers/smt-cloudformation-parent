
package shiver.me.timbers.aws.networkmanager;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GlobalNetworkAttributes {

    ARN("Arn"),
    ID("Id");
    private final String value;
    private final static Map<String, GlobalNetworkAttributes> CONSTANTS = new HashMap<String, GlobalNetworkAttributes>();

    static {
        for (GlobalNetworkAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private GlobalNetworkAttributes(String value) {
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
    public static GlobalNetworkAttributes fromValue(String value) {
        GlobalNetworkAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
