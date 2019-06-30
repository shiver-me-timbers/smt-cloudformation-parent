
package aws.s3;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * BucketTransition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "StorageClass",
    "TransitionDate",
    "TransitionInDays"
})
public class BucketTransition implements Property<BucketTransition>
{

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
    private CharSequence transitionDate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitionindays
     * 
     */
    @JsonProperty("TransitionInDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitionindays")
    private Number transitionInDays;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-storageclass
     * 
     */
    @JsonIgnore
    public CharSequence getStorageClass() {
        return storageClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-storageclass
     * 
     */
    @JsonIgnore
    public void setStorageClass(CharSequence storageClass) {
        this.storageClass = storageClass;
    }

    public BucketTransition withStorageClass(CharSequence storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitiondate
     * 
     */
    @JsonIgnore
    public CharSequence getTransitionDate() {
        return transitionDate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitiondate
     * 
     */
    @JsonIgnore
    public void setTransitionDate(CharSequence transitionDate) {
        this.transitionDate = transitionDate;
    }

    public BucketTransition withTransitionDate(CharSequence transitionDate) {
        this.transitionDate = transitionDate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitionindays
     * 
     */
    @JsonIgnore
    public Number getTransitionInDays() {
        return transitionInDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitionindays
     * 
     */
    @JsonIgnore
    public void setTransitionInDays(Number transitionInDays) {
        this.transitionInDays = transitionInDays;
    }

    public BucketTransition withTransitionInDays(Number transitionInDays) {
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
        if ((other instanceof BucketTransition) == false) {
            return false;
        }
        BucketTransition rhs = ((BucketTransition) other);
        return new EqualsBuilder().append(transitionDate, rhs.transitionDate).append(storageClass, rhs.storageClass).append(transitionInDays, rhs.transitionInDays).isEquals();
    }

}
