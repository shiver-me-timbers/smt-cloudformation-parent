package shiver.me.timbers.aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Fluent methods for adding Statements to a PolicyDocument.
 */
public interface HasStatements<T extends HasStatements, S> {

    /**
     * Add Statements to this PolicyDocument.
     *
     * @param statements - The Statements to add.
     * @return this PolicyDocument.
     */
    default T withStatements(S... statements) {
        return withStatement(asList(statements));
    }

    /**
     * Add Statements to this PolicyDocument.
     *
     * @param statement - The Statements to add.
     * @return this PolicyDocument.
     */
    T withStatement(List<S> statement);
}
