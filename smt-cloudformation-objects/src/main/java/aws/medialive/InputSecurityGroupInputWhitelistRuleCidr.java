
package aws.medialive;

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
 * InputSecurityGroupInputWhitelistRuleCidr
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-inputsecuritygroup-inputwhitelistrulecidr.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Cidr"
})
public class InputSecurityGroupInputWhitelistRuleCidr implements Property<InputSecurityGroupInputWhitelistRuleCidr>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-inputsecuritygroup-inputwhitelistrulecidr.html#cfn-medialive-inputsecuritygroup-inputwhitelistrulecidr-cidr
     * 
     */
    @JsonProperty("Cidr")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-inputsecuritygroup-inputwhitelistrulecidr.html#cfn-medialive-inputsecuritygroup-inputwhitelistrulecidr-cidr")
    private CharSequence cidr;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-inputsecuritygroup-inputwhitelistrulecidr.html#cfn-medialive-inputsecuritygroup-inputwhitelistrulecidr-cidr
     * 
     */
    @JsonIgnore
    public CharSequence getCidr() {
        return cidr;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-inputsecuritygroup-inputwhitelistrulecidr.html#cfn-medialive-inputsecuritygroup-inputwhitelistrulecidr-cidr
     * 
     */
    @JsonIgnore
    public void setCidr(CharSequence cidr) {
        this.cidr = cidr;
    }

    public InputSecurityGroupInputWhitelistRuleCidr withCidr(CharSequence cidr) {
        this.cidr = cidr;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cidr", cidr).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cidr).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InputSecurityGroupInputWhitelistRuleCidr) == false) {
            return false;
        }
        InputSecurityGroupInputWhitelistRuleCidr rhs = ((InputSecurityGroupInputWhitelistRuleCidr) other);
        return new EqualsBuilder().append(cidr, rhs.cidr).isEquals();
    }

}
