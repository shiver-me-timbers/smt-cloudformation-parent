package shiver.me.timbers.cloudformation.transformers.property;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.types.ClassTypeConverter;
import shiver.me.timbers.cloudformation.types.PrimitiveTypeConverter;
import shiver.me.timbers.cloudformation.types.TypeException;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyZeroInteractions;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class MapTransformerTest {

    private MapTransformer transformer;
    private ClassTypeConverter classTypeConverter;
    private PrimitiveTypeConverter primitiveTypeConverter;

    @Before
    public void setUp() {
        classTypeConverter = mock(ClassTypeConverter.class);
        primitiveTypeConverter = mock(PrimitiveTypeConverter.class);
        transformer = new MapTransformer(primitiveTypeConverter, classTypeConverter);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_transform_a_primitive_typed_map() {

        final CloudformationProperty cloudformationProperty = mock(CloudformationProperty.class);

        final String type = someString();

        final Map<String, Object> actual = new HashMap<>();
        final Map<String, Object> typeMap = mock(Map.class);
        final String mappedType = someString();

        // Given
        given(cloudformationProperty.getPrimitiveItemType()).willReturn(type);
        given(primitiveTypeConverter.convert(type)).willReturn(typeMap);
        given(typeMap.get("javaType")).willReturn(mappedType);

        // When
        transformer.transform(someString(), mock(CloudformationType.class), someString(), cloudformationProperty, actual);

        // Then
        assertThat(actual, hasEntry("type", "object"));
        assertThat(actual, hasEntry("javaType", format("java.util.Map<String, %s>", mappedType)));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_transform_a_boolean_typed_map() {

        final CloudformationProperty cloudformationProperty = mock(CloudformationProperty.class);

        final Map<String, Object> actual = new HashMap<>();

        // Given
        given(cloudformationProperty.getPrimitiveItemType()).willReturn("Boolean");

        // When
        transformer.transform(someString(), mock(CloudformationType.class), someString(), cloudformationProperty, actual);

        // Then
        verifyZeroInteractions(primitiveTypeConverter);
        assertThat(actual, hasEntry("type", "object"));
        assertThat(actual, hasEntry("javaType", "java.util.Map<String, java.lang.Boolean>"));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_transform_a_class_typed_map() {

        final String resourceName = someString();
        final CloudformationProperty cloudformationProperty = mock(CloudformationProperty.class);

        final String type = someString();
        final String javaType = someString();

        final Map<String, Object> actual = new HashMap<>();

        // Given
        given(cloudformationProperty.getItemType()).willReturn(type);
        given(classTypeConverter.toJavaType(resourceName, type)).willReturn(javaType);

        // When
        transformer.transform(resourceName, mock(CloudformationType.class), someString(), cloudformationProperty, actual);

        // Then
        assertThat(actual, hasEntry("type", "object"));
        assertThat(actual, hasEntry("javaType", format("java.util.Map<String, %s>", javaType)));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_fail_to_transform_a_map() {

        final CloudformationProperty cloudformationProperty = mock(CloudformationProperty.class);
        final String resourceName = someString();
        final String propertyName = someString();

        // Given
        given(cloudformationProperty.getPrimitiveItemType()).willReturn(null);
        given(cloudformationProperty.getItemType()).willReturn(null);

        // When
        final Throwable actual = catchThrowable(() -> transformer.transform(
            resourceName,
            mock(CloudformationType.class),
            propertyName,
            cloudformationProperty,
            new HashMap<>()
        ));

        // Then
        assertThat(actual, instanceOf(TypeException.class));
        assertThat(
            actual.getMessage(),
            equalTo(format("Could not find Map type for resource (%s) and property (%s),", resourceName, propertyName))
        );
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Will_support_map_types() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getType()).willReturn("Map");

        // When
        final boolean actual = transformer.supports(property);


        // Then
        assertThat(actual, is(true));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Will_ignore_non_list_types() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getType()).willReturn(someString());

        // When
        final boolean actual = transformer.supports(property);


        // Then
        assertThat(actual, is(false));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Will_ignore_non_class_types() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getType()).willReturn(null);

        // When
        final boolean actual = transformer.supports(property);


        // Then
        assertThat(actual, is(false));
    }
}