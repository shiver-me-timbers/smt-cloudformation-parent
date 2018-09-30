
package aws.codecommit;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RepositoryAttributes {

    CLONE_URL_HTTP("CloneUrlHttp"),
    CLONE_URL_SSH("CloneUrlSsh"),
    ARN("Arn"),
    NAME("Name");
    private final String value;
    private final static Map<String, RepositoryAttributes> CONSTANTS = new HashMap<String, RepositoryAttributes>();

    static {
        for (RepositoryAttributes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RepositoryAttributes(String value) {
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
    public static RepositoryAttributes fromValue(String value) {
        RepositoryAttributes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
