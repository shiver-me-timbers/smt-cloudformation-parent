
package shiver.me.timbers.aws.wafv2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum WebACLAttributes {

    ARN("Arn"),
    CAPACITY("Capacity"),
    ID("Id");
    private final String value;
    private final static Map<String, WebACLAttributes> CONSTANTS = new HashMap<String, WebACLAttributes>();

    static {
        for (WebACLAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private WebACLAttributes(String value) {
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
    public static WebACLAttributes fromValue(String value) {
        WebACLAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
