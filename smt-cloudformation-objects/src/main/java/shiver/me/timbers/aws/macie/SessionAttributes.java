
package shiver.me.timbers.aws.macie;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SessionAttributes {

    AWS_ACCOUNT_ID("AwsAccountId"),
    SERVICE_ROLE("ServiceRole");
    private final String value;
    private final static Map<String, SessionAttributes> CONSTANTS = new HashMap<String, SessionAttributes>();

    static {
        for (SessionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private SessionAttributes(String value) {
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
    public static SessionAttributes fromValue(String value) {
        SessionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
