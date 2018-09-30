
package aws.iot1click;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PlacementAttributes {

    PLACEMENT_NAME("PlacementName"),
    PROJECT_NAME("ProjectName");
    private final String value;
    private final static Map<String, PlacementAttributes> CONSTANTS = new HashMap<String, PlacementAttributes>();

    static {
        for (PlacementAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PlacementAttributes(String value) {
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
    public static PlacementAttributes fromValue(String value) {
        PlacementAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
