package shiver.me.timbers.cloudformation.codepipeline.actions;

import shiver.me.timbers.aws.codepipeline.PipelineActionDeclaration;
import shiver.me.timbers.aws.codepipeline.PipelineInputArtifact;
import shiver.me.timbers.aws.codepipeline.PipelineOutputArtifact;

import java.util.List;
import java.util.Set;
import java.util.function.Function;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toSet;

@SuppressWarnings({"rawtypes", "unchecked"})
public class Action<A extends Action> extends PipelineActionDeclaration {

    public A outputArtifacts(String... outputArtifacts) {
        return outputArtifacts(asList(outputArtifacts));
    }

    public A outputArtifacts(List<String> outputArtifacts) {
        withOutputArtifacts(toArtifacts(o -> new PipelineOutputArtifact().withName(o), outputArtifacts));
        return (A) this;
    }

    public A inputArtifacts(String... inputArtifacts) {
        return inputArtifacts(asList(inputArtifacts));
    }

    public A inputArtifacts(List<String> inputArtifacts) {
        withInputArtifacts(toArtifacts(i -> new PipelineInputArtifact().withName(i), inputArtifacts));
        return (A) this;
    }

    private <T> Set<T> toArtifacts(Function<String, T> mapper, List<String> artifacts) {
        return artifacts.stream().map(mapper).collect(toSet());
    }
}
