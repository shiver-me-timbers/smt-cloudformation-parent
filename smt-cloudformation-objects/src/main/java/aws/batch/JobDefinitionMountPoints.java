
package aws.batch;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * JobDefinitionMountPoints
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ReadOnly",
    "SourceVolume",
    "ContainerPath"
})
public class JobDefinitionMountPoints implements Property<JobDefinitionMountPoints>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly
     * 
     */
    @JsonProperty("ReadOnly")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly")
    private CharSequence readOnly;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-sourcevolume
     * 
     */
    @JsonProperty("SourceVolume")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-sourcevolume")
    private CharSequence sourceVolume;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-containerpath
     * 
     */
    @JsonProperty("ContainerPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-containerpath")
    private CharSequence containerPath;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly
     * 
     */
    @JsonIgnore
    public CharSequence getReadOnly() {
        return readOnly;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly
     * 
     */
    @JsonIgnore
    public void setReadOnly(CharSequence readOnly) {
        this.readOnly = readOnly;
    }

    public JobDefinitionMountPoints withReadOnly(CharSequence readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-sourcevolume
     * 
     */
    @JsonIgnore
    public CharSequence getSourceVolume() {
        return sourceVolume;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-sourcevolume
     * 
     */
    @JsonIgnore
    public void setSourceVolume(CharSequence sourceVolume) {
        this.sourceVolume = sourceVolume;
    }

    public JobDefinitionMountPoints withSourceVolume(CharSequence sourceVolume) {
        this.sourceVolume = sourceVolume;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-containerpath
     * 
     */
    @JsonIgnore
    public CharSequence getContainerPath() {
        return containerPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-containerpath
     * 
     */
    @JsonIgnore
    public void setContainerPath(CharSequence containerPath) {
        this.containerPath = containerPath;
    }

    public JobDefinitionMountPoints withContainerPath(CharSequence containerPath) {
        this.containerPath = containerPath;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("readOnly", readOnly).append("sourceVolume", sourceVolume).append("containerPath", containerPath).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(readOnly).append(containerPath).append(sourceVolume).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobDefinitionMountPoints) == false) {
            return false;
        }
        JobDefinitionMountPoints rhs = ((JobDefinitionMountPoints) other);
        return new EqualsBuilder().append(readOnly, rhs.readOnly).append(containerPath, rhs.containerPath).append(sourceVolume, rhs.sourceVolume).isEquals();
    }

}
