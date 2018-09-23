package shiver.me.timbers.cloudformation.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class ObjectMappersTest {

    @Test
    public void Instantiation_for_coverage() {
        new ObjectMappers();
    }

    @Test
    public void Can_create_an_object_mapper() {

        // When
        final ObjectMapper actual = ObjectMappers.objectMapper();

        // Then
        assertThat(actual, notNullValue());
    }
}