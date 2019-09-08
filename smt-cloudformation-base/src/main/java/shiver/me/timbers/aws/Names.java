package shiver.me.timbers.aws;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Helper methods for adding named objects to a map using the name as the key.
 */
public class Names {

    /**
     * Get a map from the supplied getter if it exists, otherwise create a new {@link LinkedHashMap} and set that with
     * the supplied setter and return it.
     *
     * @param getter - The getter that will supply the requested map if it exists.
     * @param setter - The setter that will be used to set the map with an emtpy {@link LinkedHashMap} if one doesn't
     *               already exist.
     * @return the existing map if it exists, otherwise the new empty {@link LinkedHashMap} map.
     */
    public static <T> Map<String, T> getMap(
        Getter<Map<String, T>> getter,
        Setter<Map<String, T>> setter
    ) {
        final Map<String, T> value = getter.get();
        if (value == null) {
            setter.set(new LinkedHashMap<>());
        }
        return getter.get();
    }

    /**
     * Add all the values in the supplied collection into the supplied map using the each values name as the key.
     *
     * @param map    - The map that will have the values added to it.
     * @param values - The values to add.
     */
    public static <T extends HasName> void withNamedMap(Map<String, T> map, Collection<T> values) {
        withNamedMap(map, value -> value, values);
    }

    /**
     * Add all the values in the supplied collection into the supplied map using the each objects name as the key and
     * the result returned by the retriever as the value.
     *
     * @param map       - The map that will have the values added to it.
     * @param retriever - The retriever that will retrieve the required value from the each object.
     * @param objects   - The objects that will have their names and values added to the map.
     */
    public static <T extends HasName, O> void withNamedMap(
        Map<String, O> map,
        Retriever<T, O> retriever,
        Collection<T> objects
    ) {
        objects.forEach(value -> map.put(value.getName(), retriever.get(value)));
    }
}
