
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DynamoDBv2Action
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PutItem",
    "RoleArn"
})
public class DynamoDBv2Action {

    /**
     * PutItemInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html
     * 
     */
    @JsonProperty("PutItem")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html")
    private PutItemInput putItem;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-rolearn")
    private CharSequence roleArn;

    /**
     * PutItemInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html
     * 
     */
    public PutItemInput getPutItem() {
        return putItem;
    }

    /**
     * PutItemInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html
     * 
     */
    public void setPutItem(PutItemInput putItem) {
        this.putItem = putItem;
    }

    public DynamoDBv2Action withPutItem(PutItemInput putItem) {
        this.putItem = putItem;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public DynamoDBv2Action withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("putItem", putItem).append("roleArn", roleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(putItem).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DynamoDBv2Action) == false) {
            return false;
        }
        DynamoDBv2Action rhs = ((DynamoDBv2Action) other);
        return new EqualsBuilder().append(putItem, rhs.putItem).append(roleArn, rhs.roleArn).isEquals();
    }

}
