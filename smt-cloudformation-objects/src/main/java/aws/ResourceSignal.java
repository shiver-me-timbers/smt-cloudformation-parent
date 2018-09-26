
package aws;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Count",
    "Timeout"
})
public class ResourceSignal {

    @JsonProperty("Count")
    private Integer count;
    @JsonProperty("Timeout")
    private String timeout;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ResourceSignal withCount(Integer count) {
        this.count = count;
        return this;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public ResourceSignal withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("count", count).append("timeout", timeout).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(timeout).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceSignal) == false) {
            return false;
        }
        ResourceSignal rhs = ((ResourceSignal) other);
        return new EqualsBuilder().append(count, rhs.count).append(timeout, rhs.timeout).isEquals();
    }

}
