
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Connection
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ConnectionInput",
    "CatalogId"
})
public class Connection {

    /**
     * ConnectionInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html
     * 
     */
    @JsonProperty("ConnectionInput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html")
    private ConnectionInput connectionInput;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid
     * 
     */
    @JsonProperty("CatalogId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid")
    private CharSequence catalogId;

    /**
     * ConnectionInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html
     * 
     */
    public ConnectionInput getConnectionInput() {
        return connectionInput;
    }

    /**
     * ConnectionInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html
     * 
     */
    public void setConnectionInput(ConnectionInput connectionInput) {
        this.connectionInput = connectionInput;
    }

    public Connection withConnectionInput(ConnectionInput connectionInput) {
        this.connectionInput = connectionInput;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid
     * 
     */
    public CharSequence getCatalogId() {
        return catalogId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid
     * 
     */
    public void setCatalogId(CharSequence catalogId) {
        this.catalogId = catalogId;
    }

    public Connection withCatalogId(CharSequence catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("connectionInput", connectionInput).append("catalogId", catalogId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(connectionInput).append(catalogId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Connection) == false) {
            return false;
        }
        Connection rhs = ((Connection) other);
        return new EqualsBuilder().append(connectionInput, rhs.connectionInput).append(catalogId, rhs.catalogId).isEquals();
    }

}
