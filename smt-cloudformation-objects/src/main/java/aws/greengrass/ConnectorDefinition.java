
package aws.greengrass;

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
 * ConnectorDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "InitialVersion",
    "Name"
})
public class ConnectorDefinition {

    /**
     * ConnectorDefinitionVersion
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html
     * 
     */
    @JsonProperty("InitialVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html")
    private Property<ConnectorDefinitionVersion> initialVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-name")
    private CharSequence name;

    /**
     * ConnectorDefinitionVersion
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html
     * 
     */
    @JsonIgnore
    public Property<ConnectorDefinitionVersion> getInitialVersion() {
        return initialVersion;
    }

    /**
     * ConnectorDefinitionVersion
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html
     * 
     */
    @JsonIgnore
    public void setInitialVersion(Property<ConnectorDefinitionVersion> initialVersion) {
        this.initialVersion = initialVersion;
    }

    public ConnectorDefinition withInitialVersion(Property<ConnectorDefinitionVersion> initialVersion) {
        this.initialVersion = initialVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ConnectorDefinition withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("initialVersion", initialVersion).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(initialVersion).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectorDefinition) == false) {
            return false;
        }
        ConnectorDefinition rhs = ((ConnectorDefinition) other);
        return new EqualsBuilder().append(initialVersion, rhs.initialVersion).append(name, rhs.name).isEquals();
    }

}
