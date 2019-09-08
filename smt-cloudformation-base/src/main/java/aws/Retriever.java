package aws;

/**
 * A functional interface that should be implemented with logic to extract a value from a supplied object.
 */
public interface Retriever<I, O> {

    /**
     * Extract a value from a supplied object.
     *
     * @param input - The object that wil have the value extracted from it.
     * @return the extracted value.
     */
    O get(I input);
}
