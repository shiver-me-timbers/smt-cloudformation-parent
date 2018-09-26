
package aws.batch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MountPoints
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ReadOnly",
    "SourceVolume",
    "ContainerPath"
})
public class MountPoints {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly
     * 
     */
    @JsonProperty("ReadOnly")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly")
    private Boolean readOnly;
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
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly
     * 
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public MountPoints withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-sourcevolume
     * 
     */
    public CharSequence getSourceVolume() {
        return sourceVolume;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-sourcevolume
     * 
     */
    public void setSourceVolume(CharSequence sourceVolume) {
        this.sourceVolume = sourceVolume;
    }

    public MountPoints withSourceVolume(CharSequence sourceVolume) {
        this.sourceVolume = sourceVolume;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-containerpath
     * 
     */
    public CharSequence getContainerPath() {
        return containerPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-containerpath
     * 
     */
    public void setContainerPath(CharSequence containerPath) {
        this.containerPath = containerPath;
    }

    public MountPoints withContainerPath(CharSequence containerPath) {
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
        if ((other instanceof MountPoints) == false) {
            return false;
        }
        MountPoints rhs = ((MountPoints) other);
        return new EqualsBuilder().append(readOnly, rhs.readOnly).append(containerPath, rhs.containerPath).append(sourceVolume, rhs.sourceVolume).isEquals();
    }

}
