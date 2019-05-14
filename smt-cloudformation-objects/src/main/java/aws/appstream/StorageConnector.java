
package aws.appstream;

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
 * StorageConnector
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Domains",
    "ResourceIdentifier",
    "ConnectorType"
})
public class StorageConnector implements Property<StorageConnector>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-domains
     * 
     */
    @JsonProperty("Domains")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-domains")
    private List<CharSequence> domains = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-resourceidentifier
     * 
     */
    @JsonProperty("ResourceIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-resourceidentifier")
    private CharSequence resourceIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-connectortype
     * 
     */
    @JsonProperty("ConnectorType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-connectortype")
    private CharSequence connectorType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-domains
     * 
     */
    @JsonIgnore
    public List<CharSequence> getDomains() {
        return domains;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-domains
     * 
     */
    @JsonIgnore
    public void setDomains(List<CharSequence> domains) {
        this.domains = domains;
    }

    public StorageConnector withDomains(List<CharSequence> domains) {
        this.domains = domains;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-resourceidentifier
     * 
     */
    @JsonIgnore
    public CharSequence getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-resourceidentifier
     * 
     */
    @JsonIgnore
    public void setResourceIdentifier(CharSequence resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    public StorageConnector withResourceIdentifier(CharSequence resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-connectortype
     * 
     */
    @JsonIgnore
    public CharSequence getConnectorType() {
        return connectorType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-connectortype
     * 
     */
    @JsonIgnore
    public void setConnectorType(CharSequence connectorType) {
        this.connectorType = connectorType;
    }

    public StorageConnector withConnectorType(CharSequence connectorType) {
        this.connectorType = connectorType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("domains", domains).append("resourceIdentifier", resourceIdentifier).append("connectorType", connectorType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(domains).append(connectorType).append(resourceIdentifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageConnector) == false) {
            return false;
        }
        StorageConnector rhs = ((StorageConnector) other);
        return new EqualsBuilder().append(domains, rhs.domains).append(connectorType, rhs.connectorType).append(resourceIdentifier, rhs.resourceIdentifier).isEquals();
    }

}
