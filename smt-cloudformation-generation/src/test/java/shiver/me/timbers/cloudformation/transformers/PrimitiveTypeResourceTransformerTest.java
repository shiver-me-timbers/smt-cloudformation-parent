package shiver.me.timbers.cloudformation.transformers;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.types.PrimitiveTypeConverter;

import java.util.Map;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyZeroInteractions;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PrimitiveTypeResourceTransformerTest {

    private PrimitiveTypeConverter converter;
    private PrimitiveTypeResourceTransformer transformer;

    @Before
    public void setUp() {
        converter = mock(PrimitiveTypeConverter.class);
        transformer = new PrimitiveTypeResourceTransformer(converter);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_transform_a_primitive_type() {

        final String resourceName = someString();
        final CloudformationType type = mock(CloudformationType.class);
        final Map<String, Object> schema = mock(Map.class);

        final String primitiveType = someString();
        final Map<String, Object> typeMap = mock(Map.class);

        // Given
        given(type.getPrimitiveType()).willReturn(primitiveType);
        given(converter.convert(primitiveType)).willReturn(typeMap);

        // When
        transformer.transform(resourceName, type, schema);

        // Then
        then(schema).should().putAll(typeMap);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Will_not_transform_a_non_primitive_type() {

        final String resourceName = someString();
        final CloudformationType type = mock(CloudformationType.class);
        final Map<String, Object> schema = mock(Map.class);

        // Given
        given(type.getPrimitiveType()).willReturn(null);

        // When
        transformer.transform(resourceName, type, schema);

        // Then
        verifyZeroInteractions(converter, schema);
    }
}