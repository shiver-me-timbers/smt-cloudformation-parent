
package shiver.me.timbers.aws.imagebuilder;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ComponentAttributes {

    ARN("Arn"),
    TYPE("Type"),
    ENCRYPTED("Encrypted");
    private final String value;
    private final static Map<String, ComponentAttributes> CONSTANTS = new HashMap<String, ComponentAttributes>();

    static {
        for (ComponentAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ComponentAttributes(String value) {
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
    public static ComponentAttributes fromValue(String value) {
        ComponentAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
