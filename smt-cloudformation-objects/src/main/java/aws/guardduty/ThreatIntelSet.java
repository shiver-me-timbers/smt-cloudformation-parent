
package aws.guardduty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ThreatIntelSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Format",
    "Activate",
    "DetectorId",
    "Name",
    "Location"
})
public class ThreatIntelSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-format
     * 
     */
    @JsonProperty("Format")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-format")
    private CharSequence format;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-activate
     * 
     */
    @JsonProperty("Activate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-activate")
    private Boolean activate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-detectorid
     * 
     */
    @JsonProperty("DetectorId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-detectorid")
    private CharSequence detectorId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-location
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-location")
    private CharSequence location;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-format
     * 
     */
    public CharSequence getFormat() {
        return format;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-format
     * 
     */
    public void setFormat(CharSequence format) {
        this.format = format;
    }

    public ThreatIntelSet withFormat(CharSequence format) {
        this.format = format;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-activate
     * 
     */
    public Boolean getActivate() {
        return activate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-activate
     * 
     */
    public void setActivate(Boolean activate) {
        this.activate = activate;
    }

    public ThreatIntelSet withActivate(Boolean activate) {
        this.activate = activate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-detectorid
     * 
     */
    public CharSequence getDetectorId() {
        return detectorId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-detectorid
     * 
     */
    public void setDetectorId(CharSequence detectorId) {
        this.detectorId = detectorId;
    }

    public ThreatIntelSet withDetectorId(CharSequence detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ThreatIntelSet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-location
     * 
     */
    public CharSequence getLocation() {
        return location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-location
     * 
     */
    public void setLocation(CharSequence location) {
        this.location = location;
    }

    public ThreatIntelSet withLocation(CharSequence location) {
        this.location = location;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("format", format).append("activate", activate).append("detectorId", detectorId).append("name", name).append("location", location).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(format).append(activate).append(name).append(location).append(detectorId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThreatIntelSet) == false) {
            return false;
        }
        ThreatIntelSet rhs = ((ThreatIntelSet) other);
        return new EqualsBuilder().append(format, rhs.format).append(activate, rhs.activate).append(name, rhs.name).append(location, rhs.location).append(detectorId, rhs.detectorId).isEquals();
    }

}
