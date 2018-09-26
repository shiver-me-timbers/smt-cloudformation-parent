
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
 * GlobalSecondaryIndex
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "IndexName",
    "KeySchema",
    "Projection",
    "ProvisionedThroughput"
})
public class GlobalSecondaryIndex {

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
     * ProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
     * 
     */
    @JsonProperty("ProvisionedThroughput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html")
    private ProvisionedThroughput provisionedThroughput;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-indexname
     * 
     */
    public CharSequence getIndexName() {
        return indexName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-indexname
     * 
     */
    public void setIndexName(CharSequence indexName) {
        this.indexName = indexName;
    }

    public GlobalSecondaryIndex withIndexName(CharSequence indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-keyschema
     * 
     */
    public Set<KeySchema> getKeySchema() {
        return keySchema;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-keyschema
     * 
     */
    public void setKeySchema(Set<KeySchema> keySchema) {
        this.keySchema = keySchema;
    }

    public GlobalSecondaryIndex withKeySchema(Set<KeySchema> keySchema) {
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

    public GlobalSecondaryIndex withProjection(Projection projection) {
        this.projection = projection;
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

    public GlobalSecondaryIndex withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
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
        if ((other instanceof GlobalSecondaryIndex) == false) {
            return false;
        }
        GlobalSecondaryIndex rhs = ((GlobalSecondaryIndex) other);
        return new EqualsBuilder().append(keySchema, rhs.keySchema).append(projection, rhs.projection).append(provisionedThroughput, rhs.provisionedThroughput).append(indexName, rhs.indexName).isEquals();
    }

}
