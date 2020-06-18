
package shiver.me.timbers.aws.eks;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ClusterEncryptionConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-encryptionconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Resources",
    "Provider"
})
public class ClusterEncryptionConfig implements Property<ClusterEncryptionConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-encryptionconfig.html#cfn-eks-cluster-encryptionconfig-resources
     * 
     */
    @JsonProperty("Resources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-encryptionconfig.html#cfn-eks-cluster-encryptionconfig-resources")
    private List<CharSequence> resources = new ArrayList<CharSequence>();
    /**
     * ClusterProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html
     * 
     */
    @JsonProperty("Provider")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html")
    private Property<ClusterProvider> provider;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-encryptionconfig.html#cfn-eks-cluster-encryptionconfig-resources
     * 
     */
    @JsonIgnore
    public List<CharSequence> getResources() {
        return resources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-encryptionconfig.html#cfn-eks-cluster-encryptionconfig-resources
     * 
     */
    @JsonIgnore
    public void setResources(List<CharSequence> resources) {
        this.resources = resources;
    }

    public ClusterEncryptionConfig withResources(List<CharSequence> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * ClusterProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html
     * 
     */
    @JsonIgnore
    public Property<ClusterProvider> getProvider() {
        return provider;
    }

    /**
     * ClusterProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html
     * 
     */
    @JsonIgnore
    public void setProvider(Property<ClusterProvider> provider) {
        this.provider = provider;
    }

    public ClusterEncryptionConfig withProvider(Property<ClusterProvider> provider) {
        this.provider = provider;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resources", resources).append("provider", provider).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resources).append(provider).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterEncryptionConfig) == false) {
            return false;
        }
        ClusterEncryptionConfig rhs = ((ClusterEncryptionConfig) other);
        return new EqualsBuilder().append(resources, rhs.resources).append(provider, rhs.provider).isEquals();
    }

}
