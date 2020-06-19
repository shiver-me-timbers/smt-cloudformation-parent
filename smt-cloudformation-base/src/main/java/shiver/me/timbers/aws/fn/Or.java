package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-conditions.html#intrinsic-function-reference-conditions-or">Fn::Or</a>
 */
public class Or implements ConditionFunction {

    @JsonProperty("Fn::Or")
    private final List<ConditionFunction> conditions;

    /**
     * @param conditions - Some conditions that evaluate to true or false.
     */
    public Or(ConditionFunction... conditions) {
        this(asList(conditions));
    }

    /**
     * @param conditions - A list of conditions that evaluate to true or false.
     */
    public Or(List<ConditionFunction> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Or or = (Or) o;
        return Objects.equals(conditions, or.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditions);
    }
}
