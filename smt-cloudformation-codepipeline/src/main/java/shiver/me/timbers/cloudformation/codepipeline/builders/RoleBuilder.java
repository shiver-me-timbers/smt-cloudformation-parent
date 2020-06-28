package shiver.me.timbers.cloudformation.codepipeline.builders;

import shiver.me.timbers.aws.iam.*;
import shiver.me.timbers.cloudformation.builders.Builder;
import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;

import static java.util.Collections.singletonList;
import static java.util.Collections.singletonMap;
import static shiver.me.timbers.aws.iam.Effect.ALLOW;

public class RoleBuilder implements Builder<Pipeline, PipelineConfig> {

    @Override
    public void apply(Pipeline pipeline, PipelineConfig config) {
        final RoleResource roleResource = new RoleResource(config.getResourceName() + "Role")
            .withProperties(
                new Role()
                    .withRoleName(config.getPipelineName() + "-role")
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
        config.setRoleResource(roleResource);
        pipeline.add(roleResource);
    }
}
