
package shiver.me.timbers.aws.servicecatalog;

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
 * CloudFormationProductProvisioningArtifactProperties
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "DisableTemplateValidation",
    "Info",
    "Name"
})
public class CloudFormationProductProvisioningArtifactProperties implements Property<CloudFormationProductProvisioningArtifactProperties>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-disabletemplatevalidation
     * 
     */
    @JsonProperty("DisableTemplateValidation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-disabletemplatevalidation")
    private CharSequence disableTemplateValidation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-info
     * 
     */
    @JsonProperty("Info")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-info")
    private Object info;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public CloudFormationProductProvisioningArtifactProperties withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-disabletemplatevalidation
     * 
     */
    @JsonIgnore
    public CharSequence getDisableTemplateValidation() {
        return disableTemplateValidation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-disabletemplatevalidation
     * 
     */
    @JsonIgnore
    public void setDisableTemplateValidation(CharSequence disableTemplateValidation) {
        this.disableTemplateValidation = disableTemplateValidation;
    }

    public CloudFormationProductProvisioningArtifactProperties withDisableTemplateValidation(CharSequence disableTemplateValidation) {
        this.disableTemplateValidation = disableTemplateValidation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-info
     * 
     */
    @JsonIgnore
    public Object getInfo() {
        return info;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-info
     * 
     */
    @JsonIgnore
    public void setInfo(Object info) {
        this.info = info;
    }

    public CloudFormationProductProvisioningArtifactProperties withInfo(Object info) {
        this.info = info;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public CloudFormationProductProvisioningArtifactProperties withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("disableTemplateValidation", disableTemplateValidation).append("info", info).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(description).append(disableTemplateValidation).append(info).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudFormationProductProvisioningArtifactProperties) == false) {
            return false;
        }
        CloudFormationProductProvisioningArtifactProperties rhs = ((CloudFormationProductProvisioningArtifactProperties) other);
        return new EqualsBuilder().append(name, rhs.name).append(description, rhs.description).append(disableTemplateValidation, rhs.disableTemplateValidation).append(info, rhs.info).isEquals();
    }

}
