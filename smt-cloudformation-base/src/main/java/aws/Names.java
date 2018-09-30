package aws;

import java.util.Arrays;
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

    @SafeVarargs
    public static <T extends HasName> void withNamedMap(Map<String, T> map, T... values) {
        withNamedMap(map, value -> value, values);
    }

    public static <T extends HasName, O> void withNamedMap(Map<String, O> map, Retriever<T, O> retriever, T... values) {
        Arrays.stream(values).forEach(value -> map.put(value.getName(), retriever.get(value)));
    }
}
