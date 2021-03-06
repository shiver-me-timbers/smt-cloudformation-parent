
package shiver.me.timbers.aws.iot;

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
 * TopicRuleDynamoDBAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
public class TopicRuleDynamoDBAction implements Property<TopicRuleDynamoDBAction>
{

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
    @JsonIgnore
    public CharSequence getHashKeyField() {
        return hashKeyField;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield
     * 
     */
    @JsonIgnore
    public void setHashKeyField(CharSequence hashKeyField) {
        this.hashKeyField = hashKeyField;
    }

    public TopicRuleDynamoDBAction withHashKeyField(CharSequence hashKeyField) {
        this.hashKeyField = hashKeyField;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype
     * 
     */
    @JsonIgnore
    public CharSequence getHashKeyType() {
        return hashKeyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype
     * 
     */
    @JsonIgnore
    public void setHashKeyType(CharSequence hashKeyType) {
        this.hashKeyType = hashKeyType;
    }

    public TopicRuleDynamoDBAction withHashKeyType(CharSequence hashKeyType) {
        this.hashKeyType = hashKeyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue
     * 
     */
    @JsonIgnore
    public CharSequence getHashKeyValue() {
        return hashKeyValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue
     * 
     */
    @JsonIgnore
    public void setHashKeyValue(CharSequence hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }

    public TopicRuleDynamoDBAction withHashKeyValue(CharSequence hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield
     * 
     */
    @JsonIgnore
    public CharSequence getPayloadField() {
        return payloadField;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield
     * 
     */
    @JsonIgnore
    public void setPayloadField(CharSequence payloadField) {
        this.payloadField = payloadField;
    }

    public TopicRuleDynamoDBAction withPayloadField(CharSequence payloadField) {
        this.payloadField = payloadField;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield
     * 
     */
    @JsonIgnore
    public CharSequence getRangeKeyField() {
        return rangeKeyField;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield
     * 
     */
    @JsonIgnore
    public void setRangeKeyField(CharSequence rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
    }

    public TopicRuleDynamoDBAction withRangeKeyField(CharSequence rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype
     * 
     */
    @JsonIgnore
    public CharSequence getRangeKeyType() {
        return rangeKeyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype
     * 
     */
    @JsonIgnore
    public void setRangeKeyType(CharSequence rangeKeyType) {
        this.rangeKeyType = rangeKeyType;
    }

    public TopicRuleDynamoDBAction withRangeKeyType(CharSequence rangeKeyType) {
        this.rangeKeyType = rangeKeyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue
     * 
     */
    @JsonIgnore
    public CharSequence getRangeKeyValue() {
        return rangeKeyValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue
     * 
     */
    @JsonIgnore
    public void setRangeKeyValue(CharSequence rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
    }

    public TopicRuleDynamoDBAction withRangeKeyValue(CharSequence rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public TopicRuleDynamoDBAction withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename
     * 
     */
    @JsonIgnore
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename
     * 
     */
    @JsonIgnore
    public void setTableName(CharSequence tableName) {
        this.tableName = tableName;
    }

    public TopicRuleDynamoDBAction withTableName(CharSequence tableName) {
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
        if ((other instanceof TopicRuleDynamoDBAction) == false) {
            return false;
        }
        TopicRuleDynamoDBAction rhs = ((TopicRuleDynamoDBAction) other);
        return new EqualsBuilder().append(rangeKeyType, rhs.rangeKeyType).append(rangeKeyValue, rhs.rangeKeyValue).append(rangeKeyField, rhs.rangeKeyField).append(roleArn, rhs.roleArn).append(hashKeyField, rhs.hashKeyField).append(payloadField, rhs.payloadField).append(hashKeyType, rhs.hashKeyType).append(hashKeyValue, rhs.hashKeyValue).append(tableName, rhs.tableName).isEquals();
    }

}
