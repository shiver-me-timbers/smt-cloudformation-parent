
package shiver.me.timbers.aws.cognito;

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


/**
 * UserPoolIdentityProvider
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ProviderName",
    "UserPoolId",
    "AttributeMapping",
    "ProviderDetails",
    "ProviderType",
    "IdpIdentifiers"
})
public class UserPoolIdentityProvider {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providername
     * 
     */
    @JsonProperty("ProviderName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providername")
    private CharSequence providerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-userpoolid")
    private CharSequence userPoolId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-attributemapping
     * 
     */
    @JsonProperty("AttributeMapping")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-attributemapping")
    private Object attributeMapping;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providerdetails
     * 
     */
    @JsonProperty("ProviderDetails")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providerdetails")
    private Object providerDetails;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providertype
     * 
     */
    @JsonProperty("ProviderType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providertype")
    private CharSequence providerType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers
     * 
     */
    @JsonProperty("IdpIdentifiers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers")
    private List<CharSequence> idpIdentifiers = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providername
     * 
     */
    @JsonIgnore
    public CharSequence getProviderName() {
        return providerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providername
     * 
     */
    @JsonIgnore
    public void setProviderName(CharSequence providerName) {
        this.providerName = providerName;
    }

    public UserPoolIdentityProvider withProviderName(CharSequence providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-userpoolid
     * 
     */
    @JsonIgnore
    public CharSequence getUserPoolId() {
        return userPoolId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-userpoolid
     * 
     */
    @JsonIgnore
    public void setUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
    }

    public UserPoolIdentityProvider withUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-attributemapping
     * 
     */
    @JsonIgnore
    public Object getAttributeMapping() {
        return attributeMapping;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-attributemapping
     * 
     */
    @JsonIgnore
    public void setAttributeMapping(Object attributeMapping) {
        this.attributeMapping = attributeMapping;
    }

    public UserPoolIdentityProvider withAttributeMapping(Object attributeMapping) {
        this.attributeMapping = attributeMapping;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providerdetails
     * 
     */
    @JsonIgnore
    public Object getProviderDetails() {
        return providerDetails;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providerdetails
     * 
     */
    @JsonIgnore
    public void setProviderDetails(Object providerDetails) {
        this.providerDetails = providerDetails;
    }

    public UserPoolIdentityProvider withProviderDetails(Object providerDetails) {
        this.providerDetails = providerDetails;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providertype
     * 
     */
    @JsonIgnore
    public CharSequence getProviderType() {
        return providerType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providertype
     * 
     */
    @JsonIgnore
    public void setProviderType(CharSequence providerType) {
        this.providerType = providerType;
    }

    public UserPoolIdentityProvider withProviderType(CharSequence providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers
     * 
     */
    @JsonIgnore
    public List<CharSequence> getIdpIdentifiers() {
        return idpIdentifiers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers
     * 
     */
    @JsonIgnore
    public void setIdpIdentifiers(List<CharSequence> idpIdentifiers) {
        this.idpIdentifiers = idpIdentifiers;
    }

    public UserPoolIdentityProvider withIdpIdentifiers(List<CharSequence> idpIdentifiers) {
        this.idpIdentifiers = idpIdentifiers;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("providerName", providerName).append("userPoolId", userPoolId).append("attributeMapping", attributeMapping).append("providerDetails", providerDetails).append("providerType", providerType).append("idpIdentifiers", idpIdentifiers).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(idpIdentifiers).append(attributeMapping).append(providerDetails).append(userPoolId).append(providerName).append(providerType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolIdentityProvider) == false) {
            return false;
        }
        UserPoolIdentityProvider rhs = ((UserPoolIdentityProvider) other);
        return new EqualsBuilder().append(idpIdentifiers, rhs.idpIdentifiers).append(attributeMapping, rhs.attributeMapping).append(providerDetails, rhs.providerDetails).append(userPoolId, rhs.userPoolId).append(providerName, rhs.providerName).append(providerType, rhs.providerType).isEquals();
    }

}
