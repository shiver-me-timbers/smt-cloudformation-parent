
package aws.greengrass;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum ConnectorDefinitionAttributes {

    LATEST_VERSION_ARN("LatestVersionArn"),
    ID("Id"),
    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, ConnectorDefinitionAttributes> CONSTANTS = new HashMap<String, ConnectorDefinitionAttributes>();

    static {
        for (ConnectorDefinitionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ConnectorDefinitionAttributes(String value) {
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
    public static ConnectorDefinitionAttributes fromValue(String value) {
        ConnectorDefinitionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
