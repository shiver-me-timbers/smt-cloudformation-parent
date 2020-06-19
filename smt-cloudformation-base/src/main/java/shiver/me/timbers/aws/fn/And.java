package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-conditions.html#intrinsic-function-reference-conditions-and">Fn::And</a>
 */
public class And implements ConditionFunction {

    @JsonProperty("Fn::And")
    private final List<ConditionFunction> conditions;

    /**
     * @param conditions - Some conditions that evaluate to true or false.
     */
    public And(ConditionFunction... conditions) {
        this(asList(conditions));
    }

    /**
     * @param conditions - Some conditions that evaluate to true or false.
     */
    public And(List<ConditionFunction> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        And and = (And) o;
        return Objects.equals(conditions, and.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditions);
    }
}
