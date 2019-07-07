package aws;

import aws.fn.ConditionFunction;

import java.util.Collection;
import java.util.Map;

import static aws.Names.getMap;
import static aws.Names.withNamedMap;
import static java.util.Arrays.asList;

public interface HasConditions<T extends HasConditions> {

    Map<String, ConditionFunction> getConditions();

    void setConditions(Map<String, ConditionFunction> conditions);

    default T withConditions(Condition... conditions) {
        return withConditions(asList(conditions));
    }

    @SuppressWarnings("unchecked")
    default T withConditions(Collection<Condition> conditions) {
        withNamedMap(getMap(this::getConditions, this::setConditions), Condition::getCondition, conditions);
        return (T) this;
    }
}
