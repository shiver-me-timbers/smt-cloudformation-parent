
package aws.mediastore;

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
 * Container
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Policy",
    "ContainerName",
    "CorsPolicy",
    "LifecyclePolicy",
    "AccessLoggingEnabled"
})
public class Container {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-policy
     * 
     */
    @JsonProperty("Policy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-policy")
    private CharSequence policy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-containername
     * 
     */
    @JsonProperty("ContainerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-containername")
    private CharSequence containerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy
     * 
     */
    @JsonProperty("CorsPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy")
    private List<Property<ContainerCorsRule>> corsPolicy = new ArrayList<Property<ContainerCorsRule>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-lifecyclepolicy
     * 
     */
    @JsonProperty("LifecyclePolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-lifecyclepolicy")
    private CharSequence lifecyclePolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-accessloggingenabled
     * 
     */
    @JsonProperty("AccessLoggingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-accessloggingenabled")
    private CharSequence accessLoggingEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-policy
     * 
     */
    @JsonIgnore
    public CharSequence getPolicy() {
        return policy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-policy
     * 
     */
    @JsonIgnore
    public void setPolicy(CharSequence policy) {
        this.policy = policy;
    }

    public Container withPolicy(CharSequence policy) {
        this.policy = policy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-containername
     * 
     */
    @JsonIgnore
    public CharSequence getContainerName() {
        return containerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-containername
     * 
     */
    @JsonIgnore
    public void setContainerName(CharSequence containerName) {
        this.containerName = containerName;
    }

    public Container withContainerName(CharSequence containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy
     * 
     */
    @JsonIgnore
    public List<Property<ContainerCorsRule>> getCorsPolicy() {
        return corsPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy
     * 
     */
    @JsonIgnore
    public void setCorsPolicy(List<Property<ContainerCorsRule>> corsPolicy) {
        this.corsPolicy = corsPolicy;
    }

    public Container withCorsPolicy(List<Property<ContainerCorsRule>> corsPolicy) {
        this.corsPolicy = corsPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-lifecyclepolicy
     * 
     */
    @JsonIgnore
    public CharSequence getLifecyclePolicy() {
        return lifecyclePolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-lifecyclepolicy
     * 
     */
    @JsonIgnore
    public void setLifecyclePolicy(CharSequence lifecyclePolicy) {
        this.lifecyclePolicy = lifecyclePolicy;
    }

    public Container withLifecyclePolicy(CharSequence lifecyclePolicy) {
        this.lifecyclePolicy = lifecyclePolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-accessloggingenabled
     * 
     */
    @JsonIgnore
    public CharSequence getAccessLoggingEnabled() {
        return accessLoggingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-accessloggingenabled
     * 
     */
    @JsonIgnore
    public void setAccessLoggingEnabled(CharSequence accessLoggingEnabled) {
        this.accessLoggingEnabled = accessLoggingEnabled;
    }

    public Container withAccessLoggingEnabled(CharSequence accessLoggingEnabled) {
        this.accessLoggingEnabled = accessLoggingEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("policy", policy).append("containerName", containerName).append("corsPolicy", corsPolicy).append("lifecyclePolicy", lifecyclePolicy).append("accessLoggingEnabled", accessLoggingEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lifecyclePolicy).append(containerName).append(policy).append(corsPolicy).append(accessLoggingEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Container) == false) {
            return false;
        }
        Container rhs = ((Container) other);
        return new EqualsBuilder().append(lifecyclePolicy, rhs.lifecyclePolicy).append(containerName, rhs.containerName).append(policy, rhs.policy).append(corsPolicy, rhs.corsPolicy).append(accessLoggingEnabled, rhs.accessLoggingEnabled).isEquals();
    }

}
