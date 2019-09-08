package shiver.me.timbers.aws;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A generic property that can be converted back into it's root object. This interface exists to allow the assigning of
 * different types to resources property. That is an intrinsic function type can be assigned to a string property.
 */
public interface Property<T> {

    /**
     * @return the root object of this property.
     */
    @JsonIgnore
    default T toType() {
        return (T) this;
    }
}
