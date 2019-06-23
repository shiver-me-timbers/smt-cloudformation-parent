
package aws.emr;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AutoScalingPolicy",
    "BidPrice",
    "Configurations",
    "EbsConfiguration",
    "InstanceCount",
    "InstanceRole",
    "InstanceType",
    "JobFlowId",
    "Market",
    "Name"
})
public class InstanceGroupConfig {

    /**
     * InstanceGroupConfigAutoScalingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html
     * 
     */
    @JsonProperty("AutoScalingPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html")
    private Property<InstanceGroupConfigAutoScalingPolicy> autoScalingPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-bidprice
     * 
     */
    @JsonProperty("BidPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-bidprice")
    private CharSequence bidPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations
     * 
     */
    @JsonProperty("Configurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations")
    private Set<Property<InstanceGroupConfigConfiguration>> configurations = new LinkedHashSet<Property<InstanceGroupConfigConfiguration>>();
    /**
     * InstanceGroupConfigEbsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html
     * 
     */
    @JsonProperty("EbsConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html")
    private Property<InstanceGroupConfigEbsConfiguration> ebsConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfiginstancecount-
     * 
     */
    @JsonProperty("InstanceCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfiginstancecount-")
    private Integer instanceCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancerole
     * 
     */
    @JsonProperty("InstanceRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancerole")
    private CharSequence instanceRole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-jobflowid
     * 
     */
    @JsonProperty("JobFlowId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-jobflowid")
    private CharSequence jobFlowId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-market
     * 
     */
    @JsonProperty("Market")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-market")
    private CharSequence market;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-name")
    private CharSequence name;

    /**
     * InstanceGroupConfigAutoScalingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html
     * 
     */
    @JsonIgnore
    public Property<InstanceGroupConfigAutoScalingPolicy> getAutoScalingPolicy() {
        return autoScalingPolicy;
    }

    /**
     * InstanceGroupConfigAutoScalingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html
     * 
     */
    @JsonIgnore
    public void setAutoScalingPolicy(Property<InstanceGroupConfigAutoScalingPolicy> autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
    }

    public InstanceGroupConfig withAutoScalingPolicy(Property<InstanceGroupConfigAutoScalingPolicy> autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-bidprice
     * 
     */
    @JsonIgnore
    public CharSequence getBidPrice() {
        return bidPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-bidprice
     * 
     */
    @JsonIgnore
    public void setBidPrice(CharSequence bidPrice) {
        this.bidPrice = bidPrice;
    }

    public InstanceGroupConfig withBidPrice(CharSequence bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations
     * 
     */
    @JsonIgnore
    public Set<Property<InstanceGroupConfigConfiguration>> getConfigurations() {
        return configurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations
     * 
     */
    @JsonIgnore
    public void setConfigurations(Set<Property<InstanceGroupConfigConfiguration>> configurations) {
        this.configurations = configurations;
    }

    public InstanceGroupConfig withConfigurations(Set<Property<InstanceGroupConfigConfiguration>> configurations) {
        this.configurations = configurations;
        return this;
    }

    /**
     * InstanceGroupConfigEbsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<InstanceGroupConfigEbsConfiguration> getEbsConfiguration() {
        return ebsConfiguration;
    }

    /**
     * InstanceGroupConfigEbsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html
     * 
     */
    @JsonIgnore
    public void setEbsConfiguration(Property<InstanceGroupConfigEbsConfiguration> ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
    }

    public InstanceGroupConfig withEbsConfiguration(Property<InstanceGroupConfigEbsConfiguration> ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfiginstancecount-
     * 
     */
    @JsonIgnore
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfiginstancecount-
     * 
     */
    @JsonIgnore
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public InstanceGroupConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancerole
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceRole() {
        return instanceRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancerole
     * 
     */
    @JsonIgnore
    public void setInstanceRole(CharSequence instanceRole) {
        this.instanceRole = instanceRole;
    }

    public InstanceGroupConfig withInstanceRole(CharSequence instanceRole) {
        this.instanceRole = instanceRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public InstanceGroupConfig withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-jobflowid
     * 
     */
    @JsonIgnore
    public CharSequence getJobFlowId() {
        return jobFlowId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-jobflowid
     * 
     */
    @JsonIgnore
    public void setJobFlowId(CharSequence jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    public InstanceGroupConfig withJobFlowId(CharSequence jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-market
     * 
     */
    @JsonIgnore
    public CharSequence getMarket() {
        return market;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-market
     * 
     */
    @JsonIgnore
    public void setMarket(CharSequence market) {
        this.market = market;
    }

    public InstanceGroupConfig withMarket(CharSequence market) {
        this.market = market;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public InstanceGroupConfig withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("autoScalingPolicy", autoScalingPolicy).append("bidPrice", bidPrice).append("configurations", configurations).append("ebsConfiguration", ebsConfiguration).append("instanceCount", instanceCount).append("instanceRole", instanceRole).append("instanceType", instanceType).append("jobFlowId", jobFlowId).append("market", market).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(market).append(jobFlowId).append(configurations).append(instanceCount).append(instanceType).append(name).append(autoScalingPolicy).append(instanceRole).append(bidPrice).append(ebsConfiguration).toHashCode();
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
        return new EqualsBuilder().append(market, rhs.market).append(jobFlowId, rhs.jobFlowId).append(configurations, rhs.configurations).append(instanceCount, rhs.instanceCount).append(instanceType, rhs.instanceType).append(name, rhs.name).append(autoScalingPolicy, rhs.autoScalingPolicy).append(instanceRole, rhs.instanceRole).append(bidPrice, rhs.bidPrice).append(ebsConfiguration, rhs.ebsConfiguration).isEquals();
    }

}
