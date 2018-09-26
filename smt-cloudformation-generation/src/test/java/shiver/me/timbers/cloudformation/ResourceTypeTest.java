package shiver.me.timbers.cloudformation;

import org.junit.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.junit.Assert.assertThat;

public class ResourceTypeTest {

    @Test
    public void ResourceType_is_a_valid_bean() {
        assertThat(ResourceType.class, hasValidGettersAndSetters());
    }
}