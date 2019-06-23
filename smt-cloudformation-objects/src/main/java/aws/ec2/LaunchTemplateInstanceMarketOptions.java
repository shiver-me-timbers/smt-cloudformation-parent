
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
 * LaunchTemplateInstanceMarketOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SpotOptions",
    "MarketType"
})
public class LaunchTemplateInstanceMarketOptions implements Property<LaunchTemplateInstanceMarketOptions>
{

    /**
     * LaunchTemplateSpotOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html
     * 
     */
    @JsonProperty("SpotOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html")
    private Property<LaunchTemplateSpotOptions> spotOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-markettype
     * 
     */
    @JsonProperty("MarketType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-markettype")
    private CharSequence marketType;

    /**
     * LaunchTemplateSpotOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html
     * 
     */
    @JsonIgnore
    public Property<LaunchTemplateSpotOptions> getSpotOptions() {
        return spotOptions;
    }

    /**
     * LaunchTemplateSpotOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html
     * 
     */
    @JsonIgnore
    public void setSpotOptions(Property<LaunchTemplateSpotOptions> spotOptions) {
        this.spotOptions = spotOptions;
    }

    public LaunchTemplateInstanceMarketOptions withSpotOptions(Property<LaunchTemplateSpotOptions> spotOptions) {
        this.spotOptions = spotOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-markettype
     * 
     */
    @JsonIgnore
    public CharSequence getMarketType() {
        return marketType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-markettype
     * 
     */
    @JsonIgnore
    public void setMarketType(CharSequence marketType) {
        this.marketType = marketType;
    }

    public LaunchTemplateInstanceMarketOptions withMarketType(CharSequence marketType) {
        this.marketType = marketType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("spotOptions", spotOptions).append("marketType", marketType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(spotOptions).append(marketType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchTemplateInstanceMarketOptions) == false) {
            return false;
        }
        LaunchTemplateInstanceMarketOptions rhs = ((LaunchTemplateInstanceMarketOptions) other);
        return new EqualsBuilder().append(spotOptions, rhs.spotOptions).append(marketType, rhs.marketType).isEquals();
    }

}
