
package shiver.me.timbers.aws.globalaccelerator;

import java.util.ArrayList;
import java.util.List;
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
 * EndpointGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ListenerArn",
    "EndpointGroupRegion",
    "EndpointConfigurations",
    "TrafficDialPercentage",
    "HealthCheckPort",
    "HealthCheckProtocol",
    "HealthCheckPath",
    "HealthCheckIntervalSeconds",
    "ThresholdCount"
})
public class EndpointGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-listenerarn
     * 
     */
    @JsonProperty("ListenerArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-listenerarn")
    private CharSequence listenerArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointgroupregion
     * 
     */
    @JsonProperty("EndpointGroupRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointgroupregion")
    private CharSequence endpointGroupRegion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations
     * 
     */
    @JsonProperty("EndpointConfigurations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations")
    private List<Property<EndpointGroupEndpointConfiguration>> endpointConfigurations = new ArrayList<Property<EndpointGroupEndpointConfiguration>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-trafficdialpercentage
     * 
     */
    @JsonProperty("TrafficDialPercentage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-trafficdialpercentage")
    private Number trafficDialPercentage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckport
     * 
     */
    @JsonProperty("HealthCheckPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckport")
    private Number healthCheckPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckprotocol
     * 
     */
    @JsonProperty("HealthCheckProtocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckprotocol")
    private CharSequence healthCheckProtocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckpath
     * 
     */
    @JsonProperty("HealthCheckPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckpath")
    private CharSequence healthCheckPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckintervalseconds
     * 
     */
    @JsonProperty("HealthCheckIntervalSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckintervalseconds")
    private Number healthCheckIntervalSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-thresholdcount
     * 
     */
    @JsonProperty("ThresholdCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-thresholdcount")
    private Number thresholdCount;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-listenerarn
     * 
     */
    @JsonIgnore
    public CharSequence getListenerArn() {
        return listenerArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-listenerarn
     * 
     */
    @JsonIgnore
    public void setListenerArn(CharSequence listenerArn) {
        this.listenerArn = listenerArn;
    }

    public EndpointGroup withListenerArn(CharSequence listenerArn) {
        this.listenerArn = listenerArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointgroupregion
     * 
     */
    @JsonIgnore
    public CharSequence getEndpointGroupRegion() {
        return endpointGroupRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointgroupregion
     * 
     */
    @JsonIgnore
    public void setEndpointGroupRegion(CharSequence endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
    }

    public EndpointGroup withEndpointGroupRegion(CharSequence endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations
     * 
     */
    @JsonIgnore
    public List<Property<EndpointGroupEndpointConfiguration>> getEndpointConfigurations() {
        return endpointConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations
     * 
     */
    @JsonIgnore
    public void setEndpointConfigurations(List<Property<EndpointGroupEndpointConfiguration>> endpointConfigurations) {
        this.endpointConfigurations = endpointConfigurations;
    }

    public EndpointGroup withEndpointConfigurations(List<Property<EndpointGroupEndpointConfiguration>> endpointConfigurations) {
        this.endpointConfigurations = endpointConfigurations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-trafficdialpercentage
     * 
     */
    @JsonIgnore
    public Number getTrafficDialPercentage() {
        return trafficDialPercentage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-trafficdialpercentage
     * 
     */
    @JsonIgnore
    public void setTrafficDialPercentage(Number trafficDialPercentage) {
        this.trafficDialPercentage = trafficDialPercentage;
    }

    public EndpointGroup withTrafficDialPercentage(Number trafficDialPercentage) {
        this.trafficDialPercentage = trafficDialPercentage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckport
     * 
     */
    @JsonIgnore
    public Number getHealthCheckPort() {
        return healthCheckPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckport
     * 
     */
    @JsonIgnore
    public void setHealthCheckPort(Number healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
    }

    public EndpointGroup withHealthCheckPort(Number healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckprotocol
     * 
     */
    @JsonIgnore
    public CharSequence getHealthCheckProtocol() {
        return healthCheckProtocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckprotocol
     * 
     */
    @JsonIgnore
    public void setHealthCheckProtocol(CharSequence healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
    }

    public EndpointGroup withHealthCheckProtocol(CharSequence healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckpath
     * 
     */
    @JsonIgnore
    public CharSequence getHealthCheckPath() {
        return healthCheckPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckpath
     * 
     */
    @JsonIgnore
    public void setHealthCheckPath(CharSequence healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    public EndpointGroup withHealthCheckPath(CharSequence healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckintervalseconds
     * 
     */
    @JsonIgnore
    public Number getHealthCheckIntervalSeconds() {
        return healthCheckIntervalSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckintervalseconds
     * 
     */
    @JsonIgnore
    public void setHealthCheckIntervalSeconds(Number healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
    }

    public EndpointGroup withHealthCheckIntervalSeconds(Number healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-thresholdcount
     * 
     */
    @JsonIgnore
    public Number getThresholdCount() {
        return thresholdCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-thresholdcount
     * 
     */
    @JsonIgnore
    public void setThresholdCount(Number thresholdCount) {
        this.thresholdCount = thresholdCount;
    }

    public EndpointGroup withThresholdCount(Number thresholdCount) {
        this.thresholdCount = thresholdCount;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("listenerArn", listenerArn).append("endpointGroupRegion", endpointGroupRegion).append("endpointConfigurations", endpointConfigurations).append("trafficDialPercentage", trafficDialPercentage).append("healthCheckPort", healthCheckPort).append("healthCheckProtocol", healthCheckProtocol).append("healthCheckPath", healthCheckPath).append("healthCheckIntervalSeconds", healthCheckIntervalSeconds).append("thresholdCount", thresholdCount).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(healthCheckPath).append(thresholdCount).append(endpointConfigurations).append(listenerArn).append(endpointGroupRegion).append(healthCheckIntervalSeconds).append(trafficDialPercentage).append(healthCheckPort).append(healthCheckProtocol).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndpointGroup) == false) {
            return false;
        }
        EndpointGroup rhs = ((EndpointGroup) other);
        return new EqualsBuilder().append(healthCheckPath, rhs.healthCheckPath).append(thresholdCount, rhs.thresholdCount).append(endpointConfigurations, rhs.endpointConfigurations).append(listenerArn, rhs.listenerArn).append(endpointGroupRegion, rhs.endpointGroupRegion).append(healthCheckIntervalSeconds, rhs.healthCheckIntervalSeconds).append(trafficDialPercentage, rhs.trafficDialPercentage).append(healthCheckPort, rhs.healthCheckPort).append(healthCheckProtocol, rhs.healthCheckProtocol).isEquals();
    }

}
