package aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

public interface HasResources<T> {

    default T withResources(String... resources) {
        return withResource(asList(resources));
    }

    T withResource(List<String> resources);
}
