
package shiver.me.timbers.aws.sagemaker;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ModelAttributes {

    MODEL_NAME("ModelName");
    private final String value;
    private final static Map<String, ModelAttributes> CONSTANTS = new HashMap<String, ModelAttributes>();

    static {
        for (ModelAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ModelAttributes(String value) {
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
    public static ModelAttributes fromValue(String value) {
        ModelAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
