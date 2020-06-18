
package shiver.me.timbers.aws.iot;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ProvisioningTemplateAttributes {

    TEMPLATE_ARN("TemplateArn");
    private final String value;
    private final static Map<String, ProvisioningTemplateAttributes> CONSTANTS = new HashMap<String, ProvisioningTemplateAttributes>();

    static {
        for (ProvisioningTemplateAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ProvisioningTemplateAttributes(String value) {
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
    public static ProvisioningTemplateAttributes fromValue(String value) {
        ProvisioningTemplateAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
