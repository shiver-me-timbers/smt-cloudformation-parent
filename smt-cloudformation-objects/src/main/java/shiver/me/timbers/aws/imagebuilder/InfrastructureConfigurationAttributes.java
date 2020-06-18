
package shiver.me.timbers.aws.imagebuilder;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum InfrastructureConfigurationAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, InfrastructureConfigurationAttributes> CONSTANTS = new HashMap<String, InfrastructureConfigurationAttributes>();

    static {
        for (InfrastructureConfigurationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private InfrastructureConfigurationAttributes(String value) {
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
    public static InfrastructureConfigurationAttributes fromValue(String value) {
        InfrastructureConfigurationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
