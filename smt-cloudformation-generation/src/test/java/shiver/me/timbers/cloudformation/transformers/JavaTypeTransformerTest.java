package shiver.me.timbers.cloudformation.transformers;

import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.HashMap;

import static java.lang.String.format;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class JavaTypeTransformerTest {

    @Test
    public void Can_add_the_java_type_to_the_schema() {

        final JavaTypes javaTypes = mock(JavaTypes.class);
        final String resourceName = someString();
        final CloudformationType cloudformationType = mock(CloudformationType.class);

        final String packageName = someString();
        final String className = someString();

        // Given
        given(javaTypes.parsePackage(resourceName)).willReturn(packageName);
        given(javaTypes.extractClassName(resourceName)).willReturn(className);

        final HashMap<String, Object> actual = new HashMap<>();

        // When
        new JavaTypeTransformer(javaTypes).transform(resourceName, cloudformationType, actual);

        // Then
        assertThat(actual, hasEntry("javaType", format("%s.%s", packageName, className)));
    }
}