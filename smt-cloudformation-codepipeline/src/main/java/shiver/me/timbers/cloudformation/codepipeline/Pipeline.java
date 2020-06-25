package shiver.me.timbers.cloudformation.codepipeline;

import shiver.me.timbers.aws.Resource;
import shiver.me.timbers.aws.ResourceList;
import shiver.me.timbers.cloudformation.codepipeline.actions.SourcesFactory;
import shiver.me.timbers.cloudformation.codepipeline.actions.transformations.ActionTransformation;
import shiver.me.timbers.cloudformation.codepipeline.actions.transformations.PipelineActionTransformations;
import shiver.me.timbers.cloudformation.codepipeline.builders.*;
import shiver.me.timbers.cloudformation.codepipeline.stages.PipelineStageFactory;

import static java.util.Arrays.asList;

public class Pipeline extends ResourceList<Pipeline, Resource> {

    Pipeline() {
    }

    public static PipelineResources resource(String name) {
        return new PipelineResources(new PipelineConfig(name), new SourcesFactory(new PipelinesFactory(
            new Builders(asList(
                new S3BucketBuilder(),
                new RoleBuilder(),
                new S3BucketPolicyBuilder(),
                new PolicyBuilder(),
                new PipelineBuilder(new PipelineStageFactory(new PipelineActionTransformations(asList(
                    new ActionTransformation()
                ))))
            ))
        )));
    }
}
