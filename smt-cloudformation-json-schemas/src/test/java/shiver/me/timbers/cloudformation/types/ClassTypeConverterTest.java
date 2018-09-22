package shiver.me.timbers.cloudformation.types;

import org.junit.Test;
import shiver.me.timbers.cloudformation.files.FileNames;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class ClassTypeConverterTest {

    @Test
    public void Can_convert_a_class_type() {

        final TypeNameFinder nameFinder = mock(TypeNameFinder.class);
        final FileNames fileNames = mock(FileNames.class);
        final String resourceName = someString();

        final String type = someString();
        final String typeName = someString();
        final String fileName = someString();

        // Given
        given(nameFinder.find(resourceName, type)).willReturn(typeName);
        given(fileNames.parse(typeName)).willReturn(fileName);

        // When
        final String actual = new ClassTypeConverter(nameFinder, fileNames).convert(resourceName, type);

        // Then
        assertThat(actual, is(fileName));
    }
}