
package aws.servicecatalog;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CloudFormationProductAttributes {

    PRODUCT_NAME("ProductName"),
    PROVISIONING_ARTIFACT_IDS("ProvisioningArtifactIds"),
    PROVISIONING_ARTIFACT_NAMES("ProvisioningArtifactNames");
    private final String value;
    private final static Map<String, CloudFormationProductAttributes> CONSTANTS = new HashMap<String, CloudFormationProductAttributes>();

    static {
        for (CloudFormationProductAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CloudFormationProductAttributes(String value) {
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
    public static CloudFormationProductAttributes fromValue(String value) {
        CloudFormationProductAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
