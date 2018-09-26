
package aws.events;

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
 * RunCommandTarget
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Key",
    "Values"
})
public class RunCommandTarget {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-key")
    private CharSequence key;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-values
     * 
     */
    @JsonProperty("Values")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-values")
    private Set<CharSequence> values = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-key
     * 
     */
    public CharSequence getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-key
     * 
     */
    public void setKey(CharSequence key) {
        this.key = key;
    }

    public RunCommandTarget withKey(CharSequence key) {
        this.key = key;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-values
     * 
     */
    public Set<CharSequence> getValues() {
        return values;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-values
     * 
     */
    public void setValues(Set<CharSequence> values) {
        this.values = values;
    }

    public RunCommandTarget withValues(Set<CharSequence> values) {
        this.values = values;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("key", key).append("values", values).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(key).append(values).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RunCommandTarget) == false) {
            return false;
        }
        RunCommandTarget rhs = ((RunCommandTarget) other);
        return new EqualsBuilder().append(key, rhs.key).append(values, rhs.values).isEquals();
    }

}
