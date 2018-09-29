package aws.fn;

import aws.HasAttributes;
import aws.HasName;
import aws.StringProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;

public class GetAtt extends StringProperty implements StringFunction {

    @JsonProperty("Fn::GetAtt")
    private final List<Object> values;

    public <T, R extends HasName & HasAttributes<T>> GetAtt(R resource, T attribute) {
        super(format("{ \"Fn::GetAtt\" : [ \"%s\", \"%s\" ] }", resource.getName(), attribute));
        this.values = asList(resource.getName(), attribute);
    }
}
