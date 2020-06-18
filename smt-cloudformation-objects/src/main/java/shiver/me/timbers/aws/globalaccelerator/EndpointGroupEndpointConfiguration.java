
package shiver.me.timbers.aws.globalaccelerator;

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
 * EndpointGroupEndpointConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EndpointId",
    "Weight",
    "ClientIPPreservationEnabled"
})
public class EndpointGroupEndpointConfiguration implements Property<EndpointGroupEndpointConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-endpointid
     * 
     */
    @JsonProperty("EndpointId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-endpointid")
    private CharSequence endpointId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-weight
     * 
     */
    @JsonProperty("Weight")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-weight")
    private Number weight;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-clientippreservationenabled
     * 
     */
    @JsonProperty("ClientIPPreservationEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-clientippreservationenabled")
    private CharSequence clientIPPreservationEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-endpointid
     * 
     */
    @JsonIgnore
    public CharSequence getEndpointId() {
        return endpointId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-endpointid
     * 
     */
    @JsonIgnore
    public void setEndpointId(CharSequence endpointId) {
        this.endpointId = endpointId;
    }

    public EndpointGroupEndpointConfiguration withEndpointId(CharSequence endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-weight
     * 
     */
    @JsonIgnore
    public Number getWeight() {
        return weight;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-weight
     * 
     */
    @JsonIgnore
    public void setWeight(Number weight) {
        this.weight = weight;
    }

    public EndpointGroupEndpointConfiguration withWeight(Number weight) {
        this.weight = weight;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-clientippreservationenabled
     * 
     */
    @JsonIgnore
    public CharSequence getClientIPPreservationEnabled() {
        return clientIPPreservationEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-clientippreservationenabled
     * 
     */
    @JsonIgnore
    public void setClientIPPreservationEnabled(CharSequence clientIPPreservationEnabled) {
        this.clientIPPreservationEnabled = clientIPPreservationEnabled;
    }

    public EndpointGroupEndpointConfiguration withClientIPPreservationEnabled(CharSequence clientIPPreservationEnabled) {
        this.clientIPPreservationEnabled = clientIPPreservationEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("endpointId", endpointId).append("weight", weight).append("clientIPPreservationEnabled", clientIPPreservationEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(weight).append(clientIPPreservationEnabled).append(endpointId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndpointGroupEndpointConfiguration) == false) {
            return false;
        }
        EndpointGroupEndpointConfiguration rhs = ((EndpointGroupEndpointConfiguration) other);
        return new EqualsBuilder().append(weight, rhs.weight).append(clientIPPreservationEnabled, rhs.clientIPPreservationEnabled).append(endpointId, rhs.endpointId).isEquals();
    }

}
