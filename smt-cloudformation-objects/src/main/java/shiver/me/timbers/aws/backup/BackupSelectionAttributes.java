
package shiver.me.timbers.aws.backup;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BackupSelectionAttributes {

    BACKUP_PLAN_ID("BackupPlanId"),
    SELECTION_ID("SelectionId");
    private final String value;
    private final static Map<String, BackupSelectionAttributes> CONSTANTS = new HashMap<String, BackupSelectionAttributes>();

    static {
        for (BackupSelectionAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private BackupSelectionAttributes(String value) {
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
    public static BackupSelectionAttributes fromValue(String value) {
        BackupSelectionAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
