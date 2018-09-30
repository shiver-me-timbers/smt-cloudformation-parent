package aws;

import org.junit.Test;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class HasConditionTest {

    @Test
    @SuppressWarnings("unchecked")
    public void Can_set_a_condition() {

        final Condition condition = mock(Condition.class);
        final Retriever<String, ?> retriever = mock(Retriever.class);

        final String name = someString();

        // Given
        given(condition.getName()).willReturn(name);

        // When
        ((HasCondition<Object>) retriever::get).withCondition(condition);

        // Then
        then(retriever).should().get(name);
    }
}