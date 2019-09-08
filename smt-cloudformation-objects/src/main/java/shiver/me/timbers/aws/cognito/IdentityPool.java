
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
import shiver.me.timbers.aws.Property;


/**
 * IdentityPool
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
     * IdentityPoolPushSync
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html
     * 
     */
    @JsonProperty("PushSync")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html")
    private Property<IdentityPoolPushSync> pushSync;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders
     * 
     */
    @JsonProperty("CognitoIdentityProviders")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders")
    private List<Property<IdentityPoolCognitoIdentityProvider>> cognitoIdentityProviders = new ArrayList<Property<IdentityPoolCognitoIdentityProvider>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents
     * 
     */
    @JsonProperty("CognitoEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents")
    private Object cognitoEvents;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername
     * 
     */
    @JsonProperty("DeveloperProviderName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername")
    private CharSequence developerProviderName;
    /**
     * IdentityPoolCognitoStreams
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html
     * 
     */
    @JsonProperty("CognitoStreams")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html")
    private Property<IdentityPoolCognitoStreams> cognitoStreams;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-identitypoolname
     * 
     */
    @JsonProperty("IdentityPoolName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-identitypoolname")
    private CharSequence identityPoolName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities
     * 
     */
    @JsonProperty("AllowUnauthenticatedIdentities")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities")
    private CharSequence allowUnauthenticatedIdentities;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders
     * 
     */
    @JsonProperty("SupportedLoginProviders")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders")
    private Object supportedLoginProviders;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns
     * 
     */
    @JsonProperty("SamlProviderARNs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns")
    private List<CharSequence> samlProviderARNs = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns
     * 
     */
    @JsonProperty("OpenIdConnectProviderARNs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns")
    private List<CharSequence> openIdConnectProviderARNs = new ArrayList<CharSequence>();

    /**
     * IdentityPoolPushSync
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html
     * 
     */
    @JsonIgnore
    public Property<IdentityPoolPushSync> getPushSync() {
        return pushSync;
    }

    /**
     * IdentityPoolPushSync
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html
     * 
     */
    @JsonIgnore
    public void setPushSync(Property<IdentityPoolPushSync> pushSync) {
        this.pushSync = pushSync;
    }

    public IdentityPool withPushSync(Property<IdentityPoolPushSync> pushSync) {
        this.pushSync = pushSync;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders
     * 
     */
    @JsonIgnore
    public List<Property<IdentityPoolCognitoIdentityProvider>> getCognitoIdentityProviders() {
        return cognitoIdentityProviders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders
     * 
     */
    @JsonIgnore
    public void setCognitoIdentityProviders(List<Property<IdentityPoolCognitoIdentityProvider>> cognitoIdentityProviders) {
        this.cognitoIdentityProviders = cognitoIdentityProviders;
    }

    public IdentityPool withCognitoIdentityProviders(List<Property<IdentityPoolCognitoIdentityProvider>> cognitoIdentityProviders) {
        this.cognitoIdentityProviders = cognitoIdentityProviders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents
     * 
     */
    @JsonIgnore
    public Object getCognitoEvents() {
        return cognitoEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents
     * 
     */
    @JsonIgnore
    public void setCognitoEvents(Object cognitoEvents) {
        this.cognitoEvents = cognitoEvents;
    }

    public IdentityPool withCognitoEvents(Object cognitoEvents) {
        this.cognitoEvents = cognitoEvents;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername
     * 
     */
    @JsonIgnore
    public CharSequence getDeveloperProviderName() {
        return developerProviderName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername
     * 
     */
    @JsonIgnore
    public void setDeveloperProviderName(CharSequence developerProviderName) {
        this.developerProviderName = developerProviderName;
    }

    public IdentityPool withDeveloperProviderName(CharSequence developerProviderName) {
        this.developerProviderName = developerProviderName;
        return this;
    }

    /**
     * IdentityPoolCognitoStreams
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html
     * 
     */
    @JsonIgnore
    public Property<IdentityPoolCognitoStreams> getCognitoStreams() {
        return cognitoStreams;
    }

    /**
     * IdentityPoolCognitoStreams
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html
     * 
     */
    @JsonIgnore
    public void setCognitoStreams(Property<IdentityPoolCognitoStreams> cognitoStreams) {
        this.cognitoStreams = cognitoStreams;
    }

    public IdentityPool withCognitoStreams(Property<IdentityPoolCognitoStreams> cognitoStreams) {
        this.cognitoStreams = cognitoStreams;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-identitypoolname
     * 
     */
    @JsonIgnore
    public CharSequence getIdentityPoolName() {
        return identityPoolName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-identitypoolname
     * 
     */
    @JsonIgnore
    public void setIdentityPoolName(CharSequence identityPoolName) {
        this.identityPoolName = identityPoolName;
    }

    public IdentityPool withIdentityPoolName(CharSequence identityPoolName) {
        this.identityPoolName = identityPoolName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities
     * 
     */
    @JsonIgnore
    public CharSequence getAllowUnauthenticatedIdentities() {
        return allowUnauthenticatedIdentities;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities
     * 
     */
    @JsonIgnore
    public void setAllowUnauthenticatedIdentities(CharSequence allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
    }

    public IdentityPool withAllowUnauthenticatedIdentities(CharSequence allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders
     * 
     */
    @JsonIgnore
    public Object getSupportedLoginProviders() {
        return supportedLoginProviders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders
     * 
     */
    @JsonIgnore
    public void setSupportedLoginProviders(Object supportedLoginProviders) {
        this.supportedLoginProviders = supportedLoginProviders;
    }

    public IdentityPool withSupportedLoginProviders(Object supportedLoginProviders) {
        this.supportedLoginProviders = supportedLoginProviders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSamlProviderARNs() {
        return samlProviderARNs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns
     * 
     */
    @JsonIgnore
    public void setSamlProviderARNs(List<CharSequence> samlProviderARNs) {
        this.samlProviderARNs = samlProviderARNs;
    }

    public IdentityPool withSamlProviderARNs(List<CharSequence> samlProviderARNs) {
        this.samlProviderARNs = samlProviderARNs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns
     * 
     */
    @JsonIgnore
    public List<CharSequence> getOpenIdConnectProviderARNs() {
        return openIdConnectProviderARNs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns
     * 
     */
    @JsonIgnore
    public void setOpenIdConnectProviderARNs(List<CharSequence> openIdConnectProviderARNs) {
        this.openIdConnectProviderARNs = openIdConnectProviderARNs;
    }

    public IdentityPool withOpenIdConnectProviderARNs(List<CharSequence> openIdConnectProviderARNs) {
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
