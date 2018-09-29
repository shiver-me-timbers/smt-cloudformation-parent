package aws;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class Strings {

    @SafeVarargs
    public static <T> List<String> toStrings(T... object) {
        return toStrings(asList(object));
    }

    public static <T> List<String> toStrings(List<T> objects) {
        return objects.stream().map(Object::toString).collect(toList());
    }
}
