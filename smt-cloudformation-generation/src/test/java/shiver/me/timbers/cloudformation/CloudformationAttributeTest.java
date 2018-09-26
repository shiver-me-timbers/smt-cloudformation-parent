package shiver.me.timbers.cloudformation;

import org.junit.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.junit.Assert.assertThat;

public class CloudformationAttributeTest {

    @Test
    public void CloudformationProperty_is_a_valid_bean() {
        assertThat(CloudformationAttribute.class, hasValidGettersAndSetters());
    }
}