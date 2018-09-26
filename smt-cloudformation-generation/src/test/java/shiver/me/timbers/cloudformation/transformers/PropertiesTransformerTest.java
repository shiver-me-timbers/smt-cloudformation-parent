package shiver.me.timbers.cloudformation.transformers;

import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;

import java.util.Map;

import static java.util.Arrays.asList;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PropertiesTransformerTest {

    @Test
    @SuppressWarnings("unchecked")
    public void Can_apply_transforms_over_the_correct_properties() {

        final PropertyTransformer transformer1 = mock(PropertyTransformer.class);
        final PropertyTransformer transformer2 = mock(PropertyTransformer.class);
        final PropertyTransformer transformer3 = mock(PropertyTransformer.class);
        final String resourceName = someString();
        final CloudformationType type = mock(CloudformationType.class);
        final String propertyName = someString();
        final CloudformationProperty cloudformationProperty = mock(CloudformationProperty.class);
        final Map<String, Object> property = mock(Map.class);

        // Given
        given(transformer1.supports(cloudformationProperty)).willReturn(true);
        given(transformer2.supports(cloudformationProperty)).willReturn(false);
        given(transformer3.supports(cloudformationProperty)).willReturn(true);

        // When
        new PropertiesTransformer(asList(transformer1, transformer2, transformer3))
            .transform(resourceName, type, propertyName, cloudformationProperty, property);

        // Then
        then(transformer1).should().transform(resourceName, type, propertyName, cloudformationProperty, property);
        then(transformer2).should(never()).transform(
            anyString(),
            any(CloudformationType.class),
            anyString(),
            any(CloudformationProperty.class),
            anyMap()
        );
        then(transformer3).should().transform(resourceName, type, propertyName, cloudformationProperty, property);
    }
}