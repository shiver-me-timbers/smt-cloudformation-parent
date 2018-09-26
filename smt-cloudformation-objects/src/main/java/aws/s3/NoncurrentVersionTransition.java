
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NoncurrentVersionTransition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "StorageClass",
    "TransitionInDays"
})
public class NoncurrentVersionTransition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-storageclass
     * 
     */
    @JsonProperty("StorageClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-storageclass")
    private CharSequence storageClass;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-transitionindays
     * 
     */
    @JsonProperty("TransitionInDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-transitionindays")
    private Integer transitionInDays;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-storageclass
     * 
     */
    public CharSequence getStorageClass() {
        return storageClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-storageclass
     * 
     */
    public void setStorageClass(CharSequence storageClass) {
        this.storageClass = storageClass;
    }

    public NoncurrentVersionTransition withStorageClass(CharSequence storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-transitionindays
     * 
     */
    public Integer getTransitionInDays() {
        return transitionInDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-transitionindays
     * 
     */
    public void setTransitionInDays(Integer transitionInDays) {
        this.transitionInDays = transitionInDays;
    }

    public NoncurrentVersionTransition withTransitionInDays(Integer transitionInDays) {
        this.transitionInDays = transitionInDays;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("storageClass", storageClass).append("transitionInDays", transitionInDays).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(storageClass).append(transitionInDays).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NoncurrentVersionTransition) == false) {
            return false;
        }
        NoncurrentVersionTransition rhs = ((NoncurrentVersionTransition) other);
        return new EqualsBuilder().append(storageClass, rhs.storageClass).append(transitionInDays, rhs.transitionInDays).isEquals();
    }

}
