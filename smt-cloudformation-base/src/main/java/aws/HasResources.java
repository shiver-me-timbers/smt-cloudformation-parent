package aws;

import java.util.Map;

import static aws.Names.getMap;
import static aws.Names.withNamedMap;

public interface HasResources<T, R extends HasName> {

    Map<String, R> getResources();

    void setResources(Map<String, R> resources);

    @SuppressWarnings("unchecked")
    default T withResources(R... resources) {
        withNamedMap(getMap(this::getResources, this::setResources), resources);
        return (T) this;
    }
}
