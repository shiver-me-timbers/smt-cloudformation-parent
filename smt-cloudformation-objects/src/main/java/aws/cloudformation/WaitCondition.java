
package aws.cloudformation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * WaitCondition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Count",
    "Handle",
    "Timeout"
})
public class WaitCondition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-count
     * 
     */
    @JsonProperty("Count")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-count")
    private Integer count;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-handle
     * 
     */
    @JsonProperty("Handle")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-handle")
    private CharSequence handle;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-timeout
     * 
     */
    @JsonProperty("Timeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-timeout")
    private CharSequence timeout;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-count
     * 
     */
    public Integer getCount() {
        return count;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-count
     * 
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    public WaitCondition withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-handle
     * 
     */
    public CharSequence getHandle() {
        return handle;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-handle
     * 
     */
    public void setHandle(CharSequence handle) {
        this.handle = handle;
    }

    public WaitCondition withHandle(CharSequence handle) {
        this.handle = handle;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-timeout
     * 
     */
    public CharSequence getTimeout() {
        return timeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-timeout
     * 
     */
    public void setTimeout(CharSequence timeout) {
        this.timeout = timeout;
    }

    public WaitCondition withTimeout(CharSequence timeout) {
        this.timeout = timeout;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("count", count).append("handle", handle).append("timeout", timeout).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(handle).append(timeout).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WaitCondition) == false) {
            return false;
        }
        WaitCondition rhs = ((WaitCondition) other);
        return new EqualsBuilder().append(count, rhs.count).append(handle, rhs.handle).append(timeout, rhs.timeout).isEquals();
    }

}
