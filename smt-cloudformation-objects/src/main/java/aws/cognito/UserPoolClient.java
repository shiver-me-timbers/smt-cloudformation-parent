
package aws.cognito;

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
 * UserPoolClient
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "GenerateSecret",
    "ClientName",
    "UserPoolId",
    "ExplicitAuthFlows",
    "RefreshTokenValidity",
    "ReadAttributes",
    "WriteAttributes"
})
public class UserPoolClient {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret
     * 
     */
    @JsonProperty("GenerateSecret")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret")
    private Boolean generateSecret;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname
     * 
     */
    @JsonProperty("ClientName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname")
    private CharSequence clientName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid")
    private CharSequence userPoolId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows
     * 
     */
    @JsonProperty("ExplicitAuthFlows")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows")
    private List<CharSequence> explicitAuthFlows = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity
     * 
     */
    @JsonProperty("RefreshTokenValidity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity")
    private Double refreshTokenValidity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes
     * 
     */
    @JsonProperty("ReadAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes")
    private List<CharSequence> readAttributes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes
     * 
     */
    @JsonProperty("WriteAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes")
    private List<CharSequence> writeAttributes = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret
     * 
     */
    public Boolean getGenerateSecret() {
        return generateSecret;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret
     * 
     */
    public void setGenerateSecret(Boolean generateSecret) {
        this.generateSecret = generateSecret;
    }

    public UserPoolClient withGenerateSecret(Boolean generateSecret) {
        this.generateSecret = generateSecret;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname
     * 
     */
    public CharSequence getClientName() {
        return clientName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname
     * 
     */
    public void setClientName(CharSequence clientName) {
        this.clientName = clientName;
    }

    public UserPoolClient withClientName(CharSequence clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid
     * 
     */
    public CharSequence getUserPoolId() {
        return userPoolId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid
     * 
     */
    public void setUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
    }

    public UserPoolClient withUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows
     * 
     */
    public List<CharSequence> getExplicitAuthFlows() {
        return explicitAuthFlows;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows
     * 
     */
    public void setExplicitAuthFlows(List<CharSequence> explicitAuthFlows) {
        this.explicitAuthFlows = explicitAuthFlows;
    }

    public UserPoolClient withExplicitAuthFlows(List<CharSequence> explicitAuthFlows) {
        this.explicitAuthFlows = explicitAuthFlows;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity
     * 
     */
    public Double getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity
     * 
     */
    public void setRefreshTokenValidity(Double refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public UserPoolClient withRefreshTokenValidity(Double refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes
     * 
     */
    public List<CharSequence> getReadAttributes() {
        return readAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes
     * 
     */
    public void setReadAttributes(List<CharSequence> readAttributes) {
        this.readAttributes = readAttributes;
    }

    public UserPoolClient withReadAttributes(List<CharSequence> readAttributes) {
        this.readAttributes = readAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes
     * 
     */
    public List<CharSequence> getWriteAttributes() {
        return writeAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes
     * 
     */
    public void setWriteAttributes(List<CharSequence> writeAttributes) {
        this.writeAttributes = writeAttributes;
    }

    public UserPoolClient withWriteAttributes(List<CharSequence> writeAttributes) {
        this.writeAttributes = writeAttributes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("generateSecret", generateSecret).append("clientName", clientName).append("userPoolId", userPoolId).append("explicitAuthFlows", explicitAuthFlows).append("refreshTokenValidity", refreshTokenValidity).append("readAttributes", readAttributes).append("writeAttributes", writeAttributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(explicitAuthFlows).append(clientName).append(refreshTokenValidity).append(readAttributes).append(generateSecret).append(userPoolId).append(writeAttributes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolClient) == false) {
            return false;
        }
        UserPoolClient rhs = ((UserPoolClient) other);
        return new EqualsBuilder().append(explicitAuthFlows, rhs.explicitAuthFlows).append(clientName, rhs.clientName).append(refreshTokenValidity, rhs.refreshTokenValidity).append(readAttributes, rhs.readAttributes).append(generateSecret, rhs.generateSecret).append(userPoolId, rhs.userPoolId).append(writeAttributes, rhs.writeAttributes).isEquals();
    }

}
