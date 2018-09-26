
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
 * CacheBehavior
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html
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
    "PathPattern",
    "CachedMethods",
    "SmoothStreaming",
    "ForwardedValues",
    "MinTTL",
    "MaxTTL"
})
public class CacheBehavior {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-compress
     * 
     */
    @JsonProperty("Compress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-compress")
    private Boolean compress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-lambdafunctionassociations
     * 
     */
    @JsonProperty("LambdaFunctionAssociations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-lambdafunctionassociations")
    private List<LambdaFunctionAssociation> lambdaFunctionAssociations = new ArrayList<LambdaFunctionAssociation>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-targetoriginid
     * 
     */
    @JsonProperty("TargetOriginId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-targetoriginid")
    private CharSequence targetOriginId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-viewerprotocolpolicy
     * 
     */
    @JsonProperty("ViewerProtocolPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-viewerprotocolpolicy")
    private CharSequence viewerProtocolPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-trustedsigners
     * 
     */
    @JsonProperty("TrustedSigners")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-trustedsigners")
    private List<CharSequence> trustedSigners = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-defaultttl
     * 
     */
    @JsonProperty("DefaultTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-defaultttl")
    private Double defaultTTL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-fieldlevelencryptionid
     * 
     */
    @JsonProperty("FieldLevelEncryptionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-fieldlevelencryptionid")
    private CharSequence fieldLevelEncryptionId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-allowedmethods
     * 
     */
    @JsonProperty("AllowedMethods")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-allowedmethods")
    private List<CharSequence> allowedMethods = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-pathpattern
     * 
     */
    @JsonProperty("PathPattern")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-pathpattern")
    private CharSequence pathPattern;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-cachedmethods
     * 
     */
    @JsonProperty("CachedMethods")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-cachedmethods")
    private List<CharSequence> cachedMethods = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-smoothstreaming
     * 
     */
    @JsonProperty("SmoothStreaming")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-smoothstreaming")
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-minttl
     * 
     */
    @JsonProperty("MinTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-minttl")
    private Double minTTL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-maxttl
     * 
     */
    @JsonProperty("MaxTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-maxttl")
    private Double maxTTL;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-compress
     * 
     */
    public Boolean getCompress() {
        return compress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-compress
     * 
     */
    public void setCompress(Boolean compress) {
        this.compress = compress;
    }

    public CacheBehavior withCompress(Boolean compress) {
        this.compress = compress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-lambdafunctionassociations
     * 
     */
    public List<LambdaFunctionAssociation> getLambdaFunctionAssociations() {
        return lambdaFunctionAssociations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-lambdafunctionassociations
     * 
     */
    public void setLambdaFunctionAssociations(List<LambdaFunctionAssociation> lambdaFunctionAssociations) {
        this.lambdaFunctionAssociations = lambdaFunctionAssociations;
    }

    public CacheBehavior withLambdaFunctionAssociations(List<LambdaFunctionAssociation> lambdaFunctionAssociations) {
        this.lambdaFunctionAssociations = lambdaFunctionAssociations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-targetoriginid
     * 
     */
    public CharSequence getTargetOriginId() {
        return targetOriginId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-targetoriginid
     * 
     */
    public void setTargetOriginId(CharSequence targetOriginId) {
        this.targetOriginId = targetOriginId;
    }

    public CacheBehavior withTargetOriginId(CharSequence targetOriginId) {
        this.targetOriginId = targetOriginId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-viewerprotocolpolicy
     * 
     */
    public CharSequence getViewerProtocolPolicy() {
        return viewerProtocolPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-viewerprotocolpolicy
     * 
     */
    public void setViewerProtocolPolicy(CharSequence viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
    }

    public CacheBehavior withViewerProtocolPolicy(CharSequence viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-trustedsigners
     * 
     */
    public List<CharSequence> getTrustedSigners() {
        return trustedSigners;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-trustedsigners
     * 
     */
    public void setTrustedSigners(List<CharSequence> trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    public CacheBehavior withTrustedSigners(List<CharSequence> trustedSigners) {
        this.trustedSigners = trustedSigners;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-defaultttl
     * 
     */
    public Double getDefaultTTL() {
        return defaultTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-defaultttl
     * 
     */
    public void setDefaultTTL(Double defaultTTL) {
        this.defaultTTL = defaultTTL;
    }

    public CacheBehavior withDefaultTTL(Double defaultTTL) {
        this.defaultTTL = defaultTTL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-fieldlevelencryptionid
     * 
     */
    public CharSequence getFieldLevelEncryptionId() {
        return fieldLevelEncryptionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-fieldlevelencryptionid
     * 
     */
    public void setFieldLevelEncryptionId(CharSequence fieldLevelEncryptionId) {
        this.fieldLevelEncryptionId = fieldLevelEncryptionId;
    }

    public CacheBehavior withFieldLevelEncryptionId(CharSequence fieldLevelEncryptionId) {
        this.fieldLevelEncryptionId = fieldLevelEncryptionId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-allowedmethods
     * 
     */
    public List<CharSequence> getAllowedMethods() {
        return allowedMethods;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-allowedmethods
     * 
     */
    public void setAllowedMethods(List<CharSequence> allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

    public CacheBehavior withAllowedMethods(List<CharSequence> allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-pathpattern
     * 
     */
    public CharSequence getPathPattern() {
        return pathPattern;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-pathpattern
     * 
     */
    public void setPathPattern(CharSequence pathPattern) {
        this.pathPattern = pathPattern;
    }

    public CacheBehavior withPathPattern(CharSequence pathPattern) {
        this.pathPattern = pathPattern;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-cachedmethods
     * 
     */
    public List<CharSequence> getCachedMethods() {
        return cachedMethods;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-cachedmethods
     * 
     */
    public void setCachedMethods(List<CharSequence> cachedMethods) {
        this.cachedMethods = cachedMethods;
    }

    public CacheBehavior withCachedMethods(List<CharSequence> cachedMethods) {
        this.cachedMethods = cachedMethods;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-smoothstreaming
     * 
     */
    public Boolean getSmoothStreaming() {
        return smoothStreaming;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-smoothstreaming
     * 
     */
    public void setSmoothStreaming(Boolean smoothStreaming) {
        this.smoothStreaming = smoothStreaming;
    }

    public CacheBehavior withSmoothStreaming(Boolean smoothStreaming) {
        this.smoothStreaming = smoothStreaming;
        return this;
    }

    /**
     * ForwardedValues
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html
     * 
     */
    public ForwardedValues getForwardedValues() {
        return forwardedValues;
    }

    /**
     * ForwardedValues
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html
     * 
     */
    public void setForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
    }

    public CacheBehavior withForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-minttl
     * 
     */
    public Double getMinTTL() {
        return minTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-minttl
     * 
     */
    public void setMinTTL(Double minTTL) {
        this.minTTL = minTTL;
    }

    public CacheBehavior withMinTTL(Double minTTL) {
        this.minTTL = minTTL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-maxttl
     * 
     */
    public Double getMaxTTL() {
        return maxTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-maxttl
     * 
     */
    public void setMaxTTL(Double maxTTL) {
        this.maxTTL = maxTTL;
    }

    public CacheBehavior withMaxTTL(Double maxTTL) {
        this.maxTTL = maxTTL;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("compress", compress).append("lambdaFunctionAssociations", lambdaFunctionAssociations).append("targetOriginId", targetOriginId).append("viewerProtocolPolicy", viewerProtocolPolicy).append("trustedSigners", trustedSigners).append("defaultTTL", defaultTTL).append("fieldLevelEncryptionId", fieldLevelEncryptionId).append("allowedMethods", allowedMethods).append("pathPattern", pathPattern).append("cachedMethods", cachedMethods).append("smoothStreaming", smoothStreaming).append("forwardedValues", forwardedValues).append("minTTL", minTTL).append("maxTTL", maxTTL).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(trustedSigners).append(minTTL).append(compress).append(maxTTL).append(viewerProtocolPolicy).append(forwardedValues).append(lambdaFunctionAssociations).append(cachedMethods).append(fieldLevelEncryptionId).append(defaultTTL).append(allowedMethods).append(pathPattern).append(smoothStreaming).append(targetOriginId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CacheBehavior) == false) {
            return false;
        }
        CacheBehavior rhs = ((CacheBehavior) other);
        return new EqualsBuilder().append(trustedSigners, rhs.trustedSigners).append(minTTL, rhs.minTTL).append(compress, rhs.compress).append(maxTTL, rhs.maxTTL).append(viewerProtocolPolicy, rhs.viewerProtocolPolicy).append(forwardedValues, rhs.forwardedValues).append(lambdaFunctionAssociations, rhs.lambdaFunctionAssociations).append(cachedMethods, rhs.cachedMethods).append(fieldLevelEncryptionId, rhs.fieldLevelEncryptionId).append(defaultTTL, rhs.defaultTTL).append(allowedMethods, rhs.allowedMethods).append(pathPattern, rhs.pathPattern).append(smoothStreaming, rhs.smoothStreaming).append(targetOriginId, rhs.targetOriginId).isEquals();
    }

}
