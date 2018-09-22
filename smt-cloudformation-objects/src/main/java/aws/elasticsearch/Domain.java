
package aws.elasticsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Domain
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AccessPolicies",
    "AdvancedOptions",
    "DomainName",
    "EBSOptions",
    "ElasticsearchClusterConfig",
    "ElasticsearchVersion",
    "EncryptionAtRestOptions",
    "SnapshotOptions",
    "Tags",
    "VPCOptions"
})
public class Domain {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies
     * 
     */
    @JsonProperty("AccessPolicies")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies")
    private AccessPolicies accessPolicies;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions
     * 
     */
    @JsonProperty("AdvancedOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions")
    private Map<String, String> advancedOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainname
     * 
     */
    @JsonProperty("DomainName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainname")
    private java.lang.String domainName;
    /**
     * EBSOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html
     * 
     */
    @JsonProperty("EBSOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html")
    private EBSOptions eBSOptions;
    /**
     * ElasticsearchClusterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html
     * 
     */
    @JsonProperty("ElasticsearchClusterConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html")
    private ElasticsearchClusterConfig elasticsearchClusterConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion
     * 
     */
    @JsonProperty("ElasticsearchVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion")
    private java.lang.String elasticsearchVersion;
    /**
     * EncryptionAtRestOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html
     * 
     */
    @JsonProperty("EncryptionAtRestOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html")
    private EncryptionAtRestOptions encryptionAtRestOptions;
    /**
     * SnapshotOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html
     * 
     */
    @JsonProperty("SnapshotOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html")
    private SnapshotOptions snapshotOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * VPCOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html
     * 
     */
    @JsonProperty("VPCOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html")
    private VPCOptions vPCOptions;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies
     * 
     */
    @JsonProperty("AccessPolicies")
    public AccessPolicies getAccessPolicies() {
        return accessPolicies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies
     * 
     */
    @JsonProperty("AccessPolicies")
    public void setAccessPolicies(AccessPolicies accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    public Domain withAccessPolicies(AccessPolicies accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions
     * 
     */
    @JsonProperty("AdvancedOptions")
    public Map<String, String> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions
     * 
     */
    @JsonProperty("AdvancedOptions")
    public void setAdvancedOptions(Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    public Domain withAdvancedOptions(Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainname
     * 
     */
    @JsonProperty("DomainName")
    public java.lang.String getDomainName() {
        return domainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainname
     * 
     */
    @JsonProperty("DomainName")
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }

    public Domain withDomainName(java.lang.String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * EBSOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html
     * 
     */
    @JsonProperty("EBSOptions")
    public EBSOptions getEBSOptions() {
        return eBSOptions;
    }

    /**
     * EBSOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html
     * 
     */
    @JsonProperty("EBSOptions")
    public void setEBSOptions(EBSOptions eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    public Domain withEBSOptions(EBSOptions eBSOptions) {
        this.eBSOptions = eBSOptions;
        return this;
    }

    /**
     * ElasticsearchClusterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html
     * 
     */
    @JsonProperty("ElasticsearchClusterConfig")
    public ElasticsearchClusterConfig getElasticsearchClusterConfig() {
        return elasticsearchClusterConfig;
    }

    /**
     * ElasticsearchClusterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html
     * 
     */
    @JsonProperty("ElasticsearchClusterConfig")
    public void setElasticsearchClusterConfig(ElasticsearchClusterConfig elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
    }

    public Domain withElasticsearchClusterConfig(ElasticsearchClusterConfig elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion
     * 
     */
    @JsonProperty("ElasticsearchVersion")
    public java.lang.String getElasticsearchVersion() {
        return elasticsearchVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion
     * 
     */
    @JsonProperty("ElasticsearchVersion")
    public void setElasticsearchVersion(java.lang.String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    public Domain withElasticsearchVersion(java.lang.String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
        return this;
    }

    /**
     * EncryptionAtRestOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html
     * 
     */
    @JsonProperty("EncryptionAtRestOptions")
    public EncryptionAtRestOptions getEncryptionAtRestOptions() {
        return encryptionAtRestOptions;
    }

    /**
     * EncryptionAtRestOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html
     * 
     */
    @JsonProperty("EncryptionAtRestOptions")
    public void setEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    public Domain withEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
        return this;
    }

    /**
     * SnapshotOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html
     * 
     */
    @JsonProperty("SnapshotOptions")
    public SnapshotOptions getSnapshotOptions() {
        return snapshotOptions;
    }

    /**
     * SnapshotOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html
     * 
     */
    @JsonProperty("SnapshotOptions")
    public void setSnapshotOptions(SnapshotOptions snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    public Domain withSnapshotOptions(SnapshotOptions snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags
     * 
     */
    @JsonProperty("Tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Domain withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * VPCOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html
     * 
     */
    @JsonProperty("VPCOptions")
    public VPCOptions getVPCOptions() {
        return vPCOptions;
    }

    /**
     * VPCOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html
     * 
     */
    @JsonProperty("VPCOptions")
    public void setVPCOptions(VPCOptions vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    public Domain withVPCOptions(VPCOptions vPCOptions) {
        this.vPCOptions = vPCOptions;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("accessPolicies", accessPolicies).append("advancedOptions", advancedOptions).append("domainName", domainName).append("eBSOptions", eBSOptions).append("elasticsearchClusterConfig", elasticsearchClusterConfig).append("elasticsearchVersion", elasticsearchVersion).append("encryptionAtRestOptions", encryptionAtRestOptions).append("snapshotOptions", snapshotOptions).append("tags", tags).append("vPCOptions", vPCOptions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(elasticsearchVersion).append(accessPolicies).append(elasticsearchClusterConfig).append(advancedOptions).append(eBSOptions).append(domainName).append(snapshotOptions).append(encryptionAtRestOptions).append(tags).append(vPCOptions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Domain) == false) {
            return false;
        }
        Domain rhs = ((Domain) other);
        return new EqualsBuilder().append(elasticsearchVersion, rhs.elasticsearchVersion).append(accessPolicies, rhs.accessPolicies).append(elasticsearchClusterConfig, rhs.elasticsearchClusterConfig).append(advancedOptions, rhs.advancedOptions).append(eBSOptions, rhs.eBSOptions).append(domainName, rhs.domainName).append(snapshotOptions, rhs.snapshotOptions).append(encryptionAtRestOptions, rhs.encryptionAtRestOptions).append(tags, rhs.tags).append(vPCOptions, rhs.vPCOptions).isEquals();
    }

}
