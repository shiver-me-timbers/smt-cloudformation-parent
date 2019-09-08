package shiver.me.timbers.aws;

import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

/**
 * Fluent methods for adding dependencies to a Resource.
 */
public interface HasDependsOn<T extends HasDependsOn> {

    /**
     * Add dependencies to a Resource.
     *
     * @param dependsOn - The dependencies to add.
     * @return this Resource.
     */
    @SuppressWarnings("unchecked")
    default T withDependsOn(HasReference... dependsOn) {
        return withDependsOn(asList(dependsOn));
    }

    /**
     * Add dependencies to a Resource.
     *
     * @param dependsOn - The dependencies to add.
     * @return this Resource.
     */
    @SuppressWarnings("unchecked")
    default T withDependsOn(Collection<HasReference> dependsOn) {
        setDependsOn(dependsOn.stream().map(HasReference::getName).collect(toList()));
        return (T) this;
    }

    /**
     * Set the dependencies for this Resource.
     *
     * @param dependsOn - The dependencies to set for this Resource.
     */
    void setDependsOn(List<String> dependsOn);
}
