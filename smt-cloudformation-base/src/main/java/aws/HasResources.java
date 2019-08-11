package aws;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static aws.Names.getMap;
import static aws.Names.withNamedMap;
import static java.util.Arrays.asList;

public interface HasResources<T extends HasResources, R extends HasName> {

    Map<String, R> getResources();

    void setResources(Map<String, R> resources);

    @SuppressWarnings("unchecked")
    default T withResources(R... resources) {
        return withResources(asList(resources));
    }

    @SuppressWarnings("unchecked")
    default T withResources(Collection<R> resources) {
        withNamedMap(getMap(this::getResources, this::setResources), resources);
        return (T) this;
    }
}
