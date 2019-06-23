
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
 * ConnectorDefinitionConnectorDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Connectors"
})
public class ConnectorDefinitionConnectorDefinitionVersion implements Property<ConnectorDefinitionConnectorDefinitionVersion>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html#cfn-greengrass-connectordefinition-connectordefinitionversion-connectors
     * 
     */
    @JsonProperty("Connectors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html#cfn-greengrass-connectordefinition-connectordefinitionversion-connectors")
    private List<Property<ConnectorDefinitionConnector>> connectors = new ArrayList<Property<ConnectorDefinitionConnector>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html#cfn-greengrass-connectordefinition-connectordefinitionversion-connectors
     * 
     */
    @JsonIgnore
    public List<Property<ConnectorDefinitionConnector>> getConnectors() {
        return connectors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html#cfn-greengrass-connectordefinition-connectordefinitionversion-connectors
     * 
     */
    @JsonIgnore
    public void setConnectors(List<Property<ConnectorDefinitionConnector>> connectors) {
        this.connectors = connectors;
    }

    public ConnectorDefinitionConnectorDefinitionVersion withConnectors(List<Property<ConnectorDefinitionConnector>> connectors) {
        this.connectors = connectors;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("connectors", connectors).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(connectors).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectorDefinitionConnectorDefinitionVersion) == false) {
            return false;
        }
        ConnectorDefinitionConnectorDefinitionVersion rhs = ((ConnectorDefinitionConnectorDefinitionVersion) other);
        return new EqualsBuilder().append(connectors, rhs.connectors).isEquals();
    }

}
