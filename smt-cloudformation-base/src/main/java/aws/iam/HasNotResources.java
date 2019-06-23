package aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

public interface HasNotResources<T> {

    default T withNotResources(String... actions) {
        return withNotResource(asList(actions));
    }

    T withNotResource(List<String> action);
}
