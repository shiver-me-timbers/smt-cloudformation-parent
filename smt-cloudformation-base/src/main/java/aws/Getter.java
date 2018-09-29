package aws;

public interface Getter<I, O> {

    O get(I input);
}
