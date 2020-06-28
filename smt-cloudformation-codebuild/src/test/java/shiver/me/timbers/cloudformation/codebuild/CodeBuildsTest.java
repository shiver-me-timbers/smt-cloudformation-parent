package shiver.me.timbers.cloudformation.codebuild;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import shiver.me.timbers.cloudformation.builders.Builders;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomEnums.someEnum;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class CodeBuildsTest {

    private Builders<CodeBuild, CodeBuildConfig> builders;
    private CodeBuildConfig config;
    private CodeBuilds codeBuilds;

    @Before
    public void setUp() {
        builders = mock(Builders.class);
        config = mock(CodeBuildConfig.class);
        codeBuilds = new CodeBuilds(builders, config);
    }

    @Test
    public void Can_set_a_CodeBuilds_name() {

        // Given
        final String name = someString();

        // When
        final CodeBuilds actual = codeBuilds.name(name);

        // Then
        then(config).should().setProjectName(name);
        assertThat(actual, is(codeBuilds));
    }

    @Test
    public void Can_set_a_CodeBuilds_description() {

        // Given
        final String description = someString();

        // When
        final CodeBuilds actual = codeBuilds.description(description);

        // Then
        then(config).should().setDescription(description);
        assertThat(actual, is(codeBuilds));
    }

    @Test
    public void Can_set_a_CodeBuilds_source() {

        // Given
        final Source source = mock(Source.class);

        // When
        final CodeBuilds actual = codeBuilds.source(source);

        // Then
        then(config).should().setSource(source);
        assertThat(actual, is(codeBuilds));
    }

    @Test
    public void Can_set_a_CodeBuilds_buildSpec() {

        // Given
        final String buildSpec = someString();

        // When
        final CodeBuilds actual = codeBuilds.buildSpec(buildSpec);

        // Then
        then(config).should().setBuildSpec(buildSpec);
        assertThat(actual, is(codeBuilds));
    }

    @Test
    public void Can_set_a_CodeBuilds_artifact_type() {

        // Given
        final ArtifactType artifactType = someEnum(ArtifactType.class);

        // When
        final CodeBuilds actual = codeBuilds.artifact(artifactType);

        // Then
        then(config).should().setArtifectType(artifactType);
        assertThat(actual, is(codeBuilds));
    }

    @Test
    public void Can_build_a_CodeBuild() {

        // Given
        final ArgumentCaptor<CodeBuild> captor = ArgumentCaptor.forClass(CodeBuild.class);

        // When
        final CodeBuild actual = codeBuilds.build();

        // Then
        then(builders).should().apply(captor.capture(), eq(config));
        assertThat(actual, is(captor.getValue()));
    }
}