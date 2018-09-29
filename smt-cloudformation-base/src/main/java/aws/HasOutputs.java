package aws;

import java.util.Map;

import static aws.Names.withNamedMap;

public interface HasOutputs<T, O extends HasName> {

    Map<String, O> getOutputs();

    default T withOutputs(O... outputs) {
        withNamedMap(getOutputs(), outputs);
        return (T) this;
    }
}
