
package shiver.me.timbers.aws.appsync;

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
 * ResolverCachingConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CachingKeys",
    "Ttl"
})
public class ResolverCachingConfig implements Property<ResolverCachingConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html#cfn-appsync-resolver-cachingconfig-cachingkeys
     * 
     */
    @JsonProperty("CachingKeys")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html#cfn-appsync-resolver-cachingconfig-cachingkeys")
    private List<CharSequence> cachingKeys = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html#cfn-appsync-resolver-cachingconfig-ttl
     * 
     */
    @JsonProperty("Ttl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html#cfn-appsync-resolver-cachingconfig-ttl")
    private Number ttl;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html#cfn-appsync-resolver-cachingconfig-cachingkeys
     * 
     */
    @JsonIgnore
    public List<CharSequence> getCachingKeys() {
        return cachingKeys;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html#cfn-appsync-resolver-cachingconfig-cachingkeys
     * 
     */
    @JsonIgnore
    public void setCachingKeys(List<CharSequence> cachingKeys) {
        this.cachingKeys = cachingKeys;
    }

    public ResolverCachingConfig withCachingKeys(List<CharSequence> cachingKeys) {
        this.cachingKeys = cachingKeys;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html#cfn-appsync-resolver-cachingconfig-ttl
     * 
     */
    @JsonIgnore
    public Number getTtl() {
        return ttl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html#cfn-appsync-resolver-cachingconfig-ttl
     * 
     */
    @JsonIgnore
    public void setTtl(Number ttl) {
        this.ttl = ttl;
    }

    public ResolverCachingConfig withTtl(Number ttl) {
        this.ttl = ttl;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cachingKeys", cachingKeys).append("ttl", ttl).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ttl).append(cachingKeys).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResolverCachingConfig) == false) {
            return false;
        }
        ResolverCachingConfig rhs = ((ResolverCachingConfig) other);
        return new EqualsBuilder().append(ttl, rhs.ttl).append(cachingKeys, rhs.cachingKeys).isEquals();
    }

}
