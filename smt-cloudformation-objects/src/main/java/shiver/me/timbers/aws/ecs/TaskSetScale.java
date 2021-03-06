
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
 * TaskSetScale
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Unit",
    "Value"
})
public class TaskSetScale implements Property<TaskSetScale>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html#cfn-ecs-taskset-scale-unit
     * 
     */
    @JsonProperty("Unit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html#cfn-ecs-taskset-scale-unit")
    private CharSequence unit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html#cfn-ecs-taskset-scale-value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html#cfn-ecs-taskset-scale-value")
    private Number value;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html#cfn-ecs-taskset-scale-unit
     * 
     */
    @JsonIgnore
    public CharSequence getUnit() {
        return unit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html#cfn-ecs-taskset-scale-unit
     * 
     */
    @JsonIgnore
    public void setUnit(CharSequence unit) {
        this.unit = unit;
    }

    public TaskSetScale withUnit(CharSequence unit) {
        this.unit = unit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html#cfn-ecs-taskset-scale-value
     * 
     */
    @JsonIgnore
    public Number getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html#cfn-ecs-taskset-scale-value
     * 
     */
    @JsonIgnore
    public void setValue(Number value) {
        this.value = value;
    }

    public TaskSetScale withValue(Number value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("unit", unit).append("value", value).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(unit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskSetScale) == false) {
            return false;
        }
        TaskSetScale rhs = ((TaskSetScale) other);
        return new EqualsBuilder().append(value, rhs.value).append(unit, rhs.unit).isEquals();
    }

}
