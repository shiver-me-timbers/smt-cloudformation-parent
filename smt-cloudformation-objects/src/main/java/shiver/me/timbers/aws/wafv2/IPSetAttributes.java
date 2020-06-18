
package shiver.me.timbers.aws.wafv2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum IPSetAttributes {

    ARN("Arn"),
    ID("Id");
    private final String value;
    private final static Map<String, IPSetAttributes> CONSTANTS = new HashMap<String, IPSetAttributes>();

    static {
        for (IPSetAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private IPSetAttributes(String value) {
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
    public static IPSetAttributes fromValue(String value) {
        IPSetAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
