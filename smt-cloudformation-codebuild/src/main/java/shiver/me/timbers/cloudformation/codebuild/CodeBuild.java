package shiver.me.timbers.cloudformation.codebuild;

import shiver.me.timbers.aws.Resource;
import shiver.me.timbers.aws.ResourceList;
import shiver.me.timbers.cloudformation.builders.Builders;
import shiver.me.timbers.cloudformation.codebuild.builders.*;

import static java.util.Arrays.asList;

public class CodeBuild extends ResourceList<CodeBuild, Resource> {

    CodeBuild() {
    }

    public static CodeBuildResources resource(String name) {
        return new CodeBuildResources(new CodeBuildsFactory(new Builders<>(asList(
            new RoleBuilder(),
            new PolicyBuilder(),
            new ProjectBuilder(),
            new SourceBuilder(),
            new ArtifactsBuilder()
        ))), new CodeBuildConfig(name));
    }
}
