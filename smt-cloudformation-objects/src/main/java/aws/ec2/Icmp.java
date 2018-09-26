
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Icmp
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Code",
    "Type"
})
public class Icmp {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-code
     * 
     */
    @JsonProperty("Code")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-code")
    private Integer code;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-type")
    private Integer type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-code
     * 
     */
    public Integer getCode() {
        return code;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-code
     * 
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    public Icmp withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-type
     * 
     */
    public Integer getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-type
     * 
     */
    public void setType(Integer type) {
        this.type = type;
    }

    public Icmp withType(Integer type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(code).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Icmp) == false) {
            return false;
        }
        Icmp rhs = ((Icmp) other);
        return new EqualsBuilder().append(type, rhs.type).append(code, rhs.code).isEquals();
    }

}
