
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
 * CloudFormationProvisionedProduct
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PathId",
    "ProvisioningParameters",
    "ProductName",
    "ProvisioningArtifactName",
    "NotificationArns",
    "AcceptLanguage",
    "ProductId",
    "Tags",
    "ProvisionedProductName",
    "ProvisioningArtifactId"
})
public class CloudFormationProvisionedProduct {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid
     * 
     */
    @JsonProperty("PathId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid")
    private CharSequence pathId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters
     * 
     */
    @JsonProperty("ProvisioningParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters")
    private List<ProvisioningParameter> provisioningParameters = new ArrayList<ProvisioningParameter>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname
     * 
     */
    @JsonProperty("ProductName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname")
    private CharSequence productName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname
     * 
     */
    @JsonProperty("ProvisioningArtifactName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname")
    private CharSequence provisioningArtifactName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns
     * 
     */
    @JsonProperty("NotificationArns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns")
    private List<CharSequence> notificationArns = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage")
    private CharSequence acceptLanguage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid
     * 
     */
    @JsonProperty("ProductId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid")
    private CharSequence productId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname
     * 
     */
    @JsonProperty("ProvisionedProductName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname")
    private CharSequence provisionedProductName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid
     * 
     */
    @JsonProperty("ProvisioningArtifactId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid")
    private CharSequence provisioningArtifactId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid
     * 
     */
    public CharSequence getPathId() {
        return pathId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid
     * 
     */
    public void setPathId(CharSequence pathId) {
        this.pathId = pathId;
    }

    public CloudFormationProvisionedProduct withPathId(CharSequence pathId) {
        this.pathId = pathId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters
     * 
     */
    public List<ProvisioningParameter> getProvisioningParameters() {
        return provisioningParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters
     * 
     */
    public void setProvisioningParameters(List<ProvisioningParameter> provisioningParameters) {
        this.provisioningParameters = provisioningParameters;
    }

    public CloudFormationProvisionedProduct withProvisioningParameters(List<ProvisioningParameter> provisioningParameters) {
        this.provisioningParameters = provisioningParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname
     * 
     */
    public CharSequence getProductName() {
        return productName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname
     * 
     */
    public void setProductName(CharSequence productName) {
        this.productName = productName;
    }

    public CloudFormationProvisionedProduct withProductName(CharSequence productName) {
        this.productName = productName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname
     * 
     */
    public CharSequence getProvisioningArtifactName() {
        return provisioningArtifactName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname
     * 
     */
    public void setProvisioningArtifactName(CharSequence provisioningArtifactName) {
        this.provisioningArtifactName = provisioningArtifactName;
    }

    public CloudFormationProvisionedProduct withProvisioningArtifactName(CharSequence provisioningArtifactName) {
        this.provisioningArtifactName = provisioningArtifactName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns
     * 
     */
    public List<CharSequence> getNotificationArns() {
        return notificationArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns
     * 
     */
    public void setNotificationArns(List<CharSequence> notificationArns) {
        this.notificationArns = notificationArns;
    }

    public CloudFormationProvisionedProduct withNotificationArns(List<CharSequence> notificationArns) {
        this.notificationArns = notificationArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage
     * 
     */
    public CharSequence getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage
     * 
     */
    public void setAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public CloudFormationProvisionedProduct withAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid
     * 
     */
    public CharSequence getProductId() {
        return productId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid
     * 
     */
    public void setProductId(CharSequence productId) {
        this.productId = productId;
    }

    public CloudFormationProvisionedProduct withProductId(CharSequence productId) {
        this.productId = productId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CloudFormationProvisionedProduct withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname
     * 
     */
    public CharSequence getProvisionedProductName() {
        return provisionedProductName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname
     * 
     */
    public void setProvisionedProductName(CharSequence provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    public CloudFormationProvisionedProduct withProvisionedProductName(CharSequence provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid
     * 
     */
    public CharSequence getProvisioningArtifactId() {
        return provisioningArtifactId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid
     * 
     */
    public void setProvisioningArtifactId(CharSequence provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    public CloudFormationProvisionedProduct withProvisioningArtifactId(CharSequence provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pathId", pathId).append("provisioningParameters", provisioningParameters).append("productName", productName).append("provisioningArtifactName", provisioningArtifactName).append("notificationArns", notificationArns).append("acceptLanguage", acceptLanguage).append("productId", productId).append("tags", tags).append("provisionedProductName", provisionedProductName).append("provisioningArtifactId", provisioningArtifactId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(acceptLanguage).append(notificationArns).append(productId).append(provisionedProductName).append(provisioningArtifactId).append(provisioningArtifactName).append(pathId).append(provisioningParameters).append(productName).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudFormationProvisionedProduct) == false) {
            return false;
        }
        CloudFormationProvisionedProduct rhs = ((CloudFormationProvisionedProduct) other);
        return new EqualsBuilder().append(acceptLanguage, rhs.acceptLanguage).append(notificationArns, rhs.notificationArns).append(productId, rhs.productId).append(provisionedProductName, rhs.provisionedProductName).append(provisioningArtifactId, rhs.provisioningArtifactId).append(provisioningArtifactName, rhs.provisioningArtifactName).append(pathId, rhs.pathId).append(provisioningParameters, rhs.provisioningParameters).append(productName, rhs.productName).append(tags, rhs.tags).isEquals();
    }

}
