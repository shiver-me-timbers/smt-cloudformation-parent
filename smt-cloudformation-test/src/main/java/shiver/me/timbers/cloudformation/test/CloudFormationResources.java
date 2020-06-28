package shiver.me.timbers.cloudformation.test;

import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Resource;

import java.util.List;
import java.util.function.Predicate;

import static java.lang.String.format;

public class CloudFormationResources {

    public static <R extends Resource> R findResource(List<Resource> resources, Class<R> type) {
        return findResource(resources, type, r -> true);
    }

    @SuppressWarnings("unchecked")
    public static <R extends Resource> R findResource(List<Resource> resources, Class<R> type, Predicate<R> filter) {
        return resources.stream()
            .filter(r -> type.isAssignableFrom(r.getClass()))
            .map(r -> (R) r)
            .filter(filter)
            .findFirst()
            .orElseThrow(
                () -> new IllegalStateException(format("Could not find resource of type (%s).", type.getSimpleName()))
            );
    }

    public static <T> T t(Property<T> property) {
        return property.toType();
    }
}
