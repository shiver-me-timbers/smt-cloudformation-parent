
package shiver.me.timbers.aws.appconfig;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * DeploymentStrategy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ReplicateTo",
    "GrowthType",
    "Description",
    "DeploymentDurationInMinutes",
    "GrowthFactor",
    "FinalBakeTimeInMinutes",
    "Tags",
    "Name"
})
public class DeploymentStrategy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-replicateto
     * 
     */
    @JsonProperty("ReplicateTo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-replicateto")
    private CharSequence replicateTo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthtype
     * 
     */
    @JsonProperty("GrowthType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthtype")
    private CharSequence growthType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-deploymentdurationinminutes
     * 
     */
    @JsonProperty("DeploymentDurationInMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-deploymentdurationinminutes")
    private Number deploymentDurationInMinutes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthfactor
     * 
     */
    @JsonProperty("GrowthFactor")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthfactor")
    private Number growthFactor;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-finalbaketimeinminutes
     * 
     */
    @JsonProperty("FinalBakeTimeInMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-finalbaketimeinminutes")
    private Number finalBakeTimeInMinutes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-tags")
    private List<Property<DeploymentStrategyTags>> tags = new ArrayList<Property<DeploymentStrategyTags>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-replicateto
     * 
     */
    @JsonIgnore
    public CharSequence getReplicateTo() {
        return replicateTo;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-replicateto
     * 
     */
    @JsonIgnore
    public void setReplicateTo(CharSequence replicateTo) {
        this.replicateTo = replicateTo;
    }

    public DeploymentStrategy withReplicateTo(CharSequence replicateTo) {
        this.replicateTo = replicateTo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthtype
     * 
     */
    @JsonIgnore
    public CharSequence getGrowthType() {
        return growthType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthtype
     * 
     */
    @JsonIgnore
    public void setGrowthType(CharSequence growthType) {
        this.growthType = growthType;
    }

    public DeploymentStrategy withGrowthType(CharSequence growthType) {
        this.growthType = growthType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public DeploymentStrategy withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-deploymentdurationinminutes
     * 
     */
    @JsonIgnore
    public Number getDeploymentDurationInMinutes() {
        return deploymentDurationInMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-deploymentdurationinminutes
     * 
     */
    @JsonIgnore
    public void setDeploymentDurationInMinutes(Number deploymentDurationInMinutes) {
        this.deploymentDurationInMinutes = deploymentDurationInMinutes;
    }

    public DeploymentStrategy withDeploymentDurationInMinutes(Number deploymentDurationInMinutes) {
        this.deploymentDurationInMinutes = deploymentDurationInMinutes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthfactor
     * 
     */
    @JsonIgnore
    public Number getGrowthFactor() {
        return growthFactor;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthfactor
     * 
     */
    @JsonIgnore
    public void setGrowthFactor(Number growthFactor) {
        this.growthFactor = growthFactor;
    }

    public DeploymentStrategy withGrowthFactor(Number growthFactor) {
        this.growthFactor = growthFactor;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-finalbaketimeinminutes
     * 
     */
    @JsonIgnore
    public Number getFinalBakeTimeInMinutes() {
        return finalBakeTimeInMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-finalbaketimeinminutes
     * 
     */
    @JsonIgnore
    public void setFinalBakeTimeInMinutes(Number finalBakeTimeInMinutes) {
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
    }

    public DeploymentStrategy withFinalBakeTimeInMinutes(Number finalBakeTimeInMinutes) {
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-tags
     * 
     */
    @JsonIgnore
    public List<Property<DeploymentStrategyTags>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<DeploymentStrategyTags>> tags) {
        this.tags = tags;
    }

    public DeploymentStrategy withTags(List<Property<DeploymentStrategyTags>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public DeploymentStrategy withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("replicateTo", replicateTo).append("growthType", growthType).append("description", description).append("deploymentDurationInMinutes", deploymentDurationInMinutes).append("growthFactor", growthFactor).append("finalBakeTimeInMinutes", finalBakeTimeInMinutes).append("tags", tags).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(growthType).append(growthFactor).append(finalBakeTimeInMinutes).append(deploymentDurationInMinutes).append(name).append(description).append(replicateTo).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentStrategy) == false) {
            return false;
        }
        DeploymentStrategy rhs = ((DeploymentStrategy) other);
        return new EqualsBuilder().append(growthType, rhs.growthType).append(growthFactor, rhs.growthFactor).append(finalBakeTimeInMinutes, rhs.finalBakeTimeInMinutes).append(deploymentDurationInMinutes, rhs.deploymentDurationInMinutes).append(name, rhs.name).append(description, rhs.description).append(replicateTo, rhs.replicateTo).append(tags, rhs.tags).isEquals();
    }

}
