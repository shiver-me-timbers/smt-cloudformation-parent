
package aws.lambda;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum VersionAttributes {

    VERSION("Version");
    private final String value;
    private final static Map<String, VersionAttributes> CONSTANTS = new HashMap<String, VersionAttributes>();

    static {
        for (VersionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private VersionAttributes(String value) {
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
    public static VersionAttributes fromValue(String value) {
        VersionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
