package aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

public interface HasResources<T> {

    default T withResources(String... actions) {
        return withResource(asList(actions));
    }

    T withResource(List<String> action);
}
