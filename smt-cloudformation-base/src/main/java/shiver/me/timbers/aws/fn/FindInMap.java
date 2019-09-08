package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.PrimitiveProperty;

import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-findinmap.html">Fn::FindInMap</a>
 */
public class FindInMap extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::FindInMap")
    private final List<CharSequence> values;

    /**
     * @param mapName        - The logical name of a mapping declared in the Mappings section that contains the keys and
     *                       values.
     * @param topLevelKey    - The top-level key name. Its value is a list of key-value pairs.
     * @param secondLevelKey - The second-level key name, which is set to one of the keys from the list assigned to
     *                       TopLevelKey.
     */
    public FindInMap(CharSequence mapName, CharSequence topLevelKey, CharSequence secondLevelKey) {
        super(format("{ \"Fn::FindInMap\" : [\"%s\", \"%s\", \"%s\"] }", mapName, topLevelKey, secondLevelKey));
        this.values = asList(mapName, topLevelKey, secondLevelKey);
    }
}
