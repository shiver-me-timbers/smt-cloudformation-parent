package aws.fn;

import aws.StringProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import static java.lang.String.format;

public class Base64 extends StringProperty implements StringFunction {

    @JsonProperty("Fn::Base64")
    private final CharSequence value;

    public Base64(CharSequence value) {
        super(format("{ \"Fn::Base64\" : \"%s\" }", value));
        this.value = value;
    }
}
