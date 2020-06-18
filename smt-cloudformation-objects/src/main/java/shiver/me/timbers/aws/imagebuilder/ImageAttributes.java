
package shiver.me.timbers.aws.imagebuilder;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ImageAttributes {

    ARN("Arn"),
    IMAGE_ID("ImageId");
    private final String value;
    private final static Map<String, ImageAttributes> CONSTANTS = new HashMap<String, ImageAttributes>();

    static {
        for (ImageAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ImageAttributes(String value) {
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
    public static ImageAttributes fromValue(String value) {
        ImageAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
