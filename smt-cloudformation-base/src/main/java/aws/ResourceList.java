package aws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toMap;

public class ResourceList<T extends ResourceList, R extends HasName> extends ArrayList<R> implements HasResources<T, R> {

    public ResourceList() {
    }

    public ResourceList(R... resources) {
        this(asList(resources));
    }

    public ResourceList(Collection<R> collection) {
        super(collection);
    }

    @Override
    public Map<String, R> getResources() {
        return stream().collect(toMap(HasName::getName, named -> named));
    }

    @Override
    public void setResources(Map<String, R> resources) {
        withResources(resources.values());
    }

    @SuppressWarnings("unchecked")
    @Override
    public T withResources(Collection<R> resources) {
        addAll(resources);
        return (T) this;
    }
}
