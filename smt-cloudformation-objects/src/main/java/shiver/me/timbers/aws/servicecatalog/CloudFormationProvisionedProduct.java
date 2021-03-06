
package shiver.me.timbers.aws.servicecatalog;

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
import shiver.me.timbers.aws.Tag;


/**
 * CloudFormationProvisionedProduct
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PathId",
    "ProvisioningParameters",
    "ProvisioningPreferences",
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
    private List<Property<CloudFormationProvisionedProductProvisioningParameter>> provisioningParameters = new ArrayList<Property<CloudFormationProvisionedProductProvisioningParameter>>();
    /**
     * CloudFormationProvisionedProductProvisioningPreferences
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html
     * 
     */
    @JsonProperty("ProvisioningPreferences")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html")
    private Property<CloudFormationProvisionedProductProvisioningPreferences> provisioningPreferences;
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
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
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
    @JsonIgnore
    public CharSequence getPathId() {
        return pathId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public List<Property<CloudFormationProvisionedProductProvisioningParameter>> getProvisioningParameters() {
        return provisioningParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters
     * 
     */
    @JsonIgnore
    public void setProvisioningParameters(List<Property<CloudFormationProvisionedProductProvisioningParameter>> provisioningParameters) {
        this.provisioningParameters = provisioningParameters;
    }

    public CloudFormationProvisionedProduct withProvisioningParameters(List<Property<CloudFormationProvisionedProductProvisioningParameter>> provisioningParameters) {
        this.provisioningParameters = provisioningParameters;
        return this;
    }

    /**
     * CloudFormationProvisionedProductProvisioningPreferences
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html
     * 
     */
    @JsonIgnore
    public Property<CloudFormationProvisionedProductProvisioningPreferences> getProvisioningPreferences() {
        return provisioningPreferences;
    }

    /**
     * CloudFormationProvisionedProductProvisioningPreferences
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html
     * 
     */
    @JsonIgnore
    public void setProvisioningPreferences(Property<CloudFormationProvisionedProductProvisioningPreferences> provisioningPreferences) {
        this.provisioningPreferences = provisioningPreferences;
    }

    public CloudFormationProvisionedProduct withProvisioningPreferences(Property<CloudFormationProvisionedProductProvisioningPreferences> provisioningPreferences) {
        this.provisioningPreferences = provisioningPreferences;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname
     * 
     */
    @JsonIgnore
    public CharSequence getProductName() {
        return productName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getProvisioningArtifactName() {
        return provisioningArtifactName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public List<CharSequence> getNotificationArns() {
        return notificationArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getProductId() {
        return productId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public CloudFormationProvisionedProduct withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname
     * 
     */
    @JsonIgnore
    public CharSequence getProvisionedProductName() {
        return provisionedProductName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getProvisioningArtifactId() {
        return provisioningArtifactId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid
     * 
     */
    @JsonIgnore
    public void setProvisioningArtifactId(CharSequence provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    public CloudFormationProvisionedProduct withProvisioningArtifactId(CharSequence provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pathId", pathId).append("provisioningParameters", provisioningParameters).append("provisioningPreferences", provisioningPreferences).append("productName", productName).append("provisioningArtifactName", provisioningArtifactName).append("notificationArns", notificationArns).append("acceptLanguage", acceptLanguage).append("productId", productId).append("tags", tags).append("provisionedProductName", provisionedProductName).append("provisioningArtifactId", provisioningArtifactId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(provisioningPreferences).append(acceptLanguage).append(notificationArns).append(productId).append(provisionedProductName).append(provisioningArtifactId).append(provisioningArtifactName).append(pathId).append(provisioningParameters).append(productName).append(tags).toHashCode();
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
        return new EqualsBuilder().append(provisioningPreferences, rhs.provisioningPreferences).append(acceptLanguage, rhs.acceptLanguage).append(notificationArns, rhs.notificationArns).append(productId, rhs.productId).append(provisionedProductName, rhs.provisionedProductName).append(provisioningArtifactId, rhs.provisioningArtifactId).append(provisioningArtifactName, rhs.provisioningArtifactName).append(pathId, rhs.pathId).append(provisioningParameters, rhs.provisioningParameters).append(productName, rhs.productName).append(tags, rhs.tags).isEquals();
    }

}
