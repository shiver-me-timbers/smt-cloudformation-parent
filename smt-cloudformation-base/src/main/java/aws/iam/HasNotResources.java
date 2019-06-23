package aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

public interface HasNotResources<T> {

    default T withNotResources(String... resources) {
        return withNotResource(asList(resources));
    }

    T withNotResource(List<String> resources);
}
