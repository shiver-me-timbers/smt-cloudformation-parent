
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
 * BucketObjectLockConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ObjectLockEnabled",
    "Rule"
})
public class BucketObjectLockConfiguration implements Property<BucketObjectLockConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockconfiguration.html#cfn-s3-bucket-objectlockconfiguration-objectlockenabled
     * 
     */
    @JsonProperty("ObjectLockEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockconfiguration.html#cfn-s3-bucket-objectlockconfiguration-objectlockenabled")
    private CharSequence objectLockEnabled;
    /**
     * BucketObjectLockRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html
     * 
     */
    @JsonProperty("Rule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html")
    private Property<BucketObjectLockRule> rule;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockconfiguration.html#cfn-s3-bucket-objectlockconfiguration-objectlockenabled
     * 
     */
    @JsonIgnore
    public CharSequence getObjectLockEnabled() {
        return objectLockEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockconfiguration.html#cfn-s3-bucket-objectlockconfiguration-objectlockenabled
     * 
     */
    @JsonIgnore
    public void setObjectLockEnabled(CharSequence objectLockEnabled) {
        this.objectLockEnabled = objectLockEnabled;
    }

    public BucketObjectLockConfiguration withObjectLockEnabled(CharSequence objectLockEnabled) {
        this.objectLockEnabled = objectLockEnabled;
        return this;
    }

    /**
     * BucketObjectLockRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html
     * 
     */
    @JsonIgnore
    public Property<BucketObjectLockRule> getRule() {
        return rule;
    }

    /**
     * BucketObjectLockRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html
     * 
     */
    @JsonIgnore
    public void setRule(Property<BucketObjectLockRule> rule) {
        this.rule = rule;
    }

    public BucketObjectLockConfiguration withRule(Property<BucketObjectLockRule> rule) {
        this.rule = rule;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("objectLockEnabled", objectLockEnabled).append("rule", rule).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rule).append(objectLockEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketObjectLockConfiguration) == false) {
            return false;
        }
        BucketObjectLockConfiguration rhs = ((BucketObjectLockConfiguration) other);
        return new EqualsBuilder().append(rule, rhs.rule).append(objectLockEnabled, rhs.objectLockEnabled).isEquals();
    }

}
