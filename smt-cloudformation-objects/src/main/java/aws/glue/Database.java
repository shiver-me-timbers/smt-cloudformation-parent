
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Database
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DatabaseInput",
    "CatalogId"
})
public class Database {

    /**
     * DatabaseInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html
     * 
     */
    @JsonProperty("DatabaseInput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html")
    private DatabaseInput databaseInput;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-catalogid
     * 
     */
    @JsonProperty("CatalogId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-catalogid")
    private CharSequence catalogId;

    /**
     * DatabaseInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html
     * 
     */
    public DatabaseInput getDatabaseInput() {
        return databaseInput;
    }

    /**
     * DatabaseInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html
     * 
     */
    public void setDatabaseInput(DatabaseInput databaseInput) {
        this.databaseInput = databaseInput;
    }

    public Database withDatabaseInput(DatabaseInput databaseInput) {
        this.databaseInput = databaseInput;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-catalogid
     * 
     */
    public CharSequence getCatalogId() {
        return catalogId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-catalogid
     * 
     */
    public void setCatalogId(CharSequence catalogId) {
        this.catalogId = catalogId;
    }

    public Database withCatalogId(CharSequence catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("databaseInput", databaseInput).append("catalogId", catalogId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(databaseInput).append(catalogId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Database) == false) {
            return false;
        }
        Database rhs = ((Database) other);
        return new EqualsBuilder().append(databaseInput, rhs.databaseInput).append(catalogId, rhs.catalogId).isEquals();
    }

}
