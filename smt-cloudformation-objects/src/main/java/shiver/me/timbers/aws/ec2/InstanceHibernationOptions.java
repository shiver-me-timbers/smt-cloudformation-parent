
package shiver.me.timbers.aws.ec2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * InstanceHibernationOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Configured"
})
public class InstanceHibernationOptions implements Property<InstanceHibernationOptions>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html#cfn-ec2-instance-hibernationoptions-configured
     * 
     */
    @JsonProperty("Configured")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html#cfn-ec2-instance-hibernationoptions-configured")
    private CharSequence configured;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html#cfn-ec2-instance-hibernationoptions-configured
     * 
     */
    @JsonIgnore
    public CharSequence getConfigured() {
        return configured;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html#cfn-ec2-instance-hibernationoptions-configured
     * 
     */
    @JsonIgnore
    public void setConfigured(CharSequence configured) {
        this.configured = configured;
    }

    public InstanceHibernationOptions withConfigured(CharSequence configured) {
        this.configured = configured;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("configured", configured).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(configured).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceHibernationOptions) == false) {
            return false;
        }
        InstanceHibernationOptions rhs = ((InstanceHibernationOptions) other);
        return new EqualsBuilder().append(configured, rhs.configured).isEquals();
    }

}
