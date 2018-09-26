package shiver.me.timbers.cloudformation;

import org.junit.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.junit.Assert.assertThat;

public class CloudformationTypeTest {

    @Test
    public void CloudformationType_is_a_valid_bean() {
        assertThat(CloudformationType.class, hasValidGettersAndSetters());
    }
}