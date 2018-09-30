
package aws.sagemaker;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NotebookInstanceAttributes {

    NOTEBOOK_INSTANCE_NAME("NotebookInstanceName");
    private final String value;
    private final static Map<String, NotebookInstanceAttributes> CONSTANTS = new HashMap<String, NotebookInstanceAttributes>();

    static {
        for (NotebookInstanceAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private NotebookInstanceAttributes(String value) {
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
    public static NotebookInstanceAttributes fromValue(String value) {
        NotebookInstanceAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
