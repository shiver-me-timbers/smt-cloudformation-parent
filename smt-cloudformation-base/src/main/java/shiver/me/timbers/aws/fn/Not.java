package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

import static java.util.Collections.singletonList;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-conditions.html#intrinsic-function-reference-conditions-not">Fn::Not</a>
 */
public class Not implements ConditionFunction {

    @JsonProperty("Fn::Not")
    private final List<ConditionFunction> condition;

    /**
     * @param condition - A condition such as {@link Functions#fnEquals} that evaluates to true or false.
     */
    public Not(ConditionFunction condition) {
        this.condition = singletonList(condition);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Not not = (Not) o;
        return Objects.equals(condition, not.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition);
    }
}
