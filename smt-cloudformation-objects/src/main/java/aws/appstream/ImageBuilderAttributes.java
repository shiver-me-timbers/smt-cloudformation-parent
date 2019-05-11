
package aws.appstream;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ImageBuilderAttributes {

    STREAMING_URL("StreamingUrl");
    private final String value;
    private final static Map<String, ImageBuilderAttributes> CONSTANTS = new HashMap<String, ImageBuilderAttributes>();

    static {
        for (ImageBuilderAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ImageBuilderAttributes(String value) {
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
    public static ImageBuilderAttributes fromValue(String value) {
        ImageBuilderAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
