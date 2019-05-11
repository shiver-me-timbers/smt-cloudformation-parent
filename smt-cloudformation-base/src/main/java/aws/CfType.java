package aws;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface CfType<T> {

    @JsonIgnore
    default T toType() {
        return (T) this;
    }
}
