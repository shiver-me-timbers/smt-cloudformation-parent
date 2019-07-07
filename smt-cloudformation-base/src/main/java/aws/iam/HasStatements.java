package aws.iam;

import java.util.List;

import static java.util.Arrays.asList;

public interface HasStatements<T extends HasStatements, S> {

    default T withStatements(S... statements) {
        return withStatement(asList(statements));
    }

    T withStatement(List<S> statement);
}
