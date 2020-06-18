
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
 * WorkGroupResultConfigurationUpdates
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EncryptionConfiguration",
    "OutputLocation",
    "RemoveEncryptionConfiguration",
    "RemoveOutputLocation"
})
public class WorkGroupResultConfigurationUpdates implements Property<WorkGroupResultConfigurationUpdates>
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-outputlocation
     * 
     */
    @JsonProperty("OutputLocation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-outputlocation")
    private CharSequence outputLocation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeencryptionconfiguration
     * 
     */
    @JsonProperty("RemoveEncryptionConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeencryptionconfiguration")
    private CharSequence removeEncryptionConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeoutputlocation
     * 
     */
    @JsonProperty("RemoveOutputLocation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeoutputlocation")
    private CharSequence removeOutputLocation;

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

    public WorkGroupResultConfigurationUpdates withEncryptionConfiguration(Property<WorkGroupEncryptionConfiguration> encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-outputlocation
     * 
     */
    @JsonIgnore
    public CharSequence getOutputLocation() {
        return outputLocation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-outputlocation
     * 
     */
    @JsonIgnore
    public void setOutputLocation(CharSequence outputLocation) {
        this.outputLocation = outputLocation;
    }

    public WorkGroupResultConfigurationUpdates withOutputLocation(CharSequence outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeencryptionconfiguration
     * 
     */
    @JsonIgnore
    public CharSequence getRemoveEncryptionConfiguration() {
        return removeEncryptionConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeencryptionconfiguration
     * 
     */
    @JsonIgnore
    public void setRemoveEncryptionConfiguration(CharSequence removeEncryptionConfiguration) {
        this.removeEncryptionConfiguration = removeEncryptionConfiguration;
    }

    public WorkGroupResultConfigurationUpdates withRemoveEncryptionConfiguration(CharSequence removeEncryptionConfiguration) {
        this.removeEncryptionConfiguration = removeEncryptionConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeoutputlocation
     * 
     */
    @JsonIgnore
    public CharSequence getRemoveOutputLocation() {
        return removeOutputLocation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeoutputlocation
     * 
     */
    @JsonIgnore
    public void setRemoveOutputLocation(CharSequence removeOutputLocation) {
        this.removeOutputLocation = removeOutputLocation;
    }

    public WorkGroupResultConfigurationUpdates withRemoveOutputLocation(CharSequence removeOutputLocation) {
        this.removeOutputLocation = removeOutputLocation;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("encryptionConfiguration", encryptionConfiguration).append("outputLocation", outputLocation).append("removeEncryptionConfiguration", removeEncryptionConfiguration).append("removeOutputLocation", removeOutputLocation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(outputLocation).append(encryptionConfiguration).append(removeOutputLocation).append(removeEncryptionConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkGroupResultConfigurationUpdates) == false) {
            return false;
        }
        WorkGroupResultConfigurationUpdates rhs = ((WorkGroupResultConfigurationUpdates) other);
        return new EqualsBuilder().append(outputLocation, rhs.outputLocation).append(encryptionConfiguration, rhs.encryptionConfiguration).append(removeOutputLocation, rhs.removeOutputLocation).append(removeEncryptionConfiguration, rhs.removeEncryptionConfiguration).isEquals();
    }

}
