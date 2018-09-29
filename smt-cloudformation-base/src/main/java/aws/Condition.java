package aws;

import aws.fn.ConditionFunction;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Condition implements ConditionFunction, HasName {

    @JsonProperty("Condition")
    private final String name;

    @JsonIgnore
    private final ConditionFunction condition;

    public Condition(String name, ConditionFunction condition) {
        this.name = name;
        this.condition = condition;
    }

    @Override
    public String getName() {
        return name;
    }

    public ConditionFunction getCondition() {
        return condition;
    }
}
