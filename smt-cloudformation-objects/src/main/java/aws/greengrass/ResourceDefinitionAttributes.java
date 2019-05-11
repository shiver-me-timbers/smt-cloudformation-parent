
package aws.greengrass;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ResourceDefinitionAttributes {

    LATEST_VERSION_ARN("LatestVersionArn"),
    ID("Id"),
    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, ResourceDefinitionAttributes> CONSTANTS = new HashMap<String, ResourceDefinitionAttributes>();

    static {
        for (ResourceDefinitionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ResourceDefinitionAttributes(String value) {
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
    public static ResourceDefinitionAttributes fromValue(String value) {
        ResourceDefinitionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
