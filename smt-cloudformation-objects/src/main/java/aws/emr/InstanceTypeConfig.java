
package aws.emr;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InstanceTypeConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BidPrice",
    "BidPriceAsPercentageOfOnDemandPrice",
    "Configurations",
    "EbsConfiguration",
    "InstanceType",
    "WeightedCapacity"
})
public class InstanceTypeConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidprice
     * 
     */
    @JsonProperty("BidPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidprice")
    private CharSequence bidPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidpriceaspercentageofondemandprice
     * 
     */
    @JsonProperty("BidPriceAsPercentageOfOnDemandPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidpriceaspercentageofondemandprice")
    private Double bidPriceAsPercentageOfOnDemandPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-configurations
     * 
     */
    @JsonProperty("Configurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-configurations")
    private Set<Configuration> configurations = new LinkedHashSet<Configuration>();
    /**
     * EbsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html
     * 
     */
    @JsonProperty("EbsConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html")
    private EbsConfiguration ebsConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-weightedcapacity
     * 
     */
    @JsonProperty("WeightedCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-weightedcapacity")
    private Integer weightedCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidprice
     * 
     */
    public CharSequence getBidPrice() {
        return bidPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidprice
     * 
     */
    public void setBidPrice(CharSequence bidPrice) {
        this.bidPrice = bidPrice;
    }

    public InstanceTypeConfig withBidPrice(CharSequence bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidpriceaspercentageofondemandprice
     * 
     */
    public Double getBidPriceAsPercentageOfOnDemandPrice() {
        return bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidpriceaspercentageofondemandprice
     * 
     */
    public void setBidPriceAsPercentageOfOnDemandPrice(Double bidPriceAsPercentageOfOnDemandPrice) {
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
    }

    public InstanceTypeConfig withBidPriceAsPercentageOfOnDemandPrice(Double bidPriceAsPercentageOfOnDemandPrice) {
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-configurations
     * 
     */
    public Set<Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-configurations
     * 
     */
    public void setConfigurations(Set<Configuration> configurations) {
        this.configurations = configurations;
    }

    public InstanceTypeConfig withConfigurations(Set<Configuration> configurations) {
        this.configurations = configurations;
        return this;
    }

    /**
     * EbsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html
     * 
     */
    public EbsConfiguration getEbsConfiguration() {
        return ebsConfiguration;
    }

    /**
     * EbsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html
     * 
     */
    public void setEbsConfiguration(EbsConfiguration ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
    }

    public InstanceTypeConfig withEbsConfiguration(EbsConfiguration ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-instancetype
     * 
     */
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-instancetype
     * 
     */
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public InstanceTypeConfig withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-weightedcapacity
     * 
     */
    public Integer getWeightedCapacity() {
        return weightedCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-weightedcapacity
     * 
     */
    public void setWeightedCapacity(Integer weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    public InstanceTypeConfig withWeightedCapacity(Integer weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bidPrice", bidPrice).append("bidPriceAsPercentageOfOnDemandPrice", bidPriceAsPercentageOfOnDemandPrice).append("configurations", configurations).append("ebsConfiguration", ebsConfiguration).append("instanceType", instanceType).append("weightedCapacity", weightedCapacity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bidPriceAsPercentageOfOnDemandPrice).append(configurations).append(instanceType).append(bidPrice).append(weightedCapacity).append(ebsConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceTypeConfig) == false) {
            return false;
        }
        InstanceTypeConfig rhs = ((InstanceTypeConfig) other);
        return new EqualsBuilder().append(bidPriceAsPercentageOfOnDemandPrice, rhs.bidPriceAsPercentageOfOnDemandPrice).append(configurations, rhs.configurations).append(instanceType, rhs.instanceType).append(bidPrice, rhs.bidPrice).append(weightedCapacity, rhs.weightedCapacity).append(ebsConfiguration, rhs.ebsConfiguration).isEquals();
    }

}
