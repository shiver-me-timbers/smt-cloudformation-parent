package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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
}
