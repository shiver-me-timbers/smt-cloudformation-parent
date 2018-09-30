package aws;

import org.junit.Test;

import java.util.Map;

import static java.util.Collections.emptyMap;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class HasResourcesTest {

    @Test
    @SuppressWarnings("unchecked")
    public void Can_add_resources() {

        final Map<String, HasName> map = mock(Map.class);
        final HasName named1 = mock(HasName.class);
        final HasName named2 = mock(HasName.class);
        final HasName named3 = mock(HasName.class);

        final String name1 = someString();
        final String name2 = someString();
        final String name3 = someString();

        // Given
        given(named1.getName()).willReturn(name1);
        given(named2.getName()).willReturn(name2);
        given(named3.getName()).willReturn(name3);

        // When
        new HasResources<Object, HasName>() {
            @Override
            public Map getResources() {
                return map;
            }

            @Override
            public void setResources(Map resources) {
                throw new UnsupportedOperationException();
            }
        }.withResources(named1, named2, named3);

        // Then
        then(map).should().put(name1, named1);
        then(map).should().put(name2, named2);
        then(map).should().put(name3, named3);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_add_new_resources() {

        // Given
        final Setter<Map<String, HasName>> setter = mock(Setter.class);

        // When
        new HasResources<Object, HasName>() {
            @Override
            public Map<String, HasName> getResources() {
                return null;
            }

            @Override
            public void setResources(Map<String, HasName> resources) {
                setter.set(resources);
            }
        }.withResources();

        // Then
        then(setter).should().set(emptyMap());
    }
}