package aws.fn;

import aws.StringProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static aws.Strings.toStrings;
import static aws.parameters.PseudoParameter.NoValue;
import static java.lang.String.format;
import static java.util.Arrays.asList;

public class If<T> extends StringProperty implements ConditionFunction, StringFunction {

    @JsonProperty("Fn::If")
    private final List<Object> values;

    public If(String condition, T trueValue, T falseValue) {
        this(asList(condition, trueValue, falseValue));
    }

    public If(String condition, T trueValue) {
        this(asList(condition, trueValue, NoValue));
    }

    private If(List<Object> values) {
        super(format("{ \"Fn::If\" : [ \"%s\" ] }", toStrings(values)));
        this.values = values;
    }
}
