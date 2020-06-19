package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.PrimitiveProperty;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reference reference = (Reference) o;
        return Objects.equals(logicalName, reference.logicalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicalName);
    }
}
