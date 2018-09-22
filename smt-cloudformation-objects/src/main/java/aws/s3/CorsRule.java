
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
    private Set<String> allowedHeaders = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods
     * 
     */
    @JsonProperty("AllowedMethods")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods")
    private Set<String> allowedMethods = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins
     * 
     */
    @JsonProperty("AllowedOrigins")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins")
    private Set<String> allowedOrigins = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders
     * 
     */
    @JsonProperty("ExposedHeaders")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders")
    private Set<String> exposedHeaders = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id")
    private String id;
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
    @JsonProperty("AllowedHeaders")
    public Set<String> getAllowedHeaders() {
        return allowedHeaders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedheaders
     * 
     */
    @JsonProperty("AllowedHeaders")
    public void setAllowedHeaders(Set<String> allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
    }

    public CorsRule withAllowedHeaders(Set<String> allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods
     * 
     */
    @JsonProperty("AllowedMethods")
    public Set<String> getAllowedMethods() {
        return allowedMethods;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods
     * 
     */
    @JsonProperty("AllowedMethods")
    public void setAllowedMethods(Set<String> allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

    public CorsRule withAllowedMethods(Set<String> allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins
     * 
     */
    @JsonProperty("AllowedOrigins")
    public Set<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins
     * 
     */
    @JsonProperty("AllowedOrigins")
    public void setAllowedOrigins(Set<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    public CorsRule withAllowedOrigins(Set<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders
     * 
     */
    @JsonProperty("ExposedHeaders")
    public Set<String> getExposedHeaders() {
        return exposedHeaders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders
     * 
     */
    @JsonProperty("ExposedHeaders")
    public void setExposedHeaders(Set<String> exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
    }

    public CorsRule withExposedHeaders(Set<String> exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id
     * 
     */
    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id
     * 
     */
    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    public CorsRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-maxage
     * 
     */
    @JsonProperty("MaxAge")
    public Integer getMaxAge() {
        return maxAge;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-maxage
     * 
     */
    @JsonProperty("MaxAge")
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
