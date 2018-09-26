package aws;

import java.util.Arrays;
import java.util.Map;

public class HasNamedMap {

    @SafeVarargs
    public static <T extends HasName> void withNamedMap(Map<String, T> map, T... values) {
        Arrays.stream(values).forEach(value -> map.put(value.getName(), value));
    }
}
