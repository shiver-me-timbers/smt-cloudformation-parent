
package shiver.me.timbers.aws.wafv2;

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
 * WebACLGeoMatchStatement
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CountryCodes"
})
public class WebACLGeoMatchStatement implements Property<WebACLGeoMatchStatement>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html#cfn-wafv2-webacl-geomatchstatement-countrycodes
     * 
     */
    @JsonProperty("CountryCodes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html#cfn-wafv2-webacl-geomatchstatement-countrycodes")
    private List<CharSequence> countryCodes = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html#cfn-wafv2-webacl-geomatchstatement-countrycodes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getCountryCodes() {
        return countryCodes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html#cfn-wafv2-webacl-geomatchstatement-countrycodes
     * 
     */
    @JsonIgnore
    public void setCountryCodes(List<CharSequence> countryCodes) {
        this.countryCodes = countryCodes;
    }

    public WebACLGeoMatchStatement withCountryCodes(List<CharSequence> countryCodes) {
        this.countryCodes = countryCodes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("countryCodes", countryCodes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(countryCodes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebACLGeoMatchStatement) == false) {
            return false;
        }
        WebACLGeoMatchStatement rhs = ((WebACLGeoMatchStatement) other);
        return new EqualsBuilder().append(countryCodes, rhs.countryCodes).isEquals();
    }

}
