
package shiver.me.timbers.aws.athena;

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
 * WorkGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Name",
    "Description",
    "Tags",
    "WorkGroupConfiguration",
    "WorkGroupConfigurationUpdates",
    "State",
    "RecursiveDeleteOption"
})
public class WorkGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-description")
    private CharSequence description;
    /**
     * WorkGroupTags
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-tags.html
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-tags.html")
    private Property<WorkGroupTags> tags;
    /**
     * WorkGroupWorkGroupConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html
     * 
     */
    @JsonProperty("WorkGroupConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html")
    private Property<WorkGroupWorkGroupConfiguration> workGroupConfiguration;
    /**
     * WorkGroupWorkGroupConfigurationUpdates
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html
     * 
     */
    @JsonProperty("WorkGroupConfigurationUpdates")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html")
    private Property<WorkGroupWorkGroupConfigurationUpdates> workGroupConfigurationUpdates;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-state
     * 
     */
    @JsonProperty("State")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-state")
    private CharSequence state;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-recursivedeleteoption
     * 
     */
    @JsonProperty("RecursiveDeleteOption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-recursivedeleteoption")
    private CharSequence recursiveDeleteOption;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public WorkGroup withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public WorkGroup withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * WorkGroupTags
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-tags.html
     * 
     */
    @JsonIgnore
    public Property<WorkGroupTags> getTags() {
        return tags;
    }

    /**
     * WorkGroupTags
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-tags.html
     * 
     */
    @JsonIgnore
    public void setTags(Property<WorkGroupTags> tags) {
        this.tags = tags;
    }

    public WorkGroup withTags(Property<WorkGroupTags> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * WorkGroupWorkGroupConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<WorkGroupWorkGroupConfiguration> getWorkGroupConfiguration() {
        return workGroupConfiguration;
    }

    /**
     * WorkGroupWorkGroupConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html
     * 
     */
    @JsonIgnore
    public void setWorkGroupConfiguration(Property<WorkGroupWorkGroupConfiguration> workGroupConfiguration) {
        this.workGroupConfiguration = workGroupConfiguration;
    }

    public WorkGroup withWorkGroupConfiguration(Property<WorkGroupWorkGroupConfiguration> workGroupConfiguration) {
        this.workGroupConfiguration = workGroupConfiguration;
        return this;
    }

    /**
     * WorkGroupWorkGroupConfigurationUpdates
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html
     * 
     */
    @JsonIgnore
    public Property<WorkGroupWorkGroupConfigurationUpdates> getWorkGroupConfigurationUpdates() {
        return workGroupConfigurationUpdates;
    }

    /**
     * WorkGroupWorkGroupConfigurationUpdates
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html
     * 
     */
    @JsonIgnore
    public void setWorkGroupConfigurationUpdates(Property<WorkGroupWorkGroupConfigurationUpdates> workGroupConfigurationUpdates) {
        this.workGroupConfigurationUpdates = workGroupConfigurationUpdates;
    }

    public WorkGroup withWorkGroupConfigurationUpdates(Property<WorkGroupWorkGroupConfigurationUpdates> workGroupConfigurationUpdates) {
        this.workGroupConfigurationUpdates = workGroupConfigurationUpdates;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-state
     * 
     */
    @JsonIgnore
    public CharSequence getState() {
        return state;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-state
     * 
     */
    @JsonIgnore
    public void setState(CharSequence state) {
        this.state = state;
    }

    public WorkGroup withState(CharSequence state) {
        this.state = state;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-recursivedeleteoption
     * 
     */
    @JsonIgnore
    public CharSequence getRecursiveDeleteOption() {
        return recursiveDeleteOption;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-recursivedeleteoption
     * 
     */
    @JsonIgnore
    public void setRecursiveDeleteOption(CharSequence recursiveDeleteOption) {
        this.recursiveDeleteOption = recursiveDeleteOption;
    }

    public WorkGroup withRecursiveDeleteOption(CharSequence recursiveDeleteOption) {
        this.recursiveDeleteOption = recursiveDeleteOption;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("description", description).append("tags", tags).append("workGroupConfiguration", workGroupConfiguration).append("workGroupConfigurationUpdates", workGroupConfigurationUpdates).append("state", state).append("recursiveDeleteOption", recursiveDeleteOption).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recursiveDeleteOption).append(name).append(workGroupConfiguration).append(description).append(state).append(workGroupConfigurationUpdates).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkGroup) == false) {
            return false;
        }
        WorkGroup rhs = ((WorkGroup) other);
        return new EqualsBuilder().append(recursiveDeleteOption, rhs.recursiveDeleteOption).append(name, rhs.name).append(workGroupConfiguration, rhs.workGroupConfiguration).append(description, rhs.description).append(state, rhs.state).append(workGroupConfigurationUpdates, rhs.workGroupConfigurationUpdates).append(tags, rhs.tags).isEquals();
    }

}
