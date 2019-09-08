
package shiver.me.timbers.aws.iotanalytics;

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
 * ChannelChannelStorage
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-channelstorage.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CustomerManagedS3",
    "ServiceManagedS3"
})
public class ChannelChannelStorage implements Property<ChannelChannelStorage>
{

    /**
     * ChannelCustomerManagedS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html
     * 
     */
    @JsonProperty("CustomerManagedS3")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html")
    private Property<ChannelCustomerManagedS3> customerManagedS3;
    /**
     * ChannelServiceManagedS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-servicemanageds3.html
     * 
     */
    @JsonProperty("ServiceManagedS3")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-servicemanageds3.html")
    private Property<ChannelServiceManagedS3> serviceManagedS3;

    /**
     * ChannelCustomerManagedS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html
     * 
     */
    @JsonIgnore
    public Property<ChannelCustomerManagedS3> getCustomerManagedS3() {
        return customerManagedS3;
    }

    /**
     * ChannelCustomerManagedS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html
     * 
     */
    @JsonIgnore
    public void setCustomerManagedS3(Property<ChannelCustomerManagedS3> customerManagedS3) {
        this.customerManagedS3 = customerManagedS3;
    }

    public ChannelChannelStorage withCustomerManagedS3(Property<ChannelCustomerManagedS3> customerManagedS3) {
        this.customerManagedS3 = customerManagedS3;
        return this;
    }

    /**
     * ChannelServiceManagedS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-servicemanageds3.html
     * 
     */
    @JsonIgnore
    public Property<ChannelServiceManagedS3> getServiceManagedS3() {
        return serviceManagedS3;
    }

    /**
     * ChannelServiceManagedS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-servicemanageds3.html
     * 
     */
    @JsonIgnore
    public void setServiceManagedS3(Property<ChannelServiceManagedS3> serviceManagedS3) {
        this.serviceManagedS3 = serviceManagedS3;
    }

    public ChannelChannelStorage withServiceManagedS3(Property<ChannelServiceManagedS3> serviceManagedS3) {
        this.serviceManagedS3 = serviceManagedS3;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customerManagedS3", customerManagedS3).append("serviceManagedS3", serviceManagedS3).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(customerManagedS3).append(serviceManagedS3).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelChannelStorage) == false) {
            return false;
        }
        ChannelChannelStorage rhs = ((ChannelChannelStorage) other);
        return new EqualsBuilder().append(customerManagedS3, rhs.customerManagedS3).append(serviceManagedS3, rhs.serviceManagedS3).isEquals();
    }

}
