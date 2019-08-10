
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
 * CampaignWriteTreatmentResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TreatmentDescription",
    "MessageConfiguration",
    "Schedule",
    "SizePercent",
    "TreatmentName"
})
public class CampaignWriteTreatmentResource implements Property<CampaignWriteTreatmentResource>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-treatmentdescription
     * 
     */
    @JsonProperty("TreatmentDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-treatmentdescription")
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
     * CampaignSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html
     * 
     */
    @JsonProperty("Schedule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html")
    private Property<CampaignSchedule> schedule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-sizepercent
     * 
     */
    @JsonProperty("SizePercent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-sizepercent")
    private Number sizePercent;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-treatmentname
     * 
     */
    @JsonProperty("TreatmentName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-treatmentname")
    private CharSequence treatmentName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-treatmentdescription
     * 
     */
    @JsonIgnore
    public CharSequence getTreatmentDescription() {
        return treatmentDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-treatmentdescription
     * 
     */
    @JsonIgnore
    public void setTreatmentDescription(CharSequence treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    public CampaignWriteTreatmentResource withTreatmentDescription(CharSequence treatmentDescription) {
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

    public CampaignWriteTreatmentResource withMessageConfiguration(Property<CampaignMessageConfiguration> messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
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

    public CampaignWriteTreatmentResource withSchedule(Property<CampaignSchedule> schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-sizepercent
     * 
     */
    @JsonIgnore
    public Number getSizePercent() {
        return sizePercent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-sizepercent
     * 
     */
    @JsonIgnore
    public void setSizePercent(Number sizePercent) {
        this.sizePercent = sizePercent;
    }

    public CampaignWriteTreatmentResource withSizePercent(Number sizePercent) {
        this.sizePercent = sizePercent;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-treatmentname
     * 
     */
    @JsonIgnore
    public CharSequence getTreatmentName() {
        return treatmentName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html#cfn-pinpoint-campaign-writetreatmentresource-treatmentname
     * 
     */
    @JsonIgnore
    public void setTreatmentName(CharSequence treatmentName) {
        this.treatmentName = treatmentName;
    }

    public CampaignWriteTreatmentResource withTreatmentName(CharSequence treatmentName) {
        this.treatmentName = treatmentName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("treatmentDescription", treatmentDescription).append("messageConfiguration", messageConfiguration).append("schedule", schedule).append("sizePercent", sizePercent).append("treatmentName", treatmentName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(schedule).append(treatmentDescription).append(sizePercent).append(treatmentName).append(messageConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CampaignWriteTreatmentResource) == false) {
            return false;
        }
        CampaignWriteTreatmentResource rhs = ((CampaignWriteTreatmentResource) other);
        return new EqualsBuilder().append(schedule, rhs.schedule).append(treatmentDescription, rhs.treatmentDescription).append(sizePercent, rhs.sizePercent).append(treatmentName, rhs.treatmentName).append(messageConfiguration, rhs.messageConfiguration).isEquals();
    }

}
