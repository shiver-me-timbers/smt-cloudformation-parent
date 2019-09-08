package shiver.me.timbers.aws;

import java.util.Collection;
import java.util.Map;

import static java.util.Arrays.asList;
import static shiver.me.timbers.aws.Names.getMap;
import static shiver.me.timbers.aws.Names.withNamedMap;

/**
 * Fluent methods for adding Resources to a Template.
 */
public interface HasResources<T extends HasResources, R extends HasName> {

    /**
     * Add resources to a Template.
     *
     * @param resources - The resources to add.
     * @return this Template.
     */
    @SuppressWarnings("unchecked")
    default T withResources(R... resources) {
        return withResources(asList(resources));
    }

    /**
     * Add resources to a Template.
     *
     * @param resources - The resources to add.
     * @return this Template.
     */
    @SuppressWarnings("unchecked")
    default T withResources(Collection<R> resources) {
        withNamedMap(getMap(this::getResources, this::setResources), resources);
        return (T) this;
    }

    /**
     * @return the resources for this Template.
     */
    Map<String, R> getResources();

    /**
     * Set the resources to this Template.
     *
     * @param resources - The resources to set for this Template.
     */
    void setResources(Map<String, R> resources);
}
