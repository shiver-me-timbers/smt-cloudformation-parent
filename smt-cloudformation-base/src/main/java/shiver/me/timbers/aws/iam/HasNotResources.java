package shiver.me.timbers.aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Fluent methods for adding NotResources to a Statement.
 */
public interface HasNotResources<T extends HasNotResources> {

    /**
     * Add Resources to this Statement.
     *
     * @param resources - The resources to add.
     * @return this Statement.
     */
    default T withNotResources(CharSequence... resources) {
        return withNotResource(asList(resources));
    }

    /**
     * Add Resources to this Statement.
     *
     * @param resources - The resources to add.
     * @return this Statement.
     */
    T withNotResource(List<CharSequence> resources);
}
