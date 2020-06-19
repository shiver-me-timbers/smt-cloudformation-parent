package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.PrimitiveProperty;

import java.util.List;
import java.util.Objects;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static shiver.me.timbers.aws.StringLists.toStringList;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-select.html">Fn::Select</a>
 */
public class Select extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::Select")
    private final List<Object> listOfStrings;

    /**
     * @param index         - The index of the object to retrieve. This must be a value from zero to N-1, where N
     *                      represents the number of elements in the array.
     * @param listOfStrings - Some strings to select from. This list must not be null, nor can it have null entries.
     */
    public Select(int index, String... listOfStrings) {
        this(index, asList(listOfStrings));
    }

    /**
     * @param index         - The index of the object to retrieve. This must be a value from zero to N-1, where N
     *                      represents the number of elements in the array.
     * @param listOfStrings - The list of string to select from. This list must not be null, nor can it have null entries.
     */
    public Select(int index, List<String> listOfStrings) {
        super(format("{ \"Fn::Select\" : [ \"%s\", [%s] ] }", index, toStringList(listOfStrings)));
        this.listOfStrings = asList(String.valueOf(index), listOfStrings);
    }

    /**
     * @param index    - The index of the object to retrieve. This must be a value from zero to N-1, where N represents
     *                 the number of elements in the array.
     * @param function - A function that will produce the list to select from.
     */
    public Select(int index, Function function) {
        super(format("{ \"Fn::Select\" : [ \"%s\", %s ] }", index, function));
        this.listOfStrings = asList(String.valueOf(index), function);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Select select = (Select) o;
        return Objects.equals(listOfStrings, select.listOfStrings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfStrings);
    }
}
