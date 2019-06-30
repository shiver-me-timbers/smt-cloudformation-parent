package aws.fn;

import aws.PrimitiveProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import static java.lang.String.format;

public class Reference extends PrimitiveProperty implements Function {

    @JsonProperty("Ref")
    private final String name;

    public Reference(String name) {
        super(format("${%s}", name));
        this.name = name;
    }
}
