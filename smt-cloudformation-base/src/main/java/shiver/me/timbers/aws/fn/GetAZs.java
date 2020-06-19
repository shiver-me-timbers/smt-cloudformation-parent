package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.PrimitiveProperty;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAZs getAZs = (GetAZs) o;
        return Objects.equals(region, getAZs.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region);
    }
}
