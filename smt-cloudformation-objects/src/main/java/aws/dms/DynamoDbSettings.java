
package aws.dms;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DynamoDbSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ServiceAccessRoleArn"
})
public class DynamoDbSettings {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html#cfn-dms-endpoint-dynamodbsettings-serviceaccessrolearn
     * 
     */
    @JsonProperty("ServiceAccessRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html#cfn-dms-endpoint-dynamodbsettings-serviceaccessrolearn")
    private CharSequence serviceAccessRoleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html#cfn-dms-endpoint-dynamodbsettings-serviceaccessrolearn
     * 
     */
    public CharSequence getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html#cfn-dms-endpoint-dynamodbsettings-serviceaccessrolearn
     * 
     */
    public void setServiceAccessRoleArn(CharSequence serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    public DynamoDbSettings withServiceAccessRoleArn(CharSequence serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serviceAccessRoleArn", serviceAccessRoleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serviceAccessRoleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DynamoDbSettings) == false) {
            return false;
        }
        DynamoDbSettings rhs = ((DynamoDbSettings) other);
        return new EqualsBuilder().append(serviceAccessRoleArn, rhs.serviceAccessRoleArn).isEquals();
    }

}
