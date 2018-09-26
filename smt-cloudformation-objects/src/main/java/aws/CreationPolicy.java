
package aws;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AutoScalingCreationPolicy",
    "ResourceSignal"
})
public class CreationPolicy {

    @JsonProperty("AutoScalingCreationPolicy")
    private AutoScalingCreationPolicy autoScalingCreationPolicy;
    @JsonProperty("ResourceSignal")
    private ResourceSignal resourceSignal;

    public AutoScalingCreationPolicy getAutoScalingCreationPolicy() {
        return autoScalingCreationPolicy;
    }

    public void setAutoScalingCreationPolicy(AutoScalingCreationPolicy autoScalingCreationPolicy) {
        this.autoScalingCreationPolicy = autoScalingCreationPolicy;
    }

    public CreationPolicy withAutoScalingCreationPolicy(AutoScalingCreationPolicy autoScalingCreationPolicy) {
        this.autoScalingCreationPolicy = autoScalingCreationPolicy;
        return this;
    }

    public ResourceSignal getResourceSignal() {
        return resourceSignal;
    }

    public void setResourceSignal(ResourceSignal resourceSignal) {
        this.resourceSignal = resourceSignal;
    }

    public CreationPolicy withResourceSignal(ResourceSignal resourceSignal) {
        this.resourceSignal = resourceSignal;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("autoScalingCreationPolicy", autoScalingCreationPolicy).append("resourceSignal", resourceSignal).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceSignal).append(autoScalingCreationPolicy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreationPolicy) == false) {
            return false;
        }
        CreationPolicy rhs = ((CreationPolicy) other);
        return new EqualsBuilder().append(resourceSignal, rhs.resourceSignal).append(autoScalingCreationPolicy, rhs.autoScalingCreationPolicy).isEquals();
    }

}
