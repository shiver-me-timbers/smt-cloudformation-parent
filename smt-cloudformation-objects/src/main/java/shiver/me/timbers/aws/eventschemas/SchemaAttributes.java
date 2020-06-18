
package shiver.me.timbers.aws.eventschemas;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SchemaAttributes {

    SCHEMA_VERSION("SchemaVersion"),
    SCHEMA_ARN("SchemaArn"),
    SCHEMA_NAME("SchemaName");
    private final String value;
    private final static Map<String, SchemaAttributes> CONSTANTS = new HashMap<String, SchemaAttributes>();

    static {
        for (SchemaAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private SchemaAttributes(String value) {
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
    public static SchemaAttributes fromValue(String value) {
        SchemaAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
