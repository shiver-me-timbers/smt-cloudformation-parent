package shiver.me.timbers.cloudformation.transformers.type;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.ResourceType;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.singletonList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyZeroInteractions;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class InterfacesTransformerTest {

    private JavaTypes javaTypes;
    private String resourceName;
    private CloudformationType cloudformationType;
    private Map<String, Object> schema;
    private InterfacesTransformer transformer;

    @Before
    public void setUp() {
        javaTypes = mock(JavaTypes.class);
        resourceName = someString();
        cloudformationType = mock(CloudformationType.class);
        schema = new HashMap<>();
        transformer = new InterfacesTransformer(javaTypes);
    }

    @Test
    public void Can_add_default_interfaces() {

        final String className = someString();

        // Given
        given(javaTypes.extractClassName(resourceName)).willReturn(className);

        // When
        transformer.transform(resourceName, cloudformationType, schema);

        // Then
        assertThat(schema, hasEntry("javaInterfaces", singletonList(
            format("%s<%s>", Property.class.getName(), className)
        )));
    }

    @Test
    public void Can_add_default_interfaces_to_existing_interfaces() {

        final String interface1 = someString();
        final String interface2 = someString();
        final String interface3 = someString();
        final String className = someString();

        // Given
        schema.put("javaInterfaces", new ArrayList<>(asList(interface1, interface2, interface3)));
        given(javaTypes.extractClassName(resourceName)).willReturn(className);

        // When
        transformer.transform(resourceName, cloudformationType, schema);

        // Then
        assertThat(schema, hasEntry("javaInterfaces", asList(
            interface1, interface2, interface3,
            format("%s<%s>", Property.class.getName(), className)
        )));
    }

    @Test
    public void Will_not_add_default_interfaces_to_a_resource() {

        // When
        transformer.transform(resourceName, mock(ResourceType.class), schema);

        // Then
        verifyZeroInteractions(javaTypes);
        assertThat(schema, equalTo(emptyMap()));
    }
}