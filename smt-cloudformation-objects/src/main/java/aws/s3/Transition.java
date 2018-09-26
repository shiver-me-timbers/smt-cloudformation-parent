
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Transition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "StorageClass",
    "TransitionDate",
    "TransitionInDays"
})
public class Transition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-storageclass
     * 
     */
    @JsonProperty("StorageClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-storageclass")
    private CharSequence storageClass;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitiondate
     * 
     */
    @JsonProperty("TransitionDate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitiondate")
    private String transitionDate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitionindays
     * 
     */
    @JsonProperty("TransitionInDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitionindays")
    private Integer transitionInDays;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-storageclass
     * 
     */
    public CharSequence getStorageClass() {
        return storageClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-storageclass
     * 
     */
    public void setStorageClass(CharSequence storageClass) {
        this.storageClass = storageClass;
    }

    public Transition withStorageClass(CharSequence storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitiondate
     * 
     */
    public String getTransitionDate() {
        return transitionDate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitiondate
     * 
     */
    public void setTransitionDate(String transitionDate) {
        this.transitionDate = transitionDate;
    }

    public Transition withTransitionDate(String transitionDate) {
        this.transitionDate = transitionDate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitionindays
     * 
     */
    public Integer getTransitionInDays() {
        return transitionInDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitionindays
     * 
     */
    public void setTransitionInDays(Integer transitionInDays) {
        this.transitionInDays = transitionInDays;
    }

    public Transition withTransitionInDays(Integer transitionInDays) {
        this.transitionInDays = transitionInDays;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("storageClass", storageClass).append("transitionDate", transitionDate).append("transitionInDays", transitionInDays).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(transitionDate).append(storageClass).append(transitionInDays).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transition) == false) {
            return false;
        }
        Transition rhs = ((Transition) other);
        return new EqualsBuilder().append(transitionDate, rhs.transitionDate).append(storageClass, rhs.storageClass).append(transitionInDays, rhs.transitionInDays).isEquals();
    }

}
