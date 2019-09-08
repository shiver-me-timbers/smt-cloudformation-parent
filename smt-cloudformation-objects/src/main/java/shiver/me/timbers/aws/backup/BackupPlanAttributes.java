
package shiver.me.timbers.aws.backup;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BackupPlanAttributes {

    VERSION_ID("VersionId"),
    BACKUP_PLAN_ID("BackupPlanId"),
    BACKUP_PLAN_ARN("BackupPlanArn");
    private final String value;
    private final static Map<String, BackupPlanAttributes> CONSTANTS = new HashMap<String, BackupPlanAttributes>();

    static {
        for (BackupPlanAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private BackupPlanAttributes(String value) {
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
    public static BackupPlanAttributes fromValue(String value) {
        BackupPlanAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
