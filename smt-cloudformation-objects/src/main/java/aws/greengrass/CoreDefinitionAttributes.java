
package aws.greengrass;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CoreDefinitionAttributes {

    LATEST_VERSION_ARN("LatestVersionArn"),
    ID("Id"),
    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, CoreDefinitionAttributes> CONSTANTS = new HashMap<String, CoreDefinitionAttributes>();

    static {
        for (CoreDefinitionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CoreDefinitionAttributes(String value) {
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
    public static CoreDefinitionAttributes fromValue(String value) {
        CoreDefinitionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
