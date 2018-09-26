
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RedirectAllRequestsTo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "HostName",
    "Protocol"
})
public class RedirectAllRequestsTo {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-hostname
     * 
     */
    @JsonProperty("HostName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-hostname")
    private CharSequence hostName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-protocol")
    private CharSequence protocol;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-hostname
     * 
     */
    public CharSequence getHostName() {
        return hostName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-hostname
     * 
     */
    public void setHostName(CharSequence hostName) {
        this.hostName = hostName;
    }

    public RedirectAllRequestsTo withHostName(CharSequence hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-protocol
     * 
     */
    public CharSequence getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-protocol
     * 
     */
    public void setProtocol(CharSequence protocol) {
        this.protocol = protocol;
    }

    public RedirectAllRequestsTo withProtocol(CharSequence protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hostName", hostName).append("protocol", protocol).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hostName).append(protocol).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RedirectAllRequestsTo) == false) {
            return false;
        }
        RedirectAllRequestsTo rhs = ((RedirectAllRequestsTo) other);
        return new EqualsBuilder().append(hostName, rhs.hostName).append(protocol, rhs.protocol).isEquals();
    }

}
