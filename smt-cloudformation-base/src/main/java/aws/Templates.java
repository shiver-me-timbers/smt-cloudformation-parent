package aws;

import aws.fn.ConditionFunction;

/**
 * Helper methods for creating Template related objects.
 */
public class Templates {

    /**
     * Create a new {@link Condition} object.
     *
     * @param name              - The name of the Condition.
     * @param conditionFunction - The {@link ConditionFunction} that will produce the result for this Condition.
     * @return the new Condition object.
     */
    public static Condition condition(String name, ConditionFunction conditionFunction) {
        return new Condition(name, conditionFunction);
    }
}
