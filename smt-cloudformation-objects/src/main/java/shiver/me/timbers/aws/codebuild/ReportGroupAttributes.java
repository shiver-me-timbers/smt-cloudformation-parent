
package shiver.me.timbers.aws.codebuild;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ReportGroupAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, ReportGroupAttributes> CONSTANTS = new HashMap<String, ReportGroupAttributes>();

    static {
        for (ReportGroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ReportGroupAttributes(String value) {
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
    public static ReportGroupAttributes fromValue(String value) {
        ReportGroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
