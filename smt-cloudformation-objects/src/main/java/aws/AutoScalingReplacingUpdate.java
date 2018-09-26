
package aws;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "WillReplace"
})
public class AutoScalingReplacingUpdate {

    @JsonProperty("WillReplace")
    private Boolean willReplace;

    public Boolean getWillReplace() {
        return willReplace;
    }

    public void setWillReplace(Boolean willReplace) {
        this.willReplace = willReplace;
    }

    public AutoScalingReplacingUpdate withWillReplace(Boolean willReplace) {
        this.willReplace = willReplace;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("willReplace", willReplace).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(willReplace).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutoScalingReplacingUpdate) == false) {
            return false;
        }
        AutoScalingReplacingUpdate rhs = ((AutoScalingReplacingUpdate) other);
        return new EqualsBuilder().append(willReplace, rhs.willReplace).isEquals();
    }

}
