
package shiver.me.timbers.aws.appstream;

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
import shiver.me.timbers.aws.Tag;


/**
 * Stack
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "StorageConnectors",
    "DeleteStorageConnectors",
    "EmbedHostDomains",
    "UserSettings",
    "AttributesToDelete",
    "RedirectURL",
    "Name",
    "FeedbackURL",
    "ApplicationSettings",
    "DisplayName",
    "Tags",
    "AccessEndpoints"
})
public class Stack {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors
     * 
     */
    @JsonProperty("StorageConnectors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors")
    private List<Property<StackStorageConnector>> storageConnectors = new ArrayList<Property<StackStorageConnector>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-deletestorageconnectors
     * 
     */
    @JsonProperty("DeleteStorageConnectors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-deletestorageconnectors")
    private CharSequence deleteStorageConnectors;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-embedhostdomains
     * 
     */
    @JsonProperty("EmbedHostDomains")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-embedhostdomains")
    private List<CharSequence> embedHostDomains = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings
     * 
     */
    @JsonProperty("UserSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings")
    private List<Property<StackUserSetting>> userSettings = new ArrayList<Property<StackUserSetting>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-attributestodelete
     * 
     */
    @JsonProperty("AttributesToDelete")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-attributestodelete")
    private List<CharSequence> attributesToDelete = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-redirecturl
     * 
     */
    @JsonProperty("RedirectURL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-redirecturl")
    private CharSequence redirectURL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-feedbackurl
     * 
     */
    @JsonProperty("FeedbackURL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-feedbackurl")
    private CharSequence feedbackURL;
    /**
     * StackApplicationSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-applicationsettings.html
     * 
     */
    @JsonProperty("ApplicationSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-applicationsettings.html")
    private Property<StackApplicationSettings> applicationSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-displayname
     * 
     */
    @JsonProperty("DisplayName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-displayname")
    private CharSequence displayName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints
     * 
     */
    @JsonProperty("AccessEndpoints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints")
    private List<Property<StackAccessEndpoint>> accessEndpoints = new ArrayList<Property<StackAccessEndpoint>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Stack withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors
     * 
     */
    @JsonIgnore
    public List<Property<StackStorageConnector>> getStorageConnectors() {
        return storageConnectors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors
     * 
     */
    @JsonIgnore
    public void setStorageConnectors(List<Property<StackStorageConnector>> storageConnectors) {
        this.storageConnectors = storageConnectors;
    }

    public Stack withStorageConnectors(List<Property<StackStorageConnector>> storageConnectors) {
        this.storageConnectors = storageConnectors;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-deletestorageconnectors
     * 
     */
    @JsonIgnore
    public CharSequence getDeleteStorageConnectors() {
        return deleteStorageConnectors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-deletestorageconnectors
     * 
     */
    @JsonIgnore
    public void setDeleteStorageConnectors(CharSequence deleteStorageConnectors) {
        this.deleteStorageConnectors = deleteStorageConnectors;
    }

    public Stack withDeleteStorageConnectors(CharSequence deleteStorageConnectors) {
        this.deleteStorageConnectors = deleteStorageConnectors;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-embedhostdomains
     * 
     */
    @JsonIgnore
    public List<CharSequence> getEmbedHostDomains() {
        return embedHostDomains;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-embedhostdomains
     * 
     */
    @JsonIgnore
    public void setEmbedHostDomains(List<CharSequence> embedHostDomains) {
        this.embedHostDomains = embedHostDomains;
    }

    public Stack withEmbedHostDomains(List<CharSequence> embedHostDomains) {
        this.embedHostDomains = embedHostDomains;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings
     * 
     */
    @JsonIgnore
    public List<Property<StackUserSetting>> getUserSettings() {
        return userSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings
     * 
     */
    @JsonIgnore
    public void setUserSettings(List<Property<StackUserSetting>> userSettings) {
        this.userSettings = userSettings;
    }

    public Stack withUserSettings(List<Property<StackUserSetting>> userSettings) {
        this.userSettings = userSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-attributestodelete
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAttributesToDelete() {
        return attributesToDelete;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-attributestodelete
     * 
     */
    @JsonIgnore
    public void setAttributesToDelete(List<CharSequence> attributesToDelete) {
        this.attributesToDelete = attributesToDelete;
    }

    public Stack withAttributesToDelete(List<CharSequence> attributesToDelete) {
        this.attributesToDelete = attributesToDelete;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-redirecturl
     * 
     */
    @JsonIgnore
    public CharSequence getRedirectURL() {
        return redirectURL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-redirecturl
     * 
     */
    @JsonIgnore
    public void setRedirectURL(CharSequence redirectURL) {
        this.redirectURL = redirectURL;
    }

    public Stack withRedirectURL(CharSequence redirectURL) {
        this.redirectURL = redirectURL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Stack withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-feedbackurl
     * 
     */
    @JsonIgnore
    public CharSequence getFeedbackURL() {
        return feedbackURL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-feedbackurl
     * 
     */
    @JsonIgnore
    public void setFeedbackURL(CharSequence feedbackURL) {
        this.feedbackURL = feedbackURL;
    }

    public Stack withFeedbackURL(CharSequence feedbackURL) {
        this.feedbackURL = feedbackURL;
        return this;
    }

    /**
     * StackApplicationSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-applicationsettings.html
     * 
     */
    @JsonIgnore
    public Property<StackApplicationSettings> getApplicationSettings() {
        return applicationSettings;
    }

    /**
     * StackApplicationSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-applicationsettings.html
     * 
     */
    @JsonIgnore
    public void setApplicationSettings(Property<StackApplicationSettings> applicationSettings) {
        this.applicationSettings = applicationSettings;
    }

    public Stack withApplicationSettings(Property<StackApplicationSettings> applicationSettings) {
        this.applicationSettings = applicationSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-displayname
     * 
     */
    @JsonIgnore
    public CharSequence getDisplayName() {
        return displayName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-displayname
     * 
     */
    @JsonIgnore
    public void setDisplayName(CharSequence displayName) {
        this.displayName = displayName;
    }

    public Stack withDisplayName(CharSequence displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Stack withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints
     * 
     */
    @JsonIgnore
    public List<Property<StackAccessEndpoint>> getAccessEndpoints() {
        return accessEndpoints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints
     * 
     */
    @JsonIgnore
    public void setAccessEndpoints(List<Property<StackAccessEndpoint>> accessEndpoints) {
        this.accessEndpoints = accessEndpoints;
    }

    public Stack withAccessEndpoints(List<Property<StackAccessEndpoint>> accessEndpoints) {
        this.accessEndpoints = accessEndpoints;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("storageConnectors", storageConnectors).append("deleteStorageConnectors", deleteStorageConnectors).append("embedHostDomains", embedHostDomains).append("userSettings", userSettings).append("attributesToDelete", attributesToDelete).append("redirectURL", redirectURL).append("name", name).append("feedbackURL", feedbackURL).append("applicationSettings", applicationSettings).append("displayName", displayName).append("tags", tags).append("accessEndpoints", accessEndpoints).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(redirectURL).append(attributesToDelete).append(displayName).append(embedHostDomains).append(accessEndpoints).append(description).append(tags).append(feedbackURL).append(userSettings).append(name).append(applicationSettings).append(deleteStorageConnectors).append(storageConnectors).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stack) == false) {
            return false;
        }
        Stack rhs = ((Stack) other);
        return new EqualsBuilder().append(redirectURL, rhs.redirectURL).append(attributesToDelete, rhs.attributesToDelete).append(displayName, rhs.displayName).append(embedHostDomains, rhs.embedHostDomains).append(accessEndpoints, rhs.accessEndpoints).append(description, rhs.description).append(tags, rhs.tags).append(feedbackURL, rhs.feedbackURL).append(userSettings, rhs.userSettings).append(name, rhs.name).append(applicationSettings, rhs.applicationSettings).append(deleteStorageConnectors, rhs.deleteStorageConnectors).append(storageConnectors, rhs.storageConnectors).isEquals();
    }

}
