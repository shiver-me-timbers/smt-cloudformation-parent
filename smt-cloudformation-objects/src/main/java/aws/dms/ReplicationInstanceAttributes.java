
package aws.dms;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ReplicationInstanceAttributes {

    REPLICATION_INSTANCE_PUBLIC_IP_ADDRESSES("ReplicationInstancePublicIpAddresses"),
    REPLICATION_INSTANCE_PRIVATE_IP_ADDRESSES("ReplicationInstancePrivateIpAddresses");
    private final String value;
    private final static Map<String, ReplicationInstanceAttributes> CONSTANTS = new HashMap<String, ReplicationInstanceAttributes>();

    static {
        for (ReplicationInstanceAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ReplicationInstanceAttributes(String value) {
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
    public static ReplicationInstanceAttributes fromValue(String value) {
        ReplicationInstanceAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
