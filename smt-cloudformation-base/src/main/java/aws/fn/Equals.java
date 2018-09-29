package aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static java.util.Arrays.asList;

public class Equals<T> implements ConditionFunction {

    @JsonProperty("Fn::Equals")
    private final List<T> values;

    public Equals(T left, T right) {
        this.values = asList(left, right);
    }
}
