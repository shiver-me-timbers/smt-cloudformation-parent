
package aws.guardduty;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Enable"
})
public class Detector {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable
     * 
     */
    @JsonProperty("Enable")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable")
    private Boolean enable;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable
     * 
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable
     * 
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Detector withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enable", enable).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enable).toHashCode();
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
        return new EqualsBuilder().append(enable, rhs.enable).isEquals();
    }

}
