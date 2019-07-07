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

    @SuppressWarnings("unchecked")
    default T withResourceLists(List<R>... resources) {
        return withResourceLists(asList(resources));
    }

    @SuppressWarnings("unchecked")
    default T withResourceLists(Collection<List<R>> resourceLists) {
        resourceLists.forEach(res -> withNamedMap(getMap(this::getResources, this::setResources), res));
        return (T) this;
    }
}
