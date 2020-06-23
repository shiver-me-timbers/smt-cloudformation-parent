package shiver.me.timbers.cloudformation.codepipeline.actions.configuration;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static nl.jqno.equalsverifier.Warning.NONFINAL_FIELDS;
import static org.hamcrest.MatcherAssert.assertThat;

public class CodeBuildActionConfigurationTest {

    @Test
    public void CodeBuildActionConfiguration_is_a_valid_bean() {
        assertThat(CodeBuildActionConfiguration.class, hasValidGettersAndSetters());
    }

    @Test
    public void CodeBuildActionConfiguration_hash_equality() {
        EqualsVerifier.forClass(CodeBuildActionConfiguration.class).suppress(NONFINAL_FIELDS).usingGetClass().verify();
    }
}