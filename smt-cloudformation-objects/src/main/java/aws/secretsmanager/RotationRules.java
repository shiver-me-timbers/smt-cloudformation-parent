
package aws.secretsmanager;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RotationRules
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AutomaticallyAfterDays"
})
public class RotationRules implements Property<RotationRules>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-automaticallyafterdays
     * 
     */
    @JsonProperty("AutomaticallyAfterDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-automaticallyafterdays")
    private Integer automaticallyAfterDays;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-automaticallyafterdays
     * 
     */
    @JsonIgnore
    public Integer getAutomaticallyAfterDays() {
        return automaticallyAfterDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-automaticallyafterdays
     * 
     */
    @JsonIgnore
    public void setAutomaticallyAfterDays(Integer automaticallyAfterDays) {
        this.automaticallyAfterDays = automaticallyAfterDays;
    }

    public RotationRules withAutomaticallyAfterDays(Integer automaticallyAfterDays) {
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
        if ((other instanceof RotationRules) == false) {
            return false;
        }
        RotationRules rhs = ((RotationRules) other);
        return new EqualsBuilder().append(automaticallyAfterDays, rhs.automaticallyAfterDays).isEquals();
    }

}
