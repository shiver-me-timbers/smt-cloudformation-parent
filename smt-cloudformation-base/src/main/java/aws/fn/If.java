package aws.fn;

import aws.PrimitiveProperty;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static aws.Strings.toStrings;
import static aws.parameters.PseudoParameter.NoValue;
import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;

public class If<T> extends PrimitiveProperty implements ConditionFunction, StringFunction, Property<T> {

    @JsonProperty("Fn::If")
    private final List<Object> values;

    public If(String condition, T trueValue, T falseValue) {
        this(asList(condition, trueValue, falseValue));
    }

    public If(String condition, T trueValue) {
        this(asList(condition, trueValue, NoValue));
    }

    private If(List<Object> values) {
        super(format(
            "{ \"Fn::If\" : [ %s ] }",
            toStrings(values).stream().map(string -> "\"" + string + "\"").collect(joining(","))
        ));
        this.values = values;
    }

    @Override
    public T toType() {
        throw new UnsupportedOperationException(
            "The type instance of an 'If' is indeterminate before the template has been processed by Cloudformation."
        );
    }
}
