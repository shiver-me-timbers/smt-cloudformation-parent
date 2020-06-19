package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.Condition;
import shiver.me.timbers.aws.PrimitiveProperty;
import shiver.me.timbers.aws.Property;

import java.util.List;
import java.util.Objects;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;
import static shiver.me.timbers.aws.StringLists.toStringList;
import static shiver.me.timbers.aws.parameters.PseudoParameter.NoValue;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-conditions.html#intrinsic-function-reference-conditions-if">Fn::If</a>
 */
public class If<T> extends PrimitiveProperty implements ConditionFunction, StringFunction, Property<T> {

    @JsonProperty("Fn::If")
    private final List<Object> values;

    /**
     * @param condition  - The condition for this if.
     * @param trueValue  - A value to be returned if the specified condition evaluates to true.
     * @param falseValue - A value to be returned if the specified condition evaluates to false.
     */
    public If(Condition condition, T trueValue, T falseValue) {
        this(condition.getName(), trueValue, falseValue);
    }

    /**
     * @param condition - The condition for this if.
     * @param trueValue - A value to be returned if the specified condition evaluates to true.
     */
    public If(Condition condition, T trueValue) {
        this(condition.getName(), trueValue);
    }

    /**
     * @param condition  - A reference to a condition in the Conditions section. Use the condition's name to reference it.
     * @param trueValue  - A value to be returned if the specified condition evaluates to true.
     * @param falseValue - A value to be returned if the specified condition evaluates to false.
     */
    public If(String condition, T trueValue, T falseValue) {
        this(asList(condition, trueValue, falseValue));
    }

    /**
     * @param condition - A reference to a condition in the Conditions section. Use the condition's name to reference it.
     * @param trueValue - A value to be returned if the specified condition evaluates to true.
     */
    public If(String condition, T trueValue) {
        this(asList(condition, trueValue, NoValue));
    }

    private If(List<Object> values) {
        super(format(
            "{ \"Fn::If\" : [ %s ] }",
            toStringList(values).stream().map(string -> "\"" + string + "\"").collect(joining(","))
        ));
        this.values = values;
    }

    @Override
    public T toType() {
        throw new UnsupportedOperationException(
            "The type instance of an 'If' is indeterminate before the template has been processed by Cloudformation."
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        If<?> anIf = (If<?>) o;
        return Objects.equals(values, anIf.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }
}
