package aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static java.util.Arrays.asList;

public class And implements ConditionFunction {

    @JsonProperty("Fn::And")
    private final List<ConditionFunction> conditions;

    public And(ConditionFunction... conditions) {
        this.conditions = asList(conditions);
    }
}
