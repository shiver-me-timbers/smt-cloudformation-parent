
package shiver.me.timbers.aws.iotevents;

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
 * DetectorModelDynamoDB
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TableName",
    "PayloadField",
    "RangeKeyField",
    "HashKeyField",
    "RangeKeyValue",
    "RangeKeyType",
    "HashKeyType",
    "HashKeyValue",
    "Payload",
    "Operation"
})
public class DetectorModelDynamoDB implements Property<DetectorModelDynamoDB>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-tablename
     * 
     */
    @JsonProperty("TableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-tablename")
    private CharSequence tableName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-payloadfield
     * 
     */
    @JsonProperty("PayloadField")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-payloadfield")
    private CharSequence payloadField;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeyfield
     * 
     */
    @JsonProperty("RangeKeyField")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeyfield")
    private CharSequence rangeKeyField;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeyfield
     * 
     */
    @JsonProperty("HashKeyField")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeyfield")
    private CharSequence hashKeyField;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeyvalue
     * 
     */
    @JsonProperty("RangeKeyValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeyvalue")
    private CharSequence rangeKeyValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeytype
     * 
     */
    @JsonProperty("RangeKeyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeytype")
    private CharSequence rangeKeyType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeytype
     * 
     */
    @JsonProperty("HashKeyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeytype")
    private CharSequence hashKeyType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeyvalue
     * 
     */
    @JsonProperty("HashKeyValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeyvalue")
    private CharSequence hashKeyValue;
    /**
     * DetectorModelPayload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html
     * 
     */
    @JsonProperty("Payload")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html")
    private Property<DetectorModelPayload> payload;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-operation
     * 
     */
    @JsonProperty("Operation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-operation")
    private CharSequence operation;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-tablename
     * 
     */
    @JsonIgnore
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-tablename
     * 
     */
    @JsonIgnore
    public void setTableName(CharSequence tableName) {
        this.tableName = tableName;
    }

    public DetectorModelDynamoDB withTableName(CharSequence tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-payloadfield
     * 
     */
    @JsonIgnore
    public CharSequence getPayloadField() {
        return payloadField;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-payloadfield
     * 
     */
    @JsonIgnore
    public void setPayloadField(CharSequence payloadField) {
        this.payloadField = payloadField;
    }

    public DetectorModelDynamoDB withPayloadField(CharSequence payloadField) {
        this.payloadField = payloadField;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeyfield
     * 
     */
    @JsonIgnore
    public CharSequence getRangeKeyField() {
        return rangeKeyField;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeyfield
     * 
     */
    @JsonIgnore
    public void setRangeKeyField(CharSequence rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
    }

    public DetectorModelDynamoDB withRangeKeyField(CharSequence rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeyfield
     * 
     */
    @JsonIgnore
    public CharSequence getHashKeyField() {
        return hashKeyField;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeyfield
     * 
     */
    @JsonIgnore
    public void setHashKeyField(CharSequence hashKeyField) {
        this.hashKeyField = hashKeyField;
    }

    public DetectorModelDynamoDB withHashKeyField(CharSequence hashKeyField) {
        this.hashKeyField = hashKeyField;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeyvalue
     * 
     */
    @JsonIgnore
    public CharSequence getRangeKeyValue() {
        return rangeKeyValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeyvalue
     * 
     */
    @JsonIgnore
    public void setRangeKeyValue(CharSequence rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
    }

    public DetectorModelDynamoDB withRangeKeyValue(CharSequence rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeytype
     * 
     */
    @JsonIgnore
    public CharSequence getRangeKeyType() {
        return rangeKeyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeytype
     * 
     */
    @JsonIgnore
    public void setRangeKeyType(CharSequence rangeKeyType) {
        this.rangeKeyType = rangeKeyType;
    }

    public DetectorModelDynamoDB withRangeKeyType(CharSequence rangeKeyType) {
        this.rangeKeyType = rangeKeyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeytype
     * 
     */
    @JsonIgnore
    public CharSequence getHashKeyType() {
        return hashKeyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeytype
     * 
     */
    @JsonIgnore
    public void setHashKeyType(CharSequence hashKeyType) {
        this.hashKeyType = hashKeyType;
    }

    public DetectorModelDynamoDB withHashKeyType(CharSequence hashKeyType) {
        this.hashKeyType = hashKeyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeyvalue
     * 
     */
    @JsonIgnore
    public CharSequence getHashKeyValue() {
        return hashKeyValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeyvalue
     * 
     */
    @JsonIgnore
    public void setHashKeyValue(CharSequence hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }

    public DetectorModelDynamoDB withHashKeyValue(CharSequence hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
        return this;
    }

    /**
     * DetectorModelPayload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelPayload> getPayload() {
        return payload;
    }

    /**
     * DetectorModelPayload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html
     * 
     */
    @JsonIgnore
    public void setPayload(Property<DetectorModelPayload> payload) {
        this.payload = payload;
    }

    public DetectorModelDynamoDB withPayload(Property<DetectorModelPayload> payload) {
        this.payload = payload;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-operation
     * 
     */
    @JsonIgnore
    public CharSequence getOperation() {
        return operation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-operation
     * 
     */
    @JsonIgnore
    public void setOperation(CharSequence operation) {
        this.operation = operation;
    }

    public DetectorModelDynamoDB withOperation(CharSequence operation) {
        this.operation = operation;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tableName", tableName).append("payloadField", payloadField).append("rangeKeyField", rangeKeyField).append("hashKeyField", hashKeyField).append("rangeKeyValue", rangeKeyValue).append("rangeKeyType", rangeKeyType).append("hashKeyType", hashKeyType).append("hashKeyValue", hashKeyValue).append("payload", payload).append("operation", operation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rangeKeyType).append(rangeKeyValue).append(rangeKeyField).append(payload).append(payloadField).append(hashKeyField).append(hashKeyType).append(operation).append(tableName).append(hashKeyValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelDynamoDB) == false) {
            return false;
        }
        DetectorModelDynamoDB rhs = ((DetectorModelDynamoDB) other);
        return new EqualsBuilder().append(rangeKeyType, rhs.rangeKeyType).append(rangeKeyValue, rhs.rangeKeyValue).append(rangeKeyField, rhs.rangeKeyField).append(payload, rhs.payload).append(payloadField, rhs.payloadField).append(hashKeyField, rhs.hashKeyField).append(hashKeyType, rhs.hashKeyType).append(operation, rhs.operation).append(tableName, rhs.tableName).append(hashKeyValue, rhs.hashKeyValue).isEquals();
    }

}
