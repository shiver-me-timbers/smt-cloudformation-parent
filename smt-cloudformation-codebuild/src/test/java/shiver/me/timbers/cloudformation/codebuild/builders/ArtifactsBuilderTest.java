package shiver.me.timbers.cloudformation.codebuild.builders;

import org.junit.Test;
import shiver.me.timbers.aws.codebuild.Project;
import shiver.me.timbers.aws.codebuild.ProjectArtifacts;
import shiver.me.timbers.cloudformation.codebuild.ArtifactType;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;
import shiver.me.timbers.cloudformation.codebuild.CodeBuildConfig;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomEnums.someEnum;

public class ArtifactsBuilderTest {

    @Test
    public void Can_build_no_artifacts() {

        final CodeBuild codeBuild = mock(CodeBuild.class);
        final CodeBuildConfig config = mock(CodeBuildConfig.class, RETURNS_DEEP_STUBS);
        final ArtifactType artifactType = someEnum(ArtifactType.class);
        final Project project = mock(Project.class);

        // Given
        given(config.getArtifectType()).willReturn(artifactType);
        given(config.getProjectResource().getProperties()).willReturn(project);

        // When
        new ArtifactsBuilder().apply(codeBuild, config);

        // Then
        then(project).should().setArtifacts(new ProjectArtifacts().withType(artifactType));
    }
}