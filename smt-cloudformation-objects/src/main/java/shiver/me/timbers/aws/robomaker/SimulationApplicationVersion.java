
package shiver.me.timbers.aws.robomaker;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SimulationApplicationVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CurrentRevisionId",
    "Application"
})
public class SimulationApplicationVersion {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-currentrevisionid
     * 
     */
    @JsonProperty("CurrentRevisionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-currentrevisionid")
    private CharSequence currentRevisionId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-application
     * 
     */
    @JsonProperty("Application")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-application")
    private CharSequence application;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-currentrevisionid
     * 
     */
    @JsonIgnore
    public CharSequence getCurrentRevisionId() {
        return currentRevisionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-currentrevisionid
     * 
     */
    @JsonIgnore
    public void setCurrentRevisionId(CharSequence currentRevisionId) {
        this.currentRevisionId = currentRevisionId;
    }

    public SimulationApplicationVersion withCurrentRevisionId(CharSequence currentRevisionId) {
        this.currentRevisionId = currentRevisionId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-application
     * 
     */
    @JsonIgnore
    public CharSequence getApplication() {
        return application;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-application
     * 
     */
    @JsonIgnore
    public void setApplication(CharSequence application) {
        this.application = application;
    }

    public SimulationApplicationVersion withApplication(CharSequence application) {
        this.application = application;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("currentRevisionId", currentRevisionId).append("application", application).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(application).append(currentRevisionId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimulationApplicationVersion) == false) {
            return false;
        }
        SimulationApplicationVersion rhs = ((SimulationApplicationVersion) other);
        return new EqualsBuilder().append(application, rhs.application).append(currentRevisionId, rhs.currentRevisionId).isEquals();
    }

}
