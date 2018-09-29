package aws;

import java.util.Map;

import static aws.Names.withNamedMap;

public interface HasParameters<T, P extends HasName> {

    Map<String, P> getParameters();

    @SuppressWarnings("unchecked")
    default T withParameters(P... parameters) {
        withNamedMap(getParameters(), parameters);
        return (T) this;
    }
}
