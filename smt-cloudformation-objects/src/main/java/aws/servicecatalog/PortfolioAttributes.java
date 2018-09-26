
package aws.servicecatalog;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PortfolioAttributes {

    PORTFOLIO_NAME("PortfolioName");
    private final String value;
    private final static Map<String, PortfolioAttributes> CONSTANTS = new HashMap<String, PortfolioAttributes>();

    static {
        for (PortfolioAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PortfolioAttributes(String value) {
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
    public static PortfolioAttributes fromValue(String value) {
        PortfolioAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
