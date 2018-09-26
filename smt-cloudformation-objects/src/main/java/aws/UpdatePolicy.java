
package aws;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AutoScalingReplacingUpdate"
})
public class UpdatePolicy {

    @JsonProperty("AutoScalingReplacingUpdate")
    private AutoScalingReplacingUpdate autoScalingReplacingUpdate;

    public AutoScalingReplacingUpdate getAutoScalingReplacingUpdate() {
        return autoScalingReplacingUpdate;
    }

    public void setAutoScalingReplacingUpdate(AutoScalingReplacingUpdate autoScalingReplacingUpdate) {
        this.autoScalingReplacingUpdate = autoScalingReplacingUpdate;
    }

    public UpdatePolicy withAutoScalingReplacingUpdate(AutoScalingReplacingUpdate autoScalingReplacingUpdate) {
        this.autoScalingReplacingUpdate = autoScalingReplacingUpdate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("autoScalingReplacingUpdate", autoScalingReplacingUpdate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(autoScalingReplacingUpdate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UpdatePolicy) == false) {
            return false;
        }
        UpdatePolicy rhs = ((UpdatePolicy) other);
        return new EqualsBuilder().append(autoScalingReplacingUpdate, rhs.autoScalingReplacingUpdate).isEquals();
    }

}
