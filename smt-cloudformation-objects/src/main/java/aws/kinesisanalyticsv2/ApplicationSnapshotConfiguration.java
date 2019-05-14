
package aws.kinesisanalyticsv2;

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
 * ApplicationSnapshotConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SnapshotsEnabled"
})
public class ApplicationSnapshotConfiguration implements Property<ApplicationSnapshotConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html#cfn-kinesisanalyticsv2-application-applicationsnapshotconfiguration-snapshotsenabled
     * 
     */
    @JsonProperty("SnapshotsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html#cfn-kinesisanalyticsv2-application-applicationsnapshotconfiguration-snapshotsenabled")
    private Boolean snapshotsEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html#cfn-kinesisanalyticsv2-application-applicationsnapshotconfiguration-snapshotsenabled
     * 
     */
    @JsonIgnore
    public Boolean getSnapshotsEnabled() {
        return snapshotsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html#cfn-kinesisanalyticsv2-application-applicationsnapshotconfiguration-snapshotsenabled
     * 
     */
    @JsonIgnore
    public void setSnapshotsEnabled(Boolean snapshotsEnabled) {
        this.snapshotsEnabled = snapshotsEnabled;
    }

    public ApplicationSnapshotConfiguration withSnapshotsEnabled(Boolean snapshotsEnabled) {
        this.snapshotsEnabled = snapshotsEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("snapshotsEnabled", snapshotsEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(snapshotsEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationSnapshotConfiguration) == false) {
            return false;
        }
        ApplicationSnapshotConfiguration rhs = ((ApplicationSnapshotConfiguration) other);
        return new EqualsBuilder().append(snapshotsEnabled, rhs.snapshotsEnabled).isEquals();
    }

}