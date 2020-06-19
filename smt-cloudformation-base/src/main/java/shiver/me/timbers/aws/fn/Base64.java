package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.PrimitiveProperty;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Base64 base64 = (Base64) o;
        return Objects.equals(valueToEncode, base64.valueToEncode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueToEncode);
    }
}
