package aws.fn;

import aws.PrimitiveProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import static java.lang.String.format;

public class GetAZs extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::GetAZs")
    private final CharSequence value;

    public GetAZs(CharSequence value) {
        super(format("{ \"Fn::GetAZs\" : \"%s\" }", value));
        this.value = value;
    }
}
