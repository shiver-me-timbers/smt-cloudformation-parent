package shiver.me.timbers.cloudformation.transformers;

import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationType;

import java.util.Map;

import static java.util.AbstractMap.SimpleEntry;
import static java.util.Collections.emptyMap;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class AbstractTypeTransformerTest {

    @Test
    public void Can_transform_a_cloudformation_type() {

        // Given
        final String resourceName = someString();
        final CloudformationType cloudformationType = mock(CloudformationType.class);
        final Transformer transformer = mock(Transformer.class);

        // When
        new AbstractTypeTransformer() {
            @Override
            protected void transform(String resourceName, CloudformationType type, Map<String, Object> schema) {
                transformer.transform(resourceName, type, schema);
            }
        }.transform(new SimpleEntry<>(resourceName, cloudformationType));

        // Then
        then(transformer).should().transform(resourceName, cloudformationType, emptyMap());
    }

    private interface Transformer {
        void transform(String resourceName, CloudformationType type, Map<String, Object> schema);
    }
}