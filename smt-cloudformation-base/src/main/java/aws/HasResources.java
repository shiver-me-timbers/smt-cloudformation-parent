package aws;

import java.util.Map;

import static aws.HasNamedMap.withNamedMap;

public interface HasResources<T, R extends HasName> {

    Map<String, R> getResources();

    default T withResources(R... resources) {
        withNamedMap(getResources(), resources);
        return (T) this;
    }
}
