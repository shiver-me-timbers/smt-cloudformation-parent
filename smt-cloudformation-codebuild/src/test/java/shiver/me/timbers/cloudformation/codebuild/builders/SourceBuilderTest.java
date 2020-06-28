package shiver.me.timbers.cloudformation.codebuild.builders;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import shiver.me.timbers.aws.codebuild.Project;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;
import shiver.me.timbers.cloudformation.codebuild.CodeBuildConfig;
import shiver.me.timbers.cloudformation.codebuild.Source;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class SourceBuilderTest {

    private SourceBuilder builder;

    @Before
    public void setUp() {
        builder = new SourceBuilder();
    }

    @Test
    public void Can_build_a_CodeBuild_source() {

        final CodeBuild codeBuild = mock(CodeBuild.class);
        final CodeBuildConfig config = mock(CodeBuildConfig.class, RETURNS_DEEP_STUBS);

        final Project project = mock(Project.class);
        final Source source = mock(Source.class);
        final String buildSpec = someString();

        // Given
        given(config.getProjectResource().getProperties()).willReturn(project);
        given(config.getSource()).willReturn(source);
        given(config.getBuildSpec()).willReturn(buildSpec);

        // When
        builder.apply(codeBuild, config);

        // Then
        then(source).should().setBuildSpec(buildSpec);
        then(project).should().setSource(source);
    }

    @Test
    public void Can_create_a_new_CodeBuild_source_if_none_is_supplied() {

        final CodeBuild codeBuild = mock(CodeBuild.class);
        final CodeBuildConfig config = mock(CodeBuildConfig.class, RETURNS_DEEP_STUBS);

        final Project project = mock(Project.class);
        final String buildSpec = someString();
        final ArgumentCaptor<Source> captor = ArgumentCaptor.forClass(Source.class);

        // Given
        given(config.getProjectResource().getProperties()).willReturn(project);
        given(config.getSource()).willReturn(null);
        given(config.getBuildSpec()).willReturn(buildSpec);

        // When
        builder.apply(codeBuild, config);

        // Then
        then(project).should().setSource(captor.capture());
        assertThat(captor.getValue(), equalTo(new Source().withBuildSpec(buildSpec)));
    }
}