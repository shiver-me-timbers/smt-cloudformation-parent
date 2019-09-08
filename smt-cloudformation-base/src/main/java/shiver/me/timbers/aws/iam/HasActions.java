package shiver.me.timbers.aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Fluent methods for adding Actions to a Statement.
 */
public interface HasActions<T extends HasActions> {

    /**
     * Add Actions to this Statement.
     *
     * @param actions - The actions to add.
     * @return this Statement.
     */
    default T withActions(CharSequence... actions) {
        return withAction(asList(actions));
    }

    /**
     * Add Actions to this Statement.
     *
     * @param action - The actions to add.
     * @return this Statement.
     */
    T withAction(List<CharSequence> action);
}
