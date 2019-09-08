package aws.fn;

import aws.PrimitiveProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static aws.StringLists.toStringList;
import static java.lang.String.format;
import static java.util.Arrays.asList;

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
}
