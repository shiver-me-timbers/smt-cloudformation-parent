
package aws.codepipeline;

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
 * StageDeclaration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Actions",
    "Blockers",
    "Name"
})
public class StageDeclaration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-actions
     * 
     */
    @JsonProperty("Actions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-actions")
    private Set<ActionDeclaration> actions = new LinkedHashSet<ActionDeclaration>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-blockers
     * 
     */
    @JsonProperty("Blockers")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-blockers")
    private Set<BlockerDeclaration> blockers = new LinkedHashSet<BlockerDeclaration>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-actions
     * 
     */
    public Set<ActionDeclaration> getActions() {
        return actions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-actions
     * 
     */
    public void setActions(Set<ActionDeclaration> actions) {
        this.actions = actions;
    }

    public StageDeclaration withActions(Set<ActionDeclaration> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-blockers
     * 
     */
    public Set<BlockerDeclaration> getBlockers() {
        return blockers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-blockers
     * 
     */
    public void setBlockers(Set<BlockerDeclaration> blockers) {
        this.blockers = blockers;
    }

    public StageDeclaration withBlockers(Set<BlockerDeclaration> blockers) {
        this.blockers = blockers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public StageDeclaration withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("actions", actions).append("blockers", blockers).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(blockers).append(actions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StageDeclaration) == false) {
            return false;
        }
        StageDeclaration rhs = ((StageDeclaration) other);
        return new EqualsBuilder().append(name, rhs.name).append(blockers, rhs.blockers).append(actions, rhs.actions).isEquals();
    }

}
