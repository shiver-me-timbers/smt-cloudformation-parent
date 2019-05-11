
package aws.greengrass;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SubscriptionDefinitionAttributes {

    LATEST_VERSION_ARN("LatestVersionArn"),
    ID("Id"),
    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, SubscriptionDefinitionAttributes> CONSTANTS = new HashMap<String, SubscriptionDefinitionAttributes>();

    static {
        for (SubscriptionDefinitionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private SubscriptionDefinitionAttributes(String value) {
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
    public static SubscriptionDefinitionAttributes fromValue(String value) {
        SubscriptionDefinitionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
