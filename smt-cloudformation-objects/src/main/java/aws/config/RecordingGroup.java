
package aws.config;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RecordingGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllSupported",
    "IncludeGlobalResourceTypes",
    "ResourceTypes"
})
public class RecordingGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported
     * 
     */
    @JsonProperty("AllSupported")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported")
    private Boolean allSupported;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes
     * 
     */
    @JsonProperty("IncludeGlobalResourceTypes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes")
    private Boolean includeGlobalResourceTypes;
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
    public Boolean getAllSupported() {
        return allSupported;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported
     * 
     */
    public void setAllSupported(Boolean allSupported) {
        this.allSupported = allSupported;
    }

    public RecordingGroup withAllSupported(Boolean allSupported) {
        this.allSupported = allSupported;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes
     * 
     */
    public Boolean getIncludeGlobalResourceTypes() {
        return includeGlobalResourceTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes
     * 
     */
    public void setIncludeGlobalResourceTypes(Boolean includeGlobalResourceTypes) {
        this.includeGlobalResourceTypes = includeGlobalResourceTypes;
    }

    public RecordingGroup withIncludeGlobalResourceTypes(Boolean includeGlobalResourceTypes) {
        this.includeGlobalResourceTypes = includeGlobalResourceTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-resourcetypes
     * 
     */
    public Set<CharSequence> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-resourcetypes
     * 
     */
    public void setResourceTypes(Set<CharSequence> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public RecordingGroup withResourceTypes(Set<CharSequence> resourceTypes) {
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
        if ((other instanceof RecordingGroup) == false) {
            return false;
        }
        RecordingGroup rhs = ((RecordingGroup) other);
        return new EqualsBuilder().append(resourceTypes, rhs.resourceTypes).append(includeGlobalResourceTypes, rhs.includeGlobalResourceTypes).append(allSupported, rhs.allSupported).isEquals();
    }

}
