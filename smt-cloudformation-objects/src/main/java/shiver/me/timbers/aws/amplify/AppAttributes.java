
package shiver.me.timbers.aws.amplify;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AppAttributes {

    APP_ID("AppId"),
    ARN("Arn"),
    DEFAULT_DOMAIN("DefaultDomain"),
    APP_NAME("AppName");
    private final String value;
    private final static Map<String, AppAttributes> CONSTANTS = new HashMap<String, AppAttributes>();

    static {
        for (AppAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private AppAttributes(String value) {
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
    public static AppAttributes fromValue(String value) {
        AppAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
