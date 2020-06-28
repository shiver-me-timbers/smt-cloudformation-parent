package shiver.me.timbers.cloudformation.builders;

public interface Builder<T, C> {

    void apply(T object, C config);
}
