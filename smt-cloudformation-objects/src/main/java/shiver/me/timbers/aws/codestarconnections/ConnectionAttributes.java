
package shiver.me.timbers.aws.codestarconnections;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ConnectionAttributes {

    CONNECTION_ARN("ConnectionArn"),
    CONNECTION_STATUS("ConnectionStatus"),
    OWNER_ACCOUNT_ID("OwnerAccountId");
    private final String value;
    private final static Map<String, ConnectionAttributes> CONSTANTS = new HashMap<String, ConnectionAttributes>();

    static {
        for (ConnectionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ConnectionAttributes(String value) {
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
    public static ConnectionAttributes fromValue(String value) {
        ConnectionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
