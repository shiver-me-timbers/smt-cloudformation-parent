
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
 * InstanceGroupConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AutoScalingPolicy",
    "BidPrice",
    "Configurations",
    "EbsConfiguration",
    "InstanceCount",
    "InstanceType",
    "Market",
    "Name"
})
public class InstanceGroupConfig {

    /**
     * AutoScalingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html
     * 
     */
    @JsonProperty("AutoScalingPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html")
    private AutoScalingPolicy autoScalingPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-bidprice
     * 
     */
    @JsonProperty("BidPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-bidprice")
    private CharSequence bidPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-configurations
     * 
     */
    @JsonProperty("Configurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-configurations")
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancecount
     * 
     */
    @JsonProperty("InstanceCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancecount")
    private Integer instanceCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-market
     * 
     */
    @JsonProperty("Market")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-market")
    private CharSequence market;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-name")
    private CharSequence name;

    /**
     * AutoScalingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html
     * 
     */
    public AutoScalingPolicy getAutoScalingPolicy() {
        return autoScalingPolicy;
    }

    /**
     * AutoScalingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html
     * 
     */
    public void setAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
    }

    public InstanceGroupConfig withAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-bidprice
     * 
     */
    public CharSequence getBidPrice() {
        return bidPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-bidprice
     * 
     */
    public void setBidPrice(CharSequence bidPrice) {
        this.bidPrice = bidPrice;
    }

    public InstanceGroupConfig withBidPrice(CharSequence bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-configurations
     * 
     */
    public Set<Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-configurations
     * 
     */
    public void setConfigurations(Set<Configuration> configurations) {
        this.configurations = configurations;
    }

    public InstanceGroupConfig withConfigurations(Set<Configuration> configurations) {
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

    public InstanceGroupConfig withEbsConfiguration(EbsConfiguration ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancecount
     * 
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancecount
     * 
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public InstanceGroupConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancetype
     * 
     */
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancetype
     * 
     */
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public InstanceGroupConfig withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-market
     * 
     */
    public CharSequence getMarket() {
        return market;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-market
     * 
     */
    public void setMarket(CharSequence market) {
        this.market = market;
    }

    public InstanceGroupConfig withMarket(CharSequence market) {
        this.market = market;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public InstanceGroupConfig withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("autoScalingPolicy", autoScalingPolicy).append("bidPrice", bidPrice).append("configurations", configurations).append("ebsConfiguration", ebsConfiguration).append("instanceCount", instanceCount).append("instanceType", instanceType).append("market", market).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(market).append(configurations).append(instanceCount).append(instanceType).append(name).append(autoScalingPolicy).append(bidPrice).append(ebsConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceGroupConfig) == false) {
            return false;
        }
        InstanceGroupConfig rhs = ((InstanceGroupConfig) other);
        return new EqualsBuilder().append(market, rhs.market).append(configurations, rhs.configurations).append(instanceCount, rhs.instanceCount).append(instanceType, rhs.instanceType).append(name, rhs.name).append(autoScalingPolicy, rhs.autoScalingPolicy).append(bidPrice, rhs.bidPrice).append(ebsConfiguration, rhs.ebsConfiguration).isEquals();
    }

}
