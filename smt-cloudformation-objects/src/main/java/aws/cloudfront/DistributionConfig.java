
package aws.cloudfront;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DistributionConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Logging",
    "Comment",
    "DefaultRootObject",
    "Origins",
    "ViewerCertificate",
    "PriceClass",
    "DefaultCacheBehavior",
    "CustomErrorResponses",
    "Enabled",
    "Aliases",
    "IPV6Enabled",
    "WebACLId",
    "HttpVersion",
    "Restrictions",
    "CacheBehaviors"
})
public class DistributionConfig {

    /**
     * Logging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html
     * 
     */
    @JsonProperty("Logging")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html")
    private Logging logging;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-comment
     * 
     */
    @JsonProperty("Comment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-comment")
    private CharSequence comment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultrootobject
     * 
     */
    @JsonProperty("DefaultRootObject")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultrootobject")
    private CharSequence defaultRootObject;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origins
     * 
     */
    @JsonProperty("Origins")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origins")
    private List<Origin> origins = new ArrayList<Origin>();
    /**
     * ViewerCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html
     * 
     */
    @JsonProperty("ViewerCertificate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html")
    private ViewerCertificate viewerCertificate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass
     * 
     */
    @JsonProperty("PriceClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass")
    private CharSequence priceClass;
    /**
     * DefaultCacheBehavior
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html
     * 
     */
    @JsonProperty("DefaultCacheBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html")
    private DefaultCacheBehavior defaultCacheBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses
     * 
     */
    @JsonProperty("CustomErrorResponses")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses")
    private List<CustomErrorResponse> customErrorResponses = new ArrayList<CustomErrorResponse>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-aliases
     * 
     */
    @JsonProperty("Aliases")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-aliases")
    private List<CharSequence> aliases = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-ipv6enabled
     * 
     */
    @JsonProperty("IPV6Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-ipv6enabled")
    private Boolean iPV6Enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-webaclid
     * 
     */
    @JsonProperty("WebACLId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-webaclid")
    private CharSequence webACLId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-httpversion
     * 
     */
    @JsonProperty("HttpVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-httpversion")
    private CharSequence httpVersion;
    /**
     * Restrictions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html
     * 
     */
    @JsonProperty("Restrictions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html")
    private Restrictions restrictions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors
     * 
     */
    @JsonProperty("CacheBehaviors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors")
    private List<CacheBehavior> cacheBehaviors = new ArrayList<CacheBehavior>();

    /**
     * Logging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html
     * 
     */
    public Logging getLogging() {
        return logging;
    }

    /**
     * Logging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html
     * 
     */
    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    public DistributionConfig withLogging(Logging logging) {
        this.logging = logging;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-comment
     * 
     */
    public CharSequence getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-comment
     * 
     */
    public void setComment(CharSequence comment) {
        this.comment = comment;
    }

    public DistributionConfig withComment(CharSequence comment) {
        this.comment = comment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultrootobject
     * 
     */
    public CharSequence getDefaultRootObject() {
        return defaultRootObject;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultrootobject
     * 
     */
    public void setDefaultRootObject(CharSequence defaultRootObject) {
        this.defaultRootObject = defaultRootObject;
    }

    public DistributionConfig withDefaultRootObject(CharSequence defaultRootObject) {
        this.defaultRootObject = defaultRootObject;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origins
     * 
     */
    public List<Origin> getOrigins() {
        return origins;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origins
     * 
     */
    public void setOrigins(List<Origin> origins) {
        this.origins = origins;
    }

    public DistributionConfig withOrigins(List<Origin> origins) {
        this.origins = origins;
        return this;
    }

    /**
     * ViewerCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html
     * 
     */
    public ViewerCertificate getViewerCertificate() {
        return viewerCertificate;
    }

    /**
     * ViewerCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html
     * 
     */
    public void setViewerCertificate(ViewerCertificate viewerCertificate) {
        this.viewerCertificate = viewerCertificate;
    }

    public DistributionConfig withViewerCertificate(ViewerCertificate viewerCertificate) {
        this.viewerCertificate = viewerCertificate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass
     * 
     */
    public CharSequence getPriceClass() {
        return priceClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass
     * 
     */
    public void setPriceClass(CharSequence priceClass) {
        this.priceClass = priceClass;
    }

    public DistributionConfig withPriceClass(CharSequence priceClass) {
        this.priceClass = priceClass;
        return this;
    }

    /**
     * DefaultCacheBehavior
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html
     * 
     */
    public DefaultCacheBehavior getDefaultCacheBehavior() {
        return defaultCacheBehavior;
    }

    /**
     * DefaultCacheBehavior
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html
     * 
     */
    public void setDefaultCacheBehavior(DefaultCacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
    }

    public DistributionConfig withDefaultCacheBehavior(DefaultCacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses
     * 
     */
    public List<CustomErrorResponse> getCustomErrorResponses() {
        return customErrorResponses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses
     * 
     */
    public void setCustomErrorResponses(List<CustomErrorResponse> customErrorResponses) {
        this.customErrorResponses = customErrorResponses;
    }

    public DistributionConfig withCustomErrorResponses(List<CustomErrorResponse> customErrorResponses) {
        this.customErrorResponses = customErrorResponses;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public DistributionConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-aliases
     * 
     */
    public List<CharSequence> getAliases() {
        return aliases;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-aliases
     * 
     */
    public void setAliases(List<CharSequence> aliases) {
        this.aliases = aliases;
    }

    public DistributionConfig withAliases(List<CharSequence> aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-ipv6enabled
     * 
     */
    public Boolean getIPV6Enabled() {
        return iPV6Enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-ipv6enabled
     * 
     */
    public void setIPV6Enabled(Boolean iPV6Enabled) {
        this.iPV6Enabled = iPV6Enabled;
    }

    public DistributionConfig withIPV6Enabled(Boolean iPV6Enabled) {
        this.iPV6Enabled = iPV6Enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-webaclid
     * 
     */
    public CharSequence getWebACLId() {
        return webACLId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-webaclid
     * 
     */
    public void setWebACLId(CharSequence webACLId) {
        this.webACLId = webACLId;
    }

    public DistributionConfig withWebACLId(CharSequence webACLId) {
        this.webACLId = webACLId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-httpversion
     * 
     */
    public CharSequence getHttpVersion() {
        return httpVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-httpversion
     * 
     */
    public void setHttpVersion(CharSequence httpVersion) {
        this.httpVersion = httpVersion;
    }

    public DistributionConfig withHttpVersion(CharSequence httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }

    /**
     * Restrictions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html
     * 
     */
    public Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Restrictions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html
     * 
     */
    public void setRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    public DistributionConfig withRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors
     * 
     */
    public List<CacheBehavior> getCacheBehaviors() {
        return cacheBehaviors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors
     * 
     */
    public void setCacheBehaviors(List<CacheBehavior> cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
    }

    public DistributionConfig withCacheBehaviors(List<CacheBehavior> cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("logging", logging).append("comment", comment).append("defaultRootObject", defaultRootObject).append("origins", origins).append("viewerCertificate", viewerCertificate).append("priceClass", priceClass).append("defaultCacheBehavior", defaultCacheBehavior).append("customErrorResponses", customErrorResponses).append("enabled", enabled).append("aliases", aliases).append("iPV6Enabled", iPV6Enabled).append("webACLId", webACLId).append("httpVersion", httpVersion).append("restrictions", restrictions).append("cacheBehaviors", cacheBehaviors).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(defaultCacheBehavior).append(customErrorResponses).append(aliases).append(viewerCertificate).append(cacheBehaviors).append(restrictions).append(enabled).append(httpVersion).append(priceClass).append(logging).append(origins).append(comment).append(defaultRootObject).append(webACLId).append(iPV6Enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionConfig) == false) {
            return false;
        }
        DistributionConfig rhs = ((DistributionConfig) other);
        return new EqualsBuilder().append(defaultCacheBehavior, rhs.defaultCacheBehavior).append(customErrorResponses, rhs.customErrorResponses).append(aliases, rhs.aliases).append(viewerCertificate, rhs.viewerCertificate).append(cacheBehaviors, rhs.cacheBehaviors).append(restrictions, rhs.restrictions).append(enabled, rhs.enabled).append(httpVersion, rhs.httpVersion).append(priceClass, rhs.priceClass).append(logging, rhs.logging).append(origins, rhs.origins).append(comment, rhs.comment).append(defaultRootObject, rhs.defaultRootObject).append(webACLId, rhs.webACLId).append(iPV6Enabled, rhs.iPV6Enabled).isEquals();
    }

}
