
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
 * InstanceLicenseSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-licensespecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LicenseConfigurationArn"
})
public class InstanceLicenseSpecification implements Property<InstanceLicenseSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-licensespecification.html#cfn-ec2-instance-licensespecification-licenseconfigurationarn
     * 
     */
    @JsonProperty("LicenseConfigurationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-licensespecification.html#cfn-ec2-instance-licensespecification-licenseconfigurationarn")
    private CharSequence licenseConfigurationArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-licensespecification.html#cfn-ec2-instance-licensespecification-licenseconfigurationarn
     * 
     */
    @JsonIgnore
    public CharSequence getLicenseConfigurationArn() {
        return licenseConfigurationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-licensespecification.html#cfn-ec2-instance-licensespecification-licenseconfigurationarn
     * 
     */
    @JsonIgnore
    public void setLicenseConfigurationArn(CharSequence licenseConfigurationArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
    }

    public InstanceLicenseSpecification withLicenseConfigurationArn(CharSequence licenseConfigurationArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("licenseConfigurationArn", licenseConfigurationArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(licenseConfigurationArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceLicenseSpecification) == false) {
            return false;
        }
        InstanceLicenseSpecification rhs = ((InstanceLicenseSpecification) other);
        return new EqualsBuilder().append(licenseConfigurationArn, rhs.licenseConfigurationArn).isEquals();
    }

}
