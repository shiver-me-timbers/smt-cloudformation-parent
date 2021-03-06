
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
 * JobDefinitionNodeRangeProperty
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Container",
    "TargetNodes"
})
public class JobDefinitionNodeRangeProperty implements Property<JobDefinitionNodeRangeProperty>
{

    /**
     * JobDefinitionContainerProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
     * 
     */
    @JsonProperty("Container")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html")
    private Property<JobDefinitionContainerProperties> container;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html#cfn-batch-jobdefinition-noderangeproperty-targetnodes
     * 
     */
    @JsonProperty("TargetNodes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html#cfn-batch-jobdefinition-noderangeproperty-targetnodes")
    private CharSequence targetNodes;

    /**
     * JobDefinitionContainerProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
     * 
     */
    @JsonIgnore
    public Property<JobDefinitionContainerProperties> getContainer() {
        return container;
    }

    /**
     * JobDefinitionContainerProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
     * 
     */
    @JsonIgnore
    public void setContainer(Property<JobDefinitionContainerProperties> container) {
        this.container = container;
    }

    public JobDefinitionNodeRangeProperty withContainer(Property<JobDefinitionContainerProperties> container) {
        this.container = container;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html#cfn-batch-jobdefinition-noderangeproperty-targetnodes
     * 
     */
    @JsonIgnore
    public CharSequence getTargetNodes() {
        return targetNodes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html#cfn-batch-jobdefinition-noderangeproperty-targetnodes
     * 
     */
    @JsonIgnore
    public void setTargetNodes(CharSequence targetNodes) {
        this.targetNodes = targetNodes;
    }

    public JobDefinitionNodeRangeProperty withTargetNodes(CharSequence targetNodes) {
        this.targetNodes = targetNodes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("container", container).append("targetNodes", targetNodes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(container).append(targetNodes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobDefinitionNodeRangeProperty) == false) {
            return false;
        }
        JobDefinitionNodeRangeProperty rhs = ((JobDefinitionNodeRangeProperty) other);
        return new EqualsBuilder().append(container, rhs.container).append(targetNodes, rhs.targetNodes).isEquals();
    }

}
