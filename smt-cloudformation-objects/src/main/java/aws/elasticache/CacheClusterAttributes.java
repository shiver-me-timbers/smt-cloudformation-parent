
package aws.elasticache;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CacheClusterAttributes {

    CONFIGURATION_ENDPOINT_ADDRESS("ConfigurationEndpoint.Address"),
    CONFIGURATION_ENDPOINT_PORT("ConfigurationEndpoint.Port"),
    REDIS_ENDPOINT_ADDRESS("RedisEndpoint.Address"),
    REDIS_ENDPOINT_PORT("RedisEndpoint.Port");
    private final String value;
    private final static Map<String, CacheClusterAttributes> CONSTANTS = new HashMap<String, CacheClusterAttributes>();

    static {
        for (CacheClusterAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CacheClusterAttributes(String value) {
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
    public static CacheClusterAttributes fromValue(String value) {
        CacheClusterAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
