
package shiver.me.timbers.aws.batch;

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
 * JobDefinitionVolumesHost
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SourcePath"
})
public class JobDefinitionVolumesHost implements Property<JobDefinitionVolumesHost>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html#cfn-batch-jobdefinition-volumeshost-sourcepath
     * 
     */
    @JsonProperty("SourcePath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html#cfn-batch-jobdefinition-volumeshost-sourcepath")
    private CharSequence sourcePath;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html#cfn-batch-jobdefinition-volumeshost-sourcepath
     * 
     */
    @JsonIgnore
    public CharSequence getSourcePath() {
        return sourcePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html#cfn-batch-jobdefinition-volumeshost-sourcepath
     * 
     */
    @JsonIgnore
    public void setSourcePath(CharSequence sourcePath) {
        this.sourcePath = sourcePath;
    }

    public JobDefinitionVolumesHost withSourcePath(CharSequence sourcePath) {
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
        if ((other instanceof JobDefinitionVolumesHost) == false) {
            return false;
        }
        JobDefinitionVolumesHost rhs = ((JobDefinitionVolumesHost) other);
        return new EqualsBuilder().append(sourcePath, rhs.sourcePath).isEquals();
    }

}
