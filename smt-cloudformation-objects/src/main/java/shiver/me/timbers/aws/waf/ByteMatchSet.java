
package shiver.me.timbers.aws.waf;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ByteMatchSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ByteMatchTuples",
    "Name"
})
public class ByteMatchSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples
     * 
     */
    @JsonProperty("ByteMatchTuples")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples")
    private Set<Property<ByteMatchSetByteMatchTuple>> byteMatchTuples = new LinkedHashSet<Property<ByteMatchSetByteMatchTuple>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples
     * 
     */
    @JsonIgnore
    public Set<Property<ByteMatchSetByteMatchTuple>> getByteMatchTuples() {
        return byteMatchTuples;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples
     * 
     */
    @JsonIgnore
    public void setByteMatchTuples(Set<Property<ByteMatchSetByteMatchTuple>> byteMatchTuples) {
        this.byteMatchTuples = byteMatchTuples;
    }

    public ByteMatchSet withByteMatchTuples(Set<Property<ByteMatchSetByteMatchTuple>> byteMatchTuples) {
        this.byteMatchTuples = byteMatchTuples;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ByteMatchSet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("byteMatchTuples", byteMatchTuples).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(byteMatchTuples).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ByteMatchSet) == false) {
            return false;
        }
        ByteMatchSet rhs = ((ByteMatchSet) other);
        return new EqualsBuilder().append(byteMatchTuples, rhs.byteMatchTuples).append(name, rhs.name).isEquals();
    }

}
