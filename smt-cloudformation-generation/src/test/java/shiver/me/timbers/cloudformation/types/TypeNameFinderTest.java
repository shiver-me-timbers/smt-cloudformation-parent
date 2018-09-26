package shiver.me.timbers.cloudformation.types;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.cloudformation.PropertyType;

import java.util.HashMap;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class TypeNameFinderTest {

    private JavaTypes javaTypes;

    @Before
    public void setUp() {
        javaTypes = mock(JavaTypes.class);
    }

    @Test
    public void Can_find_a_property_type() {

        final String resourceName = someString();
        final String packageName = someString();
        final String propertyName = someString();

        final String expected = format("%s%s%s", packageName, someString(), propertyName);

        // Given
        given(javaTypes.extractPackage(resourceName)).willReturn(packageName);

        // When
        final String actual = new TypeNameFinder(
            new HashMap<String, PropertyType>() {{
                put(someString(), mock(PropertyType.class));
                put(expected, mock(PropertyType.class));
                put(packageName + someString(), mock(PropertyType.class));
                put(someString() + propertyName, mock(PropertyType.class));
            }},
            javaTypes
        ).find(resourceName, propertyName);

        // Then
        assertThat(actual, is(expected));
    }

    @Test
    public void Can_find_a_root_property_type() {

        final String resourceName = someString();

        final String packageName = someString();

        final String expected = someString();

        // Given
        given(javaTypes.extractPackage(resourceName)).willReturn(packageName);

        // When
        final String actual = new TypeNameFinder(
            new HashMap<String, PropertyType>() {{
                put(someString(), mock(PropertyType.class));
                put(expected, mock(PropertyType.class));
                put(someString(), mock(PropertyType.class));
            }},
            javaTypes
        ).find(resourceName, expected);

        // Then
        assertThat(actual, is(expected));
    }

    @Test
    public void Can_fail_to_find_a_property_type() {

        // Given
        final String resourceName = someString();

        final String propertyType = someString();

        // Given
        given(javaTypes.extractPackage(resourceName)).willReturn(someString());

        // When
        final Throwable actual = catchThrowable(
            () -> new TypeNameFinder(
                new HashMap<String, PropertyType>() {{
                    put(someString(), mock(PropertyType.class));
                    put(someString(), mock(PropertyType.class));
                    put(someString(), mock(PropertyType.class));
                }},
                javaTypes
            ).find(resourceName, propertyType)
        );

        // Then
        assertThat(actual, instanceOf(TypeException.class));
        assertThat(
            actual.getMessage(),
            equalTo(format("Could not find type for resource (%s) and property (%s),", resourceName, propertyType))
        );
    }

    @Test
    public void Can_fail_to_find_a_property_type_with_class_name() {

        final String resourceName = someString();

        final String packageName = someString();

        final String propertyType = someString();

        // Given
        given(javaTypes.extractPackage(resourceName)).willReturn(packageName);

        // When
        final Throwable actual = catchThrowable(
            () -> new TypeNameFinder(
                new HashMap<String, PropertyType>() {{
                    put(someString(), mock(PropertyType.class));
                    put(packageName, mock(PropertyType.class));
                    put(someString(), mock(PropertyType.class));
                }},
                javaTypes
            ).find(resourceName, propertyType)
        );

        // Then
        assertThat(actual, instanceOf(TypeException.class));
        assertThat(
            actual.getMessage(),
            equalTo(format("Could not find type for resource (%s) and property (%s),", resourceName, propertyType))
        );
    }
}