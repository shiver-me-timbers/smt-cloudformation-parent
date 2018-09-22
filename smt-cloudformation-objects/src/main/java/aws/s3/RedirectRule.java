
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RedirectRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "HostName",
    "HttpRedirectCode",
    "Protocol",
    "ReplaceKeyPrefixWith",
    "ReplaceKeyWith"
})
public class RedirectRule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-hostname
     * 
     */
    @JsonProperty("HostName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-hostname")
    private String hostName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-httpredirectcode
     * 
     */
    @JsonProperty("HttpRedirectCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-httpredirectcode")
    private String httpRedirectCode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-protocol")
    private String protocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeyprefixwith
     * 
     */
    @JsonProperty("ReplaceKeyPrefixWith")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeyprefixwith")
    private String replaceKeyPrefixWith;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeywith
     * 
     */
    @JsonProperty("ReplaceKeyWith")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeywith")
    private String replaceKeyWith;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-hostname
     * 
     */
    @JsonProperty("HostName")
    public String getHostName() {
        return hostName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-hostname
     * 
     */
    @JsonProperty("HostName")
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public RedirectRule withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-httpredirectcode
     * 
     */
    @JsonProperty("HttpRedirectCode")
    public String getHttpRedirectCode() {
        return httpRedirectCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-httpredirectcode
     * 
     */
    @JsonProperty("HttpRedirectCode")
    public void setHttpRedirectCode(String httpRedirectCode) {
        this.httpRedirectCode = httpRedirectCode;
    }

    public RedirectRule withHttpRedirectCode(String httpRedirectCode) {
        this.httpRedirectCode = httpRedirectCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-protocol
     * 
     */
    @JsonProperty("Protocol")
    public String getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-protocol
     * 
     */
    @JsonProperty("Protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public RedirectRule withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeyprefixwith
     * 
     */
    @JsonProperty("ReplaceKeyPrefixWith")
    public String getReplaceKeyPrefixWith() {
        return replaceKeyPrefixWith;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeyprefixwith
     * 
     */
    @JsonProperty("ReplaceKeyPrefixWith")
    public void setReplaceKeyPrefixWith(String replaceKeyPrefixWith) {
        this.replaceKeyPrefixWith = replaceKeyPrefixWith;
    }

    public RedirectRule withReplaceKeyPrefixWith(String replaceKeyPrefixWith) {
        this.replaceKeyPrefixWith = replaceKeyPrefixWith;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeywith
     * 
     */
    @JsonProperty("ReplaceKeyWith")
    public String getReplaceKeyWith() {
        return replaceKeyWith;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeywith
     * 
     */
    @JsonProperty("ReplaceKeyWith")
    public void setReplaceKeyWith(String replaceKeyWith) {
        this.replaceKeyWith = replaceKeyWith;
    }

    public RedirectRule withReplaceKeyWith(String replaceKeyWith) {
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
        if ((other instanceof RedirectRule) == false) {
            return false;
        }
        RedirectRule rhs = ((RedirectRule) other);
        return new EqualsBuilder().append(httpRedirectCode, rhs.httpRedirectCode).append(replaceKeyWith, rhs.replaceKeyWith).append(hostName, rhs.hostName).append(protocol, rhs.protocol).append(replaceKeyPrefixWith, rhs.replaceKeyPrefixWith).isEquals();
    }

}
