package shiver.me.timbers.aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Fluent methods for adding Resources to a Statement.
 */
public interface HasResources<T extends HasResources> {

    /**
     * Add Resources to this Statement.
     *
     * @param resources - The Principals to add.
     * @return this Statement.
     */
    default T withResources(CharSequence... resources) {
        return withResource(asList(resources));
    }

    /**
     * Add Resources to this Statement.
     *
     * @param resources - The Principals to add.
     * @return this Statement.
     */
    T withResource(List<CharSequence> resources);
}
