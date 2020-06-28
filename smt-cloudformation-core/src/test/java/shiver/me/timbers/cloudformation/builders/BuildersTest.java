package shiver.me.timbers.cloudformation.builders;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomThings.someThing;

public class BuildersTest {

    @Test
    @SuppressWarnings("unchecked")
    public void Can_apply_transformations() {

        // Given
        final Builder<Object, Object> builder1 = mock(Builder.class);
        final Builder<Object, Object> builder2 = mock(Builder.class);
        final Builder<Object, Object> builder3 = mock(Builder.class);
        final Object object = someThing();
        final Object config = someThing();

        // When
        new Builders<>(asList(builder1, builder2, builder3)).apply(object, config);

        // Then
        then(builder1).should().apply(object, config);
        then(builder2).should().apply(object, config);
        then(builder3).should().apply(object, config);
    }
}