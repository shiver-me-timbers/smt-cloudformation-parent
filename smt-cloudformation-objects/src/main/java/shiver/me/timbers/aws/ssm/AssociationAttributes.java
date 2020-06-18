
package shiver.me.timbers.aws.ssm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AssociationAttributes {

    ASSOCIATION_ID("AssociationId");
    private final String value;
    private final static Map<String, AssociationAttributes> CONSTANTS = new HashMap<String, AssociationAttributes>();

    static {
        for (AssociationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private AssociationAttributes(String value) {
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
    public static AssociationAttributes fromValue(String value) {
        AssociationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
