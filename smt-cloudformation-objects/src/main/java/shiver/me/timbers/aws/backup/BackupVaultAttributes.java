
package shiver.me.timbers.aws.backup;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BackupVaultAttributes {

    BACKUP_VAULT_NAME("BackupVaultName"),
    BACKUP_VAULT_ARN("BackupVaultArn");
    private final String value;
    private final static Map<String, BackupVaultAttributes> CONSTANTS = new HashMap<String, BackupVaultAttributes>();

    static {
        for (BackupVaultAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private BackupVaultAttributes(String value) {
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
    public static BackupVaultAttributes fromValue(String value) {
        BackupVaultAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
