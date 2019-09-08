
package shiver.me.timbers.aws.pinpoint;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SegmentAttributes {

    SEGMENT_ID("SegmentId");
    private final String value;
    private final static Map<String, SegmentAttributes> CONSTANTS = new HashMap<String, SegmentAttributes>();

    static {
        for (SegmentAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private SegmentAttributes(String value) {
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
    public static SegmentAttributes fromValue(String value) {
        SegmentAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
