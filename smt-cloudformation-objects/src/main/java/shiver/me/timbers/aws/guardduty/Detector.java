
package shiver.me.timbers.aws.guardduty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Detector
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FindingPublishingFrequency",
    "Enable"
})
public class Detector {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-findingpublishingfrequency
     * 
     */
    @JsonProperty("FindingPublishingFrequency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-findingpublishingfrequency")
    private CharSequence findingPublishingFrequency;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable
     * 
     */
    @JsonProperty("Enable")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable")
    private CharSequence enable;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-findingpublishingfrequency
     * 
     */
    @JsonIgnore
    public CharSequence getFindingPublishingFrequency() {
        return findingPublishingFrequency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-findingpublishingfrequency
     * 
     */
    @JsonIgnore
    public void setFindingPublishingFrequency(CharSequence findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    public Detector withFindingPublishingFrequency(CharSequence findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable
     * 
     */
    @JsonIgnore
    public CharSequence getEnable() {
        return enable;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable
     * 
     */
    @JsonIgnore
    public void setEnable(CharSequence enable) {
        this.enable = enable;
    }

    public Detector withEnable(CharSequence enable) {
        this.enable = enable;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("findingPublishingFrequency", findingPublishingFrequency).append("enable", enable).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(findingPublishingFrequency).append(enable).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Detector) == false) {
            return false;
        }
        Detector rhs = ((Detector) other);
        return new EqualsBuilder().append(findingPublishingFrequency, rhs.findingPublishingFrequency).append(enable, rhs.enable).isEquals();
    }

}
