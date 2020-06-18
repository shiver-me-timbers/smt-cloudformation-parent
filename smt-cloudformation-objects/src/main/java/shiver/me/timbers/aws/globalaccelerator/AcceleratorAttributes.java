
package shiver.me.timbers.aws.globalaccelerator;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AcceleratorAttributes {

    DNS_NAME("DnsName"),
    ACCELERATOR_ARN("AcceleratorArn");
    private final String value;
    private final static Map<String, AcceleratorAttributes> CONSTANTS = new HashMap<String, AcceleratorAttributes>();

    static {
        for (AcceleratorAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private AcceleratorAttributes(String value) {
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
    public static AcceleratorAttributes fromValue(String value) {
        AcceleratorAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
