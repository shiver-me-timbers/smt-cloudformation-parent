
package shiver.me.timbers.aws.cloudfront;

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
 * DistributionOrigin
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
public class DistributionOrigin implements Property<DistributionOrigin>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders
     * 
     */
    @JsonProperty("OriginCustomHeaders")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders")
    private List<Property<DistributionOriginCustomHeader>> originCustomHeaders = new ArrayList<Property<DistributionOriginCustomHeader>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-domainname
     * 
     */
    @JsonProperty("DomainName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-domainname")
    private CharSequence domainName;
    /**
     * DistributionS3OriginConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html
     * 
     */
    @JsonProperty("S3OriginConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html")
    private Property<DistributionS3OriginConfig> s3OriginConfig;
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
     * DistributionCustomOriginConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html
     * 
     */
    @JsonProperty("CustomOriginConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html")
    private Property<DistributionCustomOriginConfig> customOriginConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders
     * 
     */
    @JsonIgnore
    public List<Property<DistributionOriginCustomHeader>> getOriginCustomHeaders() {
        return originCustomHeaders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders
     * 
     */
    @JsonIgnore
    public void setOriginCustomHeaders(List<Property<DistributionOriginCustomHeader>> originCustomHeaders) {
        this.originCustomHeaders = originCustomHeaders;
    }

    public DistributionOrigin withOriginCustomHeaders(List<Property<DistributionOriginCustomHeader>> originCustomHeaders) {
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

    public DistributionOrigin withDomainName(CharSequence domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * DistributionS3OriginConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html
     * 
     */
    @JsonIgnore
    public Property<DistributionS3OriginConfig> getS3OriginConfig() {
        return s3OriginConfig;
    }

    /**
     * DistributionS3OriginConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html
     * 
     */
    @JsonIgnore
    public void setS3OriginConfig(Property<DistributionS3OriginConfig> s3OriginConfig) {
        this.s3OriginConfig = s3OriginConfig;
    }

    public DistributionOrigin withS3OriginConfig(Property<DistributionS3OriginConfig> s3OriginConfig) {
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

    public DistributionOrigin withOriginPath(CharSequence originPath) {
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

    public DistributionOrigin withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * DistributionCustomOriginConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html
     * 
     */
    @JsonIgnore
    public Property<DistributionCustomOriginConfig> getCustomOriginConfig() {
        return customOriginConfig;
    }

    /**
     * DistributionCustomOriginConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html
     * 
     */
    @JsonIgnore
    public void setCustomOriginConfig(Property<DistributionCustomOriginConfig> customOriginConfig) {
        this.customOriginConfig = customOriginConfig;
    }

    public DistributionOrigin withCustomOriginConfig(Property<DistributionCustomOriginConfig> customOriginConfig) {
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
        if ((other instanceof DistributionOrigin) == false) {
            return false;
        }
        DistributionOrigin rhs = ((DistributionOrigin) other);
        return new EqualsBuilder().append(s3OriginConfig, rhs.s3OriginConfig).append(originPath, rhs.originPath).append(originCustomHeaders, rhs.originCustomHeaders).append(domainName, rhs.domainName).append(id, rhs.id).append(customOriginConfig, rhs.customOriginConfig).isEquals();
    }

}
