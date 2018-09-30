package aws;

import aws.fn.ConditionFunction;

import java.util.LinkedHashMap;
import java.util.Map;

import static aws.Names.getMap;
import static aws.Names.withNamedMap;

public interface HasConditions<T> {

    Map<String, ConditionFunction> getConditions();

    void setConditions(Map<String, ConditionFunction> conditions);

    @SuppressWarnings("unchecked")
    default T withConditions(Condition... conditions) {
        withNamedMap(getMap(this::getConditions, this::setConditions), Condition::getCondition, conditions);
        return (T) this;
    }
}
