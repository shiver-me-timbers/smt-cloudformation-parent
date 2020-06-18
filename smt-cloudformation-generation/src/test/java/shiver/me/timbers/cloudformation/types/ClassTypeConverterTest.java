package shiver.me.timbers.cloudformation.types;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.cloudformation.files.FileNames;

import java.util.Map;

import static java.lang.String.format;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class ClassTypeConverterTest {

    private static final String TAG = "Tag";

    private TypeNameFinder nameFinder;
    private FileNames fileNames;
    private JavaTypes javaTypes;
    private ClassTypeConverter converter;

    @Before
    public void setUp() {
        nameFinder = mock(TypeNameFinder.class);
        fileNames = mock(FileNames.class);
        javaTypes = mock(JavaTypes.class);
        converter = new ClassTypeConverter(nameFinder, fileNames, javaTypes);
    }

    @Test
    public void Can_convert_a_resource_name_and_type_to_a_java_type() {

        final String resourceName = someString();

        final String type = someString();
        final String typeName = someString();
        final String typePackage = someString();
        final String resourceClassName = someString();

        // Given
        given(nameFinder.find(resourceName, type)).willReturn(typeName);
        given(javaTypes.parsePackage(typeName)).willReturn(typePackage);
        given(javaTypes.extractResourceClassName(resourceName)).willReturn(resourceClassName);

        // When
        final String actual = converter.toJavaType(resourceName, type);

        // Then
        assertThat(
            actual,
            equalTo(format("%s<%s.%s>", Property.class.getName(), typePackage, resourceClassName + type))
        );
    }

    @Test
    public void Can_convert_a_ParameterValues_to_a_java_type() {

        final String resourceName = someString();

        final String type = someString();
        final String typeName = someString();
        final String typePackage = someString();
        final String resourceClassName = someString();

        // Given
        given(nameFinder.find(resourceName, type)).willReturn(typeName);
        given(javaTypes.parsePackage(typeName)).willReturn(typePackage);
        given(javaTypes.extractResourceClassName(resourceName)).willReturn(resourceClassName);

        // When
        final String actual = converter.toJavaType(resourceName, "ParameterValues");

        // Then
        assertThat(actual, equalTo("Object"));
    }

    @Test
    public void Can_convert_a_resource_name_and_tag_to_a_java_type() {

        final String resourceName = someString();

        final String type = TAG;
        final String typeName = someString();
        final String typePackage = someString();
        final String resourceClassName = someString();

        // Given
        given(nameFinder.find(resourceName, type)).willReturn(typeName);
        given(javaTypes.parsePackage(typeName)).willReturn(typePackage);
        given(javaTypes.extractResourceClassName(resourceName)).willReturn(resourceClassName);

        // When
        final String actual = converter.toJavaType(resourceName, type);

        // Then
        assertThat(
            actual,
            equalTo(format("%s<%s.%s>", Property.class.getName(), typePackage, type))
        );
    }

    @Test
    public void Can_convert_a_resource_name_and_type_to_a_type_map() {

        final String resourceName = someString();

        final String type = someString();
        final String typeName = someString();
        final String fileName = someString();
        final String typePackage = someString();
        final String resourceClassName = someString();

        // Given
        given(nameFinder.find(resourceName, type)).willReturn(typeName);
        given(fileNames.parse(typeName)).willReturn(fileName);
        given(javaTypes.parsePackage(typeName)).willReturn(typePackage);
        given(javaTypes.extractResourceClassName(resourceName)).willReturn(resourceClassName);

        // When
        final Map<String, String> actual = converter.toTypeMap(resourceName, type);

        // Then
        assertThat(actual, hasEntry("$ref", fileName));
        assertThat(
            actual,
            hasEntry("javaType", format("%s<%s.%s>", Property.class.getName(), typePackage, resourceClassName + type))
        );
    }

    @Test
    public void Can_convert_a_resource_name_and_tag_to_a_type_map() {

        final String resourceName = someString();

        final String type = TAG;
        final String typeName = someString();
        final String fileName = someString();
        final String typePackage = someString();
        final String resourceClassName = someString();

        // Given
        given(nameFinder.find(resourceName, type)).willReturn(typeName);
        given(fileNames.parse(typeName)).willReturn(fileName);
        given(javaTypes.parsePackage(typeName)).willReturn(typePackage);
        given(javaTypes.extractResourceClassName(resourceName)).willReturn(resourceClassName);

        // When
        final Map<String, String> actual = converter.toTypeMap(resourceName, type);

        // Then
        assertThat(actual, hasEntry("$ref", fileName));
        assertThat(
            actual,
            hasEntry("javaType", format("%s<%s.%s>", Property.class.getName(), typePackage, type))
        );
    }
}