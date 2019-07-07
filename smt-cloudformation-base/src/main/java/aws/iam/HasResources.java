package aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

public interface HasResources<T extends HasResources> {

    default T withResources(CharSequence... resources) {
        return withResource(asList(resources));
    }

    T withResource(List<CharSequence> resources);
}
