
package shiver.me.timbers.aws.ecs;

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
 * TaskDefinitionHostVolumeProperties
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SourcePath"
})
public class TaskDefinitionHostVolumeProperties implements Property<TaskDefinitionHostVolumeProperties>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html#cfn-ecs-taskdefinition-volumes-host-sourcepath
     * 
     */
    @JsonProperty("SourcePath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html#cfn-ecs-taskdefinition-volumes-host-sourcepath")
    private CharSequence sourcePath;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html#cfn-ecs-taskdefinition-volumes-host-sourcepath
     * 
     */
    @JsonIgnore
    public CharSequence getSourcePath() {
        return sourcePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html#cfn-ecs-taskdefinition-volumes-host-sourcepath
     * 
     */
    @JsonIgnore
    public void setSourcePath(CharSequence sourcePath) {
        this.sourcePath = sourcePath;
    }

    public TaskDefinitionHostVolumeProperties withSourcePath(CharSequence sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sourcePath", sourcePath).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sourcePath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskDefinitionHostVolumeProperties) == false) {
            return false;
        }
        TaskDefinitionHostVolumeProperties rhs = ((TaskDefinitionHostVolumeProperties) other);
        return new EqualsBuilder().append(sourcePath, rhs.sourcePath).isEquals();
    }

}
