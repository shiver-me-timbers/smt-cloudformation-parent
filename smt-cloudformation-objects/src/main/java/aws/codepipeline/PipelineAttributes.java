
package aws.codepipeline;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PipelineAttributes {

    VERSION("Version");
    private final String value;
    private final static Map<String, PipelineAttributes> CONSTANTS = new HashMap<String, PipelineAttributes>();

    static {
        for (PipelineAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PipelineAttributes(String value) {
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
    public static PipelineAttributes fromValue(String value) {
        PipelineAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
