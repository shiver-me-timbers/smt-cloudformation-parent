
package shiver.me.timbers.aws.networkmanager;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DeviceAttributes {

    DEVICE_ARN("DeviceArn"),
    DEVICE_ID("DeviceId");
    private final String value;
    private final static Map<String, DeviceAttributes> CONSTANTS = new HashMap<String, DeviceAttributes>();

    static {
        for (DeviceAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DeviceAttributes(String value) {
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
    public static DeviceAttributes fromValue(String value) {
        DeviceAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
