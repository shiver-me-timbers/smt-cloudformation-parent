
package aws.robomaker;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SimulationApplication
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RenderingEngine",
    "SimulationSoftwareSuite",
    "CurrentRevisionId",
    "RobotSoftwareSuite",
    "Sources",
    "Tags",
    "Name"
})
public class SimulationApplication {

    /**
     * RenderingEngine
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-renderingengine.html
     * 
     */
    @JsonProperty("RenderingEngine")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-renderingengine.html")
    private Property<RenderingEngine> renderingEngine;
    /**
     * SimulationSoftwareSuite
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-simulationsoftwaresuite.html
     * 
     */
    @JsonProperty("SimulationSoftwareSuite")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-simulationsoftwaresuite.html")
    private Property<SimulationSoftwareSuite> simulationSoftwareSuite;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-currentrevisionid
     * 
     */
    @JsonProperty("CurrentRevisionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-currentrevisionid")
    private CharSequence currentRevisionId;
    /**
     * RobotSoftwareSuite
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html
     * 
     */
    @JsonProperty("RobotSoftwareSuite")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html")
    private Property<RobotSoftwareSuite> robotSoftwareSuite;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources
     * 
     */
    @JsonProperty("Sources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources")
    private List<Property<SourceConfig>> sources = new ArrayList<Property<SourceConfig>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-tags")
    private Object tags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-name")
    private CharSequence name;

    /**
     * RenderingEngine
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-renderingengine.html
     * 
     */
    @JsonIgnore
    public Property<RenderingEngine> getRenderingEngine() {
        return renderingEngine;
    }

    /**
     * RenderingEngine
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-renderingengine.html
     * 
     */
    @JsonIgnore
    public void setRenderingEngine(Property<RenderingEngine> renderingEngine) {
        this.renderingEngine = renderingEngine;
    }

    public SimulationApplication withRenderingEngine(Property<RenderingEngine> renderingEngine) {
        this.renderingEngine = renderingEngine;
        return this;
    }

    /**
     * SimulationSoftwareSuite
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-simulationsoftwaresuite.html
     * 
     */
    @JsonIgnore
    public Property<SimulationSoftwareSuite> getSimulationSoftwareSuite() {
        return simulationSoftwareSuite;
    }

    /**
     * SimulationSoftwareSuite
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-simulationsoftwaresuite.html
     * 
     */
    @JsonIgnore
    public void setSimulationSoftwareSuite(Property<SimulationSoftwareSuite> simulationSoftwareSuite) {
        this.simulationSoftwareSuite = simulationSoftwareSuite;
    }

    public SimulationApplication withSimulationSoftwareSuite(Property<SimulationSoftwareSuite> simulationSoftwareSuite) {
        this.simulationSoftwareSuite = simulationSoftwareSuite;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-currentrevisionid
     * 
     */
    @JsonIgnore
    public CharSequence getCurrentRevisionId() {
        return currentRevisionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-currentrevisionid
     * 
     */
    @JsonIgnore
    public void setCurrentRevisionId(CharSequence currentRevisionId) {
        this.currentRevisionId = currentRevisionId;
    }

    public SimulationApplication withCurrentRevisionId(CharSequence currentRevisionId) {
        this.currentRevisionId = currentRevisionId;
        return this;
    }

    /**
     * RobotSoftwareSuite
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html
     * 
     */
    @JsonIgnore
    public Property<RobotSoftwareSuite> getRobotSoftwareSuite() {
        return robotSoftwareSuite;
    }

    /**
     * RobotSoftwareSuite
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html
     * 
     */
    @JsonIgnore
    public void setRobotSoftwareSuite(Property<RobotSoftwareSuite> robotSoftwareSuite) {
        this.robotSoftwareSuite = robotSoftwareSuite;
    }

    public SimulationApplication withRobotSoftwareSuite(Property<RobotSoftwareSuite> robotSoftwareSuite) {
        this.robotSoftwareSuite = robotSoftwareSuite;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources
     * 
     */
    @JsonIgnore
    public List<Property<SourceConfig>> getSources() {
        return sources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-sources
     * 
     */
    @JsonIgnore
    public void setSources(List<Property<SourceConfig>> sources) {
        this.sources = sources;
    }

    public SimulationApplication withSources(List<Property<SourceConfig>> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public SimulationApplication withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html#cfn-robomaker-simulationapplication-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public SimulationApplication withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("renderingEngine", renderingEngine).append("simulationSoftwareSuite", simulationSoftwareSuite).append("currentRevisionId", currentRevisionId).append("robotSoftwareSuite", robotSoftwareSuite).append("sources", sources).append("tags", tags).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sources).append(simulationSoftwareSuite).append(name).append(renderingEngine).append(currentRevisionId).append(robotSoftwareSuite).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimulationApplication) == false) {
            return false;
        }
        SimulationApplication rhs = ((SimulationApplication) other);
        return new EqualsBuilder().append(sources, rhs.sources).append(simulationSoftwareSuite, rhs.simulationSoftwareSuite).append(name, rhs.name).append(renderingEngine, rhs.renderingEngine).append(currentRevisionId, rhs.currentRevisionId).append(robotSoftwareSuite, rhs.robotSoftwareSuite).append(tags, rhs.tags).isEquals();
    }

}
