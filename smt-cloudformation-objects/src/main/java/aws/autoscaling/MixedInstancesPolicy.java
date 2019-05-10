
package aws.autoscaling;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MixedInstancesPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-group-mixedinstancespolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "InstancesDistribution",
    "LaunchTemplate"
})
public class MixedInstancesPolicy {

    /**
     * InstancesDistribution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html
     * 
     */
    @JsonProperty("InstancesDistribution")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html")
    private InstancesDistribution instancesDistribution;
    /**
     * LaunchTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html
     * 
     */
    @JsonProperty("LaunchTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html")
    private LaunchTemplate launchTemplate;

    /**
     * InstancesDistribution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html
     * 
     */
    @JsonIgnore
    public InstancesDistribution getInstancesDistribution() {
        return instancesDistribution;
    }

    /**
     * InstancesDistribution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html
     * 
     */
    @JsonIgnore
    public void setInstancesDistribution(InstancesDistribution instancesDistribution) {
        this.instancesDistribution = instancesDistribution;
    }

    public MixedInstancesPolicy withInstancesDistribution(InstancesDistribution instancesDistribution) {
        this.instancesDistribution = instancesDistribution;
        return this;
    }

    /**
     * LaunchTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html
     * 
     */
    @JsonIgnore
    public LaunchTemplate getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * LaunchTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html
     * 
     */
    @JsonIgnore
    public void setLaunchTemplate(LaunchTemplate launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    public MixedInstancesPolicy withLaunchTemplate(LaunchTemplate launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("instancesDistribution", instancesDistribution).append("launchTemplate", launchTemplate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(instancesDistribution).append(launchTemplate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MixedInstancesPolicy) == false) {
            return false;
        }
        MixedInstancesPolicy rhs = ((MixedInstancesPolicy) other);
        return new EqualsBuilder().append(instancesDistribution, rhs.instancesDistribution).append(launchTemplate, rhs.launchTemplate).isEquals();
    }

}
