package shiver.me.timbers.cloudformation.builders;

import java.util.List;

public class Builders<T, C> {

    private final List<Builder<T, C>> builders;

    public Builders(List<Builder<T, C>> builders) {
        this.builders = builders;
    }

    public void apply(T object, C config) {
        builders.forEach(t -> t.apply(object, config));
    }
}
