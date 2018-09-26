
package aws.servicecatalog;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CloudFormationProduct
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Owner",
    "SupportDescription",
    "Description",
    "Distributor",
    "SupportEmail",
    "AcceptLanguage",
    "SupportUrl",
    "Tags",
    "Name",
    "ProvisioningArtifactParameters"
})
public class CloudFormationProduct {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-owner
     * 
     */
    @JsonProperty("Owner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-owner")
    private CharSequence owner;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportdescription
     * 
     */
    @JsonProperty("SupportDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportdescription")
    private CharSequence supportDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-distributor
     * 
     */
    @JsonProperty("Distributor")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-distributor")
    private CharSequence distributor;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportemail
     * 
     */
    @JsonProperty("SupportEmail")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportemail")
    private CharSequence supportEmail;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-acceptlanguage")
    private CharSequence acceptLanguage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supporturl
     * 
     */
    @JsonProperty("SupportUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supporturl")
    private CharSequence supportUrl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters
     * 
     */
    @JsonProperty("ProvisioningArtifactParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters")
    private List<ProvisioningArtifactProperties> provisioningArtifactParameters = new ArrayList<ProvisioningArtifactProperties>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-owner
     * 
     */
    public CharSequence getOwner() {
        return owner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-owner
     * 
     */
    public void setOwner(CharSequence owner) {
        this.owner = owner;
    }

    public CloudFormationProduct withOwner(CharSequence owner) {
        this.owner = owner;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportdescription
     * 
     */
    public CharSequence getSupportDescription() {
        return supportDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportdescription
     * 
     */
    public void setSupportDescription(CharSequence supportDescription) {
        this.supportDescription = supportDescription;
    }

    public CloudFormationProduct withSupportDescription(CharSequence supportDescription) {
        this.supportDescription = supportDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public CloudFormationProduct withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-distributor
     * 
     */
    public CharSequence getDistributor() {
        return distributor;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-distributor
     * 
     */
    public void setDistributor(CharSequence distributor) {
        this.distributor = distributor;
    }

    public CloudFormationProduct withDistributor(CharSequence distributor) {
        this.distributor = distributor;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportemail
     * 
     */
    public CharSequence getSupportEmail() {
        return supportEmail;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportemail
     * 
     */
    public void setSupportEmail(CharSequence supportEmail) {
        this.supportEmail = supportEmail;
    }

    public CloudFormationProduct withSupportEmail(CharSequence supportEmail) {
        this.supportEmail = supportEmail;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-acceptlanguage
     * 
     */
    public CharSequence getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-acceptlanguage
     * 
     */
    public void setAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public CloudFormationProduct withAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supporturl
     * 
     */
    public CharSequence getSupportUrl() {
        return supportUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supporturl
     * 
     */
    public void setSupportUrl(CharSequence supportUrl) {
        this.supportUrl = supportUrl;
    }

    public CloudFormationProduct withSupportUrl(CharSequence supportUrl) {
        this.supportUrl = supportUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CloudFormationProduct withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public CloudFormationProduct withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters
     * 
     */
    public List<ProvisioningArtifactProperties> getProvisioningArtifactParameters() {
        return provisioningArtifactParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters
     * 
     */
    public void setProvisioningArtifactParameters(List<ProvisioningArtifactProperties> provisioningArtifactParameters) {
        this.provisioningArtifactParameters = provisioningArtifactParameters;
    }

    public CloudFormationProduct withProvisioningArtifactParameters(List<ProvisioningArtifactProperties> provisioningArtifactParameters) {
        this.provisioningArtifactParameters = provisioningArtifactParameters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("owner", owner).append("supportDescription", supportDescription).append("description", description).append("distributor", distributor).append("supportEmail", supportEmail).append("acceptLanguage", acceptLanguage).append("supportUrl", supportUrl).append("tags", tags).append("name", name).append("provisioningArtifactParameters", provisioningArtifactParameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(owner).append(supportDescription).append(supportEmail).append(provisioningArtifactParameters).append(acceptLanguage).append(supportUrl).append(name).append(description).append(distributor).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudFormationProduct) == false) {
            return false;
        }
        CloudFormationProduct rhs = ((CloudFormationProduct) other);
        return new EqualsBuilder().append(owner, rhs.owner).append(supportDescription, rhs.supportDescription).append(supportEmail, rhs.supportEmail).append(provisioningArtifactParameters, rhs.provisioningArtifactParameters).append(acceptLanguage, rhs.acceptLanguage).append(supportUrl, rhs.supportUrl).append(name, rhs.name).append(description, rhs.description).append(distributor, rhs.distributor).append(tags, rhs.tags).isEquals();
    }

}
