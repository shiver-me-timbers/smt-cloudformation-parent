package shiver.me.timbers.aws;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.fn.ConditionFunction;

import java.util.Objects;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/conditions-section-structure.html">Condition</a>
 */
public class Condition implements ConditionFunction, HasName {

    @JsonProperty("Condition")
    private final String name;

    @JsonIgnore
    private final ConditionFunction condition;

    /**
     * @param name      - The name of the condition.
     * @param condition - The intrinsic function that is evaluated when the stack is create or update.
     */
    public Condition(String name, ConditionFunction condition) {
        this.name = name;
        this.condition = condition;
    }

    /**
     * @return The name of the condition.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @return The intrinsic function that is evaluated when the stack is create or update.
     */
    public ConditionFunction getCondition() {
        return condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Condition condition1 = (Condition) o;
        return Objects.equals(name, condition1.name) &&
            Objects.equals(condition, condition1.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, condition);
    }
}
