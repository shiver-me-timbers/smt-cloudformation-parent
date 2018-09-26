
package aws.s3;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CorsRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllowedHeaders",
    "AllowedMethods",
    "AllowedOrigins",
    "ExposedHeaders",
    "Id",
    "MaxAge"
})
public class CorsRule {

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
    private Integer maxAge;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedheaders
     * 
     */
    public Set<CharSequence> getAllowedHeaders() {
        return allowedHeaders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedheaders
     * 
     */
    public void setAllowedHeaders(Set<CharSequence> allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
    }

    public CorsRule withAllowedHeaders(Set<CharSequence> allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods
     * 
     */
    public Set<CharSequence> getAllowedMethods() {
        return allowedMethods;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods
     * 
     */
    public void setAllowedMethods(Set<CharSequence> allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

    public CorsRule withAllowedMethods(Set<CharSequence> allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins
     * 
     */
    public Set<CharSequence> getAllowedOrigins() {
        return allowedOrigins;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins
     * 
     */
    public void setAllowedOrigins(Set<CharSequence> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    public CorsRule withAllowedOrigins(Set<CharSequence> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders
     * 
     */
    public Set<CharSequence> getExposedHeaders() {
        return exposedHeaders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders
     * 
     */
    public void setExposedHeaders(Set<CharSequence> exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
    }

    public CorsRule withExposedHeaders(Set<CharSequence> exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id
     * 
     */
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id
     * 
     */
    public void setId(CharSequence id) {
        this.id = id;
    }

    public CorsRule withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-maxage
     * 
     */
    public Integer getMaxAge() {
        return maxAge;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-maxage
     * 
     */
    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public CorsRule withMaxAge(Integer maxAge) {
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
        if ((other instanceof CorsRule) == false) {
            return false;
        }
        CorsRule rhs = ((CorsRule) other);
        return new EqualsBuilder().append(allowedOrigins, rhs.allowedOrigins).append(maxAge, rhs.maxAge).append(exposedHeaders, rhs.exposedHeaders).append(allowedHeaders, rhs.allowedHeaders).append(allowedMethods, rhs.allowedMethods).append(id, rhs.id).isEquals();
    }

}
