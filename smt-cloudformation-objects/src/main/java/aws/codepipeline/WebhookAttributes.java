
package aws.codepipeline;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum WebhookAttributes {

    URL("Url");
    private final String value;
    private final static Map<String, WebhookAttributes> CONSTANTS = new HashMap<String, WebhookAttributes>();

    static {
        for (WebhookAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private WebhookAttributes(String value) {
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
    public static WebhookAttributes fromValue(String value) {
        WebhookAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
