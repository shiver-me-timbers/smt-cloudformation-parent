
package shiver.me.timbers.aws.transfer;

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
 * UserHomeDirectoryMapEntry
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Entry",
    "Target"
})
public class UserHomeDirectoryMapEntry implements Property<UserHomeDirectoryMapEntry>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-entry
     * 
     */
    @JsonProperty("Entry")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-entry")
    private CharSequence entry;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-target
     * 
     */
    @JsonProperty("Target")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-target")
    private CharSequence target;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-entry
     * 
     */
    @JsonIgnore
    public CharSequence getEntry() {
        return entry;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-entry
     * 
     */
    @JsonIgnore
    public void setEntry(CharSequence entry) {
        this.entry = entry;
    }

    public UserHomeDirectoryMapEntry withEntry(CharSequence entry) {
        this.entry = entry;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-target
     * 
     */
    @JsonIgnore
    public CharSequence getTarget() {
        return target;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html#cfn-transfer-user-homedirectorymapentry-target
     * 
     */
    @JsonIgnore
    public void setTarget(CharSequence target) {
        this.target = target;
    }

    public UserHomeDirectoryMapEntry withTarget(CharSequence target) {
        this.target = target;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("entry", entry).append("target", target).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(entry).append(target).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserHomeDirectoryMapEntry) == false) {
            return false;
        }
        UserHomeDirectoryMapEntry rhs = ((UserHomeDirectoryMapEntry) other);
        return new EqualsBuilder().append(entry, rhs.entry).append(target, rhs.target).isEquals();
    }

}
