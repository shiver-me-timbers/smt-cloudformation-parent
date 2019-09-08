package aws.fn;

import aws.PrimitiveProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-split.html">Fn::Split</a>
 */
public class Split extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::Split")
    private final List<CharSequence> values;

    /**
     * @param delimiter - A string value that determines where the source string is divided.
     * @param string    - The string value that you want to split.
     */
    public Split(String delimiter, CharSequence string) {
        super(format("{ \"Fn::Split\" : [ \"%s\", \"%s\" ] }", delimiter, string));
        this.values = asList(delimiter, string);
    }
}
