package shiver.me.timbers.aws;

/**
 * Fluent methods for adding Conditions to a Resource.
 */
public interface HasCondition<T extends HasCondition> {

    /**
     * Add a Condition to this Resource.
     *
     * @param condition - The Condition to add.
     * @return this Resource.
     */
    @SuppressWarnings("unchecked")
    default T withCondition(Condition condition) {
        setCondition(condition.getName());
        return (T) this;
    }

    /**
     * Add a Condition to this Resource.
     *
     * @param condition - The Condition to add.
     * @return this Resource.
     */
    void setCondition(String condition);
}
