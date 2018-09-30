
package aws.sagemaker;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NotebookInstanceLifecycleConfigAttributes {

    NOTEBOOK_INSTANCE_LIFECYCLE_CONFIG_NAME("NotebookInstanceLifecycleConfigName");
    private final String value;
    private final static Map<String, NotebookInstanceLifecycleConfigAttributes> CONSTANTS = new HashMap<String, NotebookInstanceLifecycleConfigAttributes>();

    static {
        for (NotebookInstanceLifecycleConfigAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private NotebookInstanceLifecycleConfigAttributes(String value) {
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
    public static NotebookInstanceLifecycleConfigAttributes fromValue(String value) {
        NotebookInstanceLifecycleConfigAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
