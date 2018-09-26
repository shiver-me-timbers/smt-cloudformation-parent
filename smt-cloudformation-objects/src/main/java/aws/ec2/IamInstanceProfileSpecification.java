
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * IamInstanceProfileSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Arn"
})
public class IamInstanceProfileSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html#cfn-ec2-spotfleet-iaminstanceprofilespecification-arn
     * 
     */
    @JsonProperty("Arn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html#cfn-ec2-spotfleet-iaminstanceprofilespecification-arn")
    private CharSequence arn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html#cfn-ec2-spotfleet-iaminstanceprofilespecification-arn
     * 
     */
    public CharSequence getArn() {
        return arn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html#cfn-ec2-spotfleet-iaminstanceprofilespecification-arn
     * 
     */
    public void setArn(CharSequence arn) {
        this.arn = arn;
    }

    public IamInstanceProfileSpecification withArn(CharSequence arn) {
        this.arn = arn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("arn", arn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(arn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IamInstanceProfileSpecification) == false) {
            return false;
        }
        IamInstanceProfileSpecification rhs = ((IamInstanceProfileSpecification) other);
        return new EqualsBuilder().append(arn, rhs.arn).isEquals();
    }

}
