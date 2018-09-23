
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
 * CustomOriginConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OriginReadTimeout",
    "HTTPSPort",
    "OriginKeepaliveTimeout",
    "OriginSSLProtocols",
    "HTTPPort",
    "OriginProtocolPolicy"
})
public class CustomOriginConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout
     * 
     */
    @JsonProperty("OriginReadTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout")
    private Integer originReadTimeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport
     * 
     */
    @JsonProperty("HTTPSPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport")
    private Integer hTTPSPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout
     * 
     */
    @JsonProperty("OriginKeepaliveTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout")
    private Integer originKeepaliveTimeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols
     * 
     */
    @JsonProperty("OriginSSLProtocols")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols")
    private List<String> originSSLProtocols = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport
     * 
     */
    @JsonProperty("HTTPPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport")
    private Integer hTTPPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy
     * 
     */
    @JsonProperty("OriginProtocolPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy")
    private String originProtocolPolicy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout
     * 
     */
    @JsonProperty("OriginReadTimeout")
    public Integer getOriginReadTimeout() {
        return originReadTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout
     * 
     */
    @JsonProperty("OriginReadTimeout")
    public void setOriginReadTimeout(Integer originReadTimeout) {
        this.originReadTimeout = originReadTimeout;
    }

    public CustomOriginConfig withOriginReadTimeout(Integer originReadTimeout) {
        this.originReadTimeout = originReadTimeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport
     * 
     */
    @JsonProperty("HTTPSPort")
    public Integer getHTTPSPort() {
        return hTTPSPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport
     * 
     */
    @JsonProperty("HTTPSPort")
    public void setHTTPSPort(Integer hTTPSPort) {
        this.hTTPSPort = hTTPSPort;
    }

    public CustomOriginConfig withHTTPSPort(Integer hTTPSPort) {
        this.hTTPSPort = hTTPSPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout
     * 
     */
    @JsonProperty("OriginKeepaliveTimeout")
    public Integer getOriginKeepaliveTimeout() {
        return originKeepaliveTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout
     * 
     */
    @JsonProperty("OriginKeepaliveTimeout")
    public void setOriginKeepaliveTimeout(Integer originKeepaliveTimeout) {
        this.originKeepaliveTimeout = originKeepaliveTimeout;
    }

    public CustomOriginConfig withOriginKeepaliveTimeout(Integer originKeepaliveTimeout) {
        this.originKeepaliveTimeout = originKeepaliveTimeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols
     * 
     */
    @JsonProperty("OriginSSLProtocols")
    public List<String> getOriginSSLProtocols() {
        return originSSLProtocols;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols
     * 
     */
    @JsonProperty("OriginSSLProtocols")
    public void setOriginSSLProtocols(List<String> originSSLProtocols) {
        this.originSSLProtocols = originSSLProtocols;
    }

    public CustomOriginConfig withOriginSSLProtocols(List<String> originSSLProtocols) {
        this.originSSLProtocols = originSSLProtocols;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport
     * 
     */
    @JsonProperty("HTTPPort")
    public Integer getHTTPPort() {
        return hTTPPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport
     * 
     */
    @JsonProperty("HTTPPort")
    public void setHTTPPort(Integer hTTPPort) {
        this.hTTPPort = hTTPPort;
    }

    public CustomOriginConfig withHTTPPort(Integer hTTPPort) {
        this.hTTPPort = hTTPPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy
     * 
     */
    @JsonProperty("OriginProtocolPolicy")
    public String getOriginProtocolPolicy() {
        return originProtocolPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy
     * 
     */
    @JsonProperty("OriginProtocolPolicy")
    public void setOriginProtocolPolicy(String originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy;
    }

    public CustomOriginConfig withOriginProtocolPolicy(String originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("originReadTimeout", originReadTimeout).append("hTTPSPort", hTTPSPort).append("originKeepaliveTimeout", originKeepaliveTimeout).append("originSSLProtocols", originSSLProtocols).append("hTTPPort", hTTPPort).append("originProtocolPolicy", originProtocolPolicy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(originKeepaliveTimeout).append(hTTPPort).append(originProtocolPolicy).append(originReadTimeout).append(hTTPSPort).append(originSSLProtocols).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomOriginConfig) == false) {
            return false;
        }
        CustomOriginConfig rhs = ((CustomOriginConfig) other);
        return new EqualsBuilder().append(originKeepaliveTimeout, rhs.originKeepaliveTimeout).append(hTTPPort, rhs.hTTPPort).append(originProtocolPolicy, rhs.originProtocolPolicy).append(originReadTimeout, rhs.originReadTimeout).append(hTTPSPort, rhs.hTTPSPort).append(originSSLProtocols, rhs.originSSLProtocols).isEquals();
    }

}