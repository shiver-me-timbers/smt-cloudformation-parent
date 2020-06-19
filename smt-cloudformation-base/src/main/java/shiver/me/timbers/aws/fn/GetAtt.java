package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.HasAttributes;
import shiver.me.timbers.aws.HasName;
import shiver.me.timbers.aws.PrimitiveProperty;

import java.util.List;
import java.util.Objects;

import static java.lang.String.format;
import static java.util.Arrays.asList;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html">Fn::GetAtt</a>
 */
public class GetAtt extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::GetAtt")
    private final List<Object> values;

    /**
     * @param resource  - The resource that contains the attribute that you want.
     * @param attribute - The resource-specific attribute enum whose value you want. See the resource's reference page
     *                  for details about the attributes available for that resource type.
     */
    public <T, R extends HasName & HasAttributes<T>> GetAtt(R resource, T attribute) {
        super(format("{ \"Fn::GetAtt\" : [ \"%s\", \"%s\" ] }", resource.getName(), attribute));
        this.values = asList(resource.getName(), attribute);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAtt getAtt = (GetAtt) o;
        return Objects.equals(values, getAtt.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }
}
