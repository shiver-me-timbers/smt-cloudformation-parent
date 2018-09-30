package aws;

import java.util.Map;

import static aws.Names.getMap;
import static aws.Names.withNamedMap;

public interface HasOutputs<T, O extends HasName> {

    Map<String, O> getOutputs();

    void setOutputs(Map<String, O> outputs);

    default T withOutputs(O... outputs) {
        withNamedMap(getMap(this::getOutputs, this::setOutputs), outputs);
        return (T) this;
    }
}
