
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VolumeFrom
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ReadOnly",
    "SourceContainer"
})
public class VolumeFrom {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-readonly
     * 
     */
    @JsonProperty("ReadOnly")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-readonly")
    private Boolean readOnly;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-sourcecontainer
     * 
     */
    @JsonProperty("SourceContainer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-sourcecontainer")
    private CharSequence sourceContainer;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-readonly
     * 
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-readonly
     * 
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public VolumeFrom withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-sourcecontainer
     * 
     */
    public CharSequence getSourceContainer() {
        return sourceContainer;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-sourcecontainer
     * 
     */
    public void setSourceContainer(CharSequence sourceContainer) {
        this.sourceContainer = sourceContainer;
    }

    public VolumeFrom withSourceContainer(CharSequence sourceContainer) {
        this.sourceContainer = sourceContainer;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("readOnly", readOnly).append("sourceContainer", sourceContainer).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sourceContainer).append(readOnly).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VolumeFrom) == false) {
            return false;
        }
        VolumeFrom rhs = ((VolumeFrom) other);
        return new EqualsBuilder().append(sourceContainer, rhs.sourceContainer).append(readOnly, rhs.readOnly).isEquals();
    }

}
