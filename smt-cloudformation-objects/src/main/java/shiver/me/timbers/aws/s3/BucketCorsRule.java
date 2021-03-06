
package shiver.me.timbers.aws.s3;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * BucketCorsRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AllowedHeaders",
    "AllowedMethods",
    "AllowedOrigins",
    "ExposedHeaders",
    "Id",
    "MaxAge"
})
public class BucketCorsRule implements Property<BucketCorsRule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedheaders
     * 
     */
    @JsonProperty("AllowedHeaders")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedheaders")
    private Set<CharSequence> allowedHeaders = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods
     * 
     */
    @JsonProperty("AllowedMethods")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods")
    private Set<CharSequence> allowedMethods = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins
     * 
     */
    @JsonProperty("AllowedOrigins")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins")
    private Set<CharSequence> allowedOrigins = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders
     * 
     */
    @JsonProperty("ExposedHeaders")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders")
    private Set<CharSequence> exposedHeaders = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id")
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-maxage
     * 
     */
    @JsonProperty("MaxAge")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-maxage")
    private Number maxAge;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedheaders
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getAllowedHeaders() {
        return allowedHeaders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedheaders
     * 
     */
    @JsonIgnore
    public void setAllowedHeaders(Set<CharSequence> allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
    }

    public BucketCorsRule withAllowedHeaders(Set<CharSequence> allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getAllowedMethods() {
        return allowedMethods;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods
     * 
     */
    @JsonIgnore
    public void setAllowedMethods(Set<CharSequence> allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

    public BucketCorsRule withAllowedMethods(Set<CharSequence> allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getAllowedOrigins() {
        return allowedOrigins;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins
     * 
     */
    @JsonIgnore
    public void setAllowedOrigins(Set<CharSequence> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    public BucketCorsRule withAllowedOrigins(Set<CharSequence> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getExposedHeaders() {
        return exposedHeaders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders
     * 
     */
    @JsonIgnore
    public void setExposedHeaders(Set<CharSequence> exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
    }

    public BucketCorsRule withExposedHeaders(Set<CharSequence> exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id
     * 
     */
    @JsonIgnore
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id
     * 
     */
    @JsonIgnore
    public void setId(CharSequence id) {
        this.id = id;
    }

    public BucketCorsRule withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-maxage
     * 
     */
    @JsonIgnore
    public Number getMaxAge() {
        return maxAge;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-maxage
     * 
     */
    @JsonIgnore
    public void setMaxAge(Number maxAge) {
        this.maxAge = maxAge;
    }

    public BucketCorsRule withMaxAge(Number maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allowedHeaders", allowedHeaders).append("allowedMethods", allowedMethods).append("allowedOrigins", allowedOrigins).append("exposedHeaders", exposedHeaders).append("id", id).append("maxAge", maxAge).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(allowedOrigins).append(maxAge).append(exposedHeaders).append(allowedHeaders).append(allowedMethods).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketCorsRule) == false) {
            return false;
        }
        BucketCorsRule rhs = ((BucketCorsRule) other);
        return new EqualsBuilder().append(allowedOrigins, rhs.allowedOrigins).append(maxAge, rhs.maxAge).append(exposedHeaders, rhs.exposedHeaders).append(allowedHeaders, rhs.allowedHeaders).append(allowedMethods, rhs.allowedMethods).append(id, rhs.id).isEquals();
    }

}
