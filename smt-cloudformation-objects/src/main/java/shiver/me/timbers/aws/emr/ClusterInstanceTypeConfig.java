
package shiver.me.timbers.aws.emr;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ClusterInstanceTypeConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BidPrice",
    "BidPriceAsPercentageOfOnDemandPrice",
    "Configurations",
    "EbsConfiguration",
    "InstanceType",
    "WeightedCapacity"
})
public class ClusterInstanceTypeConfig implements Property<ClusterInstanceTypeConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidprice
     * 
     */
    @JsonProperty("BidPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidprice")
    private CharSequence bidPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidpriceaspercentageofondemandprice
     * 
     */
    @JsonProperty("BidPriceAsPercentageOfOnDemandPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidpriceaspercentageofondemandprice")
    private Number bidPriceAsPercentageOfOnDemandPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-configurations
     * 
     */
    @JsonProperty("Configurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-configurations")
    private Set<Property<ClusterConfiguration>> configurations = new LinkedHashSet<Property<ClusterConfiguration>>();
    /**
     * ClusterEbsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html
     * 
     */
    @JsonProperty("EbsConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html")
    private Property<ClusterEbsConfiguration> ebsConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-weightedcapacity
     * 
     */
    @JsonProperty("WeightedCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-weightedcapacity")
    private Number weightedCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidprice
     * 
     */
    @JsonIgnore
    public CharSequence getBidPrice() {
        return bidPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidprice
     * 
     */
    @JsonIgnore
    public void setBidPrice(CharSequence bidPrice) {
        this.bidPrice = bidPrice;
    }

    public ClusterInstanceTypeConfig withBidPrice(CharSequence bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidpriceaspercentageofondemandprice
     * 
     */
    @JsonIgnore
    public Number getBidPriceAsPercentageOfOnDemandPrice() {
        return bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidpriceaspercentageofondemandprice
     * 
     */
    @JsonIgnore
    public void setBidPriceAsPercentageOfOnDemandPrice(Number bidPriceAsPercentageOfOnDemandPrice) {
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
    }

    public ClusterInstanceTypeConfig withBidPriceAsPercentageOfOnDemandPrice(Number bidPriceAsPercentageOfOnDemandPrice) {
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-configurations
     * 
     */
    @JsonIgnore
    public Set<Property<ClusterConfiguration>> getConfigurations() {
        return configurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-configurations
     * 
     */
    @JsonIgnore
    public void setConfigurations(Set<Property<ClusterConfiguration>> configurations) {
        this.configurations = configurations;
    }

    public ClusterInstanceTypeConfig withConfigurations(Set<Property<ClusterConfiguration>> configurations) {
        this.configurations = configurations;
        return this;
    }

    /**
     * ClusterEbsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ClusterEbsConfiguration> getEbsConfiguration() {
        return ebsConfiguration;
    }

    /**
     * ClusterEbsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html
     * 
     */
    @JsonIgnore
    public void setEbsConfiguration(Property<ClusterEbsConfiguration> ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
    }

    public ClusterInstanceTypeConfig withEbsConfiguration(Property<ClusterEbsConfiguration> ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public ClusterInstanceTypeConfig withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-weightedcapacity
     * 
     */
    @JsonIgnore
    public Number getWeightedCapacity() {
        return weightedCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-weightedcapacity
     * 
     */
    @JsonIgnore
    public void setWeightedCapacity(Number weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    public ClusterInstanceTypeConfig withWeightedCapacity(Number weightedCapacity) {
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
        if ((other instanceof ClusterInstanceTypeConfig) == false) {
            return false;
        }
        ClusterInstanceTypeConfig rhs = ((ClusterInstanceTypeConfig) other);
        return new EqualsBuilder().append(bidPriceAsPercentageOfOnDemandPrice, rhs.bidPriceAsPercentageOfOnDemandPrice).append(configurations, rhs.configurations).append(instanceType, rhs.instanceType).append(bidPrice, rhs.bidPrice).append(weightedCapacity, rhs.weightedCapacity).append(ebsConfiguration, rhs.ebsConfiguration).isEquals();
    }

}
