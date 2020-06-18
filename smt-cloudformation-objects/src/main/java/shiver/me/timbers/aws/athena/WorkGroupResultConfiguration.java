
package shiver.me.timbers.aws.athena;

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
 * WorkGroupResultConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EncryptionConfiguration",
    "OutputLocation"
})
public class WorkGroupResultConfiguration implements Property<WorkGroupResultConfiguration>
{

    /**
     * WorkGroupEncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html
     * 
     */
    @JsonProperty("EncryptionConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html")
    private Property<WorkGroupEncryptionConfiguration> encryptionConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html#cfn-athena-workgroup-resultconfiguration-outputlocation
     * 
     */
    @JsonProperty("OutputLocation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html#cfn-athena-workgroup-resultconfiguration-outputlocation")
    private CharSequence outputLocation;

    /**
     * WorkGroupEncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<WorkGroupEncryptionConfiguration> getEncryptionConfiguration() {
        return encryptionConfiguration;
    }

    /**
     * WorkGroupEncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html
     * 
     */
    @JsonIgnore
    public void setEncryptionConfiguration(Property<WorkGroupEncryptionConfiguration> encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    public WorkGroupResultConfiguration withEncryptionConfiguration(Property<WorkGroupEncryptionConfiguration> encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html#cfn-athena-workgroup-resultconfiguration-outputlocation
     * 
     */
    @JsonIgnore
    public CharSequence getOutputLocation() {
        return outputLocation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html#cfn-athena-workgroup-resultconfiguration-outputlocation
     * 
     */
    @JsonIgnore
    public void setOutputLocation(CharSequence outputLocation) {
        this.outputLocation = outputLocation;
    }

    public WorkGroupResultConfiguration withOutputLocation(CharSequence outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("encryptionConfiguration", encryptionConfiguration).append("outputLocation", outputLocation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(outputLocation).append(encryptionConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkGroupResultConfiguration) == false) {
            return false;
        }
        WorkGroupResultConfiguration rhs = ((WorkGroupResultConfiguration) other);
        return new EqualsBuilder().append(outputLocation, rhs.outputLocation).append(encryptionConfiguration, rhs.encryptionConfiguration).isEquals();
    }

}
