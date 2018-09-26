
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PlacementStrategy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Field",
    "Type"
})
public class PlacementStrategy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-field
     * 
     */
    @JsonProperty("Field")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-field")
    private CharSequence field;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-field
     * 
     */
    public CharSequence getField() {
        return field;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-field
     * 
     */
    public void setField(CharSequence field) {
        this.field = field;
    }

    public PlacementStrategy withField(CharSequence field) {
        this.field = field;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public PlacementStrategy withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("field", field).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(field).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlacementStrategy) == false) {
            return false;
        }
        PlacementStrategy rhs = ((PlacementStrategy) other);
        return new EqualsBuilder().append(field, rhs.field).append(type, rhs.type).isEquals();
    }

}
