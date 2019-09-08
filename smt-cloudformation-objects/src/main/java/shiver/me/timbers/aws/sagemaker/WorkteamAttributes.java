
package shiver.me.timbers.aws.sagemaker;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum WorkteamAttributes {

    WORKTEAM_NAME("WorkteamName");
    private final String value;
    private final static Map<String, WorkteamAttributes> CONSTANTS = new HashMap<String, WorkteamAttributes>();

    static {
        for (WorkteamAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private WorkteamAttributes(String value) {
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
    public static WorkteamAttributes fromValue(String value) {
        WorkteamAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
