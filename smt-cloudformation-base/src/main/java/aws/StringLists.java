package aws;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class StringLists {

    @SafeVarargs
    public static <T> List<String> toStringList(T... object) {
        return toStringList(asList(object));
    }

    public static <T> List<String> toStringList(List<T> objects) {
        return objects.stream().map(Object::toString).collect(toList());
    }
}
