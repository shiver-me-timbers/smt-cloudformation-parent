
package aws.cognito;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum IdentityPoolAttributes {

    NAME("Name");
    private final String value;
    private final static Map<String, IdentityPoolAttributes> CONSTANTS = new HashMap<String, IdentityPoolAttributes>();

    static {
        for (IdentityPoolAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private IdentityPoolAttributes(String value) {
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
    public static IdentityPoolAttributes fromValue(String value) {
        IdentityPoolAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
