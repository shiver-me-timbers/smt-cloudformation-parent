
package aws.iam;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AccessKey
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Serial",
    "Status",
    "UserName"
})
public class AccessKey {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-serial
     * 
     */
    @JsonProperty("Serial")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-serial")
    private Integer serial;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-status
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-status")
    private CharSequence status;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-username
     * 
     */
    @JsonProperty("UserName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-username")
    private CharSequence userName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-serial
     * 
     */
    public Integer getSerial() {
        return serial;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-serial
     * 
     */
    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public AccessKey withSerial(Integer serial) {
        this.serial = serial;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-status
     * 
     */
    public CharSequence getStatus() {
        return status;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-status
     * 
     */
    public void setStatus(CharSequence status) {
        this.status = status;
    }

    public AccessKey withStatus(CharSequence status) {
        this.status = status;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-username
     * 
     */
    public CharSequence getUserName() {
        return userName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-username
     * 
     */
    public void setUserName(CharSequence userName) {
        this.userName = userName;
    }

    public AccessKey withUserName(CharSequence userName) {
        this.userName = userName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serial", serial).append("status", status).append("userName", userName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(userName).append(serial).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessKey) == false) {
            return false;
        }
        AccessKey rhs = ((AccessKey) other);
        return new EqualsBuilder().append(userName, rhs.userName).append(serial, rhs.serial).append(status, rhs.status).isEquals();
    }

}
