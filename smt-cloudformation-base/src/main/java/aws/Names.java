package aws;

import java.util.Arrays;
import java.util.Map;

public class Names {

    @SafeVarargs
    public static <T extends HasName> void withNamedMap(Map<String, T> map, T... values) {
        withNamedMap(map, value -> value, values);
    }

    public static <T extends HasName, O> void withNamedMap(Map<String, O> map, Getter<T, O> getter, T... values) {
        Arrays.stream(values).forEach(value -> map.put(value.getName(), getter.get(value)));
    }
}
