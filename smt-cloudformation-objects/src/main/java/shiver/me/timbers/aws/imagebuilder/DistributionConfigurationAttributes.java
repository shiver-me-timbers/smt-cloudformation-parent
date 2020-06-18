
package shiver.me.timbers.aws.imagebuilder;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DistributionConfigurationAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, DistributionConfigurationAttributes> CONSTANTS = new HashMap<String, DistributionConfigurationAttributes>();

    static {
        for (DistributionConfigurationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DistributionConfigurationAttributes(String value) {
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
    public static DistributionConfigurationAttributes fromValue(String value) {
        DistributionConfigurationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
