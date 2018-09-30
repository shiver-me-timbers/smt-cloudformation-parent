
package aws.ecs;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DockerVolumeConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Autoprovision",
    "Driver",
    "DriverOpts",
    "Labels",
    "Scope"
})
public class DockerVolumeConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-autoprovision
     * 
     */
    @JsonProperty("Autoprovision")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-autoprovision")
    private Boolean autoprovision;
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
    private Map<String, String> driverOpts;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-labels
     * 
     */
    @JsonProperty("Labels")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-labels")
    private Map<String, String> labels;
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
    public Boolean getAutoprovision() {
        return autoprovision;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-autoprovision
     * 
     */
    public void setAutoprovision(Boolean autoprovision) {
        this.autoprovision = autoprovision;
    }

    public DockerVolumeConfiguration withAutoprovision(Boolean autoprovision) {
        this.autoprovision = autoprovision;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driver
     * 
     */
    public CharSequence getDriver() {
        return driver;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driver
     * 
     */
    public void setDriver(CharSequence driver) {
        this.driver = driver;
    }

    public DockerVolumeConfiguration withDriver(CharSequence driver) {
        this.driver = driver;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driveropts
     * 
     */
    public Map<String, String> getDriverOpts() {
        return driverOpts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driveropts
     * 
     */
    public void setDriverOpts(Map<String, String> driverOpts) {
        this.driverOpts = driverOpts;
    }

    public DockerVolumeConfiguration withDriverOpts(Map<String, String> driverOpts) {
        this.driverOpts = driverOpts;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-labels
     * 
     */
    public Map<String, String> getLabels() {
        return labels;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-labels
     * 
     */
    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public DockerVolumeConfiguration withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-scope
     * 
     */
    public CharSequence getScope() {
        return scope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-scope
     * 
     */
    public void setScope(CharSequence scope) {
        this.scope = scope;
    }

    public DockerVolumeConfiguration withScope(CharSequence scope) {
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
        if ((other instanceof DockerVolumeConfiguration) == false) {
            return false;
        }
        DockerVolumeConfiguration rhs = ((DockerVolumeConfiguration) other);
        return new EqualsBuilder().append(driverOpts, rhs.driverOpts).append(autoprovision, rhs.autoprovision).append(driver, rhs.driver).append(labels, rhs.labels).append(scope, rhs.scope).isEquals();
    }

}
