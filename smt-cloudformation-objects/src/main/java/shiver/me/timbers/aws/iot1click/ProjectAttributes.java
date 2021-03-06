
package shiver.me.timbers.aws.iot1click;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ProjectAttributes {

    PROJECT_NAME("ProjectName"),
    ARN("Arn");
    private final String value;
    private final static Map<String, ProjectAttributes> CONSTANTS = new HashMap<String, ProjectAttributes>();

    static {
        for (ProjectAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ProjectAttributes(String value) {
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
    public static ProjectAttributes fromValue(String value) {
        ProjectAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
