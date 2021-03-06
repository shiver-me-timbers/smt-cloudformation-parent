
package shiver.me.timbers.aws.secretsmanager;

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
 * RotationScheduleRotationRules
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AutomaticallyAfterDays"
})
public class RotationScheduleRotationRules implements Property<RotationScheduleRotationRules>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-automaticallyafterdays
     * 
     */
    @JsonProperty("AutomaticallyAfterDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-automaticallyafterdays")
    private Number automaticallyAfterDays;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-automaticallyafterdays
     * 
     */
    @JsonIgnore
    public Number getAutomaticallyAfterDays() {
        return automaticallyAfterDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-automaticallyafterdays
     * 
     */
    @JsonIgnore
    public void setAutomaticallyAfterDays(Number automaticallyAfterDays) {
        this.automaticallyAfterDays = automaticallyAfterDays;
    }

    public RotationScheduleRotationRules withAutomaticallyAfterDays(Number automaticallyAfterDays) {
        this.automaticallyAfterDays = automaticallyAfterDays;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("automaticallyAfterDays", automaticallyAfterDays).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(automaticallyAfterDays).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RotationScheduleRotationRules) == false) {
            return false;
        }
        RotationScheduleRotationRules rhs = ((RotationScheduleRotationRules) other);
        return new EqualsBuilder().append(automaticallyAfterDays, rhs.automaticallyAfterDays).isEquals();
    }

}
