
package aws.ssm;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Association
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AssociationName",
    "DocumentVersion",
    "InstanceId",
    "Name",
    "OutputLocation",
    "Parameters",
    "ScheduleExpression",
    "Targets"
})
public class Association {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname
     * 
     */
    @JsonProperty("AssociationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname")
    private java.lang.String associationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion
     * 
     */
    @JsonProperty("DocumentVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion")
    private java.lang.String documentVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid")
    private java.lang.String instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name")
    private java.lang.String name;
    /**
     * InstanceAssociationOutputLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html
     * 
     */
    @JsonProperty("OutputLocation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html")
    private InstanceAssociationOutputLocation outputLocation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters")
    private Map<String, ParameterValues> parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression
     * 
     */
    @JsonProperty("ScheduleExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression")
    private java.lang.String scheduleExpression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets
     * 
     */
    @JsonProperty("Targets")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets")
    private Set<Target> targets = new LinkedHashSet<Target>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname
     * 
     */
    @JsonProperty("AssociationName")
    public java.lang.String getAssociationName() {
        return associationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname
     * 
     */
    @JsonProperty("AssociationName")
    public void setAssociationName(java.lang.String associationName) {
        this.associationName = associationName;
    }

    public Association withAssociationName(java.lang.String associationName) {
        this.associationName = associationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion
     * 
     */
    @JsonProperty("DocumentVersion")
    public java.lang.String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion
     * 
     */
    @JsonProperty("DocumentVersion")
    public void setDocumentVersion(java.lang.String documentVersion) {
        this.documentVersion = documentVersion;
    }

    public Association withDocumentVersion(java.lang.String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    public java.lang.String getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    public void setInstanceId(java.lang.String instanceId) {
        this.instanceId = instanceId;
    }

    public Association withInstanceId(java.lang.String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name
     * 
     */
    @JsonProperty("Name")
    public java.lang.String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name
     * 
     */
    @JsonProperty("Name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public Association withName(java.lang.String name) {
        this.name = name;
        return this;
    }

    /**
     * InstanceAssociationOutputLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html
     * 
     */
    @JsonProperty("OutputLocation")
    public InstanceAssociationOutputLocation getOutputLocation() {
        return outputLocation;
    }

    /**
     * InstanceAssociationOutputLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html
     * 
     */
    @JsonProperty("OutputLocation")
    public void setOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    public Association withOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters
     * 
     */
    @JsonProperty("Parameters")
    public Map<String, ParameterValues> getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters
     * 
     */
    @JsonProperty("Parameters")
    public void setParameters(Map<String, ParameterValues> parameters) {
        this.parameters = parameters;
    }

    public Association withParameters(Map<String, ParameterValues> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression
     * 
     */
    @JsonProperty("ScheduleExpression")
    public java.lang.String getScheduleExpression() {
        return scheduleExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression
     * 
     */
    @JsonProperty("ScheduleExpression")
    public void setScheduleExpression(java.lang.String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    public Association withScheduleExpression(java.lang.String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets
     * 
     */
    @JsonProperty("Targets")
    public Set<Target> getTargets() {
        return targets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets
     * 
     */
    @JsonProperty("Targets")
    public void setTargets(Set<Target> targets) {
        this.targets = targets;
    }

    public Association withTargets(Set<Target> targets) {
        this.targets = targets;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("associationName", associationName).append("documentVersion", documentVersion).append("instanceId", instanceId).append("name", name).append("outputLocation", outputLocation).append("parameters", parameters).append("scheduleExpression", scheduleExpression).append("targets", targets).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(outputLocation).append(instanceId).append(associationName).append(scheduleExpression).append(name).append(parameters).append(targets).append(documentVersion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Association) == false) {
            return false;
        }
        Association rhs = ((Association) other);
        return new EqualsBuilder().append(outputLocation, rhs.outputLocation).append(instanceId, rhs.instanceId).append(associationName, rhs.associationName).append(scheduleExpression, rhs.scheduleExpression).append(name, rhs.name).append(parameters, rhs.parameters).append(targets, rhs.targets).append(documentVersion, rhs.documentVersion).isEquals();
    }

}
