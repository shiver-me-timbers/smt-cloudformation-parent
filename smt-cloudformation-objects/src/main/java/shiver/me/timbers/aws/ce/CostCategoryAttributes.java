
package shiver.me.timbers.aws.ce;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CostCategoryAttributes {

    ARN("Arn"),
    EFFECTIVE_START("EffectiveStart");
    private final String value;
    private final static Map<String, CostCategoryAttributes> CONSTANTS = new HashMap<String, CostCategoryAttributes>();

    static {
        for (CostCategoryAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CostCategoryAttributes(String value) {
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
    public static CostCategoryAttributes fromValue(String value) {
        CostCategoryAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
