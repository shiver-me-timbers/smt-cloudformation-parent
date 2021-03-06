
package shiver.me.timbers.aws.s3;

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
 * BucketRedirectRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HostName",
    "HttpRedirectCode",
    "Protocol",
    "ReplaceKeyPrefixWith",
    "ReplaceKeyWith"
})
public class BucketRedirectRule implements Property<BucketRedirectRule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-hostname
     * 
     */
    @JsonProperty("HostName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-hostname")
    private CharSequence hostName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-httpredirectcode
     * 
     */
    @JsonProperty("HttpRedirectCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-httpredirectcode")
    private CharSequence httpRedirectCode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-protocol")
    private CharSequence protocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeyprefixwith
     * 
     */
    @JsonProperty("ReplaceKeyPrefixWith")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeyprefixwith")
    private CharSequence replaceKeyPrefixWith;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeywith
     * 
     */
    @JsonProperty("ReplaceKeyWith")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeywith")
    private CharSequence replaceKeyWith;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-hostname
     * 
     */
    @JsonIgnore
    public CharSequence getHostName() {
        return hostName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-hostname
     * 
     */
    @JsonIgnore
    public void setHostName(CharSequence hostName) {
        this.hostName = hostName;
    }

    public BucketRedirectRule withHostName(CharSequence hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-httpredirectcode
     * 
     */
    @JsonIgnore
    public CharSequence getHttpRedirectCode() {
        return httpRedirectCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-httpredirectcode
     * 
     */
    @JsonIgnore
    public void setHttpRedirectCode(CharSequence httpRedirectCode) {
        this.httpRedirectCode = httpRedirectCode;
    }

    public BucketRedirectRule withHttpRedirectCode(CharSequence httpRedirectCode) {
        this.httpRedirectCode = httpRedirectCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-protocol
     * 
     */
    @JsonIgnore
    public CharSequence getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-protocol
     * 
     */
    @JsonIgnore
    public void setProtocol(CharSequence protocol) {
        this.protocol = protocol;
    }

    public BucketRedirectRule withProtocol(CharSequence protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeyprefixwith
     * 
     */
    @JsonIgnore
    public CharSequence getReplaceKeyPrefixWith() {
        return replaceKeyPrefixWith;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeyprefixwith
     * 
     */
    @JsonIgnore
    public void setReplaceKeyPrefixWith(CharSequence replaceKeyPrefixWith) {
        this.replaceKeyPrefixWith = replaceKeyPrefixWith;
    }

    public BucketRedirectRule withReplaceKeyPrefixWith(CharSequence replaceKeyPrefixWith) {
        this.replaceKeyPrefixWith = replaceKeyPrefixWith;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeywith
     * 
     */
    @JsonIgnore
    public CharSequence getReplaceKeyWith() {
        return replaceKeyWith;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeywith
     * 
     */
    @JsonIgnore
    public void setReplaceKeyWith(CharSequence replaceKeyWith) {
        this.replaceKeyWith = replaceKeyWith;
    }

    public BucketRedirectRule withReplaceKeyWith(CharSequence replaceKeyWith) {
        this.replaceKeyWith = replaceKeyWith;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hostName", hostName).append("httpRedirectCode", httpRedirectCode).append("protocol", protocol).append("replaceKeyPrefixWith", replaceKeyPrefixWith).append("replaceKeyWith", replaceKeyWith).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(httpRedirectCode).append(replaceKeyWith).append(hostName).append(protocol).append(replaceKeyPrefixWith).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketRedirectRule) == false) {
            return false;
        }
        BucketRedirectRule rhs = ((BucketRedirectRule) other);
        return new EqualsBuilder().append(httpRedirectCode, rhs.httpRedirectCode).append(replaceKeyWith, rhs.replaceKeyWith).append(hostName, rhs.hostName).append(protocol, rhs.protocol).append(replaceKeyPrefixWith, rhs.replaceKeyPrefixWith).isEquals();
    }

}
