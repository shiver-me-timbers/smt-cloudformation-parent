
package shiver.me.timbers.aws.dynamodb;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * TableGlobalSecondaryIndex
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IndexName",
    "KeySchema",
    "Projection",
    "ProvisionedThroughput"
})
public class TableGlobalSecondaryIndex implements Property<TableGlobalSecondaryIndex>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-indexname
     * 
     */
    @JsonProperty("IndexName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-indexname")
    private CharSequence indexName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-keyschema
     * 
     */
    @JsonProperty("KeySchema")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-keyschema")
    private Set<Property<TableKeySchema>> keySchema = new LinkedHashSet<Property<TableKeySchema>>();
    /**
     * TableProjection
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html
     * 
     */
    @JsonProperty("Projection")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html")
    private Property<TableProjection> projection;
    /**
     * TableProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
     * 
     */
    @JsonProperty("ProvisionedThroughput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html")
    private Property<TableProvisionedThroughput> provisionedThroughput;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-indexname
     * 
     */
    @JsonIgnore
    public CharSequence getIndexName() {
        return indexName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-indexname
     * 
     */
    @JsonIgnore
    public void setIndexName(CharSequence indexName) {
        this.indexName = indexName;
    }

    public TableGlobalSecondaryIndex withIndexName(CharSequence indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-keyschema
     * 
     */
    @JsonIgnore
    public Set<Property<TableKeySchema>> getKeySchema() {
        return keySchema;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-keyschema
     * 
     */
    @JsonIgnore
    public void setKeySchema(Set<Property<TableKeySchema>> keySchema) {
        this.keySchema = keySchema;
    }

    public TableGlobalSecondaryIndex withKeySchema(Set<Property<TableKeySchema>> keySchema) {
        this.keySchema = keySchema;
        return this;
    }

    /**
     * TableProjection
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html
     * 
     */
    @JsonIgnore
    public Property<TableProjection> getProjection() {
        return projection;
    }

    /**
     * TableProjection
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html
     * 
     */
    @JsonIgnore
    public void setProjection(Property<TableProjection> projection) {
        this.projection = projection;
    }

    public TableGlobalSecondaryIndex withProjection(Property<TableProjection> projection) {
        this.projection = projection;
        return this;
    }

    /**
     * TableProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
     * 
     */
    @JsonIgnore
    public Property<TableProvisionedThroughput> getProvisionedThroughput() {
        return provisionedThroughput;
    }

    /**
     * TableProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
     * 
     */
    @JsonIgnore
    public void setProvisionedThroughput(Property<TableProvisionedThroughput> provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    public TableGlobalSecondaryIndex withProvisionedThroughput(Property<TableProvisionedThroughput> provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("indexName", indexName).append("keySchema", keySchema).append("projection", projection).append("provisionedThroughput", provisionedThroughput).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keySchema).append(projection).append(provisionedThroughput).append(indexName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableGlobalSecondaryIndex) == false) {
            return false;
        }
        TableGlobalSecondaryIndex rhs = ((TableGlobalSecondaryIndex) other);
        return new EqualsBuilder().append(keySchema, rhs.keySchema).append(projection, rhs.projection).append(provisionedThroughput, rhs.provisionedThroughput).append(indexName, rhs.indexName).isEquals();
    }

}
