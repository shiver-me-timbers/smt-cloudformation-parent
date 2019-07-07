package aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

public interface HasNotActions<T extends HasNotActions> {

    default T withNotActions(CharSequence... actions) {
        return withNotAction(asList(actions));
    }

    T withNotAction(List<CharSequence> action);
}
