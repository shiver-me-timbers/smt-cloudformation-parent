
package shiver.me.timbers.aws.sagemaker;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CodeRepositoryAttributes {

    CODE_REPOSITORY_NAME("CodeRepositoryName");
    private final String value;
    private final static Map<String, CodeRepositoryAttributes> CONSTANTS = new HashMap<String, CodeRepositoryAttributes>();

    static {
        for (CodeRepositoryAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CodeRepositoryAttributes(String value) {
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
    public static CodeRepositoryAttributes fromValue(String value) {
        CodeRepositoryAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
