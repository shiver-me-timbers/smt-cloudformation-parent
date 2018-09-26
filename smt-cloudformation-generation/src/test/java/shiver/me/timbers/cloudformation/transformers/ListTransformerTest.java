package shiver.me.timbers.cloudformation.transformers;

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
import static java.util.Collections.singletonMap;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomBooleans.someBoolean;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class ListTransformerTest {

    private PrimitiveTypeConverter primitiveTypeConverter;
    private ClassTypeConverter classTypeConverter;
    private ListTransformer transformer;

    @Before
    public void setUp() {
        primitiveTypeConverter = mock(PrimitiveTypeConverter.class);
        classTypeConverter = mock(ClassTypeConverter.class);
        transformer = new ListTransformer(primitiveTypeConverter, classTypeConverter);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_transform_a_primitive_typed_list() {

        final CloudformationProperty cloudformationProperty = mock(CloudformationProperty.class);

        final String itemType = someString();
        final Map<String, Object> primitiveType = mock(Map.class);

        final Map<String, Object> actual = new HashMap<>();

        // Given
        given(cloudformationProperty.getPrimitiveItemType()).willReturn(itemType);
        given(cloudformationProperty.isDuplicatesAllowed()).willReturn(true);
        given(primitiveTypeConverter.convert(itemType)).willReturn(primitiveType);

        // When
        transformer.transform(someString(), mock(CloudformationType.class), someString(), cloudformationProperty, actual);

        // Then
        assertThat(actual, hasEntry("type", "array"));
        assertThat(actual, not(hasKey("uniqueItems")));
        assertThat(actual, hasEntry("items", primitiveType));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_transform_a_primitive_typed_list_with_unique_items() {

        final CloudformationProperty cloudformationProperty = mock(CloudformationProperty.class);

        final String itemType = someString();
        final Map<String, Object> primitiveType = mock(Map.class);

        final Map<String, Object> actual = new HashMap<>();

        // Given
        given(cloudformationProperty.getPrimitiveItemType()).willReturn(itemType);
        given(cloudformationProperty.isDuplicatesAllowed()).willReturn(false);
        given(primitiveTypeConverter.convert(itemType)).willReturn(primitiveType);

        // When
        transformer.transform(someString(), mock(CloudformationType.class), someString(), cloudformationProperty, actual);

        // Then
        assertThat(actual, hasEntry("type", "array"));
        assertThat(actual, hasEntry("uniqueItems", true));
        assertThat(actual, hasEntry("items", primitiveType));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_transform_a_class_typed_list() {

        final String resourceName = someString();
        final CloudformationProperty cloudformationProperty = mock(CloudformationProperty.class);

        final String itemType = someString();
        final String type = someString();

        final Map<String, Object> actual = new HashMap<>();

        // Given
        given(cloudformationProperty.getItemType()).willReturn(itemType);
        given(cloudformationProperty.isDuplicatesAllowed()).willReturn(someBoolean());
        given(classTypeConverter.convert(resourceName, itemType)).willReturn(type);

        // When
        transformer.transform(resourceName, mock(CloudformationType.class), someString(), cloudformationProperty, actual);

        // Then
        assertThat(actual, hasEntry("type", "array"));
        assertThat(actual, hasEntry("items", singletonMap("$ref", type)));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_fail_to_transform_a_list() {

        final String resourceName = someString();
        final String propertyName = someString();

        // Given
        given(mock(CloudformationProperty.class).getPrimitiveItemType()).willReturn(null);
        given(mock(CloudformationProperty.class).getItemType()).willReturn(null);

        // When
        final Throwable actual = catchThrowable(() -> transformer.transform(
            resourceName,
            mock(CloudformationType.class),
            propertyName,
            mock(CloudformationProperty.class),
            new HashMap<>()
        ));

        // Then
        assertThat(actual, instanceOf(TypeException.class));
        assertThat(
            actual.getMessage(),
            equalTo(format("Could not find List type for resource (%s) and property (%s),", resourceName, propertyName))
        );
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Will_support_list_types() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getType()).willReturn("List");

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