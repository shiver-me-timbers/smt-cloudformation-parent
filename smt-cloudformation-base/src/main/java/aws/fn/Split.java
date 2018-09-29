package aws.fn;

import aws.StringProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Split extends StringProperty implements StringFunction {

    @JsonProperty("Fn::Split")
    private final List<CharSequence> values;

    public Split(String delimiter, CharSequence string) {
        super(format("{ \"Fn::Split\" : [ \"%s\", \"%s\" ] }", delimiter, string));
        this.values = asList(delimiter, string);
    }
}
