
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
    private String format;
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
    private String detectorId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-name")
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-location
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-location")
    private String location;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-format
     * 
     */
    @JsonProperty("Format")
    public String getFormat() {
        return format;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-format
     * 
     */
    @JsonProperty("Format")
    public void setFormat(String format) {
        this.format = format;
    }

    public ThreatIntelSet withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-activate
     * 
     */
    @JsonProperty("Activate")
    public Boolean getActivate() {
        return activate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-activate
     * 
     */
    @JsonProperty("Activate")
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
    @JsonProperty("DetectorId")
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-detectorid
     * 
     */
    @JsonProperty("DetectorId")
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    public ThreatIntelSet withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public ThreatIntelSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-location
     * 
     */
    @JsonProperty("Location")
    public String getLocation() {
        return location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-location
     * 
     */
    @JsonProperty("Location")
    public void setLocation(String location) {
        this.location = location;
    }

    public ThreatIntelSet withLocation(String location) {
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
