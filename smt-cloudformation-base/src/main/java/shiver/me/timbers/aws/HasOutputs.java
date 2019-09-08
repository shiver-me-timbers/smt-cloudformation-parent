package shiver.me.timbers.aws;

import java.util.Collection;
import java.util.Map;

import static java.util.Arrays.asList;
import static shiver.me.timbers.aws.Names.getMap;
import static shiver.me.timbers.aws.Names.withNamedMap;

/**
 * Fluent methods for adding outputs to a Template.
 */
public interface HasOutputs<T extends HasOutputs, O extends HasName> {

    /**
     * Add outputs to a Template.
     *
     * @param outputs - The outputs to add.
     * @return this Template.
     */
    @SuppressWarnings("unchecked")
    default T withOutputs(O... outputs) {
        return withOutputs(asList(outputs));
    }

    /**
     * Add outputs to a Template.
     *
     * @param outputs - The outputs to add.
     * @return this Template.
     */
    @SuppressWarnings("unchecked")
    default T withOutputs(Collection<O> outputs) {
        withNamedMap(getMap(this::getOutputs, this::setOutputs), outputs);
        return (T) this;
    }

    /**
     * @return the outputs for this Template.
     */
    Map<String, O> getOutputs();

    /**
     * Set the outputs for this Template.
     *
     * @param outputs - The outputs to set for this Template.
     */
    void setOutputs(Map<String, O> outputs);
}
