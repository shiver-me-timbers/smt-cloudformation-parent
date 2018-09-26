
package aws.appsync;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DataSourceAttributes {

    DATA_SOURCE_ARN("DataSourceArn"),
    NAME("Name");
    private final String value;
    private final static Map<String, DataSourceAttributes> CONSTANTS = new HashMap<String, DataSourceAttributes>();

    static {
        for (DataSourceAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DataSourceAttributes(String value) {
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
    public static DataSourceAttributes fromValue(String value) {
        DataSourceAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
