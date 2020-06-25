package shiver.me.timbers.cloudformation.codepipeline.actions;

import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.Pipelines;
import shiver.me.timbers.cloudformation.codepipeline.PipelinesFactory;
import shiver.me.timbers.cloudformation.codepipeline.stages.Stage;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class Sources {

    private final PipelineConfig config;
    private final PipelinesFactory pipelinesFactory;

    public Sources(PipelineConfig config, PipelinesFactory pipelinesFactory) {
        this.config = config;
        this.pipelinesFactory = pipelinesFactory;
    }

    @SuppressWarnings("rawtypes")
    public Pipelines source(String stageName, Source source, PipelineAction... actions) {
        final ArrayList<PipelineAction> actionList = new ArrayList<>();
        actionList.add(source);
        actionList.addAll(asList(actions));
        config.setStages(new ArrayList<>(singletonList(new Stage(stageName, actionList))));
        return pipelinesFactory.create(config);
    }
}
