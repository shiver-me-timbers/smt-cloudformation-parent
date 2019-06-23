
package aws.cloudfront;

import java.util.ArrayList;
import java.util.List;
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
 * DistributionDistributionConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
public class DistributionDistributionConfig implements Property<DistributionDistributionConfig>
{

    /**
     * DistributionLogging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html
     * 
     */
    @JsonProperty("Logging")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html")
    private Property<DistributionLogging> logging;
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
    private List<Property<DistributionOrigin>> origins = new ArrayList<Property<DistributionOrigin>>();
    /**
     * DistributionViewerCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html
     * 
     */
    @JsonProperty("ViewerCertificate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html")
    private Property<DistributionViewerCertificate> viewerCertificate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass
     * 
     */
    @JsonProperty("PriceClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass")
    private CharSequence priceClass;
    /**
     * DistributionDefaultCacheBehavior
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html
     * 
     */
    @JsonProperty("DefaultCacheBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html")
    private Property<DistributionDefaultCacheBehavior> defaultCacheBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses
     * 
     */
    @JsonProperty("CustomErrorResponses")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses")
    private List<Property<DistributionCustomErrorResponse>> customErrorResponses = new ArrayList<Property<DistributionCustomErrorResponse>>();
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
     * DistributionRestrictions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html
     * 
     */
    @JsonProperty("Restrictions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html")
    private Property<DistributionRestrictions> restrictions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors
     * 
     */
    @JsonProperty("CacheBehaviors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors")
    private List<Property<DistributionCacheBehavior>> cacheBehaviors = new ArrayList<Property<DistributionCacheBehavior>>();

    /**
     * DistributionLogging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html
     * 
     */
    @JsonIgnore
    public Property<DistributionLogging> getLogging() {
        return logging;
    }

    /**
     * DistributionLogging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html
     * 
     */
    @JsonIgnore
    public void setLogging(Property<DistributionLogging> logging) {
        this.logging = logging;
    }

    public DistributionDistributionConfig withLogging(Property<DistributionLogging> logging) {
        this.logging = logging;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-comment
     * 
     */
    @JsonIgnore
    public CharSequence getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-comment
     * 
     */
    @JsonIgnore
    public void setComment(CharSequence comment) {
        this.comment = comment;
    }

    public DistributionDistributionConfig withComment(CharSequence comment) {
        this.comment = comment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultrootobject
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultRootObject() {
        return defaultRootObject;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultrootobject
     * 
     */
    @JsonIgnore
    public void setDefaultRootObject(CharSequence defaultRootObject) {
        this.defaultRootObject = defaultRootObject;
    }

    public DistributionDistributionConfig withDefaultRootObject(CharSequence defaultRootObject) {
        this.defaultRootObject = defaultRootObject;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origins
     * 
     */
    @JsonIgnore
    public List<Property<DistributionOrigin>> getOrigins() {
        return origins;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origins
     * 
     */
    @JsonIgnore
    public void setOrigins(List<Property<DistributionOrigin>> origins) {
        this.origins = origins;
    }

    public DistributionDistributionConfig withOrigins(List<Property<DistributionOrigin>> origins) {
        this.origins = origins;
        return this;
    }

    /**
     * DistributionViewerCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html
     * 
     */
    @JsonIgnore
    public Property<DistributionViewerCertificate> getViewerCertificate() {
        return viewerCertificate;
    }

    /**
     * DistributionViewerCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html
     * 
     */
    @JsonIgnore
    public void setViewerCertificate(Property<DistributionViewerCertificate> viewerCertificate) {
        this.viewerCertificate = viewerCertificate;
    }

    public DistributionDistributionConfig withViewerCertificate(Property<DistributionViewerCertificate> viewerCertificate) {
        this.viewerCertificate = viewerCertificate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass
     * 
     */
    @JsonIgnore
    public CharSequence getPriceClass() {
        return priceClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass
     * 
     */
    @JsonIgnore
    public void setPriceClass(CharSequence priceClass) {
        this.priceClass = priceClass;
    }

    public DistributionDistributionConfig withPriceClass(CharSequence priceClass) {
        this.priceClass = priceClass;
        return this;
    }

    /**
     * DistributionDefaultCacheBehavior
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html
     * 
     */
    @JsonIgnore
    public Property<DistributionDefaultCacheBehavior> getDefaultCacheBehavior() {
        return defaultCacheBehavior;
    }

    /**
     * DistributionDefaultCacheBehavior
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html
     * 
     */
    @JsonIgnore
    public void setDefaultCacheBehavior(Property<DistributionDefaultCacheBehavior> defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
    }

    public DistributionDistributionConfig withDefaultCacheBehavior(Property<DistributionDefaultCacheBehavior> defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses
     * 
     */
    @JsonIgnore
    public List<Property<DistributionCustomErrorResponse>> getCustomErrorResponses() {
        return customErrorResponses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses
     * 
     */
    @JsonIgnore
    public void setCustomErrorResponses(List<Property<DistributionCustomErrorResponse>> customErrorResponses) {
        this.customErrorResponses = customErrorResponses;
    }

    public DistributionDistributionConfig withCustomErrorResponses(List<Property<DistributionCustomErrorResponse>> customErrorResponses) {
        this.customErrorResponses = customErrorResponses;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-enabled
     * 
     */
    @JsonIgnore
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-enabled
     * 
     */
    @JsonIgnore
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public DistributionDistributionConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-aliases
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAliases() {
        return aliases;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-aliases
     * 
     */
    @JsonIgnore
    public void setAliases(List<CharSequence> aliases) {
        this.aliases = aliases;
    }

    public DistributionDistributionConfig withAliases(List<CharSequence> aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-ipv6enabled
     * 
     */
    @JsonIgnore
    public Boolean getIPV6Enabled() {
        return iPV6Enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-ipv6enabled
     * 
     */
    @JsonIgnore
    public void setIPV6Enabled(Boolean iPV6Enabled) {
        this.iPV6Enabled = iPV6Enabled;
    }

    public DistributionDistributionConfig withIPV6Enabled(Boolean iPV6Enabled) {
        this.iPV6Enabled = iPV6Enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-webaclid
     * 
     */
    @JsonIgnore
    public CharSequence getWebACLId() {
        return webACLId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-webaclid
     * 
     */
    @JsonIgnore
    public void setWebACLId(CharSequence webACLId) {
        this.webACLId = webACLId;
    }

    public DistributionDistributionConfig withWebACLId(CharSequence webACLId) {
        this.webACLId = webACLId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-httpversion
     * 
     */
    @JsonIgnore
    public CharSequence getHttpVersion() {
        return httpVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-httpversion
     * 
     */
    @JsonIgnore
    public void setHttpVersion(CharSequence httpVersion) {
        this.httpVersion = httpVersion;
    }

    public DistributionDistributionConfig withHttpVersion(CharSequence httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }

    /**
     * DistributionRestrictions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html
     * 
     */
    @JsonIgnore
    public Property<DistributionRestrictions> getRestrictions() {
        return restrictions;
    }

    /**
     * DistributionRestrictions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html
     * 
     */
    @JsonIgnore
    public void setRestrictions(Property<DistributionRestrictions> restrictions) {
        this.restrictions = restrictions;
    }

    public DistributionDistributionConfig withRestrictions(Property<DistributionRestrictions> restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors
     * 
     */
    @JsonIgnore
    public List<Property<DistributionCacheBehavior>> getCacheBehaviors() {
        return cacheBehaviors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors
     * 
     */
    @JsonIgnore
    public void setCacheBehaviors(List<Property<DistributionCacheBehavior>> cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
    }

    public DistributionDistributionConfig withCacheBehaviors(List<Property<DistributionCacheBehavior>> cacheBehaviors) {
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
        if ((other instanceof DistributionDistributionConfig) == false) {
            return false;
        }
        DistributionDistributionConfig rhs = ((DistributionDistributionConfig) other);
        return new EqualsBuilder().append(defaultCacheBehavior, rhs.defaultCacheBehavior).append(customErrorResponses, rhs.customErrorResponses).append(aliases, rhs.aliases).append(viewerCertificate, rhs.viewerCertificate).append(cacheBehaviors, rhs.cacheBehaviors).append(restrictions, rhs.restrictions).append(enabled, rhs.enabled).append(httpVersion, rhs.httpVersion).append(priceClass, rhs.priceClass).append(logging, rhs.logging).append(origins, rhs.origins).append(comment, rhs.comment).append(defaultRootObject, rhs.defaultRootObject).append(webACLId, rhs.webACLId).append(iPV6Enabled, rhs.iPV6Enabled).isEquals();
    }

}
