package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-conditions.html#intrinsic-function-reference-conditions-equals">Fn::Equals</a>
 */
public class Equals<T> implements ConditionFunction {

    @JsonProperty("Fn::Equals")
    private final List<T> values;

    /**
     * @param value1 - A value of any type that you want to compare.
     * @param value2 - A value of any type that you want to compare.
     */
    public Equals(T value1, T value2) {
        this.values = asList(value1, value2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equals<?> equals = (Equals<?>) o;
        return Objects.equals(values, equals.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }
}
