
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Host
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AutoPlacement",
    "AvailabilityZone",
    "InstanceType"
})
public class Host {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-autoplacement
     * 
     */
    @JsonProperty("AutoPlacement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-autoplacement")
    private CharSequence autoPlacement;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-availabilityzone")
    private CharSequence availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancetype")
    private CharSequence instanceType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-autoplacement
     * 
     */
    public CharSequence getAutoPlacement() {
        return autoPlacement;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-autoplacement
     * 
     */
    public void setAutoPlacement(CharSequence autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    public Host withAutoPlacement(CharSequence autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-availabilityzone
     * 
     */
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-availabilityzone
     * 
     */
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Host withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancetype
     * 
     */
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancetype
     * 
     */
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public Host withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("autoPlacement", autoPlacement).append("availabilityZone", availabilityZone).append("instanceType", instanceType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(autoPlacement).append(availabilityZone).append(instanceType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Host) == false) {
            return false;
        }
        Host rhs = ((Host) other);
        return new EqualsBuilder().append(autoPlacement, rhs.autoPlacement).append(availabilityZone, rhs.availabilityZone).append(instanceType, rhs.instanceType).isEquals();
    }

}
