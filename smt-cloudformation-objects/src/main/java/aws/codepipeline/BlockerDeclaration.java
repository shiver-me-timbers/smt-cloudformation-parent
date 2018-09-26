
package aws.codepipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * BlockerDeclaration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "Type"
})
public class BlockerDeclaration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html#cfn-codepipeline-pipeline-stages-blockers-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html#cfn-codepipeline-pipeline-stages-blockers-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html#cfn-codepipeline-pipeline-stages-blockers-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html#cfn-codepipeline-pipeline-stages-blockers-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html#cfn-codepipeline-pipeline-stages-blockers-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html#cfn-codepipeline-pipeline-stages-blockers-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public BlockerDeclaration withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html#cfn-codepipeline-pipeline-stages-blockers-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html#cfn-codepipeline-pipeline-stages-blockers-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public BlockerDeclaration withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BlockerDeclaration) == false) {
            return false;
        }
        BlockerDeclaration rhs = ((BlockerDeclaration) other);
        return new EqualsBuilder().append(name, rhs.name).append(type, rhs.type).isEquals();
    }

}
