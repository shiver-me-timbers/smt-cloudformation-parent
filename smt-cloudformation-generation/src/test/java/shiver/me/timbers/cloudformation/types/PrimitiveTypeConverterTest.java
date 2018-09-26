package shiver.me.timbers.cloudformation.types;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PrimitiveTypeConverterTest {

    @Test
    @SuppressWarnings("unchecked")
    public void Can_convert_a_primitive_type() {

        final Map<String, Map<String, Object>> typeMap = mock(Map.class);
        final String type = someString();

        final Map<String, Object> expected = mock(Map.class);

        // Given
        given(typeMap.get(type)).willReturn(expected);

        // When
        final Map<String, Object> actual = new PrimitiveTypeConverter(typeMap).convert(type);

        // Then
        assertThat(actual, is(expected));
    }
}