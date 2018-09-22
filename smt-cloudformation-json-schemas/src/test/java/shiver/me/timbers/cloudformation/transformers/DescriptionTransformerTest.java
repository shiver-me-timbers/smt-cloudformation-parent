package shiver.me.timbers.cloudformation.transformers;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class DescriptionTransformerTest {

    private DescriptionTransformer transformer;

    @Before
    public void setUp() {
        transformer = new DescriptionTransformer();
    }

    @Test
    public void Can_add_the_property_description() {

        final CloudformationProperty cloudformationProperty = mock(CloudformationProperty.class);

        final String documentation = someString();

        final Map<String, Object> actual = new HashMap<>();

        // Given
        given(cloudformationProperty.getDocumentation()).willReturn(documentation);

        // When
        transformer.transform(
            someString(),
            mock(CloudformationType.class),
            someString(),
            cloudformationProperty,
            actual
        );

        // Then
        assertThat(actual, hasEntry("description", documentation));
    }

    @Test
    public void Can_support_properties_with_documentation() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getDocumentation()).willReturn(someString());

        // When
        final boolean actual = transformer.supports(property);

        // Then
        assertThat(actual, is(true));
    }

    @Test
    public void Will_not_support_properties_without_documentation() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getDocumentation()).willReturn(null);

        // When
        final boolean actual = transformer.supports(property);

        // Then
        assertThat(actual, is(false));
    }

    @Test
    public void Will_not_support_properties_with_empty_documentation() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getDocumentation()).willReturn("");

        // When
        final boolean actual = transformer.supports(property);

        // Then
        assertThat(actual, is(false));
    }
}