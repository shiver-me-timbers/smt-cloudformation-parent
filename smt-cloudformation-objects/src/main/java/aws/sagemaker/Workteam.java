
package aws.sagemaker;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Workteam
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "NotificationConfiguration",
    "WorkteamName",
    "MemberDefinitions",
    "Tags"
})
public class Workteam {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-description")
    private CharSequence description;
    /**
     * WorkteamNotificationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html
     * 
     */
    @JsonProperty("NotificationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html")
    private Property<WorkteamNotificationConfiguration> notificationConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workteamname
     * 
     */
    @JsonProperty("WorkteamName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workteamname")
    private CharSequence workteamName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions
     * 
     */
    @JsonProperty("MemberDefinitions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions")
    private List<Property<WorkteamMemberDefinition>> memberDefinitions = new ArrayList<Property<WorkteamMemberDefinition>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Workteam withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * WorkteamNotificationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<WorkteamNotificationConfiguration> getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * WorkteamNotificationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setNotificationConfiguration(Property<WorkteamNotificationConfiguration> notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    public Workteam withNotificationConfiguration(Property<WorkteamNotificationConfiguration> notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workteamname
     * 
     */
    @JsonIgnore
    public CharSequence getWorkteamName() {
        return workteamName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workteamname
     * 
     */
    @JsonIgnore
    public void setWorkteamName(CharSequence workteamName) {
        this.workteamName = workteamName;
    }

    public Workteam withWorkteamName(CharSequence workteamName) {
        this.workteamName = workteamName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions
     * 
     */
    @JsonIgnore
    public List<Property<WorkteamMemberDefinition>> getMemberDefinitions() {
        return memberDefinitions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions
     * 
     */
    @JsonIgnore
    public void setMemberDefinitions(List<Property<WorkteamMemberDefinition>> memberDefinitions) {
        this.memberDefinitions = memberDefinitions;
    }

    public Workteam withMemberDefinitions(List<Property<WorkteamMemberDefinition>> memberDefinitions) {
        this.memberDefinitions = memberDefinitions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Workteam withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("notificationConfiguration", notificationConfiguration).append("workteamName", workteamName).append("memberDefinitions", memberDefinitions).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(memberDefinitions).append(workteamName).append(notificationConfiguration).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Workteam) == false) {
            return false;
        }
        Workteam rhs = ((Workteam) other);
        return new EqualsBuilder().append(description, rhs.description).append(memberDefinitions, rhs.memberDefinitions).append(workteamName, rhs.workteamName).append(notificationConfiguration, rhs.notificationConfiguration).append(tags, rhs.tags).isEquals();
    }

}
