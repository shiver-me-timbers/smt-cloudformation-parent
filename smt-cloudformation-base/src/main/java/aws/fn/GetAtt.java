package aws.fn;

import aws.HasAttributes;
import aws.HasName;
import aws.PrimitiveProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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
}
