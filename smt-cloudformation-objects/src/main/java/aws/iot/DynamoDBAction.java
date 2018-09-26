
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
    private CharSequence hashKeyField;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype
     * 
     */
    @JsonProperty("HashKeyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype")
    private CharSequence hashKeyType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue
     * 
     */
    @JsonProperty("HashKeyValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue")
    private CharSequence hashKeyValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield
     * 
     */
    @JsonProperty("PayloadField")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield")
    private CharSequence payloadField;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield
     * 
     */
    @JsonProperty("RangeKeyField")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield")
    private CharSequence rangeKeyField;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype
     * 
     */
    @JsonProperty("RangeKeyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype")
    private CharSequence rangeKeyType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue
     * 
     */
    @JsonProperty("RangeKeyValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue")
    private CharSequence rangeKeyValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename
     * 
     */
    @JsonProperty("TableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename")
    private CharSequence tableName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield
     * 
     */
    public CharSequence getHashKeyField() {
        return hashKeyField;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield
     * 
     */
    public void setHashKeyField(CharSequence hashKeyField) {
        this.hashKeyField = hashKeyField;
    }

    public DynamoDBAction withHashKeyField(CharSequence hashKeyField) {
        this.hashKeyField = hashKeyField;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype
     * 
     */
    public CharSequence getHashKeyType() {
        return hashKeyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype
     * 
     */
    public void setHashKeyType(CharSequence hashKeyType) {
        this.hashKeyType = hashKeyType;
    }

    public DynamoDBAction withHashKeyType(CharSequence hashKeyType) {
        this.hashKeyType = hashKeyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue
     * 
     */
    public CharSequence getHashKeyValue() {
        return hashKeyValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue
     * 
     */
    public void setHashKeyValue(CharSequence hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }

    public DynamoDBAction withHashKeyValue(CharSequence hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield
     * 
     */
    public CharSequence getPayloadField() {
        return payloadField;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield
     * 
     */
    public void setPayloadField(CharSequence payloadField) {
        this.payloadField = payloadField;
    }

    public DynamoDBAction withPayloadField(CharSequence payloadField) {
        this.payloadField = payloadField;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield
     * 
     */
    public CharSequence getRangeKeyField() {
        return rangeKeyField;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield
     * 
     */
    public void setRangeKeyField(CharSequence rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
    }

    public DynamoDBAction withRangeKeyField(CharSequence rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype
     * 
     */
    public CharSequence getRangeKeyType() {
        return rangeKeyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype
     * 
     */
    public void setRangeKeyType(CharSequence rangeKeyType) {
        this.rangeKeyType = rangeKeyType;
    }

    public DynamoDBAction withRangeKeyType(CharSequence rangeKeyType) {
        this.rangeKeyType = rangeKeyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue
     * 
     */
    public CharSequence getRangeKeyValue() {
        return rangeKeyValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue
     * 
     */
    public void setRangeKeyValue(CharSequence rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
    }

    public DynamoDBAction withRangeKeyValue(CharSequence rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public DynamoDBAction withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename
     * 
     */
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename
     * 
     */
    public void setTableName(CharSequence tableName) {
        this.tableName = tableName;
    }

    public DynamoDBAction withTableName(CharSequence tableName) {
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
