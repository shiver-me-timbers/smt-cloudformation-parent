
package aws.dynamodb;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Tag;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AttributeDefinitions",
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
    private List<AttributeDefinition> attributeDefinitions = new ArrayList<AttributeDefinition>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-gsi
     * 
     */
    @JsonProperty("GlobalSecondaryIndexes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-gsi")
    private List<GlobalSecondaryIndex> globalSecondaryIndexes = new ArrayList<GlobalSecondaryIndex>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema
     * 
     */
    @JsonProperty("KeySchema")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema")
    private Set<KeySchema> keySchema = new LinkedHashSet<KeySchema>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-lsi
     * 
     */
    @JsonProperty("LocalSecondaryIndexes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-lsi")
    private List<LocalSecondaryIndex> localSecondaryIndexes = new ArrayList<LocalSecondaryIndex>();
    /**
     * PointInTimeRecoverySpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html
     * 
     */
    @JsonProperty("PointInTimeRecoverySpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html")
    private PointInTimeRecoverySpecification pointInTimeRecoverySpecification;
    /**
     * ProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
     * 
     */
    @JsonProperty("ProvisionedThroughput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html")
    private ProvisionedThroughput provisionedThroughput;
    /**
     * SSESpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html
     * 
     */
    @JsonProperty("SSESpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html")
    private SSESpecification sSESpecification;
    /**
     * StreamSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html
     * 
     */
    @JsonProperty("StreamSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html")
    private StreamSpecification streamSpecification;
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
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * TimeToLiveSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html
     * 
     */
    @JsonProperty("TimeToLiveSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html")
    private TimeToLiveSpecification timeToLiveSpecification;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedef
     * 
     */
    public List<AttributeDefinition> getAttributeDefinitions() {
        return attributeDefinitions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedef
     * 
     */
    public void setAttributeDefinitions(List<AttributeDefinition> attributeDefinitions) {
        this.attributeDefinitions = attributeDefinitions;
    }

    public Table withAttributeDefinitions(List<AttributeDefinition> attributeDefinitions) {
        this.attributeDefinitions = attributeDefinitions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-gsi
     * 
     */
    public List<GlobalSecondaryIndex> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-gsi
     * 
     */
    public void setGlobalSecondaryIndexes(List<GlobalSecondaryIndex> globalSecondaryIndexes) {
        this.globalSecondaryIndexes = globalSecondaryIndexes;
    }

    public Table withGlobalSecondaryIndexes(List<GlobalSecondaryIndex> globalSecondaryIndexes) {
        this.globalSecondaryIndexes = globalSecondaryIndexes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema
     * 
     */
    public Set<KeySchema> getKeySchema() {
        return keySchema;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema
     * 
     */
    public void setKeySchema(Set<KeySchema> keySchema) {
        this.keySchema = keySchema;
    }

    public Table withKeySchema(Set<KeySchema> keySchema) {
        this.keySchema = keySchema;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-lsi
     * 
     */
    public List<LocalSecondaryIndex> getLocalSecondaryIndexes() {
        return localSecondaryIndexes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-lsi
     * 
     */
    public void setLocalSecondaryIndexes(List<LocalSecondaryIndex> localSecondaryIndexes) {
        this.localSecondaryIndexes = localSecondaryIndexes;
    }

    public Table withLocalSecondaryIndexes(List<LocalSecondaryIndex> localSecondaryIndexes) {
        this.localSecondaryIndexes = localSecondaryIndexes;
        return this;
    }

    /**
     * PointInTimeRecoverySpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html
     * 
     */
    public PointInTimeRecoverySpecification getPointInTimeRecoverySpecification() {
        return pointInTimeRecoverySpecification;
    }

    /**
     * PointInTimeRecoverySpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html
     * 
     */
    public void setPointInTimeRecoverySpecification(PointInTimeRecoverySpecification pointInTimeRecoverySpecification) {
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
    }

    public Table withPointInTimeRecoverySpecification(PointInTimeRecoverySpecification pointInTimeRecoverySpecification) {
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
        return this;
    }

    /**
     * ProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
     * 
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }

    /**
     * ProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
     * 
     */
    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    public Table withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    /**
     * SSESpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html
     * 
     */
    public SSESpecification getSSESpecification() {
        return sSESpecification;
    }

    /**
     * SSESpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html
     * 
     */
    public void setSSESpecification(SSESpecification sSESpecification) {
        this.sSESpecification = sSESpecification;
    }

    public Table withSSESpecification(SSESpecification sSESpecification) {
        this.sSESpecification = sSESpecification;
        return this;
    }

    /**
     * StreamSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html
     * 
     */
    public StreamSpecification getStreamSpecification() {
        return streamSpecification;
    }

    /**
     * StreamSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html
     * 
     */
    public void setStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
    }

    public Table withStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tablename
     * 
     */
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tablename
     * 
     */
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
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Table withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * TimeToLiveSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html
     * 
     */
    public TimeToLiveSpecification getTimeToLiveSpecification() {
        return timeToLiveSpecification;
    }

    /**
     * TimeToLiveSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html
     * 
     */
    public void setTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
    }

    public Table withTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attributeDefinitions", attributeDefinitions).append("globalSecondaryIndexes", globalSecondaryIndexes).append("keySchema", keySchema).append("localSecondaryIndexes", localSecondaryIndexes).append("pointInTimeRecoverySpecification", pointInTimeRecoverySpecification).append("provisionedThroughput", provisionedThroughput).append("sSESpecification", sSESpecification).append("streamSpecification", streamSpecification).append("tableName", tableName).append("tags", tags).append("timeToLiveSpecification", timeToLiveSpecification).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(globalSecondaryIndexes).append(pointInTimeRecoverySpecification).append(streamSpecification).append(sSESpecification).append(attributeDefinitions).append(keySchema).append(timeToLiveSpecification).append(localSecondaryIndexes).append(provisionedThroughput).append(tableName).append(tags).toHashCode();
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
        return new EqualsBuilder().append(globalSecondaryIndexes, rhs.globalSecondaryIndexes).append(pointInTimeRecoverySpecification, rhs.pointInTimeRecoverySpecification).append(streamSpecification, rhs.streamSpecification).append(sSESpecification, rhs.sSESpecification).append(attributeDefinitions, rhs.attributeDefinitions).append(keySchema, rhs.keySchema).append(timeToLiveSpecification, rhs.timeToLiveSpecification).append(localSecondaryIndexes, rhs.localSecondaryIndexes).append(provisionedThroughput, rhs.provisionedThroughput).append(tableName, rhs.tableName).append(tags, rhs.tags).isEquals();
    }

}
