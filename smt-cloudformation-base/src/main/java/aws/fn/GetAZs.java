package aws.fn;

import aws.PrimitiveProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import static java.lang.String.format;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getavailabilityzones.html">Fn::GetAZs</a>
 */
public class GetAZs extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::GetAZs")
    private final CharSequence region;

    /**
     * @param region - The name of the region for which you want to get the Availability Zones.
     */
    public GetAZs(CharSequence region) {
        super(format("{ \"Fn::GetAZs\" : \"%s\" }", region));
        this.region = region;
    }
}
