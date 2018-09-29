package aws.fn;

import aws.StringProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import static java.lang.String.format;

public class ImportValue extends StringProperty implements StringFunction {

    @JsonProperty("Fn::ImportValue")
    private final CharSequence value;

    public ImportValue(CharSequence value) {
        super(format("{ \"Fn::ImportValue\" : \"%s\" }", value));
        this.value = value;
    }
}
