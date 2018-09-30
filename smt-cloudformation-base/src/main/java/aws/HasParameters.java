package aws;

import java.util.Map;

import static aws.Names.getMap;
import static aws.Names.withNamedMap;

public interface HasParameters<T, P extends HasName> {

    Map<String, P> getParameters();

    void setParameters(Map<String, P> parameters);

    @SuppressWarnings("unchecked")
    default T withParameters(P... parameters) {
        withNamedMap(getMap(this::getParameters, this::setParameters), parameters);
        return (T) this;
    }
}
