
package aws.dynamodb;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Table
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AttributeDefinitions",
    "BillingMode",
    "GlobalSecondaryIndexes",
    "KeySchema",
    "LocalSecondaryIndexes",
    "PointInTimeRecoverySpecification",
    "ProvisionedThroughput",
    "SSESpecification",
    "StreamSpecification",
    "TableName",
    "Tags",
    "TimeToLiveSpecification"
})
public class Table {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedef
     * 
     */
    @JsonProperty("AttributeDefinitions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedef")
    private List<Property<AttributeDefinition>> attributeDefinitions = new ArrayList<Property<AttributeDefinition>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-billingmode
     * 
     */
    @JsonProperty("BillingMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-billingmode")
    private CharSequence billingMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-gsi
     * 
     */
    @JsonProperty("GlobalSecondaryIndexes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-gsi")
    private List<Property<GlobalSecondaryIndex>> globalSecondaryIndexes = new ArrayList<Property<GlobalSecondaryIndex>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema
     * 
     */
    @JsonProperty("KeySchema")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema")
    private Set<Property<KeySchema>> keySchema = new LinkedHashSet<Property<KeySchema>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-lsi
     * 
     */
    @JsonProperty("LocalSecondaryIndexes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-lsi")
    private List<Property<LocalSecondaryIndex>> localSecondaryIndexes = new ArrayList<Property<LocalSecondaryIndex>>();
    /**
     * PointInTimeRecoverySpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html
     * 
     */
    @JsonProperty("PointInTimeRecoverySpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html")
    private Property<PointInTimeRecoverySpecification> pointInTimeRecoverySpecification;
    /**
     * ProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
     * 
     */
    @JsonProperty("ProvisionedThroughput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html")
    private Property<ProvisionedThroughput> provisionedThroughput;
    /**
     * SSESpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html
     * 
     */
    @JsonProperty("SSESpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html")
    private Property<SSESpecification> sSESpecification;
    /**
     * StreamSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html
     * 
     */
    @JsonProperty("StreamSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html")
    private Property<StreamSpecification> streamSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tablename
     * 
     */
    @JsonProperty("TableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tablename")
    private CharSequence tableName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * TimeToLiveSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html
     * 
     */
    @JsonProperty("TimeToLiveSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html")
    private Property<TimeToLiveSpecification> timeToLiveSpecification;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedef
     * 
     */
    @JsonIgnore
    public List<Property<AttributeDefinition>> getAttributeDefinitions() {
        return attributeDefinitions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedef
     * 
     */
    @JsonIgnore
    public void setAttributeDefinitions(List<Property<AttributeDefinition>> attributeDefinitions) {
        this.attributeDefinitions = attributeDefinitions;
    }

    public Table withAttributeDefinitions(List<Property<AttributeDefinition>> attributeDefinitions) {
        this.attributeDefinitions = attributeDefinitions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-billingmode
     * 
     */
    @JsonIgnore
    public CharSequence getBillingMode() {
        return billingMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-billingmode
     * 
     */
    @JsonIgnore
    public void setBillingMode(CharSequence billingMode) {
        this.billingMode = billingMode;
    }

    public Table withBillingMode(CharSequence billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-gsi
     * 
     */
    @JsonIgnore
    public List<Property<GlobalSecondaryIndex>> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-gsi
     * 
     */
    @JsonIgnore
    public void setGlobalSecondaryIndexes(List<Property<GlobalSecondaryIndex>> globalSecondaryIndexes) {
        this.globalSecondaryIndexes = globalSecondaryIndexes;
    }

    public Table withGlobalSecondaryIndexes(List<Property<GlobalSecondaryIndex>> globalSecondaryIndexes) {
        this.globalSecondaryIndexes = globalSecondaryIndexes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema
     * 
     */
    @JsonIgnore
    public Set<Property<KeySchema>> getKeySchema() {
        return keySchema;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema
     * 
     */
    @JsonIgnore
    public void setKeySchema(Set<Property<KeySchema>> keySchema) {
        this.keySchema = keySchema;
    }

    public Table withKeySchema(Set<Property<KeySchema>> keySchema) {
        this.keySchema = keySchema;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-lsi
     * 
     */
    @JsonIgnore
    public List<Property<LocalSecondaryIndex>> getLocalSecondaryIndexes() {
        return localSecondaryIndexes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-lsi
     * 
     */
    @JsonIgnore
    public void setLocalSecondaryIndexes(List<Property<LocalSecondaryIndex>> localSecondaryIndexes) {
        this.localSecondaryIndexes = localSecondaryIndexes;
    }

    public Table withLocalSecondaryIndexes(List<Property<LocalSecondaryIndex>> localSecondaryIndexes) {
        this.localSecondaryIndexes = localSecondaryIndexes;
        return this;
    }

    /**
     * PointInTimeRecoverySpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html
     * 
     */
    @JsonIgnore
    public Property<PointInTimeRecoverySpecification> getPointInTimeRecoverySpecification() {
        return pointInTimeRecoverySpecification;
    }

    /**
     * PointInTimeRecoverySpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html
     * 
     */
    @JsonIgnore
    public void setPointInTimeRecoverySpecification(Property<PointInTimeRecoverySpecification> pointInTimeRecoverySpecification) {
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
    }

    public Table withPointInTimeRecoverySpecification(Property<PointInTimeRecoverySpecification> pointInTimeRecoverySpecification) {
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
        return this;
    }

    /**
     * ProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
     * 
     */
    @JsonIgnore
    public Property<ProvisionedThroughput> getProvisionedThroughput() {
        return provisionedThroughput;
    }

    /**
     * ProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
     * 
     */
    @JsonIgnore
    public void setProvisionedThroughput(Property<ProvisionedThroughput> provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    public Table withProvisionedThroughput(Property<ProvisionedThroughput> provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    /**
     * SSESpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html
     * 
     */
    @JsonIgnore
    public Property<SSESpecification> getSSESpecification() {
        return sSESpecification;
    }

    /**
     * SSESpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html
     * 
     */
    @JsonIgnore
    public void setSSESpecification(Property<SSESpecification> sSESpecification) {
        this.sSESpecification = sSESpecification;
    }

    public Table withSSESpecification(Property<SSESpecification> sSESpecification) {
        this.sSESpecification = sSESpecification;
        return this;
    }

    /**
     * StreamSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html
     * 
     */
    @JsonIgnore
    public Property<StreamSpecification> getStreamSpecification() {
        return streamSpecification;
    }

    /**
     * StreamSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html
     * 
     */
    @JsonIgnore
    public void setStreamSpecification(Property<StreamSpecification> streamSpecification) {
        this.streamSpecification = streamSpecification;
    }

    public Table withStreamSpecification(Property<StreamSpecification> streamSpecification) {
        this.streamSpecification = streamSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tablename
     * 
     */
    @JsonIgnore
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tablename
     * 
     */
    @JsonIgnore
    public void setTableName(CharSequence tableName) {
        this.tableName = tableName;
    }

    public Table withTableName(CharSequence tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Table withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * TimeToLiveSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html
     * 
     */
    @JsonIgnore
    public Property<TimeToLiveSpecification> getTimeToLiveSpecification() {
        return timeToLiveSpecification;
    }

    /**
     * TimeToLiveSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html
     * 
     */
    @JsonIgnore
    public void setTimeToLiveSpecification(Property<TimeToLiveSpecification> timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
    }

    public Table withTimeToLiveSpecification(Property<TimeToLiveSpecification> timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attributeDefinitions", attributeDefinitions).append("billingMode", billingMode).append("globalSecondaryIndexes", globalSecondaryIndexes).append("keySchema", keySchema).append("localSecondaryIndexes", localSecondaryIndexes).append("pointInTimeRecoverySpecification", pointInTimeRecoverySpecification).append("provisionedThroughput", provisionedThroughput).append("sSESpecification", sSESpecification).append("streamSpecification", streamSpecification).append("tableName", tableName).append("tags", tags).append("timeToLiveSpecification", timeToLiveSpecification).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(globalSecondaryIndexes).append(pointInTimeRecoverySpecification).append(billingMode).append(sSESpecification).append(keySchema).append(timeToLiveSpecification).append(provisionedThroughput).append(tableName).append(tags).append(streamSpecification).append(attributeDefinitions).append(localSecondaryIndexes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Table) == false) {
            return false;
        }
        Table rhs = ((Table) other);
        return new EqualsBuilder().append(globalSecondaryIndexes, rhs.globalSecondaryIndexes).append(pointInTimeRecoverySpecification, rhs.pointInTimeRecoverySpecification).append(billingMode, rhs.billingMode).append(sSESpecification, rhs.sSESpecification).append(keySchema, rhs.keySchema).append(timeToLiveSpecification, rhs.timeToLiveSpecification).append(provisionedThroughput, rhs.provisionedThroughput).append(tableName, rhs.tableName).append(tags, rhs.tags).append(streamSpecification, rhs.streamSpecification).append(attributeDefinitions, rhs.attributeDefinitions).append(localSecondaryIndexes, rhs.localSecondaryIndexes).isEquals();
    }

}
