
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
 * IPSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "IPSetDescriptors",
    "Name"
})
public class IPSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors
     * 
     */
    @JsonProperty("IPSetDescriptors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors")
    private List<IPSetDescriptor> iPSetDescriptors = new ArrayList<IPSetDescriptor>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors
     * 
     */
    public List<IPSetDescriptor> getIPSetDescriptors() {
        return iPSetDescriptors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors
     * 
     */
    public void setIPSetDescriptors(List<IPSetDescriptor> iPSetDescriptors) {
        this.iPSetDescriptors = iPSetDescriptors;
    }

    public IPSet withIPSetDescriptors(List<IPSetDescriptor> iPSetDescriptors) {
        this.iPSetDescriptors = iPSetDescriptors;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public IPSet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("iPSetDescriptors", iPSetDescriptors).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(iPSetDescriptors).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IPSet) == false) {
            return false;
        }
        IPSet rhs = ((IPSet) other);
        return new EqualsBuilder().append(iPSetDescriptors, rhs.iPSetDescriptors).append(name, rhs.name).isEquals();
    }

}
