
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SpotFleetMonitoring
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Enabled"
})
public class SpotFleetMonitoring {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html#cfn-ec2-spotfleet-spotfleetmonitoring-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html#cfn-ec2-spotfleet-spotfleetmonitoring-enabled")
    private Boolean enabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html#cfn-ec2-spotfleet-spotfleetmonitoring-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html#cfn-ec2-spotfleet-spotfleetmonitoring-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public SpotFleetMonitoring withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enabled", enabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpotFleetMonitoring) == false) {
            return false;
        }
        SpotFleetMonitoring rhs = ((SpotFleetMonitoring) other);
        return new EqualsBuilder().append(enabled, rhs.enabled).isEquals();
    }

}
