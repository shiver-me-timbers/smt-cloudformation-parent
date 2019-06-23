package aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

public interface HasActions<T> {

    default T withActions(String... actions) {
        return withAction(asList(actions));
    }

    T withAction(List<String> action);
}
