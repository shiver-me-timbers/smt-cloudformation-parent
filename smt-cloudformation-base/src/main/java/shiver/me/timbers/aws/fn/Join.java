package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.PrimitiveProperty;

import java.util.List;
import java.util.Objects;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static shiver.me.timbers.aws.StringLists.toStringList;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-join.html">Fn::Join</a>
 */
public class Join extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::Join")
    private final List<Object> listOfValues;

    /**
     * @param delimiter    - The value you want to occur between fragments. The delimiter will occur between fragments
     *                     only. It will not terminate the final value.
     * @param listOfValues - The list of values you want combined.
     */
    public Join(String delimiter, CharSequence... listOfValues) {
        this(delimiter, asList(listOfValues));
    }

    /**
     * @param delimiter    - The value you want to occur between fragments. The delimiter will occur between fragments
     *                     only. It will not terminate the final value.
     * @param listOfValues - The list of values you want combined.
     */
    public Join(String delimiter, List<CharSequence> listOfValues) {
        super(format("{ \"Fn::Join\" : [ \"%s\", [%s] ] }", delimiter, toStringList(listOfValues)));
        this.listOfValues = asList(delimiter, listOfValues);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Join join = (Join) o;
        return Objects.equals(listOfValues, join.listOfValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfValues);
    }
}
