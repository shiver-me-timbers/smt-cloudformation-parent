
package aws.codedeploy;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AutoRollbackConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Enabled",
    "Events"
})
public class AutoRollbackConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-events
     * 
     */
    @JsonProperty("Events")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-events")
    private Set<CharSequence> events = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public AutoRollbackConfiguration withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-events
     * 
     */
    public Set<CharSequence> getEvents() {
        return events;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-events
     * 
     */
    public void setEvents(Set<CharSequence> events) {
        this.events = events;
    }

    public AutoRollbackConfiguration withEvents(Set<CharSequence> events) {
        this.events = events;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enabled", enabled).append("events", events).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enabled).append(events).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutoRollbackConfiguration) == false) {
            return false;
        }
        AutoRollbackConfiguration rhs = ((AutoRollbackConfiguration) other);
        return new EqualsBuilder().append(enabled, rhs.enabled).append(events, rhs.events).isEquals();
    }

}
