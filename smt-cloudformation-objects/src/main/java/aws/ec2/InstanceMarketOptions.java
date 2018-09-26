
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InstanceMarketOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SpotOptions",
    "MarketType"
})
public class InstanceMarketOptions {

    /**
     * SpotOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html
     * 
     */
    @JsonProperty("SpotOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html")
    private SpotOptions spotOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-markettype
     * 
     */
    @JsonProperty("MarketType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-markettype")
    private CharSequence marketType;

    /**
     * SpotOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html
     * 
     */
    public SpotOptions getSpotOptions() {
        return spotOptions;
    }

    /**
     * SpotOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html
     * 
     */
    public void setSpotOptions(SpotOptions spotOptions) {
        this.spotOptions = spotOptions;
    }

    public InstanceMarketOptions withSpotOptions(SpotOptions spotOptions) {
        this.spotOptions = spotOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-markettype
     * 
     */
    public CharSequence getMarketType() {
        return marketType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-markettype
     * 
     */
    public void setMarketType(CharSequence marketType) {
        this.marketType = marketType;
    }

    public InstanceMarketOptions withMarketType(CharSequence marketType) {
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
        if ((other instanceof InstanceMarketOptions) == false) {
            return false;
        }
        InstanceMarketOptions rhs = ((InstanceMarketOptions) other);
        return new EqualsBuilder().append(spotOptions, rhs.spotOptions).append(marketType, rhs.marketType).isEquals();
    }

}
