
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CreditSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CPUCredits"
})
public class CreditSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html#cfn-ec2-instance-creditspecification-cpucredits
     * 
     */
    @JsonProperty("CPUCredits")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html#cfn-ec2-instance-creditspecification-cpucredits")
    private CharSequence cPUCredits;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html#cfn-ec2-instance-creditspecification-cpucredits
     * 
     */
    public CharSequence getCPUCredits() {
        return cPUCredits;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html#cfn-ec2-instance-creditspecification-cpucredits
     * 
     */
    public void setCPUCredits(CharSequence cPUCredits) {
        this.cPUCredits = cPUCredits;
    }

    public CreditSpecification withCPUCredits(CharSequence cPUCredits) {
        this.cPUCredits = cPUCredits;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cPUCredits", cPUCredits).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cPUCredits).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreditSpecification) == false) {
            return false;
        }
        CreditSpecification rhs = ((CreditSpecification) other);
        return new EqualsBuilder().append(cPUCredits, rhs.cPUCredits).isEquals();
    }

}
