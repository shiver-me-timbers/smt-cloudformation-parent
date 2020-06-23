package shiver.me.timbers.cloudformation.codepipeline.builders;

import org.junit.Test;
import shiver.me.timbers.aws.iam.*;
import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;

import static java.util.Collections.singletonList;
import static java.util.Collections.singletonMap;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.aws.iam.Effect.ALLOW;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class RoleBuilderTest {

    @Test
    public void Can_build_a_role() {

        final Pipeline pipeline = mock(Pipeline.class);
        final PipelineConfig config = mock(PipelineConfig.class);
        final String resourceName = someString();
        final String pipelineName = someString();

        // Given
        given(config.getResourceName()).willReturn(resourceName);
        given(config.getPipelineName()).willReturn(pipelineName);

        // When
        new RoleBuilder().apply(pipeline, config);

        // Then
        final RoleResource roleResource = new RoleResource()
            .withName(resourceName + "Role")
            .withProperties(
                new Role()
                    .withRoleName(pipelineName + "-role")
                    .withAssumeRolePolicyDocument(
                        new PolicyDocument()
                            .withStatement(singletonList(
                                new Statement()
                                    .withEffect(ALLOW)
                                    .withActions("sts:AssumeRole")
                                    .withPrincipal(
                                        new Principal(
                                            singletonMap("Service", singletonList("codepipeline.amazonaws.com"))
                                        )
                                    )
                            ))
                    )
                    .withPath("/")
            );
        then(config).should().setRoleResource(roleResource);
        then(pipeline).should().add(roleResource);
    }
}