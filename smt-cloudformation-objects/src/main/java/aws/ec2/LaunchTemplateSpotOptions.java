
package aws.ec2;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LaunchTemplateSpotOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SpotInstanceType",
    "InstanceInterruptionBehavior",
    "MaxPrice"
})
public class LaunchTemplateSpotOptions implements Property<LaunchTemplateSpotOptions>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-spotinstancetype
     * 
     */
    @JsonProperty("SpotInstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-spotinstancetype")
    private CharSequence spotInstanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-instanceinterruptionbehavior
     * 
     */
    @JsonProperty("InstanceInterruptionBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-instanceinterruptionbehavior")
    private CharSequence instanceInterruptionBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-maxprice
     * 
     */
    @JsonProperty("MaxPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-maxprice")
    private CharSequence maxPrice;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-spotinstancetype
     * 
     */
    @JsonIgnore
    public CharSequence getSpotInstanceType() {
        return spotInstanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-spotinstancetype
     * 
     */
    @JsonIgnore
    public void setSpotInstanceType(CharSequence spotInstanceType) {
        this.spotInstanceType = spotInstanceType;
    }

    public LaunchTemplateSpotOptions withSpotInstanceType(CharSequence spotInstanceType) {
        this.spotInstanceType = spotInstanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-instanceinterruptionbehavior
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceInterruptionBehavior() {
        return instanceInterruptionBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-instanceinterruptionbehavior
     * 
     */
    @JsonIgnore
    public void setInstanceInterruptionBehavior(CharSequence instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    public LaunchTemplateSpotOptions withInstanceInterruptionBehavior(CharSequence instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-maxprice
     * 
     */
    @JsonIgnore
    public CharSequence getMaxPrice() {
        return maxPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-maxprice
     * 
     */
    @JsonIgnore
    public void setMaxPrice(CharSequence maxPrice) {
        this.maxPrice = maxPrice;
    }

    public LaunchTemplateSpotOptions withMaxPrice(CharSequence maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("spotInstanceType", spotInstanceType).append("instanceInterruptionBehavior", instanceInterruptionBehavior).append("maxPrice", maxPrice).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(instanceInterruptionBehavior).append(spotInstanceType).append(maxPrice).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchTemplateSpotOptions) == false) {
            return false;
        }
        LaunchTemplateSpotOptions rhs = ((LaunchTemplateSpotOptions) other);
        return new EqualsBuilder().append(instanceInterruptionBehavior, rhs.instanceInterruptionBehavior).append(spotInstanceType, rhs.spotInstanceType).append(maxPrice, rhs.maxPrice).isEquals();
    }

}