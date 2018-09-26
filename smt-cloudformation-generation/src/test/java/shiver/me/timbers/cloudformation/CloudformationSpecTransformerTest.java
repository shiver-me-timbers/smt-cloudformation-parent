package shiver.me.timbers.cloudformation;

import org.junit.Test;
import shiver.me.timbers.cloudformation.transformers.TypesTransformer;

import java.util.Map;

import static java.util.Collections.singletonMap;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class CloudformationSpecTransformerTest {

    @Test
    public void Can_transform_a_cloudformation_specification() {

        final TypesTransformer transformer = mock(TypesTransformer.class, "transformer1");
        final CloudFormationResourceSpecification specification = mock(CloudFormationResourceSpecification.class);

        final CloudformationTypes propertyTypes = mock(CloudformationTypes.class);
        final CloudformationTypes resourceTypes = mock(CloudformationTypes.class);
        final String resourceName1 = someString();
        final String resourceName2 = someString();
        final Map<String, String> resourceValue1 = singletonMap(someString(), someString());
        final Map<String, String> resourceValue2 = singletonMap(someString(), someString());
        final Map<String, Object> schema1 = singletonMap(resourceName1, resourceValue1);
        final Map<String, Object> schema2 = singletonMap(resourceName2, resourceValue2);

        // Given
        given(specification.getPropertyTypes()).willReturn(propertyTypes);
        given(specification.getResourceTypes()).willReturn(resourceTypes);
        given(transformer.transform(propertyTypes)).willReturn(schema1);
        given(transformer.transform(resourceTypes)).willReturn(schema2);


        // When
        final Map<String, Object> actual = new CloudformationSpecTransformer(transformer).transform(specification);

        // Then
        assertThat(actual, hasEntry(resourceName1, resourceValue1));
        assertThat(actual, hasEntry(resourceName2, resourceValue2));
    }
}