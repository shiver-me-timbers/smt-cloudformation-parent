package shiver.me.timbers.aws;

import java.util.Collection;
import java.util.Map;

import static java.util.Arrays.asList;
import static shiver.me.timbers.aws.Names.getMap;
import static shiver.me.timbers.aws.Names.withNamedMap;

/**
 * Fluent methods for adding Parameters to a Template.
 */
public interface HasParameters<T extends HasParameters, P extends HasName> {

    /**
     * Add parameters to a Template.
     *
     * @param parameters - The parameters to add.
     * @return this Template.
     */
    @SuppressWarnings("unchecked")
    default T withParameters(P... parameters) {
        return withParameters(asList(parameters));
    }

    /**
     * Add parameters to a Template.
     *
     * @param parameters - The parameters to add.
     * @return this Template.
     */
    @SuppressWarnings("unchecked")
    default T withParameters(Collection<P> parameters) {
        withNamedMap(getMap(this::getParameters, this::setParameters), parameters);
        return (T) this;
    }

    /**
     * @return the parameters for this Template.
     */
    Map<String, P> getParameters();

    /**
     * Set the parameters to this Template.
     *
     * @param parameters - The parameters to set for this Template.
     */
    void setParameters(Map<String, P> parameters);
}
