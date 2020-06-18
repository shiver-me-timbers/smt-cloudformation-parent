
package shiver.me.timbers.aws.accessanalyzer;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AnalyzerAttributes {

    ARN("Arn");
    private final String value;
    private final static Map<String, AnalyzerAttributes> CONSTANTS = new HashMap<String, AnalyzerAttributes>();

    static {
        for (AnalyzerAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private AnalyzerAttributes(String value) {
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
    public static AnalyzerAttributes fromValue(String value) {
        AnalyzerAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
