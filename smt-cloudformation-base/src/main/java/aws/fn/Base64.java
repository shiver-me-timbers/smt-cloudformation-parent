package aws.fn;

import aws.PrimitiveProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import static java.lang.String.format;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-base64.html">Fn::Base64</a>
 */
public class Base64 extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::Base64")
    private final CharSequence valueToEncode;

    /**
     * @param valueToEncode - The string value you want to convert to Base64.
     */
    public Base64(CharSequence valueToEncode) {
        super(format("{ \"Fn::Base64\" : \"%s\" }", valueToEncode));
        this.valueToEncode = valueToEncode;
    }
}
