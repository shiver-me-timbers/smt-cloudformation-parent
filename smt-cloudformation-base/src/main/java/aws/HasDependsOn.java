package aws;

import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public interface HasDependsOn<T extends HasDependsOn> {

    void setDependsOn(List<String> dependsOn);

    @SuppressWarnings("unchecked")
    default T withDependsOn(HasReference... dependsOn) {
        return withDependsOn(asList(dependsOn));
    }

    @SuppressWarnings("unchecked")
    default T withDependsOn(Collection<HasReference> dependsOn) {
        setDependsOn(dependsOn.stream().map(HasReference::getName).collect(toList()));
        return (T) this;
    }
}
