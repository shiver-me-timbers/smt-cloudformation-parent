package aws;

import java.util.Collection;
import java.util.Map;

import static aws.Names.getMap;
import static aws.Names.withNamedMap;
import static java.util.Arrays.asList;

public interface HasParameters<T extends HasParameters, P extends HasName> {

    Map<String, P> getParameters();

    void setParameters(Map<String, P> parameters);

    @SuppressWarnings("unchecked")
    default T withParameters(P... parameters) {
        return withParameters(asList(parameters));
    }

    @SuppressWarnings("unchecked")
    default T withParameters(Collection<P> parameters) {
        withNamedMap(getMap(this::getParameters, this::setParameters), parameters);
        return (T) this;
    }
}
