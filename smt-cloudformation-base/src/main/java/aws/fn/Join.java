package aws.fn;

import aws.PrimitiveProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static aws.StringLists.toStringList;
import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Join extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::Join")
    private final List<Object> values;

    public Join(String delimiter, CharSequence... strings) {
        this(delimiter, asList(strings));
    }

    public Join(String delimiter, List<CharSequence> strings) {
        super(format("{ \"Fn::Join\" : [ \"%s\", [%s] ] }", delimiter, toStringList(strings)));
        this.values = asList(delimiter, strings);
    }
}
