
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SslConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Certificate",
    "Chain",
    "PrivateKey"
})
public class SslConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-certificate
     * 
     */
    @JsonProperty("Certificate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-certificate")
    private String certificate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-chain
     * 
     */
    @JsonProperty("Chain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-chain")
    private String chain;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-privatekey
     * 
     */
    @JsonProperty("PrivateKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-privatekey")
    private String privateKey;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-certificate
     * 
     */
    @JsonProperty("Certificate")
    public String getCertificate() {
        return certificate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-certificate
     * 
     */
    @JsonProperty("Certificate")
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public SslConfiguration withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-chain
     * 
     */
    @JsonProperty("Chain")
    public String getChain() {
        return chain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-chain
     * 
     */
    @JsonProperty("Chain")
    public void setChain(String chain) {
        this.chain = chain;
    }

    public SslConfiguration withChain(String chain) {
        this.chain = chain;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-privatekey
     * 
     */
    @JsonProperty("PrivateKey")
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-privatekey
     * 
     */
    @JsonProperty("PrivateKey")
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public SslConfiguration withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificate", certificate).append("chain", chain).append("privateKey", privateKey).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificate).append(privateKey).append(chain).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SslConfiguration) == false) {
            return false;
        }
        SslConfiguration rhs = ((SslConfiguration) other);
        return new EqualsBuilder().append(certificate, rhs.certificate).append(privateKey, rhs.privateKey).append(chain, rhs.chain).isEquals();
    }

}
