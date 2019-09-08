package aws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toMap;

/**
 * A list of Resources that can be added to a Template. This can be used to create common groupings of resources that
 * can then be reused within Templates.
 */
public class ResourceList<T extends ResourceList, R extends HasName> extends ArrayList<R> implements HasResources<T, R> {

    /**
     * Create an empty ResourceList.
     */
    public ResourceList() {
    }

    /**
     * Create a populated ResourceList.
     *
     * @param resources - The resources that will be contained within this list.
     */
    public ResourceList(R... resources) {
        this(asList(resources));
    }

    /**
     * Create a populated ResourceList.
     *
     * @param resources - The resources that will be contained within this list.
     */
    public ResourceList(Collection<R> resources) {
        super(resources);
    }

    /**
     * @return the resources in this list as a map with the resource names as the keys.
     */
    @Override
    public Map<String, R> getResources() {
        return stream().collect(toMap(HasName::getName, named -> named));
    }

    /**
     * @param resources - A map of resources where the resources are the values in the map.
     */
    @Override
    public void setResources(Map<String, R> resources) {
        withResources(resources.values());
    }

    /**
     * Add more resources to this ResourceList.
     *
     * @param resources -The resources to add.
     * @return this ResourceList.
     */
    @SuppressWarnings("unchecked")
    @Override
    public T withResources(Collection<R> resources) {
        addAll(resources);
        return (T) this;
    }
}
