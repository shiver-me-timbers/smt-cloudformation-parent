
package shiver.me.timbers.aws.glue;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ConnectionConnectionInput
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "ConnectionType",
    "MatchCriteria",
    "PhysicalConnectionRequirements",
    "ConnectionProperties",
    "Name"
})
public class ConnectionConnectionInput implements Property<ConnectionConnectionInput>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectiontype
     * 
     */
    @JsonProperty("ConnectionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectiontype")
    private CharSequence connectionType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-matchcriteria
     * 
     */
    @JsonProperty("MatchCriteria")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-matchcriteria")
    private List<CharSequence> matchCriteria = new ArrayList<CharSequence>();
    /**
     * ConnectionPhysicalConnectionRequirements
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html
     * 
     */
    @JsonProperty("PhysicalConnectionRequirements")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html")
    private Property<ConnectionPhysicalConnectionRequirements> physicalConnectionRequirements;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectionproperties
     * 
     */
    @JsonProperty("ConnectionProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectionproperties")
    private Object connectionProperties;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ConnectionConnectionInput withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectiontype
     * 
     */
    @JsonIgnore
    public CharSequence getConnectionType() {
        return connectionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectiontype
     * 
     */
    @JsonIgnore
    public void setConnectionType(CharSequence connectionType) {
        this.connectionType = connectionType;
    }

    public ConnectionConnectionInput withConnectionType(CharSequence connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-matchcriteria
     * 
     */
    @JsonIgnore
    public List<CharSequence> getMatchCriteria() {
        return matchCriteria;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-matchcriteria
     * 
     */
    @JsonIgnore
    public void setMatchCriteria(List<CharSequence> matchCriteria) {
        this.matchCriteria = matchCriteria;
    }

    public ConnectionConnectionInput withMatchCriteria(List<CharSequence> matchCriteria) {
        this.matchCriteria = matchCriteria;
        return this;
    }

    /**
     * ConnectionPhysicalConnectionRequirements
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html
     * 
     */
    @JsonIgnore
    public Property<ConnectionPhysicalConnectionRequirements> getPhysicalConnectionRequirements() {
        return physicalConnectionRequirements;
    }

    /**
     * ConnectionPhysicalConnectionRequirements
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html
     * 
     */
    @JsonIgnore
    public void setPhysicalConnectionRequirements(Property<ConnectionPhysicalConnectionRequirements> physicalConnectionRequirements) {
        this.physicalConnectionRequirements = physicalConnectionRequirements;
    }

    public ConnectionConnectionInput withPhysicalConnectionRequirements(Property<ConnectionPhysicalConnectionRequirements> physicalConnectionRequirements) {
        this.physicalConnectionRequirements = physicalConnectionRequirements;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectionproperties
     * 
     */
    @JsonIgnore
    public Object getConnectionProperties() {
        return connectionProperties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectionproperties
     * 
     */
    @JsonIgnore
    public void setConnectionProperties(Object connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    public ConnectionConnectionInput withConnectionProperties(Object connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ConnectionConnectionInput withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("connectionType", connectionType).append("matchCriteria", matchCriteria).append("physicalConnectionRequirements", physicalConnectionRequirements).append("connectionProperties", connectionProperties).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(connectionProperties).append(matchCriteria).append(name).append(description).append(physicalConnectionRequirements).append(connectionType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectionConnectionInput) == false) {
            return false;
        }
        ConnectionConnectionInput rhs = ((ConnectionConnectionInput) other);
        return new EqualsBuilder().append(connectionProperties, rhs.connectionProperties).append(matchCriteria, rhs.matchCriteria).append(name, rhs.name).append(description, rhs.description).append(physicalConnectionRequirements, rhs.physicalConnectionRequirements).append(connectionType, rhs.connectionType).isEquals();
    }

}
