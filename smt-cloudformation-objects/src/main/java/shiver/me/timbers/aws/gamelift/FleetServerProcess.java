
package shiver.me.timbers.aws.gamelift;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * FleetServerProcess
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ConcurrentExecutions",
    "LaunchPath",
    "Parameters"
})
public class FleetServerProcess implements Property<FleetServerProcess>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-concurrentexecutions
     * 
     */
    @JsonProperty("ConcurrentExecutions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-concurrentexecutions")
    private Number concurrentExecutions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-launchpath
     * 
     */
    @JsonProperty("LaunchPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-launchpath")
    private CharSequence launchPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-parameters")
    private CharSequence parameters;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-concurrentexecutions
     * 
     */
    @JsonIgnore
    public Number getConcurrentExecutions() {
        return concurrentExecutions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-concurrentexecutions
     * 
     */
    @JsonIgnore
    public void setConcurrentExecutions(Number concurrentExecutions) {
        this.concurrentExecutions = concurrentExecutions;
    }

    public FleetServerProcess withConcurrentExecutions(Number concurrentExecutions) {
        this.concurrentExecutions = concurrentExecutions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-launchpath
     * 
     */
    @JsonIgnore
    public CharSequence getLaunchPath() {
        return launchPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-launchpath
     * 
     */
    @JsonIgnore
    public void setLaunchPath(CharSequence launchPath) {
        this.launchPath = launchPath;
    }

    public FleetServerProcess withLaunchPath(CharSequence launchPath) {
        this.launchPath = launchPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-parameters
     * 
     */
    @JsonIgnore
    public CharSequence getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-parameters
     * 
     */
    @JsonIgnore
    public void setParameters(CharSequence parameters) {
        this.parameters = parameters;
    }

    public FleetServerProcess withParameters(CharSequence parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("concurrentExecutions", concurrentExecutions).append("launchPath", launchPath).append("parameters", parameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(concurrentExecutions).append(parameters).append(launchPath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FleetServerProcess) == false) {
            return false;
        }
        FleetServerProcess rhs = ((FleetServerProcess) other);
        return new EqualsBuilder().append(concurrentExecutions, rhs.concurrentExecutions).append(parameters, rhs.parameters).append(launchPath, rhs.launchPath).isEquals();
    }

}
