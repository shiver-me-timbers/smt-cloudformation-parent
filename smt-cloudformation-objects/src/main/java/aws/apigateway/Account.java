
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Account
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CloudWatchRoleArn"
})
public class Account {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html#cfn-apigateway-account-cloudwatchrolearn
     * 
     */
    @JsonProperty("CloudWatchRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html#cfn-apigateway-account-cloudwatchrolearn")
    private CharSequence cloudWatchRoleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html#cfn-apigateway-account-cloudwatchrolearn
     * 
     */
    public CharSequence getCloudWatchRoleArn() {
        return cloudWatchRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html#cfn-apigateway-account-cloudwatchrolearn
     * 
     */
    public void setCloudWatchRoleArn(CharSequence cloudWatchRoleArn) {
        this.cloudWatchRoleArn = cloudWatchRoleArn;
    }

    public Account withCloudWatchRoleArn(CharSequence cloudWatchRoleArn) {
        this.cloudWatchRoleArn = cloudWatchRoleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudWatchRoleArn", cloudWatchRoleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchRoleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Account) == false) {
            return false;
        }
        Account rhs = ((Account) other);
        return new EqualsBuilder().append(cloudWatchRoleArn, rhs.cloudWatchRoleArn).isEquals();
    }

}
