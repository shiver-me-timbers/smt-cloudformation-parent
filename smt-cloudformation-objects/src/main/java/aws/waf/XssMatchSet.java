
package aws.waf;

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
 * XssMatchSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "XssMatchTuples"
})
public class XssMatchSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-xssmatchtuples
     * 
     */
    @JsonProperty("XssMatchTuples")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-xssmatchtuples")
    private Set<XssMatchTuple> xssMatchTuples = new LinkedHashSet<XssMatchTuple>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public XssMatchSet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-xssmatchtuples
     * 
     */
    public Set<XssMatchTuple> getXssMatchTuples() {
        return xssMatchTuples;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-xssmatchtuples
     * 
     */
    public void setXssMatchTuples(Set<XssMatchTuple> xssMatchTuples) {
        this.xssMatchTuples = xssMatchTuples;
    }

    public XssMatchSet withXssMatchTuples(Set<XssMatchTuple> xssMatchTuples) {
        this.xssMatchTuples = xssMatchTuples;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("xssMatchTuples", xssMatchTuples).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(xssMatchTuples).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof XssMatchSet) == false) {
            return false;
        }
        XssMatchSet rhs = ((XssMatchSet) other);
        return new EqualsBuilder().append(name, rhs.name).append(xssMatchTuples, rhs.xssMatchTuples).isEquals();
    }

}
