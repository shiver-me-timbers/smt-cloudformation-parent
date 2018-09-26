
package aws.elasticache;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ReplicationGroupAttributes {

    CONFIGURATION_END_POINT_ADDRESS("ConfigurationEndPoint.Address"),
    CONFIGURATION_END_POINT_PORT("ConfigurationEndPoint.Port"),
    PRIMARY_END_POINT_ADDRESS("PrimaryEndPoint.Address"),
    PRIMARY_END_POINT_PORT("PrimaryEndPoint.Port"),
    READ_END_POINT_ADDRESSES("ReadEndPoint.Addresses"),
    READ_END_POINT_ADDRESSES_LIST("ReadEndPoint.Addresses.List"),
    READ_END_POINT_PORTS("ReadEndPoint.Ports"),
    READ_END_POINT_PORTS_LIST("ReadEndPoint.Ports.List");
    private final String value;
    private final static Map<String, ReplicationGroupAttributes> CONSTANTS = new HashMap<String, ReplicationGroupAttributes>();

    static {
        for (ReplicationGroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ReplicationGroupAttributes(String value) {
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
    public static ReplicationGroupAttributes fromValue(String value) {
        ReplicationGroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
