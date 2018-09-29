package aws.fn;

import aws.StringProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Sub extends StringProperty implements StringFunction {

    @JsonProperty("Fn::Sub")
    private final Object value;

    public Sub(CharSequence string) {
        super(format("{ \"Fn::Sub\" : \"%s\" }", string));
        this.value = string;
    }

    public Sub(CharSequence string, Map<String, CharSequence> variables) {
        super(format("{ \"Fn::Sub\" : [\"%s\", %s] }", string, variables));
        this.value = asList(string, variables);
    }
}
