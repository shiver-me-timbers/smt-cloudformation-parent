package shiver.me.timbers.cloudformation.codepipeline;

import shiver.me.timbers.cloudformation.codepipeline.actions.Action;
import shiver.me.timbers.cloudformation.codepipeline.actions.source.Source;
import shiver.me.timbers.cloudformation.codepipeline.stages.Stage;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class Sources {

    private final PipelinesFactory pipelinesFactory;
    private final PipelineConfig config;

    public Sources(PipelinesFactory pipelinesFactory, PipelineConfig config) {
        this.pipelinesFactory = pipelinesFactory;
        this.config = config;
    }

    @SuppressWarnings("rawtypes")
    public Pipelines source(String stageName, Source source, Action<?>... actions) {
        final ArrayList<Action<?>> actionList = new ArrayList<>();
        actionList.add(source);
        actionList.addAll(asList(actions));
        config.setStages(new ArrayList<>(singletonList(new Stage(stageName, actionList))));
        return pipelinesFactory.create(config);
    }
}
