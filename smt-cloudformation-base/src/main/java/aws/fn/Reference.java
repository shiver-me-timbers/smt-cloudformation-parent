package aws.fn;

import aws.StringProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Reference extends StringProperty implements Function {

    @JsonProperty("Ref")
    private final String name;

    public Reference(String name) {
        super("{ \"Ref\": \"" + name + "\" }");
        this.name = name;
    }
}
