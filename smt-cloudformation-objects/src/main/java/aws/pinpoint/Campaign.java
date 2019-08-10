
package aws.pinpoint;

import java.util.ArrayList;
import java.util.List;
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
 * Campaign
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "SegmentId",
    "IsPaused",
    "AdditionalTreatments",
    "Name",
    "SegmentVersion",
    "TreatmentDescription",
    "MessageConfiguration",
    "Limits",
    "HoldoutPercent",
    "Schedule",
    "ApplicationId",
    "CampaignHook",
    "TreatmentName"
})
public class Campaign {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentid
     * 
     */
    @JsonProperty("SegmentId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentid")
    private CharSequence segmentId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-ispaused
     * 
     */
    @JsonProperty("IsPaused")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-ispaused")
    private CharSequence isPaused;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-additionaltreatments
     * 
     */
    @JsonProperty("AdditionalTreatments")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-additionaltreatments")
    private List<Property<CampaignWriteTreatmentResource>> additionalTreatments = new ArrayList<Property<CampaignWriteTreatmentResource>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentversion
     * 
     */
    @JsonProperty("SegmentVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentversion")
    private Number segmentVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentdescription
     * 
     */
    @JsonProperty("TreatmentDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentdescription")
    private CharSequence treatmentDescription;
    /**
     * CampaignMessageConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html
     * 
     */
    @JsonProperty("MessageConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html")
    private Property<CampaignMessageConfiguration> messageConfiguration;
    /**
     * CampaignLimits
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html
     * 
     */
    @JsonProperty("Limits")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html")
    private Property<CampaignLimits> limits;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-holdoutpercent
     * 
     */
    @JsonProperty("HoldoutPercent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-holdoutpercent")
    private Number holdoutPercent;
    /**
     * CampaignSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html
     * 
     */
    @JsonProperty("Schedule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html")
    private Property<CampaignSchedule> schedule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-applicationid
     * 
     */
    @JsonProperty("ApplicationId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-applicationid")
    private CharSequence applicationId;
    /**
     * CampaignCampaignHook
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html
     * 
     */
    @JsonProperty("CampaignHook")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html")
    private Property<CampaignCampaignHook> campaignHook;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentname
     * 
     */
    @JsonProperty("TreatmentName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentname")
    private CharSequence treatmentName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Campaign withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentid
     * 
     */
    @JsonIgnore
    public CharSequence getSegmentId() {
        return segmentId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentid
     * 
     */
    @JsonIgnore
    public void setSegmentId(CharSequence segmentId) {
        this.segmentId = segmentId;
    }

    public Campaign withSegmentId(CharSequence segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-ispaused
     * 
     */
    @JsonIgnore
    public CharSequence getIsPaused() {
        return isPaused;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-ispaused
     * 
     */
    @JsonIgnore
    public void setIsPaused(CharSequence isPaused) {
        this.isPaused = isPaused;
    }

    public Campaign withIsPaused(CharSequence isPaused) {
        this.isPaused = isPaused;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-additionaltreatments
     * 
     */
    @JsonIgnore
    public List<Property<CampaignWriteTreatmentResource>> getAdditionalTreatments() {
        return additionalTreatments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-additionaltreatments
     * 
     */
    @JsonIgnore
    public void setAdditionalTreatments(List<Property<CampaignWriteTreatmentResource>> additionalTreatments) {
        this.additionalTreatments = additionalTreatments;
    }

    public Campaign withAdditionalTreatments(List<Property<CampaignWriteTreatmentResource>> additionalTreatments) {
        this.additionalTreatments = additionalTreatments;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Campaign withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentversion
     * 
     */
    @JsonIgnore
    public Number getSegmentVersion() {
        return segmentVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-segmentversion
     * 
     */
    @JsonIgnore
    public void setSegmentVersion(Number segmentVersion) {
        this.segmentVersion = segmentVersion;
    }

    public Campaign withSegmentVersion(Number segmentVersion) {
        this.segmentVersion = segmentVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentdescription
     * 
     */
    @JsonIgnore
    public CharSequence getTreatmentDescription() {
        return treatmentDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentdescription
     * 
     */
    @JsonIgnore
    public void setTreatmentDescription(CharSequence treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    public Campaign withTreatmentDescription(CharSequence treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
        return this;
    }

    /**
     * CampaignMessageConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<CampaignMessageConfiguration> getMessageConfiguration() {
        return messageConfiguration;
    }

    /**
     * CampaignMessageConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html
     * 
     */
    @JsonIgnore
    public void setMessageConfiguration(Property<CampaignMessageConfiguration> messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    public Campaign withMessageConfiguration(Property<CampaignMessageConfiguration> messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
        return this;
    }

    /**
     * CampaignLimits
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html
     * 
     */
    @JsonIgnore
    public Property<CampaignLimits> getLimits() {
        return limits;
    }

    /**
     * CampaignLimits
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html
     * 
     */
    @JsonIgnore
    public void setLimits(Property<CampaignLimits> limits) {
        this.limits = limits;
    }

    public Campaign withLimits(Property<CampaignLimits> limits) {
        this.limits = limits;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-holdoutpercent
     * 
     */
    @JsonIgnore
    public Number getHoldoutPercent() {
        return holdoutPercent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-holdoutpercent
     * 
     */
    @JsonIgnore
    public void setHoldoutPercent(Number holdoutPercent) {
        this.holdoutPercent = holdoutPercent;
    }

    public Campaign withHoldoutPercent(Number holdoutPercent) {
        this.holdoutPercent = holdoutPercent;
        return this;
    }

    /**
     * CampaignSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html
     * 
     */
    @JsonIgnore
    public Property<CampaignSchedule> getSchedule() {
        return schedule;
    }

    /**
     * CampaignSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html
     * 
     */
    @JsonIgnore
    public void setSchedule(Property<CampaignSchedule> schedule) {
        this.schedule = schedule;
    }

    public Campaign withSchedule(Property<CampaignSchedule> schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-applicationid
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationId() {
        return applicationId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-applicationid
     * 
     */
    @JsonIgnore
    public void setApplicationId(CharSequence applicationId) {
        this.applicationId = applicationId;
    }

    public Campaign withApplicationId(CharSequence applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * CampaignCampaignHook
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html
     * 
     */
    @JsonIgnore
    public Property<CampaignCampaignHook> getCampaignHook() {
        return campaignHook;
    }

    /**
     * CampaignCampaignHook
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html
     * 
     */
    @JsonIgnore
    public void setCampaignHook(Property<CampaignCampaignHook> campaignHook) {
        this.campaignHook = campaignHook;
    }

    public Campaign withCampaignHook(Property<CampaignCampaignHook> campaignHook) {
        this.campaignHook = campaignHook;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentname
     * 
     */
    @JsonIgnore
    public CharSequence getTreatmentName() {
        return treatmentName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html#cfn-pinpoint-campaign-treatmentname
     * 
     */
    @JsonIgnore
    public void setTreatmentName(CharSequence treatmentName) {
        this.treatmentName = treatmentName;
    }

    public Campaign withTreatmentName(CharSequence treatmentName) {
        this.treatmentName = treatmentName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("segmentId", segmentId).append("isPaused", isPaused).append("additionalTreatments", additionalTreatments).append("name", name).append("segmentVersion", segmentVersion).append("treatmentDescription", treatmentDescription).append("messageConfiguration", messageConfiguration).append("limits", limits).append("holdoutPercent", holdoutPercent).append("schedule", schedule).append("applicationId", applicationId).append("campaignHook", campaignHook).append("treatmentName", treatmentName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isPaused).append(segmentVersion).append(description).append(additionalTreatments).append(holdoutPercent).append(schedule).append(treatmentDescription).append(segmentId).append(messageConfiguration).append(campaignHook).append(name).append(applicationId).append(limits).append(treatmentName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Campaign) == false) {
            return false;
        }
        Campaign rhs = ((Campaign) other);
        return new EqualsBuilder().append(isPaused, rhs.isPaused).append(segmentVersion, rhs.segmentVersion).append(description, rhs.description).append(additionalTreatments, rhs.additionalTreatments).append(holdoutPercent, rhs.holdoutPercent).append(schedule, rhs.schedule).append(treatmentDescription, rhs.treatmentDescription).append(segmentId, rhs.segmentId).append(messageConfiguration, rhs.messageConfiguration).append(campaignHook, rhs.campaignHook).append(name, rhs.name).append(applicationId, rhs.applicationId).append(limits, rhs.limits).append(treatmentName, rhs.treatmentName).isEquals();
    }

}
