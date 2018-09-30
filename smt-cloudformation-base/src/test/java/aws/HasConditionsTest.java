package aws;

import aws.fn.ConditionFunction;
import org.junit.Test;

import java.util.Map;

import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class HasConditionsTest {

    @Test
    @SuppressWarnings("unchecked")
    public void Can_add_resources() {

        final Map<String, ConditionFunction> map = mock(Map.class);
        final Condition condition1 = mock(Condition.class);
        final Condition condition2 = mock(Condition.class);
        final Condition condition3 = mock(Condition.class);

        final String name1 = someString();
        final String name2 = someString();
        final String name3 = someString();
        final ConditionFunction function1 = mock(ConditionFunction.class);
        final ConditionFunction function2 = mock(ConditionFunction.class);
        final ConditionFunction function3 = mock(ConditionFunction.class);

        // Given
        given(condition1.getName()).willReturn(name1);
        given(condition2.getName()).willReturn(name2);
        given(condition3.getName()).willReturn(name3);
        given(condition1.getCondition()).willReturn(function1);
        given(condition2.getCondition()).willReturn(function2);
        given(condition3.getCondition()).willReturn(function3);

        // When
        new HasConditions<Object>() {
            @Override
            public Map<String, ConditionFunction> getConditions() {
                return map;
            }

            @Override
            public void setConditions(Map conditions) {
                throw new UnsupportedOperationException();
            }
        }.withConditions(condition1, condition2, condition3);

        // Then
        then(map).should().put(name1, function1);
        then(map).should().put(name2, function2);
        then(map).should().put(name3, function3);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_add_new_resources() {

        // Given
        final Retriever<Map<String, ConditionFunction>, ?> retriever = mock(Retriever.class);

        // When
        new HasConditions<Object>() {
            @Override
            public Map<String, ConditionFunction> getConditions() {
                return null;
            }

            @Override
            public void setConditions(Map conditions) {
                retriever.get(conditions);
            }
        }.withConditions();

        // Then
        then(retriever).should().get(anyMap());
    }
}