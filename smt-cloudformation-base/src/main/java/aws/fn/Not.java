package aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static java.util.Collections.singletonList;

public class Not implements ConditionFunction {

    @JsonProperty("Fn::Not")
    private final List<ConditionFunction> condition;

    public Not(ConditionFunction condition) {
        this.condition = singletonList(condition);
    }
}
