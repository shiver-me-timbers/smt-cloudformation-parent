
package aws.dynamodb;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LocalSecondaryIndex
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "IndexName",
    "KeySchema",
    "Projection"
})
public class LocalSecondaryIndex {

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
    private Set<KeySchema> keySchema = new LinkedHashSet<KeySchema>();
    /**
     * Projection
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html
     * 
     */
    @JsonProperty("Projection")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html")
    private Projection projection;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-indexname
     * 
     */
    public CharSequence getIndexName() {
        return indexName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-indexname
     * 
     */
    public void setIndexName(CharSequence indexName) {
        this.indexName = indexName;
    }

    public LocalSecondaryIndex withIndexName(CharSequence indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-keyschema
     * 
     */
    public Set<KeySchema> getKeySchema() {
        return keySchema;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-keyschema
     * 
     */
    public void setKeySchema(Set<KeySchema> keySchema) {
        this.keySchema = keySchema;
    }

    public LocalSecondaryIndex withKeySchema(Set<KeySchema> keySchema) {
        this.keySchema = keySchema;
        return this;
    }

    /**
     * Projection
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html
     * 
     */
    public Projection getProjection() {
        return projection;
    }

    /**
     * Projection
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html
     * 
     */
    public void setProjection(Projection projection) {
        this.projection = projection;
    }

    public LocalSecondaryIndex withProjection(Projection projection) {
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
        if ((other instanceof LocalSecondaryIndex) == false) {
            return false;
        }
        LocalSecondaryIndex rhs = ((LocalSecondaryIndex) other);
        return new EqualsBuilder().append(keySchema, rhs.keySchema).append(projection, rhs.projection).append(indexName, rhs.indexName).isEquals();
    }

}
