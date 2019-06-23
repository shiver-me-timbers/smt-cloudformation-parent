
package aws.elasticsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AccessPolicies",
    "AdvancedOptions",
    "DomainName",
    "EBSOptions",
    "ElasticsearchClusterConfig",
    "ElasticsearchVersion",
    "EncryptionAtRestOptions",
    "NodeToNodeEncryptionOptions",
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
    private Object accessPolicies;
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
    private CharSequence domainName;
    /**
     * DomainEBSOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html
     * 
     */
    @JsonProperty("EBSOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html")
    private Property<DomainEBSOptions> eBSOptions;
    /**
     * DomainElasticsearchClusterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html
     * 
     */
    @JsonProperty("ElasticsearchClusterConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html")
    private Property<DomainElasticsearchClusterConfig> elasticsearchClusterConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion
     * 
     */
    @JsonProperty("ElasticsearchVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion")
    private CharSequence elasticsearchVersion;
    /**
     * DomainEncryptionAtRestOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html
     * 
     */
    @JsonProperty("EncryptionAtRestOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html")
    private Property<DomainEncryptionAtRestOptions> encryptionAtRestOptions;
    /**
     * DomainNodeToNodeEncryptionOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-nodetonodeencryptionoptions.html
     * 
     */
    @JsonProperty("NodeToNodeEncryptionOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-nodetonodeencryptionoptions.html")
    private Property<DomainNodeToNodeEncryptionOptions> nodeToNodeEncryptionOptions;
    /**
     * DomainSnapshotOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html
     * 
     */
    @JsonProperty("SnapshotOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html")
    private Property<DomainSnapshotOptions> snapshotOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * DomainVPCOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html
     * 
     */
    @JsonProperty("VPCOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html")
    private Property<DomainVPCOptions> vPCOptions;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies
     * 
     */
    @JsonIgnore
    public Object getAccessPolicies() {
        return accessPolicies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies
     * 
     */
    @JsonIgnore
    public void setAccessPolicies(Object accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    public Domain withAccessPolicies(Object accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions
     * 
     */
    @JsonIgnore
    public Map<String, String> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getDomainName() {
        return domainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainname
     * 
     */
    @JsonIgnore
    public void setDomainName(CharSequence domainName) {
        this.domainName = domainName;
    }

    public Domain withDomainName(CharSequence domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * DomainEBSOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html
     * 
     */
    @JsonIgnore
    public Property<DomainEBSOptions> getEBSOptions() {
        return eBSOptions;
    }

    /**
     * DomainEBSOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html
     * 
     */
    @JsonIgnore
    public void setEBSOptions(Property<DomainEBSOptions> eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    public Domain withEBSOptions(Property<DomainEBSOptions> eBSOptions) {
        this.eBSOptions = eBSOptions;
        return this;
    }

    /**
     * DomainElasticsearchClusterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html
     * 
     */
    @JsonIgnore
    public Property<DomainElasticsearchClusterConfig> getElasticsearchClusterConfig() {
        return elasticsearchClusterConfig;
    }

    /**
     * DomainElasticsearchClusterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html
     * 
     */
    @JsonIgnore
    public void setElasticsearchClusterConfig(Property<DomainElasticsearchClusterConfig> elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
    }

    public Domain withElasticsearchClusterConfig(Property<DomainElasticsearchClusterConfig> elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion
     * 
     */
    @JsonIgnore
    public CharSequence getElasticsearchVersion() {
        return elasticsearchVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion
     * 
     */
    @JsonIgnore
    public void setElasticsearchVersion(CharSequence elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    public Domain withElasticsearchVersion(CharSequence elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
        return this;
    }

    /**
     * DomainEncryptionAtRestOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html
     * 
     */
    @JsonIgnore
    public Property<DomainEncryptionAtRestOptions> getEncryptionAtRestOptions() {
        return encryptionAtRestOptions;
    }

    /**
     * DomainEncryptionAtRestOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html
     * 
     */
    @JsonIgnore
    public void setEncryptionAtRestOptions(Property<DomainEncryptionAtRestOptions> encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    public Domain withEncryptionAtRestOptions(Property<DomainEncryptionAtRestOptions> encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
        return this;
    }

    /**
     * DomainNodeToNodeEncryptionOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-nodetonodeencryptionoptions.html
     * 
     */
    @JsonIgnore
    public Property<DomainNodeToNodeEncryptionOptions> getNodeToNodeEncryptionOptions() {
        return nodeToNodeEncryptionOptions;
    }

    /**
     * DomainNodeToNodeEncryptionOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-nodetonodeencryptionoptions.html
     * 
     */
    @JsonIgnore
    public void setNodeToNodeEncryptionOptions(Property<DomainNodeToNodeEncryptionOptions> nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    public Domain withNodeToNodeEncryptionOptions(Property<DomainNodeToNodeEncryptionOptions> nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
        return this;
    }

    /**
     * DomainSnapshotOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html
     * 
     */
    @JsonIgnore
    public Property<DomainSnapshotOptions> getSnapshotOptions() {
        return snapshotOptions;
    }

    /**
     * DomainSnapshotOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html
     * 
     */
    @JsonIgnore
    public void setSnapshotOptions(Property<DomainSnapshotOptions> snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    public Domain withSnapshotOptions(Property<DomainSnapshotOptions> snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Domain withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * DomainVPCOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html
     * 
     */
    @JsonIgnore
    public Property<DomainVPCOptions> getVPCOptions() {
        return vPCOptions;
    }

    /**
     * DomainVPCOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html
     * 
     */
    @JsonIgnore
    public void setVPCOptions(Property<DomainVPCOptions> vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    public Domain withVPCOptions(Property<DomainVPCOptions> vPCOptions) {
        this.vPCOptions = vPCOptions;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("accessPolicies", accessPolicies).append("advancedOptions", advancedOptions).append("domainName", domainName).append("eBSOptions", eBSOptions).append("elasticsearchClusterConfig", elasticsearchClusterConfig).append("elasticsearchVersion", elasticsearchVersion).append("encryptionAtRestOptions", encryptionAtRestOptions).append("nodeToNodeEncryptionOptions", nodeToNodeEncryptionOptions).append("snapshotOptions", snapshotOptions).append("tags", tags).append("vPCOptions", vPCOptions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(elasticsearchVersion).append(nodeToNodeEncryptionOptions).append(accessPolicies).append(elasticsearchClusterConfig).append(advancedOptions).append(eBSOptions).append(domainName).append(snapshotOptions).append(encryptionAtRestOptions).append(tags).append(vPCOptions).toHashCode();
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
        return new EqualsBuilder().append(elasticsearchVersion, rhs.elasticsearchVersion).append(nodeToNodeEncryptionOptions, rhs.nodeToNodeEncryptionOptions).append(accessPolicies, rhs.accessPolicies).append(elasticsearchClusterConfig, rhs.elasticsearchClusterConfig).append(advancedOptions, rhs.advancedOptions).append(eBSOptions, rhs.eBSOptions).append(domainName, rhs.domainName).append(snapshotOptions, rhs.snapshotOptions).append(encryptionAtRestOptions, rhs.encryptionAtRestOptions).append(tags, rhs.tags).append(vPCOptions, rhs.vPCOptions).isEquals();
    }

}
