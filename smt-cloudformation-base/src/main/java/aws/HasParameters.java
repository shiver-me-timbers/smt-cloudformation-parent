package aws;

import java.util.Map;

import static aws.HasNamedMap.withNamedMap;

public interface HasParameters<T, P extends HasName> {

    Map<String, P> getParameters();

    default T withParameters(P... parameters) {
        withNamedMap(getParameters(), parameters);
        return (T) this;
    }
}
