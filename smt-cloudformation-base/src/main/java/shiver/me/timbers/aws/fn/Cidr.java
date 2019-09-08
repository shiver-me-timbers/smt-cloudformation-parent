package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.PrimitiveProperty;

import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-cidr.html">Fn::Cidr</a>
 */
public class Cidr extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::Cidr")
    private final List<CharSequence> values;

    /**
     * @param ipBlock  - The user-specified CIDR address block to be split into smaller CIDR blocks.
     * @param count    - The number of CIDRs to generate. Valid range is between 1 and 256.
     * @param cidrBits - The number of subnet bits for the CIDR. For example, specifying a value "8" for this parameter
     *                 will create a CIDR with a mask of "/24".
     */
    public Cidr(CharSequence ipBlock, CharSequence count, CharSequence cidrBits) {
        super(format("{ \"Fn::Cidr\" : [\"%s\", \"%s\", \"%s\"] }", ipBlock, count, cidrBits));
        this.values = asList(ipBlock, count, cidrBits);
    }
}
