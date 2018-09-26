
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * IamInstanceProfile
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Arn",
    "Name"
})
public class IamInstanceProfile {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-arn
     * 
     */
    @JsonProperty("Arn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-arn")
    private CharSequence arn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-arn
     * 
     */
    public CharSequence getArn() {
        return arn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-arn
     * 
     */
    public void setArn(CharSequence arn) {
        this.arn = arn;
    }

    public IamInstanceProfile withArn(CharSequence arn) {
        this.arn = arn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public IamInstanceProfile withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("arn", arn).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(arn).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IamInstanceProfile) == false) {
            return false;
        }
        IamInstanceProfile rhs = ((IamInstanceProfile) other);
        return new EqualsBuilder().append(arn, rhs.arn).append(name, rhs.name).isEquals();
    }

}
