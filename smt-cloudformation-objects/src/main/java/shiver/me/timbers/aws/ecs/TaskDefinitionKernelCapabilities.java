
package shiver.me.timbers.aws.ecs;

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
 * TaskDefinitionKernelCapabilities
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Add",
    "Drop"
})
public class TaskDefinitionKernelCapabilities implements Property<TaskDefinitionKernelCapabilities>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-add
     * 
     */
    @JsonProperty("Add")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-add")
    private Set<CharSequence> add = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-drop
     * 
     */
    @JsonProperty("Drop")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-drop")
    private Set<CharSequence> drop = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-add
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getAdd() {
        return add;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-add
     * 
     */
    @JsonIgnore
    public void setAdd(Set<CharSequence> add) {
        this.add = add;
    }

    public TaskDefinitionKernelCapabilities withAdd(Set<CharSequence> add) {
        this.add = add;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-drop
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getDrop() {
        return drop;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-drop
     * 
     */
    @JsonIgnore
    public void setDrop(Set<CharSequence> drop) {
        this.drop = drop;
    }

    public TaskDefinitionKernelCapabilities withDrop(Set<CharSequence> drop) {
        this.drop = drop;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("add", add).append("drop", drop).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(add).append(drop).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskDefinitionKernelCapabilities) == false) {
            return false;
        }
        TaskDefinitionKernelCapabilities rhs = ((TaskDefinitionKernelCapabilities) other);
        return new EqualsBuilder().append(add, rhs.add).append(drop, rhs.drop).isEquals();
    }

}
