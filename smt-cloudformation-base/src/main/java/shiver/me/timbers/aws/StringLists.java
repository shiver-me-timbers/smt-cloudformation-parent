package shiver.me.timbers.aws;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

/**
 * Helper methods for adding the {@link Object#toString()} values of objects to a list..
 */
public class StringLists {

    /**
     * Create a list of the {@link Object#toString()} results of the supplied objects.
     *
     * @param objects - The objects to get the {@link Object#toString()} results from.
     * @return the list of {@link Object#toString()} results.
     */
    @SafeVarargs
    public static <T> List<String> toStringList(T... objects) {
        return toStringList(asList(objects));
    }

    /**
     * Create a list of the {@link Object#toString()} results of the supplied objects.
     *
     * @param objects - The objects to get the {@link Object#toString()} results from.
     * @return the list of {@link Object#toString()} results.
     */
    public static <T> List<String> toStringList(List<T> objects) {
        return objects.stream().map(Object::toString).collect(toList());
    }
}
