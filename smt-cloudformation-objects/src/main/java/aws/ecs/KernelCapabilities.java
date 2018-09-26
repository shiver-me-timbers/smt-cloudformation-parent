
package aws.ecs;

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
 * KernelCapabilities
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Add",
    "Drop"
})
public class KernelCapabilities {

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
    public Set<CharSequence> getAdd() {
        return add;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-add
     * 
     */
    public void setAdd(Set<CharSequence> add) {
        this.add = add;
    }

    public KernelCapabilities withAdd(Set<CharSequence> add) {
        this.add = add;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-drop
     * 
     */
    public Set<CharSequence> getDrop() {
        return drop;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-drop
     * 
     */
    public void setDrop(Set<CharSequence> drop) {
        this.drop = drop;
    }

    public KernelCapabilities withDrop(Set<CharSequence> drop) {
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
        if ((other instanceof KernelCapabilities) == false) {
            return false;
        }
        KernelCapabilities rhs = ((KernelCapabilities) other);
        return new EqualsBuilder().append(add, rhs.add).append(drop, rhs.drop).isEquals();
    }

}
