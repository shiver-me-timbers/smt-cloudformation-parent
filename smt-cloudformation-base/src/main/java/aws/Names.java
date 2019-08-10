package aws;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Names {

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

    public static <T extends HasName> void withNamedMap(Map<String, T> map, Collection<T> values) {
        withNamedMap(map, value -> value, values);
    }

    public static <T extends HasName, O> void withNamedMap(
        Map<String, O> map,
        Retriever<T, O> retriever,
        Collection<T> values
    ) {
        values.forEach(value -> map.put(value.getName(), retriever.get(value)));
    }
}
