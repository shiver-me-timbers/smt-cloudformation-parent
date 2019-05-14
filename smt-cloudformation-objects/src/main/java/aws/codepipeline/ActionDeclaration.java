
package aws.codepipeline;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ActionDeclaration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ActionTypeId",
    "Configuration",
    "InputArtifacts",
    "Name",
    "OutputArtifacts",
    "Region",
    "RoleArn",
    "RunOrder"
})
public class ActionDeclaration implements Property<ActionDeclaration>
{

    /**
     * ActionTypeId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html
     * 
     */
    @JsonProperty("ActionTypeId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html")
    private Property<ActionTypeId> actionTypeId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-configuration
     * 
     */
    @JsonProperty("Configuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-configuration")
    private Object configuration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-inputartifacts
     * 
     */
    @JsonProperty("InputArtifacts")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-inputartifacts")
    private Set<Property<InputArtifact>> inputArtifacts = new LinkedHashSet<Property<InputArtifact>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-outputartifacts
     * 
     */
    @JsonProperty("OutputArtifacts")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-outputartifacts")
    private Set<Property<OutputArtifact>> outputArtifacts = new LinkedHashSet<Property<OutputArtifact>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-region
     * 
     */
    @JsonProperty("Region")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-region")
    private CharSequence region;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-runorder
     * 
     */
    @JsonProperty("RunOrder")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-runorder")
    private Integer runOrder;

    /**
     * ActionTypeId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html
     * 
     */
    @JsonIgnore
    public Property<ActionTypeId> getActionTypeId() {
        return actionTypeId;
    }

    /**
     * ActionTypeId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html
     * 
     */
    @JsonIgnore
    public void setActionTypeId(Property<ActionTypeId> actionTypeId) {
        this.actionTypeId = actionTypeId;
    }

    public ActionDeclaration withActionTypeId(Property<ActionTypeId> actionTypeId) {
        this.actionTypeId = actionTypeId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-configuration
     * 
     */
    @JsonIgnore
    public Object getConfiguration() {
        return configuration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-configuration
     * 
     */
    @JsonIgnore
    public void setConfiguration(Object configuration) {
        this.configuration = configuration;
    }

    public ActionDeclaration withConfiguration(Object configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-inputartifacts
     * 
     */
    @JsonIgnore
    public Set<Property<InputArtifact>> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-inputartifacts
     * 
     */
    @JsonIgnore
    public void setInputArtifacts(Set<Property<InputArtifact>> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
    }

    public ActionDeclaration withInputArtifacts(Set<Property<InputArtifact>> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ActionDeclaration withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-outputartifacts
     * 
     */
    @JsonIgnore
    public Set<Property<OutputArtifact>> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-outputartifacts
     * 
     */
    @JsonIgnore
    public void setOutputArtifacts(Set<Property<OutputArtifact>> outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
    }

    public ActionDeclaration withOutputArtifacts(Set<Property<OutputArtifact>> outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-region
     * 
     */
    @JsonIgnore
    public CharSequence getRegion() {
        return region;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-region
     * 
     */
    @JsonIgnore
    public void setRegion(CharSequence region) {
        this.region = region;
    }

    public ActionDeclaration withRegion(CharSequence region) {
        this.region = region;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public ActionDeclaration withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-runorder
     * 
     */
    @JsonIgnore
    public Integer getRunOrder() {
        return runOrder;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-runorder
     * 
     */
    @JsonIgnore
    public void setRunOrder(Integer runOrder) {
        this.runOrder = runOrder;
    }

    public ActionDeclaration withRunOrder(Integer runOrder) {
        this.runOrder = runOrder;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("actionTypeId", actionTypeId).append("configuration", configuration).append("inputArtifacts", inputArtifacts).append("name", name).append("outputArtifacts", outputArtifacts).append("region", region).append("roleArn", roleArn).append("runOrder", runOrder).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(runOrder).append(actionTypeId).append(configuration).append(outputArtifacts).append(roleArn).append(name).append(region).append(inputArtifacts).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActionDeclaration) == false) {
            return false;
        }
        ActionDeclaration rhs = ((ActionDeclaration) other);
        return new EqualsBuilder().append(runOrder, rhs.runOrder).append(actionTypeId, rhs.actionTypeId).append(configuration, rhs.configuration).append(outputArtifacts, rhs.outputArtifacts).append(roleArn, rhs.roleArn).append(name, rhs.name).append(region, rhs.region).append(inputArtifacts, rhs.inputArtifacts).isEquals();
    }

}
