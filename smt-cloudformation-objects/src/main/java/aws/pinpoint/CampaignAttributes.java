
package aws.pinpoint;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CampaignAttributes {

    CAMPAIGN_ID("CampaignId");
    private final String value;
    private final static Map<String, CampaignAttributes> CONSTANTS = new HashMap<String, CampaignAttributes>();

    static {
        for (CampaignAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CampaignAttributes(String value) {
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
    public static CampaignAttributes fromValue(String value) {
        CampaignAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
