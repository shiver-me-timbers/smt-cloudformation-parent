
package aws.elasticsearch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ElasticsearchClusterConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DedicatedMasterCount",
    "DedicatedMasterEnabled",
    "DedicatedMasterType",
    "InstanceCount",
    "InstanceType",
    "ZoneAwarenessEnabled"
})
public class ElasticsearchClusterConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastercount
     * 
     */
    @JsonProperty("DedicatedMasterCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastercount")
    private Integer dedicatedMasterCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmasterenabled
     * 
     */
    @JsonProperty("DedicatedMasterEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmasterenabled")
    private Boolean dedicatedMasterEnabled;
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
    private Integer instanceCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instnacetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instnacetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-zoneawarenessenabled
     * 
     */
    @JsonProperty("ZoneAwarenessEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-zoneawarenessenabled")
    private Boolean zoneAwarenessEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastercount
     * 
     */
    public Integer getDedicatedMasterCount() {
        return dedicatedMasterCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastercount
     * 
     */
    public void setDedicatedMasterCount(Integer dedicatedMasterCount) {
        this.dedicatedMasterCount = dedicatedMasterCount;
    }

    public ElasticsearchClusterConfig withDedicatedMasterCount(Integer dedicatedMasterCount) {
        this.dedicatedMasterCount = dedicatedMasterCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmasterenabled
     * 
     */
    public Boolean getDedicatedMasterEnabled() {
        return dedicatedMasterEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmasterenabled
     * 
     */
    public void setDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
    }

    public ElasticsearchClusterConfig withDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastertype
     * 
     */
    public CharSequence getDedicatedMasterType() {
        return dedicatedMasterType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastertype
     * 
     */
    public void setDedicatedMasterType(CharSequence dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType;
    }

    public ElasticsearchClusterConfig withDedicatedMasterType(CharSequence dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instancecount
     * 
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instancecount
     * 
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public ElasticsearchClusterConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instnacetype
     * 
     */
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instnacetype
     * 
     */
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public ElasticsearchClusterConfig withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-zoneawarenessenabled
     * 
     */
    public Boolean getZoneAwarenessEnabled() {
        return zoneAwarenessEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-zoneawarenessenabled
     * 
     */
    public void setZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    public ElasticsearchClusterConfig withZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dedicatedMasterCount", dedicatedMasterCount).append("dedicatedMasterEnabled", dedicatedMasterEnabled).append("dedicatedMasterType", dedicatedMasterType).append("instanceCount", instanceCount).append("instanceType", instanceType).append("zoneAwarenessEnabled", zoneAwarenessEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(instanceCount).append(instanceType).append(zoneAwarenessEnabled).append(dedicatedMasterType).append(dedicatedMasterEnabled).append(dedicatedMasterCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElasticsearchClusterConfig) == false) {
            return false;
        }
        ElasticsearchClusterConfig rhs = ((ElasticsearchClusterConfig) other);
        return new EqualsBuilder().append(instanceCount, rhs.instanceCount).append(instanceType, rhs.instanceType).append(zoneAwarenessEnabled, rhs.zoneAwarenessEnabled).append(dedicatedMasterType, rhs.dedicatedMasterType).append(dedicatedMasterEnabled, rhs.dedicatedMasterEnabled).append(dedicatedMasterCount, rhs.dedicatedMasterCount).isEquals();
    }

}
