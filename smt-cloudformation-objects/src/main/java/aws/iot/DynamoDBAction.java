
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DynamoDBAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "HashKeyField",
    "HashKeyType",
    "HashKeyValue",
    "PayloadField",
    "RangeKeyField",
    "RangeKeyType",
    "RangeKeyValue",
    "RoleArn",
    "TableName"
})
public class DynamoDBAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield
     * 
     */
    @JsonProperty("HashKeyField")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield")
    private String hashKeyField;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype
     * 
     */
    @JsonProperty("HashKeyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype")
    private String hashKeyType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue
     * 
     */
    @JsonProperty("HashKeyValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue")
    private String hashKeyValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield
     * 
     */
    @JsonProperty("PayloadField")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield")
    private String payloadField;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield
     * 
     */
    @JsonProperty("RangeKeyField")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield")
    private String rangeKeyField;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype
     * 
     */
    @JsonProperty("RangeKeyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype")
    private String rangeKeyType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue
     * 
     */
    @JsonProperty("RangeKeyValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue")
    private String rangeKeyValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn")
    private String roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename
     * 
     */
    @JsonProperty("TableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename")
    private String tableName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield
     * 
     */
    @JsonProperty("HashKeyField")
    public String getHashKeyField() {
        return hashKeyField;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield
     * 
     */
    @JsonProperty("HashKeyField")
    public void setHashKeyField(String hashKeyField) {
        this.hashKeyField = hashKeyField;
    }

    public DynamoDBAction withHashKeyField(String hashKeyField) {
        this.hashKeyField = hashKeyField;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype
     * 
     */
    @JsonProperty("HashKeyType")
    public String getHashKeyType() {
        return hashKeyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype
     * 
     */
    @JsonProperty("HashKeyType")
    public void setHashKeyType(String hashKeyType) {
        this.hashKeyType = hashKeyType;
    }

    public DynamoDBAction withHashKeyType(String hashKeyType) {
        this.hashKeyType = hashKeyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue
     * 
     */
    @JsonProperty("HashKeyValue")
    public String getHashKeyValue() {
        return hashKeyValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue
     * 
     */
    @JsonProperty("HashKeyValue")
    public void setHashKeyValue(String hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }

    public DynamoDBAction withHashKeyValue(String hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield
     * 
     */
    @JsonProperty("PayloadField")
    public String getPayloadField() {
        return payloadField;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield
     * 
     */
    @JsonProperty("PayloadField")
    public void setPayloadField(String payloadField) {
        this.payloadField = payloadField;
    }

    public DynamoDBAction withPayloadField(String payloadField) {
        this.payloadField = payloadField;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield
     * 
     */
    @JsonProperty("RangeKeyField")
    public String getRangeKeyField() {
        return rangeKeyField;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield
     * 
     */
    @JsonProperty("RangeKeyField")
    public void setRangeKeyField(String rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
    }

    public DynamoDBAction withRangeKeyField(String rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype
     * 
     */
    @JsonProperty("RangeKeyType")
    public String getRangeKeyType() {
        return rangeKeyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype
     * 
     */
    @JsonProperty("RangeKeyType")
    public void setRangeKeyType(String rangeKeyType) {
        this.rangeKeyType = rangeKeyType;
    }

    public DynamoDBAction withRangeKeyType(String rangeKeyType) {
        this.rangeKeyType = rangeKeyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue
     * 
     */
    @JsonProperty("RangeKeyValue")
    public String getRangeKeyValue() {
        return rangeKeyValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue
     * 
     */
    @JsonProperty("RangeKeyValue")
    public void setRangeKeyValue(String rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
    }

    public DynamoDBAction withRangeKeyValue(String rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    public DynamoDBAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename
     * 
     */
    @JsonProperty("TableName")
    public String getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename
     * 
     */
    @JsonProperty("TableName")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DynamoDBAction withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hashKeyField", hashKeyField).append("hashKeyType", hashKeyType).append("hashKeyValue", hashKeyValue).append("payloadField", payloadField).append("rangeKeyField", rangeKeyField).append("rangeKeyType", rangeKeyType).append("rangeKeyValue", rangeKeyValue).append("roleArn", roleArn).append("tableName", tableName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rangeKeyType).append(rangeKeyValue).append(rangeKeyField).append(roleArn).append(hashKeyField).append(payloadField).append(hashKeyType).append(hashKeyValue).append(tableName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DynamoDBAction) == false) {
            return false;
        }
        DynamoDBAction rhs = ((DynamoDBAction) other);
        return new EqualsBuilder().append(rangeKeyType, rhs.rangeKeyType).append(rangeKeyValue, rhs.rangeKeyValue).append(rangeKeyField, rhs.rangeKeyField).append(roleArn, rhs.roleArn).append(hashKeyField, rhs.hashKeyField).append(payloadField, rhs.payloadField).append(hashKeyType, rhs.hashKeyType).append(hashKeyValue, rhs.hashKeyValue).append(tableName, rhs.tableName).isEquals();
    }

}
