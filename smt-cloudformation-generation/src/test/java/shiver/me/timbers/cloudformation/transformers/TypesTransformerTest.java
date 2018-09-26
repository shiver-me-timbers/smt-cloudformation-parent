package shiver.me.timbers.cloudformation.transformers;

import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.CloudformationTypes;

import java.util.HashMap;
import java.util.Map;

import static java.util.AbstractMap.SimpleEntry;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonMap;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class TypesTransformerTest {

    @Test
    public void Can_transform_cloudformation_types() {

        final CloudformationTypes<CloudformationType> cloudformationTypes = new CloudformationTypes<>();
        final TypeTransformer transformer1 = mock(TypeTransformer.class);
        final TypeTransformer transformer2 = mock(TypeTransformer.class);
        final TypeTransformer transformer3 = mock(TypeTransformer.class);

        final String typeName1 = someString();
        final String typeName2 = someString();
        final String typeName3 = someString();
        final CloudformationType type1 = mock(CloudformationType.class);
        final CloudformationType type2 = mock(CloudformationType.class);
        final CloudformationType type3 = mock(CloudformationType.class);
        final Map<String, Object> schema1 = singletonMap(someString(), someString());
        final Map<String, Object> schema2 = singletonMap(someString(), someString());
        final Map<String, Object> schema3 = singletonMap(someString(), someString());
        final Map<String, Object> schema4 = singletonMap(someString(), someString());
        final Map<String, Object> schema5 = singletonMap(someString(), someString());
        final Map<String, Object> schema6 = singletonMap(someString(), someString());
        final Map<String, Object> schema7 = singletonMap(someString(), someString());
        final Map<String, Object> schema8 = singletonMap(someString(), someString());
        final Map<String, Object> schema9 = singletonMap(someString(), someString());

        final Map<String, Object> expected = new HashMap<String, Object>() {{
            putAll(singletonMap(typeName1, new HashMap<String, Object>() {{
                putAll(schema1);
                putAll(schema4);
                putAll(schema7);
            }}));
            putAll(singletonMap(typeName2, new HashMap<String, Object>() {{
                putAll(schema2);
                putAll(schema5);
                putAll(schema8);
            }}));
            putAll(singletonMap(typeName3, new HashMap<String, Object>() {{
                putAll(schema3);
                putAll(schema6);
                putAll(schema9);
            }}));
        }};

        // Given
        cloudformationTypes.put(typeName1, type1);
        cloudformationTypes.put(typeName2, type2);
        cloudformationTypes.put(typeName3, type3);
        given(transformer1.transform(new SimpleEntry<>(typeName1, type1))).willReturn(new SimpleEntry<>(typeName1, schema1));
        given(transformer1.transform(new SimpleEntry<>(typeName2, type2))).willReturn(new SimpleEntry<>(typeName2, schema2));
        given(transformer1.transform(new SimpleEntry<>(typeName3, type3))).willReturn(new SimpleEntry<>(typeName3, schema3));
        given(transformer2.transform(new SimpleEntry<>(typeName1, type1))).willReturn(new SimpleEntry<>(typeName1, schema4));
        given(transformer2.transform(new SimpleEntry<>(typeName2, type2))).willReturn(new SimpleEntry<>(typeName2, schema5));
        given(transformer2.transform(new SimpleEntry<>(typeName3, type3))).willReturn(new SimpleEntry<>(typeName3, schema6));
        given(transformer3.transform(new SimpleEntry<>(typeName1, type1))).willReturn(new SimpleEntry<>(typeName1, schema7));
        given(transformer3.transform(new SimpleEntry<>(typeName2, type2))).willReturn(new SimpleEntry<>(typeName2, schema8));
        given(transformer3.transform(new SimpleEntry<>(typeName3, type3))).willReturn(new SimpleEntry<>(typeName3, schema9));

        // When
        final Map<String, Object> actual = new TypesTransformer(asList(transformer1, transformer2, transformer3))
            .transform(cloudformationTypes);

        // Then
        assertThat(actual, equalTo(expected));
    }
}