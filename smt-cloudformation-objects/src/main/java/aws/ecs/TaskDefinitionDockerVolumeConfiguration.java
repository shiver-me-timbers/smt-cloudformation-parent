
package aws.ecs;

import java.util.Map;
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
 * TaskDefinitionDockerVolumeConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Autoprovision",
    "Driver",
    "DriverOpts",
    "Labels",
    "Scope"
})
public class TaskDefinitionDockerVolumeConfiguration implements Property<TaskDefinitionDockerVolumeConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-autoprovision
     * 
     */
    @JsonProperty("Autoprovision")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-autoprovision")
    private CharSequence autoprovision;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driver
     * 
     */
    @JsonProperty("Driver")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driver")
    private CharSequence driver;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driveropts
     * 
     */
    @JsonProperty("DriverOpts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driveropts")
    private Map<String, CharSequence> driverOpts;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-labels
     * 
     */
    @JsonProperty("Labels")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-labels")
    private Map<String, CharSequence> labels;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-scope
     * 
     */
    @JsonProperty("Scope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-scope")
    private CharSequence scope;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-autoprovision
     * 
     */
    @JsonIgnore
    public CharSequence getAutoprovision() {
        return autoprovision;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-autoprovision
     * 
     */
    @JsonIgnore
    public void setAutoprovision(CharSequence autoprovision) {
        this.autoprovision = autoprovision;
    }

    public TaskDefinitionDockerVolumeConfiguration withAutoprovision(CharSequence autoprovision) {
        this.autoprovision = autoprovision;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driver
     * 
     */
    @JsonIgnore
    public CharSequence getDriver() {
        return driver;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driver
     * 
     */
    @JsonIgnore
    public void setDriver(CharSequence driver) {
        this.driver = driver;
    }

    public TaskDefinitionDockerVolumeConfiguration withDriver(CharSequence driver) {
        this.driver = driver;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driveropts
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getDriverOpts() {
        return driverOpts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driveropts
     * 
     */
    @JsonIgnore
    public void setDriverOpts(Map<String, CharSequence> driverOpts) {
        this.driverOpts = driverOpts;
    }

    public TaskDefinitionDockerVolumeConfiguration withDriverOpts(Map<String, CharSequence> driverOpts) {
        this.driverOpts = driverOpts;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-labels
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getLabels() {
        return labels;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-labels
     * 
     */
    @JsonIgnore
    public void setLabels(Map<String, CharSequence> labels) {
        this.labels = labels;
    }

    public TaskDefinitionDockerVolumeConfiguration withLabels(Map<String, CharSequence> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-scope
     * 
     */
    @JsonIgnore
    public CharSequence getScope() {
        return scope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-scope
     * 
     */
    @JsonIgnore
    public void setScope(CharSequence scope) {
        this.scope = scope;
    }

    public TaskDefinitionDockerVolumeConfiguration withScope(CharSequence scope) {
        this.scope = scope;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("autoprovision", autoprovision).append("driver", driver).append("driverOpts", driverOpts).append("labels", labels).append("scope", scope).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(driverOpts).append(autoprovision).append(driver).append(labels).append(scope).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskDefinitionDockerVolumeConfiguration) == false) {
            return false;
        }
        TaskDefinitionDockerVolumeConfiguration rhs = ((TaskDefinitionDockerVolumeConfiguration) other);
        return new EqualsBuilder().append(driverOpts, rhs.driverOpts).append(autoprovision, rhs.autoprovision).append(driver, rhs.driver).append(labels, rhs.labels).append(scope, rhs.scope).isEquals();
    }

}
