package aws;

import aws.fn.ConditionFunction;

import java.util.Collection;
import java.util.Map;

import static aws.Names.getMap;
import static aws.Names.withNamedMap;
import static java.util.Arrays.asList;

/**
 * Fluent methods for adding Conditions to a Template.
 */
public interface HasConditions<T extends HasConditions> {

    /**
     * Add Conditions to this Template.
     *
     * @param conditions - The Conditions to add.
     * @return this Template.
     */
    default T withConditions(Condition... conditions) {
        return withConditions(asList(conditions));
    }

    /**
     * Add Conditions to this Template.
     *
     * @param conditions - The Conditions to add.
     * @return this Template.
     */
    @SuppressWarnings("unchecked")
    default T withConditions(Collection<Condition> conditions) {
        withNamedMap(getMap(this::getConditions, this::setConditions), Condition::getCondition, conditions);
        return (T) this;
    }

    /**
     * @return the conditions for this Template.
     */
    Map<String, ConditionFunction> getConditions();

    /**
     * Set the Conditions to this Template.
     *
     * @param conditions - The conditions to set for this Template.
     */
    void setConditions(Map<String, ConditionFunction> conditions);
}
