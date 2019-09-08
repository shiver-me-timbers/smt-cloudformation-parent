package shiver.me.timbers.aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Fluent methods for adding NotActions to a Statement.
 */
public interface HasNotActions<T extends HasNotActions> {

    /**
     * Add NotActions to this Statement.
     *
     * @param actions - The not actions to add.
     * @return this Statement.
     */
    default T withNotActions(CharSequence... actions) {
        return withNotAction(asList(actions));
    }

    /**
     * Add NotActions to this Statement.
     *
     * @param actions - The not actions to add.
     * @return this Statement.
     */
    T withNotAction(List<CharSequence> action);
}
