package shiver.me.timbers.cloudformation.codepipeline.actions;

import shiver.me.timbers.cloudformation.codepipeline.PipelineResources;
import shiver.me.timbers.cloudformation.codepipeline.Pipelines;
import shiver.me.timbers.cloudformation.codepipeline.PipelinesFactory;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Sources {

    private final String resourceName;
    private final String pipelineName;
    private final PipelinesFactory pipelinesFactory;

    public Sources(String resourceName, String pipelineName, PipelinesFactory pipelinesFactory) {
        this.resourceName = resourceName;
        this.pipelineName = pipelineName;
        this.pipelinesFactory = pipelinesFactory;
    }

    @SuppressWarnings("rawtypes")
    public Pipelines source(String stageName, Source source, PipelineAction... actions) {
        final ArrayList<PipelineAction> actionList = new ArrayList<>();
        actionList.add(source);
        actionList.addAll(asList(actions));
        return pipelinesFactory.create(resourceName, pipelineName, stageName, actionList);
    }
}
