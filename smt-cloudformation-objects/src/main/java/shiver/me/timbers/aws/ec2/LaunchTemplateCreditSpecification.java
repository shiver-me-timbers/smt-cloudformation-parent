
package shiver.me.timbers.aws.ec2;

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
 * LaunchTemplateCreditSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CpuCredits"
})
public class LaunchTemplateCreditSpecification implements Property<LaunchTemplateCreditSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification-cpucredits
     * 
     */
    @JsonProperty("CpuCredits")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification-cpucredits")
    private CharSequence cpuCredits;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification-cpucredits
     * 
     */
    @JsonIgnore
    public CharSequence getCpuCredits() {
        return cpuCredits;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification-cpucredits
     * 
     */
    @JsonIgnore
    public void setCpuCredits(CharSequence cpuCredits) {
        this.cpuCredits = cpuCredits;
    }

    public LaunchTemplateCreditSpecification withCpuCredits(CharSequence cpuCredits) {
        this.cpuCredits = cpuCredits;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cpuCredits", cpuCredits).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cpuCredits).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchTemplateCreditSpecification) == false) {
            return false;
        }
        LaunchTemplateCreditSpecification rhs = ((LaunchTemplateCreditSpecification) other);
        return new EqualsBuilder().append(cpuCredits, rhs.cpuCredits).isEquals();
    }

}
