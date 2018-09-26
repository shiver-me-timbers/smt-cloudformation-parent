
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SpotOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SpotInstanceType",
    "InstanceInterruptionBehavior",
    "MaxPrice"
})
public class SpotOptions {

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
    public CharSequence getSpotInstanceType() {
        return spotInstanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-spotinstancetype
     * 
     */
    public void setSpotInstanceType(CharSequence spotInstanceType) {
        this.spotInstanceType = spotInstanceType;
    }

    public SpotOptions withSpotInstanceType(CharSequence spotInstanceType) {
        this.spotInstanceType = spotInstanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-instanceinterruptionbehavior
     * 
     */
    public CharSequence getInstanceInterruptionBehavior() {
        return instanceInterruptionBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-instanceinterruptionbehavior
     * 
     */
    public void setInstanceInterruptionBehavior(CharSequence instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    public SpotOptions withInstanceInterruptionBehavior(CharSequence instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-maxprice
     * 
     */
    public CharSequence getMaxPrice() {
        return maxPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-maxprice
     * 
     */
    public void setMaxPrice(CharSequence maxPrice) {
        this.maxPrice = maxPrice;
    }

    public SpotOptions withMaxPrice(CharSequence maxPrice) {
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
        if ((other instanceof SpotOptions) == false) {
            return false;
        }
        SpotOptions rhs = ((SpotOptions) other);
        return new EqualsBuilder().append(instanceInterruptionBehavior, rhs.instanceInterruptionBehavior).append(spotInstanceType, rhs.spotInstanceType).append(maxPrice, rhs.maxPrice).isEquals();
    }

}
