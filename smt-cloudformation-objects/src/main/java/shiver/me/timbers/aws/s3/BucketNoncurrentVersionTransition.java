
package shiver.me.timbers.aws.s3;

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
 * BucketNoncurrentVersionTransition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "StorageClass",
    "TransitionInDays"
})
public class BucketNoncurrentVersionTransition implements Property<BucketNoncurrentVersionTransition>
{

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
    private Number transitionInDays;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-storageclass
     * 
     */
    @JsonIgnore
    public CharSequence getStorageClass() {
        return storageClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-storageclass
     * 
     */
    @JsonIgnore
    public void setStorageClass(CharSequence storageClass) {
        this.storageClass = storageClass;
    }

    public BucketNoncurrentVersionTransition withStorageClass(CharSequence storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-transitionindays
     * 
     */
    @JsonIgnore
    public Number getTransitionInDays() {
        return transitionInDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-transitionindays
     * 
     */
    @JsonIgnore
    public void setTransitionInDays(Number transitionInDays) {
        this.transitionInDays = transitionInDays;
    }

    public BucketNoncurrentVersionTransition withTransitionInDays(Number transitionInDays) {
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
        if ((other instanceof BucketNoncurrentVersionTransition) == false) {
            return false;
        }
        BucketNoncurrentVersionTransition rhs = ((BucketNoncurrentVersionTransition) other);
        return new EqualsBuilder().append(storageClass, rhs.storageClass).append(transitionInDays, rhs.transitionInDays).isEquals();
    }

}
