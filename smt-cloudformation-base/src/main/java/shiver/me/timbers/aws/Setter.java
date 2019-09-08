package shiver.me.timbers.aws;

/**
 * A functional interface that should be implemented to add a supplied value to an existing object.
 */
public interface Setter<T> {

    /**
     * Add a value to an existing object.
     *
     * @param value - The value to add.
     */
    void set(T value);
}
