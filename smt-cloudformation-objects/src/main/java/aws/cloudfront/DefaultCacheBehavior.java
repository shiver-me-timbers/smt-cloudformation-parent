
package aws.cloudfront;

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


/**
 * DefaultCacheBehavior
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Compress",
    "LambdaFunctionAssociations",
    "TargetOriginId",
    "ViewerProtocolPolicy",
    "TrustedSigners",
    "DefaultTTL",
    "FieldLevelEncryptionId",
    "AllowedMethods",
    "CachedMethods",
    "SmoothStreaming",
    "ForwardedValues",
    "MinTTL",
    "MaxTTL"
})
public class DefaultCacheBehavior {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-compress
     * 
     */
    @JsonProperty("Compress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-compress")
    private Boolean compress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-lambdafunctionassociations
     * 
     */
    @JsonProperty("LambdaFunctionAssociations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-lambdafunctionassociations")
    private List<LambdaFunctionAssociation> lambdaFunctionAssociations = new ArrayList<LambdaFunctionAssociation>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-targetoriginid
     * 
     */
    @JsonProperty("TargetOriginId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-targetoriginid")
    private CharSequence targetOriginId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-viewerprotocolpolicy
     * 
     */
    @JsonProperty("ViewerProtocolPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-viewerprotocolpolicy")
    private CharSequence viewerProtocolPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-trustedsigners
     * 
     */
    @JsonProperty("TrustedSigners")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-trustedsigners")
    private List<CharSequence> trustedSigners = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-defaultttl
     * 
     */
    @JsonProperty("DefaultTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-defaultttl")
    private Double defaultTTL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-fieldlevelencryptionid
     * 
     */
    @JsonProperty("FieldLevelEncryptionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-fieldlevelencryptionid")
    private CharSequence fieldLevelEncryptionId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-allowedmethods
     * 
     */
    @JsonProperty("AllowedMethods")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-allowedmethods")
    private List<CharSequence> allowedMethods = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-cachedmethods
     * 
     */
    @JsonProperty("CachedMethods")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-cachedmethods")
    private List<CharSequence> cachedMethods = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-smoothstreaming
     * 
     */
    @JsonProperty("SmoothStreaming")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-smoothstreaming")
    private Boolean smoothStreaming;
    /**
     * ForwardedValues
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html
     * 
     */
    @JsonProperty("ForwardedValues")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html")
    private ForwardedValues forwardedValues;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-minttl
     * 
     */
    @JsonProperty("MinTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-minttl")
    private Double minTTL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-maxttl
     * 
     */
    @JsonProperty("MaxTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-maxttl")
    private Double maxTTL;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-compress
     * 
     */
    @JsonIgnore
    public Boolean getCompress() {
        return compress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-compress
     * 
     */
    @JsonIgnore
    public void setCompress(Boolean compress) {
        this.compress = compress;
    }

    public DefaultCacheBehavior withCompress(Boolean compress) {
        this.compress = compress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-lambdafunctionassociations
     * 
     */
    @JsonIgnore
    public List<LambdaFunctionAssociation> getLambdaFunctionAssociations() {
        return lambdaFunctionAssociations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-lambdafunctionassociations
     * 
     */
    @JsonIgnore
    public void setLambdaFunctionAssociations(List<LambdaFunctionAssociation> lambdaFunctionAssociations) {
        this.lambdaFunctionAssociations = lambdaFunctionAssociations;
    }

    public DefaultCacheBehavior withLambdaFunctionAssociations(List<LambdaFunctionAssociation> lambdaFunctionAssociations) {
        this.lambdaFunctionAssociations = lambdaFunctionAssociations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-targetoriginid
     * 
     */
    @JsonIgnore
    public CharSequence getTargetOriginId() {
        return targetOriginId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-targetoriginid
     * 
     */
    @JsonIgnore
    public void setTargetOriginId(CharSequence targetOriginId) {
        this.targetOriginId = targetOriginId;
    }

    public DefaultCacheBehavior withTargetOriginId(CharSequence targetOriginId) {
        this.targetOriginId = targetOriginId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-viewerprotocolpolicy
     * 
     */
    @JsonIgnore
    public CharSequence getViewerProtocolPolicy() {
        return viewerProtocolPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-viewerprotocolpolicy
     * 
     */
    @JsonIgnore
    public void setViewerProtocolPolicy(CharSequence viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
    }

    public DefaultCacheBehavior withViewerProtocolPolicy(CharSequence viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-trustedsigners
     * 
     */
    @JsonIgnore
    public List<CharSequence> getTrustedSigners() {
        return trustedSigners;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-trustedsigners
     * 
     */
    @JsonIgnore
    public void setTrustedSigners(List<CharSequence> trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    public DefaultCacheBehavior withTrustedSigners(List<CharSequence> trustedSigners) {
        this.trustedSigners = trustedSigners;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-defaultttl
     * 
     */
    @JsonIgnore
    public Double getDefaultTTL() {
        return defaultTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-defaultttl
     * 
     */
    @JsonIgnore
    public void setDefaultTTL(Double defaultTTL) {
        this.defaultTTL = defaultTTL;
    }

    public DefaultCacheBehavior withDefaultTTL(Double defaultTTL) {
        this.defaultTTL = defaultTTL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-fieldlevelencryptionid
     * 
     */
    @JsonIgnore
    public CharSequence getFieldLevelEncryptionId() {
        return fieldLevelEncryptionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-fieldlevelencryptionid
     * 
     */
    @JsonIgnore
    public void setFieldLevelEncryptionId(CharSequence fieldLevelEncryptionId) {
        this.fieldLevelEncryptionId = fieldLevelEncryptionId;
    }

    public DefaultCacheBehavior withFieldLevelEncryptionId(CharSequence fieldLevelEncryptionId) {
        this.fieldLevelEncryptionId = fieldLevelEncryptionId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-allowedmethods
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAllowedMethods() {
        return allowedMethods;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-allowedmethods
     * 
     */
    @JsonIgnore
    public void setAllowedMethods(List<CharSequence> allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

    public DefaultCacheBehavior withAllowedMethods(List<CharSequence> allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-cachedmethods
     * 
     */
    @JsonIgnore
    public List<CharSequence> getCachedMethods() {
        return cachedMethods;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-cachedmethods
     * 
     */
    @JsonIgnore
    public void setCachedMethods(List<CharSequence> cachedMethods) {
        this.cachedMethods = cachedMethods;
    }

    public DefaultCacheBehavior withCachedMethods(List<CharSequence> cachedMethods) {
        this.cachedMethods = cachedMethods;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-smoothstreaming
     * 
     */
    @JsonIgnore
    public Boolean getSmoothStreaming() {
        return smoothStreaming;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-smoothstreaming
     * 
     */
    @JsonIgnore
    public void setSmoothStreaming(Boolean smoothStreaming) {
        this.smoothStreaming = smoothStreaming;
    }

    public DefaultCacheBehavior withSmoothStreaming(Boolean smoothStreaming) {
        this.smoothStreaming = smoothStreaming;
        return this;
    }

    /**
     * ForwardedValues
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html
     * 
     */
    @JsonIgnore
    public ForwardedValues getForwardedValues() {
        return forwardedValues;
    }

    /**
     * ForwardedValues
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html
     * 
     */
    @JsonIgnore
    public void setForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
    }

    public DefaultCacheBehavior withForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-minttl
     * 
     */
    @JsonIgnore
    public Double getMinTTL() {
        return minTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-minttl
     * 
     */
    @JsonIgnore
    public void setMinTTL(Double minTTL) {
        this.minTTL = minTTL;
    }

    public DefaultCacheBehavior withMinTTL(Double minTTL) {
        this.minTTL = minTTL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-maxttl
     * 
     */
    @JsonIgnore
    public Double getMaxTTL() {
        return maxTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-maxttl
     * 
     */
    @JsonIgnore
    public void setMaxTTL(Double maxTTL) {
        this.maxTTL = maxTTL;
    }

    public DefaultCacheBehavior withMaxTTL(Double maxTTL) {
        this.maxTTL = maxTTL;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("compress", compress).append("lambdaFunctionAssociations", lambdaFunctionAssociations).append("targetOriginId", targetOriginId).append("viewerProtocolPolicy", viewerProtocolPolicy).append("trustedSigners", trustedSigners).append("defaultTTL", defaultTTL).append("fieldLevelEncryptionId", fieldLevelEncryptionId).append("allowedMethods", allowedMethods).append("cachedMethods", cachedMethods).append("smoothStreaming", smoothStreaming).append("forwardedValues", forwardedValues).append("minTTL", minTTL).append("maxTTL", maxTTL).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(trustedSigners).append(minTTL).append(compress).append(maxTTL).append(viewerProtocolPolicy).append(forwardedValues).append(lambdaFunctionAssociations).append(cachedMethods).append(fieldLevelEncryptionId).append(defaultTTL).append(allowedMethods).append(smoothStreaming).append(targetOriginId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultCacheBehavior) == false) {
            return false;
        }
        DefaultCacheBehavior rhs = ((DefaultCacheBehavior) other);
        return new EqualsBuilder().append(trustedSigners, rhs.trustedSigners).append(minTTL, rhs.minTTL).append(compress, rhs.compress).append(maxTTL, rhs.maxTTL).append(viewerProtocolPolicy, rhs.viewerProtocolPolicy).append(forwardedValues, rhs.forwardedValues).append(lambdaFunctionAssociations, rhs.lambdaFunctionAssociations).append(cachedMethods, rhs.cachedMethods).append(fieldLevelEncryptionId, rhs.fieldLevelEncryptionId).append(defaultTTL, rhs.defaultTTL).append(allowedMethods, rhs.allowedMethods).append(smoothStreaming, rhs.smoothStreaming).append(targetOriginId, rhs.targetOriginId).isEquals();
    }

}
