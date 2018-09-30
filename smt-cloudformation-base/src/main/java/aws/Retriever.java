package aws;

public interface Retriever<I, O> {

    O get(I input);
}
