package aws;

import java.util.Collection;
import java.util.Map;

import static aws.Names.getMap;
import static aws.Names.withNamedMap;
import static java.util.Arrays.asList;

public interface HasOutputs<T extends HasOutputs, O extends HasName> {

    Map<String, O> getOutputs();

    void setOutputs(Map<String, O> outputs);

    @SuppressWarnings("unchecked")
    default T withOutputs(O... outputs) {
        return withOutputs(asList(outputs));
    }

    @SuppressWarnings("unchecked")
    default T withOutputs(Collection<O> outputs) {
        withNamedMap(getMap(this::getOutputs, this::setOutputs), outputs);
        return (T) this;
    }
}
