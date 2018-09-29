package aws.fn;

import aws.StringProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;

public class FindInMap extends StringProperty implements StringFunction {

    @JsonProperty("Fn::FindInMap")
    private final List<CharSequence> values;

    public FindInMap(CharSequence mapName, CharSequence topLevelKey, CharSequence secondLevelKey) {
        super(format("{ \"Fn::FindInMap\" : [\"%s\", \"%s\", \"%s\"] }", mapName, topLevelKey, secondLevelKey));
        this.values = asList(mapName, topLevelKey, secondLevelKey);
    }
}
