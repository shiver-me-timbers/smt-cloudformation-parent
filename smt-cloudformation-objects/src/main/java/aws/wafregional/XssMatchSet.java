
package aws.wafregional;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * XssMatchSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "XssMatchTuples",
    "Name"
})
public class XssMatchSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-xssmatchtuples
     * 
     */
    @JsonProperty("XssMatchTuples")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-xssmatchtuples")
    private List<XssMatchTuple> xssMatchTuples = new ArrayList<XssMatchTuple>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-xssmatchtuples
     * 
     */
    public List<XssMatchTuple> getXssMatchTuples() {
        return xssMatchTuples;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-xssmatchtuples
     * 
     */
    public void setXssMatchTuples(List<XssMatchTuple> xssMatchTuples) {
        this.xssMatchTuples = xssMatchTuples;
    }

    public XssMatchSet withXssMatchTuples(List<XssMatchTuple> xssMatchTuples) {
        this.xssMatchTuples = xssMatchTuples;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public XssMatchSet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("xssMatchTuples", xssMatchTuples).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(xssMatchTuples).append(name).toHashCode();
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
        return new EqualsBuilder().append(xssMatchTuples, rhs.xssMatchTuples).append(name, rhs.name).isEquals();
    }

}
