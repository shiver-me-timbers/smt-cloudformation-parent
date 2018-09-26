
package aws.servicecatalog;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CloudFormationProvisionedProductAttributes {

    CLOUDFORMATION_STACK_ARN("CloudformationStackArn"),
    RECORD_ID("RecordId");
    private final String value;
    private final static Map<String, CloudFormationProvisionedProductAttributes> CONSTANTS = new HashMap<String, CloudFormationProvisionedProductAttributes>();

    static {
        for (CloudFormationProvisionedProductAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CloudFormationProvisionedProductAttributes(String value) {
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
    public static CloudFormationProvisionedProductAttributes fromValue(String value) {
        CloudFormationProvisionedProductAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
