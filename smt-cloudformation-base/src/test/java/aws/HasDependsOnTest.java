package aws;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class HasDependsOnTest {

    @Test
    @SuppressWarnings("unchecked")
    public void Can_set_depends_on() {

        final HasReference resource1 = mock(HasReference.class);
        final HasReference resource2 = mock(HasReference.class);
        final HasReference resource3 = mock(HasReference.class);
        final Getter<List<String>, ?> getter = mock(Getter.class);

        final String name1 = someString();
        final String name2 = someString();
        final String name3 = someString();

        // Given
        given(resource1.getName()).willReturn(name1);
        given(resource2.getName()).willReturn(name2);
        given(resource3.getName()).willReturn(name3);

        // When
        ((HasDependsOn) getter::get).withDependsOn(resource1, resource2, resource3);

        // Then
        then(getter).should().get(asList(name1, name2, name3));
    }
}