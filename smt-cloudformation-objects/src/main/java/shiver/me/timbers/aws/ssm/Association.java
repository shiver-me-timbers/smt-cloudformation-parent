
package shiver.me.timbers.aws.ssm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
 * Association
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AssociationName",
    "DocumentVersion",
    "InstanceId",
    "Name",
    "Parameters",
    "ScheduleExpression",
    "Targets",
    "OutputLocation",
    "AutomationTargetParameterName",
    "MaxErrors",
    "MaxConcurrency",
    "ComplianceSeverity",
    "SyncCompliance",
    "WaitForSuccessTimeoutSeconds"
})
public class Association {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname
     * 
     */
    @JsonProperty("AssociationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname")
    private CharSequence associationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion
     * 
     */
    @JsonProperty("DocumentVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion")
    private CharSequence documentVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid")
    private CharSequence instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters")
    private Map<String, Property<AssociationParameterValues>> parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression
     * 
     */
    @JsonProperty("ScheduleExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression")
    private CharSequence scheduleExpression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets
     * 
     */
    @JsonProperty("Targets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets")
    private List<Property<AssociationTarget>> targets = new ArrayList<Property<AssociationTarget>>();
    /**
     * AssociationInstanceAssociationOutputLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html
     * 
     */
    @JsonProperty("OutputLocation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html")
    private Property<AssociationInstanceAssociationOutputLocation> outputLocation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-automationtargetparametername
     * 
     */
    @JsonProperty("AutomationTargetParameterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-automationtargetparametername")
    private CharSequence automationTargetParameterName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxerrors
     * 
     */
    @JsonProperty("MaxErrors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxerrors")
    private CharSequence maxErrors;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxconcurrency
     * 
     */
    @JsonProperty("MaxConcurrency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxconcurrency")
    private CharSequence maxConcurrency;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-complianceseverity
     * 
     */
    @JsonProperty("ComplianceSeverity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-complianceseverity")
    private CharSequence complianceSeverity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-synccompliance
     * 
     */
    @JsonProperty("SyncCompliance")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-synccompliance")
    private CharSequence syncCompliance;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-waitforsuccesstimeoutseconds
     * 
     */
    @JsonProperty("WaitForSuccessTimeoutSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-waitforsuccesstimeoutseconds")
    private Number waitForSuccessTimeoutSeconds;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname
     * 
     */
    @JsonIgnore
    public CharSequence getAssociationName() {
        return associationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname
     * 
     */
    @JsonIgnore
    public void setAssociationName(CharSequence associationName) {
        this.associationName = associationName;
    }

    public Association withAssociationName(CharSequence associationName) {
        this.associationName = associationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion
     * 
     */
    @JsonIgnore
    public CharSequence getDocumentVersion() {
        return documentVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion
     * 
     */
    @JsonIgnore
    public void setDocumentVersion(CharSequence documentVersion) {
        this.documentVersion = documentVersion;
    }

    public Association withDocumentVersion(CharSequence documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid
     * 
     */
    @JsonIgnore
    public void setInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
    }

    public Association withInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Association withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters
     * 
     */
    @JsonIgnore
    public Map<String, Property<AssociationParameterValues>> getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters
     * 
     */
    @JsonIgnore
    public void setParameters(Map<String, Property<AssociationParameterValues>> parameters) {
        this.parameters = parameters;
    }

    public Association withParameters(Map<String, Property<AssociationParameterValues>> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression
     * 
     */
    @JsonIgnore
    public CharSequence getScheduleExpression() {
        return scheduleExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression
     * 
     */
    @JsonIgnore
    public void setScheduleExpression(CharSequence scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    public Association withScheduleExpression(CharSequence scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets
     * 
     */
    @JsonIgnore
    public List<Property<AssociationTarget>> getTargets() {
        return targets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets
     * 
     */
    @JsonIgnore
    public void setTargets(List<Property<AssociationTarget>> targets) {
        this.targets = targets;
    }

    public Association withTargets(List<Property<AssociationTarget>> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * AssociationInstanceAssociationOutputLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html
     * 
     */
    @JsonIgnore
    public Property<AssociationInstanceAssociationOutputLocation> getOutputLocation() {
        return outputLocation;
    }

    /**
     * AssociationInstanceAssociationOutputLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html
     * 
     */
    @JsonIgnore
    public void setOutputLocation(Property<AssociationInstanceAssociationOutputLocation> outputLocation) {
        this.outputLocation = outputLocation;
    }

    public Association withOutputLocation(Property<AssociationInstanceAssociationOutputLocation> outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-automationtargetparametername
     * 
     */
    @JsonIgnore
    public CharSequence getAutomationTargetParameterName() {
        return automationTargetParameterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-automationtargetparametername
     * 
     */
    @JsonIgnore
    public void setAutomationTargetParameterName(CharSequence automationTargetParameterName) {
        this.automationTargetParameterName = automationTargetParameterName;
    }

    public Association withAutomationTargetParameterName(CharSequence automationTargetParameterName) {
        this.automationTargetParameterName = automationTargetParameterName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxerrors
     * 
     */
    @JsonIgnore
    public CharSequence getMaxErrors() {
        return maxErrors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxerrors
     * 
     */
    @JsonIgnore
    public void setMaxErrors(CharSequence maxErrors) {
        this.maxErrors = maxErrors;
    }

    public Association withMaxErrors(CharSequence maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxconcurrency
     * 
     */
    @JsonIgnore
    public CharSequence getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-maxconcurrency
     * 
     */
    @JsonIgnore
    public void setMaxConcurrency(CharSequence maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    public Association withMaxConcurrency(CharSequence maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-complianceseverity
     * 
     */
    @JsonIgnore
    public CharSequence getComplianceSeverity() {
        return complianceSeverity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-complianceseverity
     * 
     */
    @JsonIgnore
    public void setComplianceSeverity(CharSequence complianceSeverity) {
        this.complianceSeverity = complianceSeverity;
    }

    public Association withComplianceSeverity(CharSequence complianceSeverity) {
        this.complianceSeverity = complianceSeverity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-synccompliance
     * 
     */
    @JsonIgnore
    public CharSequence getSyncCompliance() {
        return syncCompliance;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-synccompliance
     * 
     */
    @JsonIgnore
    public void setSyncCompliance(CharSequence syncCompliance) {
        this.syncCompliance = syncCompliance;
    }

    public Association withSyncCompliance(CharSequence syncCompliance) {
        this.syncCompliance = syncCompliance;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-waitforsuccesstimeoutseconds
     * 
     */
    @JsonIgnore
    public Number getWaitForSuccessTimeoutSeconds() {
        return waitForSuccessTimeoutSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-waitforsuccesstimeoutseconds
     * 
     */
    @JsonIgnore
    public void setWaitForSuccessTimeoutSeconds(Number waitForSuccessTimeoutSeconds) {
        this.waitForSuccessTimeoutSeconds = waitForSuccessTimeoutSeconds;
    }

    public Association withWaitForSuccessTimeoutSeconds(Number waitForSuccessTimeoutSeconds) {
        this.waitForSuccessTimeoutSeconds = waitForSuccessTimeoutSeconds;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("associationName", associationName).append("documentVersion", documentVersion).append("instanceId", instanceId).append("name", name).append("parameters", parameters).append("scheduleExpression", scheduleExpression).append("targets", targets).append("outputLocation", outputLocation).append("automationTargetParameterName", automationTargetParameterName).append("maxErrors", maxErrors).append("maxConcurrency", maxConcurrency).append("complianceSeverity", complianceSeverity).append("syncCompliance", syncCompliance).append("waitForSuccessTimeoutSeconds", waitForSuccessTimeoutSeconds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(outputLocation).append(automationTargetParameterName).append(syncCompliance).append(scheduleExpression).append(waitForSuccessTimeoutSeconds).append(targets).append(documentVersion).append(maxConcurrency).append(instanceId).append(maxErrors).append(complianceSeverity).append(associationName).append(name).append(parameters).toHashCode();
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
        return new EqualsBuilder().append(outputLocation, rhs.outputLocation).append(automationTargetParameterName, rhs.automationTargetParameterName).append(syncCompliance, rhs.syncCompliance).append(scheduleExpression, rhs.scheduleExpression).append(waitForSuccessTimeoutSeconds, rhs.waitForSuccessTimeoutSeconds).append(targets, rhs.targets).append(documentVersion, rhs.documentVersion).append(maxConcurrency, rhs.maxConcurrency).append(instanceId, rhs.instanceId).append(maxErrors, rhs.maxErrors).append(complianceSeverity, rhs.complianceSeverity).append(associationName, rhs.associationName).append(name, rhs.name).append(parameters, rhs.parameters).isEquals();
    }

}
