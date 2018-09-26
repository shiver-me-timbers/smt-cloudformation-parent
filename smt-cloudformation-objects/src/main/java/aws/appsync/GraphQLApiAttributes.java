
package aws.appsync;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GraphQLApiAttributes {

    GRAPH_QL_URL("GraphQLUrl"),
    ARN("Arn"),
    API_ID("ApiId");
    private final String value;
    private final static Map<String, GraphQLApiAttributes> CONSTANTS = new HashMap<String, GraphQLApiAttributes>();

    static {
        for (GraphQLApiAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private GraphQLApiAttributes(String value) {
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
    public static GraphQLApiAttributes fromValue(String value) {
        GraphQLApiAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
