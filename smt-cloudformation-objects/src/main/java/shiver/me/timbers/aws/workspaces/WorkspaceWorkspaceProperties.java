
package shiver.me.timbers.aws.workspaces;

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
 * WorkspaceWorkspaceProperties
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ComputeTypeName",
    "RootVolumeSizeGib",
    "RunningMode",
    "RunningModeAutoStopTimeoutInMinutes",
    "UserVolumeSizeGib"
})
public class WorkspaceWorkspaceProperties implements Property<WorkspaceWorkspaceProperties>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-computetypename
     * 
     */
    @JsonProperty("ComputeTypeName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-computetypename")
    private CharSequence computeTypeName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-rootvolumesizegib
     * 
     */
    @JsonProperty("RootVolumeSizeGib")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-rootvolumesizegib")
    private Number rootVolumeSizeGib;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-runningmode
     * 
     */
    @JsonProperty("RunningMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-runningmode")
    private CharSequence runningMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-runningmodeautostoptimeoutinminutes
     * 
     */
    @JsonProperty("RunningModeAutoStopTimeoutInMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-runningmodeautostoptimeoutinminutes")
    private Number runningModeAutoStopTimeoutInMinutes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-uservolumesizegib
     * 
     */
    @JsonProperty("UserVolumeSizeGib")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-uservolumesizegib")
    private Number userVolumeSizeGib;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-computetypename
     * 
     */
    @JsonIgnore
    public CharSequence getComputeTypeName() {
        return computeTypeName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-computetypename
     * 
     */
    @JsonIgnore
    public void setComputeTypeName(CharSequence computeTypeName) {
        this.computeTypeName = computeTypeName;
    }

    public WorkspaceWorkspaceProperties withComputeTypeName(CharSequence computeTypeName) {
        this.computeTypeName = computeTypeName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-rootvolumesizegib
     * 
     */
    @JsonIgnore
    public Number getRootVolumeSizeGib() {
        return rootVolumeSizeGib;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-rootvolumesizegib
     * 
     */
    @JsonIgnore
    public void setRootVolumeSizeGib(Number rootVolumeSizeGib) {
        this.rootVolumeSizeGib = rootVolumeSizeGib;
    }

    public WorkspaceWorkspaceProperties withRootVolumeSizeGib(Number rootVolumeSizeGib) {
        this.rootVolumeSizeGib = rootVolumeSizeGib;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-runningmode
     * 
     */
    @JsonIgnore
    public CharSequence getRunningMode() {
        return runningMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-runningmode
     * 
     */
    @JsonIgnore
    public void setRunningMode(CharSequence runningMode) {
        this.runningMode = runningMode;
    }

    public WorkspaceWorkspaceProperties withRunningMode(CharSequence runningMode) {
        this.runningMode = runningMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-runningmodeautostoptimeoutinminutes
     * 
     */
    @JsonIgnore
    public Number getRunningModeAutoStopTimeoutInMinutes() {
        return runningModeAutoStopTimeoutInMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-runningmodeautostoptimeoutinminutes
     * 
     */
    @JsonIgnore
    public void setRunningModeAutoStopTimeoutInMinutes(Number runningModeAutoStopTimeoutInMinutes) {
        this.runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes;
    }

    public WorkspaceWorkspaceProperties withRunningModeAutoStopTimeoutInMinutes(Number runningModeAutoStopTimeoutInMinutes) {
        this.runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-uservolumesizegib
     * 
     */
    @JsonIgnore
    public Number getUserVolumeSizeGib() {
        return userVolumeSizeGib;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html#cfn-workspaces-workspace-workspaceproperties-uservolumesizegib
     * 
     */
    @JsonIgnore
    public void setUserVolumeSizeGib(Number userVolumeSizeGib) {
        this.userVolumeSizeGib = userVolumeSizeGib;
    }

    public WorkspaceWorkspaceProperties withUserVolumeSizeGib(Number userVolumeSizeGib) {
        this.userVolumeSizeGib = userVolumeSizeGib;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("computeTypeName", computeTypeName).append("rootVolumeSizeGib", rootVolumeSizeGib).append("runningMode", runningMode).append("runningModeAutoStopTimeoutInMinutes", runningModeAutoStopTimeoutInMinutes).append("userVolumeSizeGib", userVolumeSizeGib).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rootVolumeSizeGib).append(runningModeAutoStopTimeoutInMinutes).append(userVolumeSizeGib).append(runningMode).append(computeTypeName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkspaceWorkspaceProperties) == false) {
            return false;
        }
        WorkspaceWorkspaceProperties rhs = ((WorkspaceWorkspaceProperties) other);
        return new EqualsBuilder().append(rootVolumeSizeGib, rhs.rootVolumeSizeGib).append(runningModeAutoStopTimeoutInMinutes, rhs.runningModeAutoStopTimeoutInMinutes).append(userVolumeSizeGib, rhs.userVolumeSizeGib).append(runningMode, rhs.runningMode).append(computeTypeName, rhs.computeTypeName).isEquals();
    }

}
