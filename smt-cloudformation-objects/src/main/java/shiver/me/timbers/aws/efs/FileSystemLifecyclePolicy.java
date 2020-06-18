
package shiver.me.timbers.aws.efs;

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
 * FileSystemLifecyclePolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TransitionToIA"
})
public class FileSystemLifecyclePolicy implements Property<FileSystemLifecyclePolicy>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html#cfn-efs-filesystem-lifecyclepolicy-transitiontoia
     * 
     */
    @JsonProperty("TransitionToIA")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html#cfn-efs-filesystem-lifecyclepolicy-transitiontoia")
    private CharSequence transitionToIA;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html#cfn-efs-filesystem-lifecyclepolicy-transitiontoia
     * 
     */
    @JsonIgnore
    public CharSequence getTransitionToIA() {
        return transitionToIA;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html#cfn-efs-filesystem-lifecyclepolicy-transitiontoia
     * 
     */
    @JsonIgnore
    public void setTransitionToIA(CharSequence transitionToIA) {
        this.transitionToIA = transitionToIA;
    }

    public FileSystemLifecyclePolicy withTransitionToIA(CharSequence transitionToIA) {
        this.transitionToIA = transitionToIA;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("transitionToIA", transitionToIA).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(transitionToIA).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FileSystemLifecyclePolicy) == false) {
            return false;
        }
        FileSystemLifecyclePolicy rhs = ((FileSystemLifecyclePolicy) other);
        return new EqualsBuilder().append(transitionToIA, rhs.transitionToIA).isEquals();
    }

}
