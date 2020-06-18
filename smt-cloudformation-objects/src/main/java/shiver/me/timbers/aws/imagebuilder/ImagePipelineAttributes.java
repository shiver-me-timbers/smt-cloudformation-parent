
package shiver.me.timbers.aws.imagebuilder;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ImagePipelineAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, ImagePipelineAttributes> CONSTANTS = new HashMap<String, ImagePipelineAttributes>();

    static {
        for (ImagePipelineAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ImagePipelineAttributes(String value) {
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
    public static ImagePipelineAttributes fromValue(String value) {
        ImagePipelineAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
