
package aws.servicediscovery;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Instance
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InstanceAttributes",
    "InstanceId",
    "ServiceId"
})
public class Instance {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceattributes
     * 
     */
    @JsonProperty("InstanceAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceattributes")
    private Object instanceAttributes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceid")
    private CharSequence instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-serviceid
     * 
     */
    @JsonProperty("ServiceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-serviceid")
    private CharSequence serviceId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceattributes
     * 
     */
    public Object getInstanceAttributes() {
        return instanceAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceattributes
     * 
     */
    public void setInstanceAttributes(Object instanceAttributes) {
        this.instanceAttributes = instanceAttributes;
    }

    public Instance withInstanceAttributes(Object instanceAttributes) {
        this.instanceAttributes = instanceAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceid
     * 
     */
    public CharSequence getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceid
     * 
     */
    public void setInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
    }

    public Instance withInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-serviceid
     * 
     */
    public CharSequence getServiceId() {
        return serviceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-serviceid
     * 
     */
    public void setServiceId(CharSequence serviceId) {
        this.serviceId = serviceId;
    }

    public Instance withServiceId(CharSequence serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("instanceAttributes", instanceAttributes).append("instanceId", instanceId).append("serviceId", serviceId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(instanceId).append(serviceId).append(instanceAttributes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Instance) == false) {
            return false;
        }
        Instance rhs = ((Instance) other);
        return new EqualsBuilder().append(instanceId, rhs.instanceId).append(serviceId, rhs.serviceId).append(instanceAttributes, rhs.instanceAttributes).isEquals();
    }

}
