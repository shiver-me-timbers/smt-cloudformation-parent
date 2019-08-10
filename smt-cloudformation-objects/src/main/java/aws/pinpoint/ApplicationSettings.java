
package aws.pinpoint;

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
 * ApplicationSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "QuietTime",
    "Limits",
    "ApplicationId",
    "CampaignHook",
    "CloudWatchMetricsEnabled"
})
public class ApplicationSettings {

    /**
     * ApplicationSettingsQuietTime
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-quiettime.html
     * 
     */
    @JsonProperty("QuietTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-quiettime.html")
    private Property<ApplicationSettingsQuietTime> quietTime;
    /**
     * ApplicationSettingsLimits
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html
     * 
     */
    @JsonProperty("Limits")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html")
    private Property<ApplicationSettingsLimits> limits;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-applicationid
     * 
     */
    @JsonProperty("ApplicationId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-applicationid")
    private CharSequence applicationId;
    /**
     * ApplicationSettingsCampaignHook
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-campaignhook.html
     * 
     */
    @JsonProperty("CampaignHook")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-campaignhook.html")
    private Property<ApplicationSettingsCampaignHook> campaignHook;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-cloudwatchmetricsenabled
     * 
     */
    @JsonProperty("CloudWatchMetricsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-cloudwatchmetricsenabled")
    private CharSequence cloudWatchMetricsEnabled;

    /**
     * ApplicationSettingsQuietTime
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-quiettime.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationSettingsQuietTime> getQuietTime() {
        return quietTime;
    }

    /**
     * ApplicationSettingsQuietTime
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-quiettime.html
     * 
     */
    @JsonIgnore
    public void setQuietTime(Property<ApplicationSettingsQuietTime> quietTime) {
        this.quietTime = quietTime;
    }

    public ApplicationSettings withQuietTime(Property<ApplicationSettingsQuietTime> quietTime) {
        this.quietTime = quietTime;
        return this;
    }

    /**
     * ApplicationSettingsLimits
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationSettingsLimits> getLimits() {
        return limits;
    }

    /**
     * ApplicationSettingsLimits
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html
     * 
     */
    @JsonIgnore
    public void setLimits(Property<ApplicationSettingsLimits> limits) {
        this.limits = limits;
    }

    public ApplicationSettings withLimits(Property<ApplicationSettingsLimits> limits) {
        this.limits = limits;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-applicationid
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationId() {
        return applicationId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-applicationid
     * 
     */
    @JsonIgnore
    public void setApplicationId(CharSequence applicationId) {
        this.applicationId = applicationId;
    }

    public ApplicationSettings withApplicationId(CharSequence applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * ApplicationSettingsCampaignHook
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-campaignhook.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationSettingsCampaignHook> getCampaignHook() {
        return campaignHook;
    }

    /**
     * ApplicationSettingsCampaignHook
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-campaignhook.html
     * 
     */
    @JsonIgnore
    public void setCampaignHook(Property<ApplicationSettingsCampaignHook> campaignHook) {
        this.campaignHook = campaignHook;
    }

    public ApplicationSettings withCampaignHook(Property<ApplicationSettingsCampaignHook> campaignHook) {
        this.campaignHook = campaignHook;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-cloudwatchmetricsenabled
     * 
     */
    @JsonIgnore
    public CharSequence getCloudWatchMetricsEnabled() {
        return cloudWatchMetricsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-cloudwatchmetricsenabled
     * 
     */
    @JsonIgnore
    public void setCloudWatchMetricsEnabled(CharSequence cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
    }

    public ApplicationSettings withCloudWatchMetricsEnabled(CharSequence cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("quietTime", quietTime).append("limits", limits).append("applicationId", applicationId).append("campaignHook", campaignHook).append("cloudWatchMetricsEnabled", cloudWatchMetricsEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchMetricsEnabled).append(quietTime).append(applicationId).append(limits).append(campaignHook).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationSettings) == false) {
            return false;
        }
        ApplicationSettings rhs = ((ApplicationSettings) other);
        return new EqualsBuilder().append(cloudWatchMetricsEnabled, rhs.cloudWatchMetricsEnabled).append(quietTime, rhs.quietTime).append(applicationId, rhs.applicationId).append(limits, rhs.limits).append(campaignHook, rhs.campaignHook).isEquals();
    }

}
