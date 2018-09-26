
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PortRange
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "From",
    "To"
})
public class PortRange {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-from
     * 
     */
    @JsonProperty("From")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-from")
    private Integer from;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-to
     * 
     */
    @JsonProperty("To")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-to")
    private Integer to;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-from
     * 
     */
    public Integer getFrom() {
        return from;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-from
     * 
     */
    public void setFrom(Integer from) {
        this.from = from;
    }

    public PortRange withFrom(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-to
     * 
     */
    public Integer getTo() {
        return to;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-to
     * 
     */
    public void setTo(Integer to) {
        this.to = to;
    }

    public PortRange withTo(Integer to) {
        this.to = to;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("from", from).append("to", to).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(from).append(to).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PortRange) == false) {
            return false;
        }
        PortRange rhs = ((PortRange) other);
        return new EqualsBuilder().append(from, rhs.from).append(to, rhs.to).isEquals();
    }

}
