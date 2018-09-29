package aws;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public interface HasDependsOn<T> {

    void setDependsOn(List<String> dependsOn);

    @SuppressWarnings("unchecked")
    default T withDependsOn(HasReference... dependsOn) {
        setDependsOn(Arrays.stream(dependsOn).map(HasReference::getName).collect(toList()));
        return (T) this;
    }
}
