
package aws.appsync;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ResolverAttributes {

    TYPE_NAME("TypeName"),
    RESOLVER_ARN("ResolverArn"),
    FIELD_NAME("FieldName");
    private final String value;
    private final static Map<String, ResolverAttributes> CONSTANTS = new HashMap<String, ResolverAttributes>();

    static {
        for (ResolverAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ResolverAttributes(String value) {
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
    public static ResolverAttributes fromValue(String value) {
        ResolverAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
