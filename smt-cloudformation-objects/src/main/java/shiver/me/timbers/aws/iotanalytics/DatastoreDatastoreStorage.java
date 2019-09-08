
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
 * DatastoreDatastoreStorage
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CustomerManagedS3",
    "ServiceManagedS3"
})
public class DatastoreDatastoreStorage implements Property<DatastoreDatastoreStorage>
{

    /**
     * DatastoreCustomerManagedS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html
     * 
     */
    @JsonProperty("CustomerManagedS3")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html")
    private Property<DatastoreCustomerManagedS3> customerManagedS3;
    /**
     * DatastoreServiceManagedS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-servicemanageds3.html
     * 
     */
    @JsonProperty("ServiceManagedS3")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-servicemanageds3.html")
    private Property<DatastoreServiceManagedS3> serviceManagedS3;

    /**
     * DatastoreCustomerManagedS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html
     * 
     */
    @JsonIgnore
    public Property<DatastoreCustomerManagedS3> getCustomerManagedS3() {
        return customerManagedS3;
    }

    /**
     * DatastoreCustomerManagedS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html
     * 
     */
    @JsonIgnore
    public void setCustomerManagedS3(Property<DatastoreCustomerManagedS3> customerManagedS3) {
        this.customerManagedS3 = customerManagedS3;
    }

    public DatastoreDatastoreStorage withCustomerManagedS3(Property<DatastoreCustomerManagedS3> customerManagedS3) {
        this.customerManagedS3 = customerManagedS3;
        return this;
    }

    /**
     * DatastoreServiceManagedS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-servicemanageds3.html
     * 
     */
    @JsonIgnore
    public Property<DatastoreServiceManagedS3> getServiceManagedS3() {
        return serviceManagedS3;
    }

    /**
     * DatastoreServiceManagedS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-servicemanageds3.html
     * 
     */
    @JsonIgnore
    public void setServiceManagedS3(Property<DatastoreServiceManagedS3> serviceManagedS3) {
        this.serviceManagedS3 = serviceManagedS3;
    }

    public DatastoreDatastoreStorage withServiceManagedS3(Property<DatastoreServiceManagedS3> serviceManagedS3) {
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
        if ((other instanceof DatastoreDatastoreStorage) == false) {
            return false;
        }
        DatastoreDatastoreStorage rhs = ((DatastoreDatastoreStorage) other);
        return new EqualsBuilder().append(customerManagedS3, rhs.customerManagedS3).append(serviceManagedS3, rhs.serviceManagedS3).isEquals();
    }

}
