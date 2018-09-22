package shiver.me.timbers.cloudformation.transformers;

import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationProperties;
import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;

import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.emptyMap;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class AbstractPropertiesTransformerTest {

    @Test
    public void Can_transform_some_properties() {

        final String resourceName = someString();
        final CloudformationType cloudformationType = mock(CloudformationType.class);
        final Transformer transformer = mock(Transformer.class);

        final CloudformationProperties properties = new CloudformationProperties();
        final String propertyName1 = someString();
        final String propertyName2 = someString();
        final String propertyName3 = someString();
        final CloudformationProperty property1 = mock(CloudformationProperty.class);
        final CloudformationProperty property2 = mock(CloudformationProperty.class);
        final CloudformationProperty property3 = mock(CloudformationProperty.class);

        // Given
        given(cloudformationType.getProperties()).willReturn(properties);
        properties.put(propertyName1, property1);
        properties.put(propertyName2, property2);
        properties.put(propertyName3, property3);

        final Map<String, Object> actual = new HashMap<>();
        final Map<String, Object> expected = new HashMap<String, Object>() {{
            put("properties", new HashMap<String, Object>() {{
                put(propertyName1, emptyMap());
                put(propertyName2, emptyMap());
                put(propertyName3, emptyMap());
            }});
        }};

        // When
        new AbstractPropertiesTransformer() {
            @Override
            protected void transform(
                String resourceName,
                CloudformationType type,
                String propertyName,
                CloudformationProperty cloudformationProperty,
                Map<String, Object> property
            ) {
                transformer.transform(resourceName, type, propertyName, cloudformationProperty, property);
            }
        }.transform(resourceName, cloudformationType, actual);

        // Then
        then(transformer).should().transform(
            resourceName,
            cloudformationType,
            propertyName1,
            property1,
            emptyMap()
        );
        then(transformer).should().transform(
            resourceName,
            cloudformationType,
            propertyName2,
            property2,
            emptyMap()
        );
        then(transformer).should().transform(
            resourceName,
            cloudformationType,
            propertyName3,
            property3,
            emptyMap()
        );
        assertThat(actual, equalTo(expected));
    }

    private interface Transformer {
        void transform(
            String resourceName,
            CloudformationType cloudformationType,
            String propertyName,
            CloudformationProperty cloudformationProperty,
            Map<String, Object> property
        );
    }
}