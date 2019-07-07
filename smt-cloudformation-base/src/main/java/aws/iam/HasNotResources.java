package aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

public interface HasNotResources<T extends HasNotResources> {

    default T withNotResources(CharSequence... resources) {
        return withNotResource(asList(resources));
    }

    T withNotResource(List<CharSequence> resources);
}
