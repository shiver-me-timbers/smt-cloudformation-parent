
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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Connectors"
})
public class ConnectorDefinitionVersion implements Property<ConnectorDefinitionVersion>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html#cfn-greengrass-connectordefinition-connectordefinitionversion-connectors
     * 
     */
    @JsonProperty("Connectors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html#cfn-greengrass-connectordefinition-connectordefinitionversion-connectors")
    private List<Property<Connector>> connectors = new ArrayList<Property<Connector>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html#cfn-greengrass-connectordefinition-connectordefinitionversion-connectors
     * 
     */
    @JsonIgnore
    public List<Property<Connector>> getConnectors() {
        return connectors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html#cfn-greengrass-connectordefinition-connectordefinitionversion-connectors
     * 
     */
    @JsonIgnore
    public void setConnectors(List<Property<Connector>> connectors) {
        this.connectors = connectors;
    }

    public ConnectorDefinitionVersion withConnectors(List<Property<Connector>> connectors) {
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
        if ((other instanceof ConnectorDefinitionVersion) == false) {
            return false;
        }
        ConnectorDefinitionVersion rhs = ((ConnectorDefinitionVersion) other);
        return new EqualsBuilder().append(connectors, rhs.connectors).isEquals();
    }

}
