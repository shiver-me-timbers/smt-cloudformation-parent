package aws;

import aws.fn.Reference;

/**
 * A type that can be converted into a {@link Reference}.
 */
public interface HasReference extends HasName {

    /**
     * @return the Reference representation of this object.
     */
    default Reference ref() {
        return new Reference(getName());
    }
}
