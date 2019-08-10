package aws.fn;

import aws.PrimitiveProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static aws.StringLists.toStringList;
import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Select extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::Select")
    private final List<Object> values;

    public Select(int index, String... strings) {
        this(index, asList(strings));
    }

    public Select(int index, List<String> strings) {
        super(format("{ \"Fn::Select\" : [ \"%s\", [%s] ] }", index, toStringList(strings)));
        this.values = asList(String.valueOf(index), strings);
    }

    public Select(int index, Function function) {
        super(format("{ \"Fn::Select\" : [ \"%s\", %s ] }", index, function));
        this.values = asList(String.valueOf(index), function);
    }
}
