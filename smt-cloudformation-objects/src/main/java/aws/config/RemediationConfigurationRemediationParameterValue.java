
package aws.config;

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
 * RemediationConfigurationRemediationParameterValue
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-remediationparametervalue.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ResourceValue",
    "StaticValue"
})
public class RemediationConfigurationRemediationParameterValue implements Property<RemediationConfigurationRemediationParameterValue>
{

    /**
     * RemediationConfigurationResourceValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-resourcevalue.html
     * 
     */
    @JsonProperty("ResourceValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-resourcevalue.html")
    private Property<RemediationConfigurationResourceValue> resourceValue;
    /**
     * RemediationConfigurationStaticValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-staticvalue.html
     * 
     */
    @JsonProperty("StaticValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-staticvalue.html")
    private Property<RemediationConfigurationStaticValue> staticValue;

    /**
     * RemediationConfigurationResourceValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-resourcevalue.html
     * 
     */
    @JsonIgnore
    public Property<RemediationConfigurationResourceValue> getResourceValue() {
        return resourceValue;
    }

    /**
     * RemediationConfigurationResourceValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-resourcevalue.html
     * 
     */
    @JsonIgnore
    public void setResourceValue(Property<RemediationConfigurationResourceValue> resourceValue) {
        this.resourceValue = resourceValue;
    }

    public RemediationConfigurationRemediationParameterValue withResourceValue(Property<RemediationConfigurationResourceValue> resourceValue) {
        this.resourceValue = resourceValue;
        return this;
    }

    /**
     * RemediationConfigurationStaticValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-staticvalue.html
     * 
     */
    @JsonIgnore
    public Property<RemediationConfigurationStaticValue> getStaticValue() {
        return staticValue;
    }

    /**
     * RemediationConfigurationStaticValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-staticvalue.html
     * 
     */
    @JsonIgnore
    public void setStaticValue(Property<RemediationConfigurationStaticValue> staticValue) {
        this.staticValue = staticValue;
    }

    public RemediationConfigurationRemediationParameterValue withStaticValue(Property<RemediationConfigurationStaticValue> staticValue) {
        this.staticValue = staticValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resourceValue", resourceValue).append("staticValue", staticValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(staticValue).append(resourceValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RemediationConfigurationRemediationParameterValue) == false) {
            return false;
        }
        RemediationConfigurationRemediationParameterValue rhs = ((RemediationConfigurationRemediationParameterValue) other);
        return new EqualsBuilder().append(staticValue, rhs.staticValue).append(resourceValue, rhs.resourceValue).isEquals();
    }

}
