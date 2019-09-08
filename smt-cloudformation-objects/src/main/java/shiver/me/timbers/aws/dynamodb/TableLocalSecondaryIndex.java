
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
 * TableLocalSecondaryIndex
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IndexName",
    "KeySchema",
    "Projection"
})
public class TableLocalSecondaryIndex implements Property<TableLocalSecondaryIndex>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-indexname
     * 
     */
    @JsonProperty("IndexName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-indexname")
    private CharSequence indexName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-keyschema
     * 
     */
    @JsonProperty("KeySchema")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-keyschema")
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-indexname
     * 
     */
    @JsonIgnore
    public CharSequence getIndexName() {
        return indexName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-indexname
     * 
     */
    @JsonIgnore
    public void setIndexName(CharSequence indexName) {
        this.indexName = indexName;
    }

    public TableLocalSecondaryIndex withIndexName(CharSequence indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-keyschema
     * 
     */
    @JsonIgnore
    public Set<Property<TableKeySchema>> getKeySchema() {
        return keySchema;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-keyschema
     * 
     */
    @JsonIgnore
    public void setKeySchema(Set<Property<TableKeySchema>> keySchema) {
        this.keySchema = keySchema;
    }

    public TableLocalSecondaryIndex withKeySchema(Set<Property<TableKeySchema>> keySchema) {
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

    public TableLocalSecondaryIndex withProjection(Property<TableProjection> projection) {
        this.projection = projection;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("indexName", indexName).append("keySchema", keySchema).append("projection", projection).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keySchema).append(projection).append(indexName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableLocalSecondaryIndex) == false) {
            return false;
        }
        TableLocalSecondaryIndex rhs = ((TableLocalSecondaryIndex) other);
        return new EqualsBuilder().append(keySchema, rhs.keySchema).append(projection, rhs.projection).append(indexName, rhs.indexName).isEquals();
    }

}
