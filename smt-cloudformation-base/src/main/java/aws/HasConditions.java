package aws;

import aws.fn.ConditionFunction;

import java.util.Map;

import static aws.Names.withNamedMap;

public interface HasConditions<T> {

    Map<String, ConditionFunction> getConditions();

    @SuppressWarnings("unchecked")
    default T withConditions(Condition... conditions) {
        withNamedMap(getConditions(), Condition::getCondition, conditions);
        return (T) this;
    }
}
