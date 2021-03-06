
package shiver.me.timbers.aws.config;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ConfigurationRecorderRecordingGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AllSupported",
    "IncludeGlobalResourceTypes",
    "ResourceTypes"
})
public class ConfigurationRecorderRecordingGroup implements Property<ConfigurationRecorderRecordingGroup>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported
     * 
     */
    @JsonProperty("AllSupported")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported")
    private CharSequence allSupported;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes
     * 
     */
    @JsonProperty("IncludeGlobalResourceTypes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes")
    private CharSequence includeGlobalResourceTypes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-resourcetypes
     * 
     */
    @JsonProperty("ResourceTypes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-resourcetypes")
    private Set<CharSequence> resourceTypes = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported
     * 
     */
    @JsonIgnore
    public CharSequence getAllSupported() {
        return allSupported;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported
     * 
     */
    @JsonIgnore
    public void setAllSupported(CharSequence allSupported) {
        this.allSupported = allSupported;
    }

    public ConfigurationRecorderRecordingGroup withAllSupported(CharSequence allSupported) {
        this.allSupported = allSupported;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeGlobalResourceTypes() {
        return includeGlobalResourceTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes
     * 
     */
    @JsonIgnore
    public void setIncludeGlobalResourceTypes(CharSequence includeGlobalResourceTypes) {
        this.includeGlobalResourceTypes = includeGlobalResourceTypes;
    }

    public ConfigurationRecorderRecordingGroup withIncludeGlobalResourceTypes(CharSequence includeGlobalResourceTypes) {
        this.includeGlobalResourceTypes = includeGlobalResourceTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-resourcetypes
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-resourcetypes
     * 
     */
    @JsonIgnore
    public void setResourceTypes(Set<CharSequence> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public ConfigurationRecorderRecordingGroup withResourceTypes(Set<CharSequence> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allSupported", allSupported).append("includeGlobalResourceTypes", includeGlobalResourceTypes).append("resourceTypes", resourceTypes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceTypes).append(includeGlobalResourceTypes).append(allSupported).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationRecorderRecordingGroup) == false) {
            return false;
        }
        ConfigurationRecorderRecordingGroup rhs = ((ConfigurationRecorderRecordingGroup) other);
        return new EqualsBuilder().append(resourceTypes, rhs.resourceTypes).append(includeGlobalResourceTypes, rhs.includeGlobalResourceTypes).append(allSupported, rhs.allSupported).isEquals();
    }

}
