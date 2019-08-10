
package aws.mediastore;

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
 * ContainerCorsRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AllowedMethods",
    "AllowedOrigins",
    "ExposeHeaders",
    "MaxAgeSeconds",
    "AllowedHeaders"
})
public class ContainerCorsRule implements Property<ContainerCorsRule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedmethods
     * 
     */
    @JsonProperty("AllowedMethods")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedmethods")
    private List<CharSequence> allowedMethods = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedorigins
     * 
     */
    @JsonProperty("AllowedOrigins")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedorigins")
    private List<CharSequence> allowedOrigins = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-exposeheaders
     * 
     */
    @JsonProperty("ExposeHeaders")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-exposeheaders")
    private List<CharSequence> exposeHeaders = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-maxageseconds
     * 
     */
    @JsonProperty("MaxAgeSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-maxageseconds")
    private Number maxAgeSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedheaders
     * 
     */
    @JsonProperty("AllowedHeaders")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedheaders")
    private List<CharSequence> allowedHeaders = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedmethods
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAllowedMethods() {
        return allowedMethods;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedmethods
     * 
     */
    @JsonIgnore
    public void setAllowedMethods(List<CharSequence> allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

    public ContainerCorsRule withAllowedMethods(List<CharSequence> allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedorigins
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAllowedOrigins() {
        return allowedOrigins;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedorigins
     * 
     */
    @JsonIgnore
    public void setAllowedOrigins(List<CharSequence> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    public ContainerCorsRule withAllowedOrigins(List<CharSequence> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-exposeheaders
     * 
     */
    @JsonIgnore
    public List<CharSequence> getExposeHeaders() {
        return exposeHeaders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-exposeheaders
     * 
     */
    @JsonIgnore
    public void setExposeHeaders(List<CharSequence> exposeHeaders) {
        this.exposeHeaders = exposeHeaders;
    }

    public ContainerCorsRule withExposeHeaders(List<CharSequence> exposeHeaders) {
        this.exposeHeaders = exposeHeaders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-maxageseconds
     * 
     */
    @JsonIgnore
    public Number getMaxAgeSeconds() {
        return maxAgeSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-maxageseconds
     * 
     */
    @JsonIgnore
    public void setMaxAgeSeconds(Number maxAgeSeconds) {
        this.maxAgeSeconds = maxAgeSeconds;
    }

    public ContainerCorsRule withMaxAgeSeconds(Number maxAgeSeconds) {
        this.maxAgeSeconds = maxAgeSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedheaders
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAllowedHeaders() {
        return allowedHeaders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedheaders
     * 
     */
    @JsonIgnore
    public void setAllowedHeaders(List<CharSequence> allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
    }

    public ContainerCorsRule withAllowedHeaders(List<CharSequence> allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allowedMethods", allowedMethods).append("allowedOrigins", allowedOrigins).append("exposeHeaders", exposeHeaders).append("maxAgeSeconds", maxAgeSeconds).append("allowedHeaders", allowedHeaders).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(allowedHeaders).append(allowedMethods).append(exposeHeaders).append(allowedOrigins).append(maxAgeSeconds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerCorsRule) == false) {
            return false;
        }
        ContainerCorsRule rhs = ((ContainerCorsRule) other);
        return new EqualsBuilder().append(allowedHeaders, rhs.allowedHeaders).append(allowedMethods, rhs.allowedMethods).append(exposeHeaders, rhs.exposeHeaders).append(allowedOrigins, rhs.allowedOrigins).append(maxAgeSeconds, rhs.maxAgeSeconds).isEquals();
    }

}
