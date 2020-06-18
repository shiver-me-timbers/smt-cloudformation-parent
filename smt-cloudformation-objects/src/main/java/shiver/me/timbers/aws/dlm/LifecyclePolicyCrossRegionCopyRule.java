
package shiver.me.timbers.aws.dlm;

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
 * LifecyclePolicyCrossRegionCopyRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TargetRegion",
    "Encrypted",
    "CmkArn",
    "RetainRule",
    "CopyTags"
})
public class LifecyclePolicyCrossRegionCopyRule implements Property<LifecyclePolicyCrossRegionCopyRule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-targetregion
     * 
     */
    @JsonProperty("TargetRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-targetregion")
    private CharSequence targetRegion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-encrypted
     * 
     */
    @JsonProperty("Encrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-encrypted")
    private CharSequence encrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-cmkarn
     * 
     */
    @JsonProperty("CmkArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-cmkarn")
    private CharSequence cmkArn;
    /**
     * LifecyclePolicyCrossRegionCopyRetainRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html
     * 
     */
    @JsonProperty("RetainRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html")
    private Property<LifecyclePolicyCrossRegionCopyRetainRule> retainRule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-copytags
     * 
     */
    @JsonProperty("CopyTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-copytags")
    private CharSequence copyTags;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-targetregion
     * 
     */
    @JsonIgnore
    public CharSequence getTargetRegion() {
        return targetRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-targetregion
     * 
     */
    @JsonIgnore
    public void setTargetRegion(CharSequence targetRegion) {
        this.targetRegion = targetRegion;
    }

    public LifecyclePolicyCrossRegionCopyRule withTargetRegion(CharSequence targetRegion) {
        this.targetRegion = targetRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-encrypted
     * 
     */
    @JsonIgnore
    public CharSequence getEncrypted() {
        return encrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-encrypted
     * 
     */
    @JsonIgnore
    public void setEncrypted(CharSequence encrypted) {
        this.encrypted = encrypted;
    }

    public LifecyclePolicyCrossRegionCopyRule withEncrypted(CharSequence encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-cmkarn
     * 
     */
    @JsonIgnore
    public CharSequence getCmkArn() {
        return cmkArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-cmkarn
     * 
     */
    @JsonIgnore
    public void setCmkArn(CharSequence cmkArn) {
        this.cmkArn = cmkArn;
    }

    public LifecyclePolicyCrossRegionCopyRule withCmkArn(CharSequence cmkArn) {
        this.cmkArn = cmkArn;
        return this;
    }

    /**
     * LifecyclePolicyCrossRegionCopyRetainRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html
     * 
     */
    @JsonIgnore
    public Property<LifecyclePolicyCrossRegionCopyRetainRule> getRetainRule() {
        return retainRule;
    }

    /**
     * LifecyclePolicyCrossRegionCopyRetainRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html
     * 
     */
    @JsonIgnore
    public void setRetainRule(Property<LifecyclePolicyCrossRegionCopyRetainRule> retainRule) {
        this.retainRule = retainRule;
    }

    public LifecyclePolicyCrossRegionCopyRule withRetainRule(Property<LifecyclePolicyCrossRegionCopyRetainRule> retainRule) {
        this.retainRule = retainRule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-copytags
     * 
     */
    @JsonIgnore
    public CharSequence getCopyTags() {
        return copyTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-copytags
     * 
     */
    @JsonIgnore
    public void setCopyTags(CharSequence copyTags) {
        this.copyTags = copyTags;
    }

    public LifecyclePolicyCrossRegionCopyRule withCopyTags(CharSequence copyTags) {
        this.copyTags = copyTags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("targetRegion", targetRegion).append("encrypted", encrypted).append("cmkArn", cmkArn).append("retainRule", retainRule).append("copyTags", copyTags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(copyTags).append(retainRule).append(encrypted).append(cmkArn).append(targetRegion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecyclePolicyCrossRegionCopyRule) == false) {
            return false;
        }
        LifecyclePolicyCrossRegionCopyRule rhs = ((LifecyclePolicyCrossRegionCopyRule) other);
        return new EqualsBuilder().append(copyTags, rhs.copyTags).append(retainRule, rhs.retainRule).append(encrypted, rhs.encrypted).append(cmkArn, rhs.cmkArn).append(targetRegion, rhs.targetRegion).isEquals();
    }

}
