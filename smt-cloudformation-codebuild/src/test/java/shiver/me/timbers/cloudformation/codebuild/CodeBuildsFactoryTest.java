package shiver.me.timbers.cloudformation.codebuild;

import org.junit.Test;
import shiver.me.timbers.cloudformation.builders.Builders;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class CodeBuildsFactoryTest {

    @Test
    @SuppressWarnings("unchecked")
    public void Can_create_a_CodeBuilds() {

        // Given
        final Builders<CodeBuild, CodeBuildConfig> builders = mock(Builders.class);
        final CodeBuildConfig config = mock(CodeBuildConfig.class);

        // When
        final CodeBuilds actual = new CodeBuildsFactory(builders).create(config);

        // Then
        assertThat(actual, hasField("builders", builders));
        assertThat(actual, hasField("config", config));
    }
}