package aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static java.util.Arrays.asList;

public class Or implements ConditionFunction {

    @JsonProperty("Fn::Or")
    private final List<ConditionFunction> conditions;

    public Or(ConditionFunction... conditions) {
        this(asList(conditions));
    }

    public Or(List<ConditionFunction> conditions) {
        this.conditions = conditions;
    }
}
