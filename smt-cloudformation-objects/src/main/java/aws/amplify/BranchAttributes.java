
package aws.amplify;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BranchAttributes {

    BRANCH_NAME("BranchName"),
    ARN("Arn");
    private final String value;
    private final static Map<String, BranchAttributes> CONSTANTS = new HashMap<String, BranchAttributes>();

    static {
        for (BranchAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private BranchAttributes(String value) {
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
    public static BranchAttributes fromValue(String value) {
        BranchAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
