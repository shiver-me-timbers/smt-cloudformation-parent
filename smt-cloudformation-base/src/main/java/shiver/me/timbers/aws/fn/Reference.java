package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.PrimitiveProperty;

import static java.lang.String.format;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html">Ref</a>
 */
public class Reference extends PrimitiveProperty implements Function {

    @JsonProperty("Ref")
    private final String logicalName;

    /**
     * @param logicalName - The logical name of the resource or parameter you want to dereference.
     */
    public Reference(String logicalName) {
        super(format("${%s}", logicalName));
        this.logicalName = logicalName;
    }
}
