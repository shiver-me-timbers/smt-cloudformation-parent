package aws.fn;

import aws.StringProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static aws.Strings.toStrings;
import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Join extends StringProperty implements StringFunction {

    @JsonProperty("Fn::Join")
    private final List<Object> values;

    public Join(String delimiter, String... strings) {
        this(delimiter, asList(strings));
    }

    public Join(String delimiter, List<String> strings) {
        super(format("{ \"Fn::Join\" : [ \"%s\", [%s] ] }", delimiter, toStrings(strings)));
        this.values = asList(delimiter, strings);
    }
}
