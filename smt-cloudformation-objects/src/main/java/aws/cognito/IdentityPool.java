
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
 * IdentityPool
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PushSync",
    "CognitoIdentityProviders",
    "CognitoEvents",
    "DeveloperProviderName",
    "CognitoStreams",
    "IdentityPoolName",
    "AllowUnauthenticatedIdentities",
    "SupportedLoginProviders",
    "SamlProviderARNs",
    "OpenIdConnectProviderARNs"
})
public class IdentityPool {

    /**
     * PushSync
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html
     * 
     */
    @JsonProperty("PushSync")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html")
    private PushSync pushSync;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders
     * 
     */
    @JsonProperty("CognitoIdentityProviders")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders")
    private List<CognitoIdentityProvider> cognitoIdentityProviders = new ArrayList<CognitoIdentityProvider>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents
     * 
     */
    @JsonProperty("CognitoEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents")
    private CognitoEvents cognitoEvents;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername
     * 
     */
    @JsonProperty("DeveloperProviderName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername")
    private String developerProviderName;
    /**
     * CognitoStreams
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html
     * 
     */
    @JsonProperty("CognitoStreams")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html")
    private CognitoStreams cognitoStreams;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-identitypoolname
     * 
     */
    @JsonProperty("IdentityPoolName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-identitypoolname")
    private String identityPoolName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities
     * 
     */
    @JsonProperty("AllowUnauthenticatedIdentities")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities")
    private Boolean allowUnauthenticatedIdentities;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders
     * 
     */
    @JsonProperty("SupportedLoginProviders")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders")
    private SupportedLoginProviders supportedLoginProviders;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns
     * 
     */
    @JsonProperty("SamlProviderARNs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns")
    private List<String> samlProviderARNs = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns
     * 
     */
    @JsonProperty("OpenIdConnectProviderARNs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns")
    private List<String> openIdConnectProviderARNs = new ArrayList<String>();

    /**
     * PushSync
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html
     * 
     */
    @JsonProperty("PushSync")
    public PushSync getPushSync() {
        return pushSync;
    }

    /**
     * PushSync
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html
     * 
     */
    @JsonProperty("PushSync")
    public void setPushSync(PushSync pushSync) {
        this.pushSync = pushSync;
    }

    public IdentityPool withPushSync(PushSync pushSync) {
        this.pushSync = pushSync;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders
     * 
     */
    @JsonProperty("CognitoIdentityProviders")
    public List<CognitoIdentityProvider> getCognitoIdentityProviders() {
        return cognitoIdentityProviders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders
     * 
     */
    @JsonProperty("CognitoIdentityProviders")
    public void setCognitoIdentityProviders(List<CognitoIdentityProvider> cognitoIdentityProviders) {
        this.cognitoIdentityProviders = cognitoIdentityProviders;
    }

    public IdentityPool withCognitoIdentityProviders(List<CognitoIdentityProvider> cognitoIdentityProviders) {
        this.cognitoIdentityProviders = cognitoIdentityProviders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents
     * 
     */
    @JsonProperty("CognitoEvents")
    public CognitoEvents getCognitoEvents() {
        return cognitoEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents
     * 
     */
    @JsonProperty("CognitoEvents")
    public void setCognitoEvents(CognitoEvents cognitoEvents) {
        this.cognitoEvents = cognitoEvents;
    }

    public IdentityPool withCognitoEvents(CognitoEvents cognitoEvents) {
        this.cognitoEvents = cognitoEvents;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername
     * 
     */
    @JsonProperty("DeveloperProviderName")
    public String getDeveloperProviderName() {
        return developerProviderName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername
     * 
     */
    @JsonProperty("DeveloperProviderName")
    public void setDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
    }

    public IdentityPool withDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
        return this;
    }

    /**
     * CognitoStreams
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html
     * 
     */
    @JsonProperty("CognitoStreams")
    public CognitoStreams getCognitoStreams() {
        return cognitoStreams;
    }

    /**
     * CognitoStreams
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html
     * 
     */
    @JsonProperty("CognitoStreams")
    public void setCognitoStreams(CognitoStreams cognitoStreams) {
        this.cognitoStreams = cognitoStreams;
    }

    public IdentityPool withCognitoStreams(CognitoStreams cognitoStreams) {
        this.cognitoStreams = cognitoStreams;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-identitypoolname
     * 
     */
    @JsonProperty("IdentityPoolName")
    public String getIdentityPoolName() {
        return identityPoolName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-identitypoolname
     * 
     */
    @JsonProperty("IdentityPoolName")
    public void setIdentityPoolName(String identityPoolName) {
        this.identityPoolName = identityPoolName;
    }

    public IdentityPool withIdentityPoolName(String identityPoolName) {
        this.identityPoolName = identityPoolName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities
     * 
     */
    @JsonProperty("AllowUnauthenticatedIdentities")
    public Boolean getAllowUnauthenticatedIdentities() {
        return allowUnauthenticatedIdentities;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities
     * 
     */
    @JsonProperty("AllowUnauthenticatedIdentities")
    public void setAllowUnauthenticatedIdentities(Boolean allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
    }

    public IdentityPool withAllowUnauthenticatedIdentities(Boolean allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders
     * 
     */
    @JsonProperty("SupportedLoginProviders")
    public SupportedLoginProviders getSupportedLoginProviders() {
        return supportedLoginProviders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders
     * 
     */
    @JsonProperty("SupportedLoginProviders")
    public void setSupportedLoginProviders(SupportedLoginProviders supportedLoginProviders) {
        this.supportedLoginProviders = supportedLoginProviders;
    }

    public IdentityPool withSupportedLoginProviders(SupportedLoginProviders supportedLoginProviders) {
        this.supportedLoginProviders = supportedLoginProviders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns
     * 
     */
    @JsonProperty("SamlProviderARNs")
    public List<String> getSamlProviderARNs() {
        return samlProviderARNs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns
     * 
     */
    @JsonProperty("SamlProviderARNs")
    public void setSamlProviderARNs(List<String> samlProviderARNs) {
        this.samlProviderARNs = samlProviderARNs;
    }

    public IdentityPool withSamlProviderARNs(List<String> samlProviderARNs) {
        this.samlProviderARNs = samlProviderARNs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns
     * 
     */
    @JsonProperty("OpenIdConnectProviderARNs")
    public List<String> getOpenIdConnectProviderARNs() {
        return openIdConnectProviderARNs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns
     * 
     */
    @JsonProperty("OpenIdConnectProviderARNs")
    public void setOpenIdConnectProviderARNs(List<String> openIdConnectProviderARNs) {
        this.openIdConnectProviderARNs = openIdConnectProviderARNs;
    }

    public IdentityPool withOpenIdConnectProviderARNs(List<String> openIdConnectProviderARNs) {
        this.openIdConnectProviderARNs = openIdConnectProviderARNs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pushSync", pushSync).append("cognitoIdentityProviders", cognitoIdentityProviders).append("cognitoEvents", cognitoEvents).append("developerProviderName", developerProviderName).append("cognitoStreams", cognitoStreams).append("identityPoolName", identityPoolName).append("allowUnauthenticatedIdentities", allowUnauthenticatedIdentities).append("supportedLoginProviders", supportedLoginProviders).append("samlProviderARNs", samlProviderARNs).append("openIdConnectProviderARNs", openIdConnectProviderARNs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(identityPoolName).append(openIdConnectProviderARNs).append(samlProviderARNs).append(cognitoEvents).append(allowUnauthenticatedIdentities).append(cognitoStreams).append(cognitoIdentityProviders).append(developerProviderName).append(supportedLoginProviders).append(pushSync).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdentityPool) == false) {
            return false;
        }
        IdentityPool rhs = ((IdentityPool) other);
        return new EqualsBuilder().append(identityPoolName, rhs.identityPoolName).append(openIdConnectProviderARNs, rhs.openIdConnectProviderARNs).append(samlProviderARNs, rhs.samlProviderARNs).append(cognitoEvents, rhs.cognitoEvents).append(allowUnauthenticatedIdentities, rhs.allowUnauthenticatedIdentities).append(cognitoStreams, rhs.cognitoStreams).append(cognitoIdentityProviders, rhs.cognitoIdentityProviders).append(developerProviderName, rhs.developerProviderName).append(supportedLoginProviders, rhs.supportedLoginProviders).append(pushSync, rhs.pushSync).isEquals();
    }

}