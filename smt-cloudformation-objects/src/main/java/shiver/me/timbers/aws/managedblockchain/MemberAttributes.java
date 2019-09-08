
package shiver.me.timbers.aws.managedblockchain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MemberAttributes {

    MEMBER_ID("MemberId"),
    NETWORK_ID("NetworkId");
    private final String value;
    private final static Map<String, MemberAttributes> CONSTANTS = new HashMap<String, MemberAttributes>();

    static {
        for (MemberAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private MemberAttributes(String value) {
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
    public static MemberAttributes fromValue(String value) {
        MemberAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
