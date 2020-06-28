package shiver.me.timbers.cloudformation.codebuild;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class CodeBuildResourcesTest {

    @Test
    @SuppressWarnings("unchecked")
    public void Can_create_a_CodeBuilds() {

        final CodeBuildsFactory codeBuildsFactory = mock(CodeBuildsFactory.class);
        final CodeBuildConfig config = mock(CodeBuildConfig.class);
        final String projectName = someString();

        final CodeBuilds expected = mock(CodeBuilds.class);

        // Given
        given(codeBuildsFactory.create(config)).willReturn(expected);

        // When
        final CodeBuilds actual = new CodeBuildResources(codeBuildsFactory, config).name(projectName);

        // Then
        then(config).should().setProjectName(projectName);
        assertThat(actual, is(expected));
    }
}