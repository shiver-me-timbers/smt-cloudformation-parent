
package aws.greengrass;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ConnectorDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Connectors",
    "ConnectorDefinitionId"
})
public class ConnectorDefinitionVersion {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors
     * 
     */
    @JsonProperty("Connectors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors")
    private List<Property<ConnectorDefinitionVersionConnector>> connectors = new ArrayList<Property<ConnectorDefinitionVersionConnector>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectordefinitionid
     * 
     */
    @JsonProperty("ConnectorDefinitionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectordefinitionid")
    private CharSequence connectorDefinitionId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors
     * 
     */
    @JsonIgnore
    public List<Property<ConnectorDefinitionVersionConnector>> getConnectors() {
        return connectors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors
     * 
     */
    @JsonIgnore
    public void setConnectors(List<Property<ConnectorDefinitionVersionConnector>> connectors) {
        this.connectors = connectors;
    }

    public ConnectorDefinitionVersion withConnectors(List<Property<ConnectorDefinitionVersionConnector>> connectors) {
        this.connectors = connectors;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectordefinitionid
     * 
     */
    @JsonIgnore
    public CharSequence getConnectorDefinitionId() {
        return connectorDefinitionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectordefinitionid
     * 
     */
    @JsonIgnore
    public void setConnectorDefinitionId(CharSequence connectorDefinitionId) {
        this.connectorDefinitionId = connectorDefinitionId;
    }

    public ConnectorDefinitionVersion withConnectorDefinitionId(CharSequence connectorDefinitionId) {
        this.connectorDefinitionId = connectorDefinitionId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("connectors", connectors).append("connectorDefinitionId", connectorDefinitionId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(connectors).append(connectorDefinitionId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectorDefinitionVersion) == false) {
            return false;
        }
        ConnectorDefinitionVersion rhs = ((ConnectorDefinitionVersion) other);
        return new EqualsBuilder().append(connectors, rhs.connectors).append(connectorDefinitionId, rhs.connectorDefinitionId).isEquals();
    }

}
