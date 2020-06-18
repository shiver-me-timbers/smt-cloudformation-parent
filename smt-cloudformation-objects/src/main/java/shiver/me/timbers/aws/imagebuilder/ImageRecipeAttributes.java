
package shiver.me.timbers.aws.imagebuilder;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ImageRecipeAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, ImageRecipeAttributes> CONSTANTS = new HashMap<String, ImageRecipeAttributes>();

    static {
        for (ImageRecipeAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ImageRecipeAttributes(String value) {
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
    public static ImageRecipeAttributes fromValue(String value) {
        ImageRecipeAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
