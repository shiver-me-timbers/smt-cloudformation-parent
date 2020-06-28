package shiver.me.timbers.cloudformation.codebuild;

public class CodeBuildResources {

    private final CodeBuildsFactory codeBuildsFactory;
    private final CodeBuildConfig config;

    public CodeBuildResources(CodeBuildsFactory codeBuildsFactory, CodeBuildConfig config) {
        this.codeBuildsFactory = codeBuildsFactory;
        this.config = config;
    }

    public CodeBuilds name(String name) {
        config.setProjectName(name);
        return codeBuildsFactory.create(config);
    }
}
