
package shiver.me.timbers.aws.fms;

import java.util.ArrayList;
import java.util.List;
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
 * PolicyIEMap
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ACCOUNT",
    "ORGUNIT"
})
public class PolicyIEMap implements Property<PolicyIEMap>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html#cfn-fms-policy-iemap-account
     * 
     */
    @JsonProperty("ACCOUNT")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html#cfn-fms-policy-iemap-account")
    private List<CharSequence> aCCOUNT = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html#cfn-fms-policy-iemap-orgunit
     * 
     */
    @JsonProperty("ORGUNIT")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html#cfn-fms-policy-iemap-orgunit")
    private List<CharSequence> oRGUNIT = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html#cfn-fms-policy-iemap-account
     * 
     */
    @JsonIgnore
    public List<CharSequence> getACCOUNT() {
        return aCCOUNT;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html#cfn-fms-policy-iemap-account
     * 
     */
    @JsonIgnore
    public void setACCOUNT(List<CharSequence> aCCOUNT) {
        this.aCCOUNT = aCCOUNT;
    }

    public PolicyIEMap withACCOUNT(List<CharSequence> aCCOUNT) {
        this.aCCOUNT = aCCOUNT;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html#cfn-fms-policy-iemap-orgunit
     * 
     */
    @JsonIgnore
    public List<CharSequence> getORGUNIT() {
        return oRGUNIT;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html#cfn-fms-policy-iemap-orgunit
     * 
     */
    @JsonIgnore
    public void setORGUNIT(List<CharSequence> oRGUNIT) {
        this.oRGUNIT = oRGUNIT;
    }

    public PolicyIEMap withORGUNIT(List<CharSequence> oRGUNIT) {
        this.oRGUNIT = oRGUNIT;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aCCOUNT", aCCOUNT).append("oRGUNIT", oRGUNIT).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(oRGUNIT).append(aCCOUNT).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PolicyIEMap) == false) {
            return false;
        }
        PolicyIEMap rhs = ((PolicyIEMap) other);
        return new EqualsBuilder().append(oRGUNIT, rhs.oRGUNIT).append(aCCOUNT, rhs.aCCOUNT).isEquals();
    }

}
