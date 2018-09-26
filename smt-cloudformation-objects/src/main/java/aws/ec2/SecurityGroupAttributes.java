
package aws.ec2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SecurityGroupAttributes {

    GROUP_ID("GroupId"),
    VPC_ID("VpcId");
    private final String value;
    private final static Map<String, SecurityGroupAttributes> CONSTANTS = new HashMap<String, SecurityGroupAttributes>();

    static {
        for (SecurityGroupAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private SecurityGroupAttributes(String value) {
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
    public static SecurityGroupAttributes fromValue(String value) {
        SecurityGroupAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
