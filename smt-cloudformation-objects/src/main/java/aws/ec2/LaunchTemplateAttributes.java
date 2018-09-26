
package aws.ec2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LaunchTemplateAttributes {

    LATEST_VERSION_NUMBER("LatestVersionNumber"),
    DEFAULT_VERSION_NUMBER("DefaultVersionNumber");
    private final String value;
    private final static Map<String, LaunchTemplateAttributes> CONSTANTS = new HashMap<String, LaunchTemplateAttributes>();

    static {
        for (LaunchTemplateAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private LaunchTemplateAttributes(String value) {
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
    public static LaunchTemplateAttributes fromValue(String value) {
        LaunchTemplateAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
