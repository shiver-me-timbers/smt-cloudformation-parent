package shiver.me.timbers.aws;

/**
 * Simple interface used to get a value.
 */
public interface Getter<T> {

    /**
     * @return the required value.
     */
    T get();
}
