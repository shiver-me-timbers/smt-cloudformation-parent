
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
 * DistributionCustomOriginConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OriginReadTimeout",
    "HTTPSPort",
    "OriginKeepaliveTimeout",
    "OriginSSLProtocols",
    "HTTPPort",
    "OriginProtocolPolicy"
})
public class DistributionCustomOriginConfig implements Property<DistributionCustomOriginConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout
     * 
     */
    @JsonProperty("OriginReadTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout")
    private Number originReadTimeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport
     * 
     */
    @JsonProperty("HTTPSPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport")
    private Number hTTPSPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout
     * 
     */
    @JsonProperty("OriginKeepaliveTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout")
    private Number originKeepaliveTimeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols
     * 
     */
    @JsonProperty("OriginSSLProtocols")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols")
    private List<CharSequence> originSSLProtocols = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport
     * 
     */
    @JsonProperty("HTTPPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport")
    private Number hTTPPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy
     * 
     */
    @JsonProperty("OriginProtocolPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy")
    private CharSequence originProtocolPolicy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout
     * 
     */
    @JsonIgnore
    public Number getOriginReadTimeout() {
        return originReadTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout
     * 
     */
    @JsonIgnore
    public void setOriginReadTimeout(Number originReadTimeout) {
        this.originReadTimeout = originReadTimeout;
    }

    public DistributionCustomOriginConfig withOriginReadTimeout(Number originReadTimeout) {
        this.originReadTimeout = originReadTimeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport
     * 
     */
    @JsonIgnore
    public Number getHTTPSPort() {
        return hTTPSPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport
     * 
     */
    @JsonIgnore
    public void setHTTPSPort(Number hTTPSPort) {
        this.hTTPSPort = hTTPSPort;
    }

    public DistributionCustomOriginConfig withHTTPSPort(Number hTTPSPort) {
        this.hTTPSPort = hTTPSPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout
     * 
     */
    @JsonIgnore
    public Number getOriginKeepaliveTimeout() {
        return originKeepaliveTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout
     * 
     */
    @JsonIgnore
    public void setOriginKeepaliveTimeout(Number originKeepaliveTimeout) {
        this.originKeepaliveTimeout = originKeepaliveTimeout;
    }

    public DistributionCustomOriginConfig withOriginKeepaliveTimeout(Number originKeepaliveTimeout) {
        this.originKeepaliveTimeout = originKeepaliveTimeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols
     * 
     */
    @JsonIgnore
    public List<CharSequence> getOriginSSLProtocols() {
        return originSSLProtocols;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols
     * 
     */
    @JsonIgnore
    public void setOriginSSLProtocols(List<CharSequence> originSSLProtocols) {
        this.originSSLProtocols = originSSLProtocols;
    }

    public DistributionCustomOriginConfig withOriginSSLProtocols(List<CharSequence> originSSLProtocols) {
        this.originSSLProtocols = originSSLProtocols;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport
     * 
     */
    @JsonIgnore
    public Number getHTTPPort() {
        return hTTPPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport
     * 
     */
    @JsonIgnore
    public void setHTTPPort(Number hTTPPort) {
        this.hTTPPort = hTTPPort;
    }

    public DistributionCustomOriginConfig withHTTPPort(Number hTTPPort) {
        this.hTTPPort = hTTPPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy
     * 
     */
    @JsonIgnore
    public CharSequence getOriginProtocolPolicy() {
        return originProtocolPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy
     * 
     */
    @JsonIgnore
    public void setOriginProtocolPolicy(CharSequence originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy;
    }

    public DistributionCustomOriginConfig withOriginProtocolPolicy(CharSequence originProtocolPolicy) {
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
        if ((other instanceof DistributionCustomOriginConfig) == false) {
            return false;
        }
        DistributionCustomOriginConfig rhs = ((DistributionCustomOriginConfig) other);
        return new EqualsBuilder().append(originKeepaliveTimeout, rhs.originKeepaliveTimeout).append(hTTPPort, rhs.hTTPPort).append(originProtocolPolicy, rhs.originProtocolPolicy).append(originReadTimeout, rhs.originReadTimeout).append(hTTPSPort, rhs.hTTPSPort).append(originSSLProtocols, rhs.originSSLProtocols).isEquals();
    }

}
