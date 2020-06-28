package shiver.me.timbers.cloudformation.codepipeline.actions.build;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.aws.codepipeline.PipelineInputArtifact;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;

import java.util.HashSet;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class CodeBuildActionsTest {

    private CodeBuildActionConfig config;
    private CodeBuildActions codeBuildActions;

    @Before
    public void setUp() {
        config = mock(CodeBuildActionConfig.class);
        codeBuildActions = new CodeBuildActions(config);
    }

    @Test
    public void Can_add_a_code_build() {

        // Given
        final CodeBuild codeBuild = mock(CodeBuild.class);

        // When
        codeBuildActions.codeBuild(codeBuild);

        // Then
        then(config).should().setCodeBuild(codeBuild);
    }

    @Test
    public void Can_add_a_input_artifacts() {

        // Given
        final String artifact1 = someString();
        final String artifact2 = someString();
        final String artifact3 = someString();

        // When
        codeBuildActions.inputArtifacts(artifact1, artifact2, artifact3);

        // Then
        then(config).should().setInputArtifacts(asList(artifact1, artifact2, artifact3));
    }

    @Test
    public void Can_build_a_CodeBuildAction() {

        final String name = someString();
        final CodeBuild codeBuild = mock(CodeBuild.class);
        final String artifact1 = someString();
        final String artifact2 = someString();
        final String artifact3 = someString();

        // Given
        given(config.getName()).willReturn(name);
        given(config.getCodeBuild()).willReturn(codeBuild);
        given(config.getInputArtifacts()).willReturn(asList(artifact1, artifact2, artifact3));

        // When
        final CodeBuildAction actual = codeBuildActions.build();

        // Then
        assertThat(actual, hasField("name", name));
        assertThat(actual, hasField("codeBuild", codeBuild));
        assertThat(actual, hasField("inputArtifacts", new HashSet<>(asList(
            new PipelineInputArtifact().withName(artifact1),
            new PipelineInputArtifact().withName(artifact2),
            new PipelineInputArtifact().withName(artifact3)
        ))));
    }
}