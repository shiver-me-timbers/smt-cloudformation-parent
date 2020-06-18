
package shiver.me.timbers.aws.wafv2;

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
 * WebACLOverrideAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Count",
    "None"
})
public class WebACLOverrideAction implements Property<WebACLOverrideAction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html#cfn-wafv2-webacl-overrideaction-count
     * 
     */
    @JsonProperty("Count")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html#cfn-wafv2-webacl-overrideaction-count")
    private Object count;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html#cfn-wafv2-webacl-overrideaction-none
     * 
     */
    @JsonProperty("None")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html#cfn-wafv2-webacl-overrideaction-none")
    private Object none;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html#cfn-wafv2-webacl-overrideaction-count
     * 
     */
    @JsonIgnore
    public Object getCount() {
        return count;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html#cfn-wafv2-webacl-overrideaction-count
     * 
     */
    @JsonIgnore
    public void setCount(Object count) {
        this.count = count;
    }

    public WebACLOverrideAction withCount(Object count) {
        this.count = count;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html#cfn-wafv2-webacl-overrideaction-none
     * 
     */
    @JsonIgnore
    public Object getNone() {
        return none;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html#cfn-wafv2-webacl-overrideaction-none
     * 
     */
    @JsonIgnore
    public void setNone(Object none) {
        this.none = none;
    }

    public WebACLOverrideAction withNone(Object none) {
        this.none = none;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("count", count).append("none", none).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(none).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebACLOverrideAction) == false) {
            return false;
        }
        WebACLOverrideAction rhs = ((WebACLOverrideAction) other);
        return new EqualsBuilder().append(count, rhs.count).append(none, rhs.none).isEquals();
    }

}
