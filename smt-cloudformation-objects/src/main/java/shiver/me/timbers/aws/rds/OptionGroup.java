
package shiver.me.timbers.aws.rds;

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
 * OptionGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EngineName",
    "MajorEngineVersion",
    "OptionConfigurations",
    "OptionGroupDescription",
    "Tags"
})
public class OptionGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-enginename
     * 
     */
    @JsonProperty("EngineName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-enginename")
    private CharSequence engineName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-majorengineversion
     * 
     */
    @JsonProperty("MajorEngineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-majorengineversion")
    private CharSequence majorEngineVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations
     * 
     */
    @JsonProperty("OptionConfigurations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations")
    private List<Property<OptionGroupOptionConfiguration>> optionConfigurations = new ArrayList<Property<OptionGroupOptionConfiguration>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupdescription
     * 
     */
    @JsonProperty("OptionGroupDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupdescription")
    private CharSequence optionGroupDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-enginename
     * 
     */
    @JsonIgnore
    public CharSequence getEngineName() {
        return engineName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-enginename
     * 
     */
    @JsonIgnore
    public void setEngineName(CharSequence engineName) {
        this.engineName = engineName;
    }

    public OptionGroup withEngineName(CharSequence engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-majorengineversion
     * 
     */
    @JsonIgnore
    public CharSequence getMajorEngineVersion() {
        return majorEngineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-majorengineversion
     * 
     */
    @JsonIgnore
    public void setMajorEngineVersion(CharSequence majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }

    public OptionGroup withMajorEngineVersion(CharSequence majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations
     * 
     */
    @JsonIgnore
    public List<Property<OptionGroupOptionConfiguration>> getOptionConfigurations() {
        return optionConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations
     * 
     */
    @JsonIgnore
    public void setOptionConfigurations(List<Property<OptionGroupOptionConfiguration>> optionConfigurations) {
        this.optionConfigurations = optionConfigurations;
    }

    public OptionGroup withOptionConfigurations(List<Property<OptionGroupOptionConfiguration>> optionConfigurations) {
        this.optionConfigurations = optionConfigurations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupdescription
     * 
     */
    @JsonIgnore
    public CharSequence getOptionGroupDescription() {
        return optionGroupDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupdescription
     * 
     */
    @JsonIgnore
    public void setOptionGroupDescription(CharSequence optionGroupDescription) {
        this.optionGroupDescription = optionGroupDescription;
    }

    public OptionGroup withOptionGroupDescription(CharSequence optionGroupDescription) {
        this.optionGroupDescription = optionGroupDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public OptionGroup withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("engineName", engineName).append("majorEngineVersion", majorEngineVersion).append("optionConfigurations", optionConfigurations).append("optionGroupDescription", optionGroupDescription).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(optionGroupDescription).append(majorEngineVersion).append(engineName).append(optionConfigurations).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OptionGroup) == false) {
            return false;
        }
        OptionGroup rhs = ((OptionGroup) other);
        return new EqualsBuilder().append(optionGroupDescription, rhs.optionGroupDescription).append(majorEngineVersion, rhs.majorEngineVersion).append(engineName, rhs.engineName).append(optionConfigurations, rhs.optionConfigurations).append(tags, rhs.tags).isEquals();
    }

}
