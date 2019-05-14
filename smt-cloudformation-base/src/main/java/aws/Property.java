package aws;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface Property<T> {

    @JsonIgnore
    default T toType() {
        return (T) this;
    }
}
