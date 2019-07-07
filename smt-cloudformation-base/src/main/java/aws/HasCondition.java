package aws;

public interface HasCondition<T extends HasCondition> {

    void setCondition(String condition);

    @SuppressWarnings("unchecked")
    default T withCondition(Condition condition) {
        setCondition(condition.getName());
        return (T) this;
    }
}
