package shiver.me.timbers.cloudformation.codepipeline.actions.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class CodeBuildActionConfiguration {

    @JsonProperty("ProjectName")
    private String projectName;

    public CodeBuildActionConfiguration() {
    }

    public CodeBuildActionConfiguration(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeBuildActionConfiguration that = (CodeBuildActionConfiguration) o;
        return Objects.equals(projectName, that.projectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectName);
    }
}
