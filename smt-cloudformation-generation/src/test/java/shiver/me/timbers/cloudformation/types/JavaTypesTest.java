package shiver.me.timbers.cloudformation.types;

import org.junit.Before;
import org.junit.Test;

import static java.lang.String.format;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.cloudformation.Cloudformation.packageName;
import static shiver.me.timbers.data.random.RandomStrings.someAlphaString;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class JavaTypesTest {

    private String defaultPackageName;
    private JavaTypes types;

    @Before
    public void setUp() {
        defaultPackageName = someString();
        types = new JavaTypes(defaultPackageName);
    }

    @Test
    public void Can_extract_a_class_name_for_a_resource() {

        // Given
        final String className = someAlphaString(8);

        // When
        final String actual = types.extractClassName(format("%s::%s", packageName(), className));

        // Then
        assertThat(actual, equalTo(className));
    }

    @Test
    public void Can_extract_a_class_name_for_a_property() {

        // Given
        final String className = someAlphaString(13);

        // When
        final String actual = types.extractClassName(format("%s::%s.%s", packageName(), someAlphaString(8), className));

        // Then
        assertThat(actual, equalTo(className));
    }

    @Test
    public void Can_parse_a_package_name() {

        // Given
        final String packageName = packageName();

        // When
        final String actual = types.parsePackage(format("%s::%s", packageName, someAlphaString(8)));

        // Then
        assertThat(actual, equalTo(packageName.replaceAll("::", ".").toLowerCase()));
    }

    @Test
    public void Can_parse_an_empty_package_name() {

        // When
        final String actual = types.parsePackage(someAlphaString(8));

        // Then
        assertThat(actual, equalTo(defaultPackageName));
    }
}