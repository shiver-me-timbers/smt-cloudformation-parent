
package aws.elasticsearch;

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
 * DomainElasticsearchClusterConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DedicatedMasterCount",
    "DedicatedMasterEnabled",
    "DedicatedMasterType",
    "InstanceCount",
    "InstanceType",
    "ZoneAwarenessConfig",
    "ZoneAwarenessEnabled"
})
public class DomainElasticsearchClusterConfig implements Property<DomainElasticsearchClusterConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastercount
     * 
     */
    @JsonProperty("DedicatedMasterCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastercount")
    private Number dedicatedMasterCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmasterenabled
     * 
     */
    @JsonProperty("DedicatedMasterEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmasterenabled")
    private CharSequence dedicatedMasterEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastertype
     * 
     */
    @JsonProperty("DedicatedMasterType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastertype")
    private CharSequence dedicatedMasterType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instancecount
     * 
     */
    @JsonProperty("InstanceCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instancecount")
    private Number instanceCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instnacetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instnacetype")
    private CharSequence instanceType;
    /**
     * DomainZoneAwarenessConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html
     * 
     */
    @JsonProperty("ZoneAwarenessConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html")
    private Property<DomainZoneAwarenessConfig> zoneAwarenessConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-zoneawarenessenabled
     * 
     */
    @JsonProperty("ZoneAwarenessEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-zoneawarenessenabled")
    private CharSequence zoneAwarenessEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastercount
     * 
     */
    @JsonIgnore
    public Number getDedicatedMasterCount() {
        return dedicatedMasterCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastercount
     * 
     */
    @JsonIgnore
    public void setDedicatedMasterCount(Number dedicatedMasterCount) {
        this.dedicatedMasterCount = dedicatedMasterCount;
    }

    public DomainElasticsearchClusterConfig withDedicatedMasterCount(Number dedicatedMasterCount) {
        this.dedicatedMasterCount = dedicatedMasterCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmasterenabled
     * 
     */
    @JsonIgnore
    public CharSequence getDedicatedMasterEnabled() {
        return dedicatedMasterEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmasterenabled
     * 
     */
    @JsonIgnore
    public void setDedicatedMasterEnabled(CharSequence dedicatedMasterEnabled) {
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
    }

    public DomainElasticsearchClusterConfig withDedicatedMasterEnabled(CharSequence dedicatedMasterEnabled) {
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastertype
     * 
     */
    @JsonIgnore
    public CharSequence getDedicatedMasterType() {
        return dedicatedMasterType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastertype
     * 
     */
    @JsonIgnore
    public void setDedicatedMasterType(CharSequence dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType;
    }

    public DomainElasticsearchClusterConfig withDedicatedMasterType(CharSequence dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instancecount
     * 
     */
    @JsonIgnore
    public Number getInstanceCount() {
        return instanceCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instancecount
     * 
     */
    @JsonIgnore
    public void setInstanceCount(Number instanceCount) {
        this.instanceCount = instanceCount;
    }

    public DomainElasticsearchClusterConfig withInstanceCount(Number instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instnacetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instnacetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public DomainElasticsearchClusterConfig withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * DomainZoneAwarenessConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html
     * 
     */
    @JsonIgnore
    public Property<DomainZoneAwarenessConfig> getZoneAwarenessConfig() {
        return zoneAwarenessConfig;
    }

    /**
     * DomainZoneAwarenessConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html
     * 
     */
    @JsonIgnore
    public void setZoneAwarenessConfig(Property<DomainZoneAwarenessConfig> zoneAwarenessConfig) {
        this.zoneAwarenessConfig = zoneAwarenessConfig;
    }

    public DomainElasticsearchClusterConfig withZoneAwarenessConfig(Property<DomainZoneAwarenessConfig> zoneAwarenessConfig) {
        this.zoneAwarenessConfig = zoneAwarenessConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-zoneawarenessenabled
     * 
     */
    @JsonIgnore
    public CharSequence getZoneAwarenessEnabled() {
        return zoneAwarenessEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-zoneawarenessenabled
     * 
     */
    @JsonIgnore
    public void setZoneAwarenessEnabled(CharSequence zoneAwarenessEnabled) {
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    public DomainElasticsearchClusterConfig withZoneAwarenessEnabled(CharSequence zoneAwarenessEnabled) {
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dedicatedMasterCount", dedicatedMasterCount).append("dedicatedMasterEnabled", dedicatedMasterEnabled).append("dedicatedMasterType", dedicatedMasterType).append("instanceCount", instanceCount).append("instanceType", instanceType).append("zoneAwarenessConfig", zoneAwarenessConfig).append("zoneAwarenessEnabled", zoneAwarenessEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(zoneAwarenessConfig).append(instanceCount).append(instanceType).append(zoneAwarenessEnabled).append(dedicatedMasterType).append(dedicatedMasterEnabled).append(dedicatedMasterCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomainElasticsearchClusterConfig) == false) {
            return false;
        }
        DomainElasticsearchClusterConfig rhs = ((DomainElasticsearchClusterConfig) other);
        return new EqualsBuilder().append(zoneAwarenessConfig, rhs.zoneAwarenessConfig).append(instanceCount, rhs.instanceCount).append(instanceType, rhs.instanceType).append(zoneAwarenessEnabled, rhs.zoneAwarenessEnabled).append(dedicatedMasterType, rhs.dedicatedMasterType).append(dedicatedMasterEnabled, rhs.dedicatedMasterEnabled).append(dedicatedMasterCount, rhs.dedicatedMasterCount).isEquals();
    }

}
