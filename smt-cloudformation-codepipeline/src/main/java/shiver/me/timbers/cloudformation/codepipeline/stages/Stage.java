package shiver.me.timbers.cloudformation.codepipeline.stages;

import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;

import java.util.List;
import java.util.Objects;

public class Stage {

    private final String name;
    private final List<PipelineAction> actions;

    public Stage(String name, List<PipelineAction> actions) {
        this.name = name;
        this.actions = actions;
    }

    public String getName() {
        return name;
    }

    public List<PipelineAction> getActions() {
        return actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stage stage = (Stage) o;
        return Objects.equals(name, stage.name) &&
            Objects.equals(actions, stage.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, actions);
    }
}
