
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
 * IPSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "IPSetDescriptors",
    "Name"
})
public class IPSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors
     * 
     */
    @JsonProperty("IPSetDescriptors")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors")
    private Set<IPSetDescriptor> iPSetDescriptors = new LinkedHashSet<IPSetDescriptor>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors
     * 
     */
    public Set<IPSetDescriptor> getIPSetDescriptors() {
        return iPSetDescriptors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors
     * 
     */
    public void setIPSetDescriptors(Set<IPSetDescriptor> iPSetDescriptors) {
        this.iPSetDescriptors = iPSetDescriptors;
    }

    public IPSet withIPSetDescriptors(Set<IPSetDescriptor> iPSetDescriptors) {
        this.iPSetDescriptors = iPSetDescriptors;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-name
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
