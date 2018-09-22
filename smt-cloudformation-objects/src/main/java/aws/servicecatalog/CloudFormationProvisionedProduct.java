
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
    private String pathId;
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
    private String productName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname
     * 
     */
    @JsonProperty("ProvisioningArtifactName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname")
    private String provisioningArtifactName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns
     * 
     */
    @JsonProperty("NotificationArns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns")
    private List<String> notificationArns = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage")
    private String acceptLanguage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid
     * 
     */
    @JsonProperty("ProductId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid")
    private String productId;
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
    private String provisionedProductName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid
     * 
     */
    @JsonProperty("ProvisioningArtifactId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid")
    private String provisioningArtifactId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid
     * 
     */
    @JsonProperty("PathId")
    public String getPathId() {
        return pathId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid
     * 
     */
    @JsonProperty("PathId")
    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    public CloudFormationProvisionedProduct withPathId(String pathId) {
        this.pathId = pathId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters
     * 
     */
    @JsonProperty("ProvisioningParameters")
    public List<ProvisioningParameter> getProvisioningParameters() {
        return provisioningParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters
     * 
     */
    @JsonProperty("ProvisioningParameters")
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
    @JsonProperty("ProductName")
    public String getProductName() {
        return productName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname
     * 
     */
    @JsonProperty("ProductName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public CloudFormationProvisionedProduct withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname
     * 
     */
    @JsonProperty("ProvisioningArtifactName")
    public String getProvisioningArtifactName() {
        return provisioningArtifactName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname
     * 
     */
    @JsonProperty("ProvisioningArtifactName")
    public void setProvisioningArtifactName(String provisioningArtifactName) {
        this.provisioningArtifactName = provisioningArtifactName;
    }

    public CloudFormationProvisionedProduct withProvisioningArtifactName(String provisioningArtifactName) {
        this.provisioningArtifactName = provisioningArtifactName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns
     * 
     */
    @JsonProperty("NotificationArns")
    public List<String> getNotificationArns() {
        return notificationArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns
     * 
     */
    @JsonProperty("NotificationArns")
    public void setNotificationArns(List<String> notificationArns) {
        this.notificationArns = notificationArns;
    }

    public CloudFormationProvisionedProduct withNotificationArns(List<String> notificationArns) {
        this.notificationArns = notificationArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public CloudFormationProvisionedProduct withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid
     * 
     */
    @JsonProperty("ProductId")
    public String getProductId() {
        return productId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid
     * 
     */
    @JsonProperty("ProductId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CloudFormationProvisionedProduct withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags
     * 
     */
    @JsonProperty("Tags")
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
    @JsonProperty("ProvisionedProductName")
    public String getProvisionedProductName() {
        return provisionedProductName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname
     * 
     */
    @JsonProperty("ProvisionedProductName")
    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    public CloudFormationProvisionedProduct withProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid
     * 
     */
    @JsonProperty("ProvisioningArtifactId")
    public String getProvisioningArtifactId() {
        return provisioningArtifactId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid
     * 
     */
    @JsonProperty("ProvisioningArtifactId")
    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    public CloudFormationProvisionedProduct withProvisioningArtifactId(String provisioningArtifactId) {
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
