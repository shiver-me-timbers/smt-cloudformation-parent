
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
    private String clientName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid")
    private String userPoolId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows
     * 
     */
    @JsonProperty("ExplicitAuthFlows")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows")
    private List<String> explicitAuthFlows = new ArrayList<String>();
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
    private List<String> readAttributes = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes
     * 
     */
    @JsonProperty("WriteAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes")
    private List<String> writeAttributes = new ArrayList<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret
     * 
     */
    @JsonProperty("GenerateSecret")
    public Boolean getGenerateSecret() {
        return generateSecret;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret
     * 
     */
    @JsonProperty("GenerateSecret")
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
    @JsonProperty("ClientName")
    public String getClientName() {
        return clientName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname
     * 
     */
    @JsonProperty("ClientName")
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public UserPoolClient withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public UserPoolClient withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows
     * 
     */
    @JsonProperty("ExplicitAuthFlows")
    public List<String> getExplicitAuthFlows() {
        return explicitAuthFlows;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows
     * 
     */
    @JsonProperty("ExplicitAuthFlows")
    public void setExplicitAuthFlows(List<String> explicitAuthFlows) {
        this.explicitAuthFlows = explicitAuthFlows;
    }

    public UserPoolClient withExplicitAuthFlows(List<String> explicitAuthFlows) {
        this.explicitAuthFlows = explicitAuthFlows;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity
     * 
     */
    @JsonProperty("RefreshTokenValidity")
    public Double getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity
     * 
     */
    @JsonProperty("RefreshTokenValidity")
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
    @JsonProperty("ReadAttributes")
    public List<String> getReadAttributes() {
        return readAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes
     * 
     */
    @JsonProperty("ReadAttributes")
    public void setReadAttributes(List<String> readAttributes) {
        this.readAttributes = readAttributes;
    }

    public UserPoolClient withReadAttributes(List<String> readAttributes) {
        this.readAttributes = readAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes
     * 
     */
    @JsonProperty("WriteAttributes")
    public List<String> getWriteAttributes() {
        return writeAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes
     * 
     */
    @JsonProperty("WriteAttributes")
    public void setWriteAttributes(List<String> writeAttributes) {
        this.writeAttributes = writeAttributes;
    }

    public UserPoolClient withWriteAttributes(List<String> writeAttributes) {
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
