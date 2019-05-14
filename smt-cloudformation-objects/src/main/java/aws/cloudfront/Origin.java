
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
 * Origin
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OriginCustomHeaders",
    "DomainName",
    "S3OriginConfig",
    "OriginPath",
    "Id",
    "CustomOriginConfig"
})
public class Origin implements Property<Origin>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders
     * 
     */
    @JsonProperty("OriginCustomHeaders")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders")
    private List<Property<OriginCustomHeader>> originCustomHeaders = new ArrayList<Property<OriginCustomHeader>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-domainname
     * 
     */
    @JsonProperty("DomainName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-domainname")
    private CharSequence domainName;
    /**
     * S3OriginConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html
     * 
     */
    @JsonProperty("S3OriginConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html")
    private Property<S3OriginConfig> s3OriginConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originpath
     * 
     */
    @JsonProperty("OriginPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originpath")
    private CharSequence originPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-id")
    private CharSequence id;
    /**
     * CustomOriginConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html
     * 
     */
    @JsonProperty("CustomOriginConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html")
    private Property<CustomOriginConfig> customOriginConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders
     * 
     */
    @JsonIgnore
    public List<Property<OriginCustomHeader>> getOriginCustomHeaders() {
        return originCustomHeaders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders
     * 
     */
    @JsonIgnore
    public void setOriginCustomHeaders(List<Property<OriginCustomHeader>> originCustomHeaders) {
        this.originCustomHeaders = originCustomHeaders;
    }

    public Origin withOriginCustomHeaders(List<Property<OriginCustomHeader>> originCustomHeaders) {
        this.originCustomHeaders = originCustomHeaders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-domainname
     * 
     */
    @JsonIgnore
    public CharSequence getDomainName() {
        return domainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-domainname
     * 
     */
    @JsonIgnore
    public void setDomainName(CharSequence domainName) {
        this.domainName = domainName;
    }

    public Origin withDomainName(CharSequence domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * S3OriginConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html
     * 
     */
    @JsonIgnore
    public Property<S3OriginConfig> getS3OriginConfig() {
        return s3OriginConfig;
    }

    /**
     * S3OriginConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html
     * 
     */
    @JsonIgnore
    public void setS3OriginConfig(Property<S3OriginConfig> s3OriginConfig) {
        this.s3OriginConfig = s3OriginConfig;
    }

    public Origin withS3OriginConfig(Property<S3OriginConfig> s3OriginConfig) {
        this.s3OriginConfig = s3OriginConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originpath
     * 
     */
    @JsonIgnore
    public CharSequence getOriginPath() {
        return originPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originpath
     * 
     */
    @JsonIgnore
    public void setOriginPath(CharSequence originPath) {
        this.originPath = originPath;
    }

    public Origin withOriginPath(CharSequence originPath) {
        this.originPath = originPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-id
     * 
     */
    @JsonIgnore
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-id
     * 
     */
    @JsonIgnore
    public void setId(CharSequence id) {
        this.id = id;
    }

    public Origin withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * CustomOriginConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html
     * 
     */
    @JsonIgnore
    public Property<CustomOriginConfig> getCustomOriginConfig() {
        return customOriginConfig;
    }

    /**
     * CustomOriginConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html
     * 
     */
    @JsonIgnore
    public void setCustomOriginConfig(Property<CustomOriginConfig> customOriginConfig) {
        this.customOriginConfig = customOriginConfig;
    }

    public Origin withCustomOriginConfig(Property<CustomOriginConfig> customOriginConfig) {
        this.customOriginConfig = customOriginConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("originCustomHeaders", originCustomHeaders).append("domainName", domainName).append("s3OriginConfig", s3OriginConfig).append("originPath", originPath).append("id", id).append("customOriginConfig", customOriginConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3OriginConfig).append(originPath).append(originCustomHeaders).append(domainName).append(id).append(customOriginConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Origin) == false) {
            return false;
        }
        Origin rhs = ((Origin) other);
        return new EqualsBuilder().append(s3OriginConfig, rhs.s3OriginConfig).append(originPath, rhs.originPath).append(originCustomHeaders, rhs.originCustomHeaders).append(domainName, rhs.domainName).append(id, rhs.id).append(customOriginConfig, rhs.customOriginConfig).isEquals();
    }

}
