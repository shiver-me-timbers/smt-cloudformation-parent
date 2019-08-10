
package aws.ec2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CapacityReservationAttributes {

    TENANCY("Tenancy"),
    AVAILABLE_INSTANCE_COUNT("AvailableInstanceCount"),
    AVAILABILITY_ZONE("AvailabilityZone"),
    TOTAL_INSTANCE_COUNT("TotalInstanceCount"),
    INSTANCE_TYPE("InstanceType");
    private final String value;
    private final static Map<String, CapacityReservationAttributes> CONSTANTS = new HashMap<String, CapacityReservationAttributes>();

    static {
        for (CapacityReservationAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CapacityReservationAttributes(String value) {
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
    public static CapacityReservationAttributes fromValue(String value) {
        CapacityReservationAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
