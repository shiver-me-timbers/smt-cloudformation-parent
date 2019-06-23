package aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

public interface HasActions<T> {

    default T withActions(CharSequence... actions) {
        return withAction(asList(actions));
    }

    T withAction(List<CharSequence> action);
}
