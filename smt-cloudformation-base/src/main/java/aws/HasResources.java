package aws;

import java.util.Map;

import static aws.Names.withNamedMap;

public interface HasResources<T, R extends HasName> {

    Map<String, R> getResources();

    @SuppressWarnings("unchecked")
    default T withResources(R... resources) {
        withNamedMap(getResources(), resources);
        return (T) this;
    }
}
