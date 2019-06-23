package aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

public interface HasNotActions<T> {

    default T withNotActions(String... actions) {
        return withNotAction(asList(actions));
    }

    T withNotAction(List<String> action);
}
