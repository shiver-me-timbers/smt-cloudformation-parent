
package aws;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MinSuccessfulInstancesPercent"
})
public class AutoScalingCreationPolicy {

    @JsonProperty("MinSuccessfulInstancesPercent")
    private Integer minSuccessfulInstancesPercent;

    public Integer getMinSuccessfulInstancesPercent() {
        return minSuccessfulInstancesPercent;
    }

    public void setMinSuccessfulInstancesPercent(Integer minSuccessfulInstancesPercent) {
        this.minSuccessfulInstancesPercent = minSuccessfulInstancesPercent;
    }

    public AutoScalingCreationPolicy withMinSuccessfulInstancesPercent(Integer minSuccessfulInstancesPercent) {
        this.minSuccessfulInstancesPercent = minSuccessfulInstancesPercent;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("minSuccessfulInstancesPercent", minSuccessfulInstancesPercent).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(minSuccessfulInstancesPercent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutoScalingCreationPolicy) == false) {
            return false;
        }
        AutoScalingCreationPolicy rhs = ((AutoScalingCreationPolicy) other);
        return new EqualsBuilder().append(minSuccessfulInstancesPercent, rhs.minSuccessfulInstancesPercent).isEquals();
    }

}
