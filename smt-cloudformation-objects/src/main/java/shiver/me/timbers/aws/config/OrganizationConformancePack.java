
package shiver.me.timbers.aws.config;

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
 * OrganizationConformancePack
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OrganizationConformancePackName",
    "TemplateS3Uri",
    "TemplateBody",
    "DeliveryS3Bucket",
    "DeliveryS3KeyPrefix",
    "ConformancePackInputParameters",
    "ExcludedAccounts"
})
public class OrganizationConformancePack {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-organizationconformancepackname
     * 
     */
    @JsonProperty("OrganizationConformancePackName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-organizationconformancepackname")
    private CharSequence organizationConformancePackName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templates3uri
     * 
     */
    @JsonProperty("TemplateS3Uri")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templates3uri")
    private CharSequence templateS3Uri;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templatebody
     * 
     */
    @JsonProperty("TemplateBody")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templatebody")
    private CharSequence templateBody;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3bucket
     * 
     */
    @JsonProperty("DeliveryS3Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3bucket")
    private CharSequence deliveryS3Bucket;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3keyprefix
     * 
     */
    @JsonProperty("DeliveryS3KeyPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3keyprefix")
    private CharSequence deliveryS3KeyPrefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters
     * 
     */
    @JsonProperty("ConformancePackInputParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters")
    private List<Property<OrganizationConformancePackConformancePackInputParameter>> conformancePackInputParameters = new ArrayList<Property<OrganizationConformancePackConformancePackInputParameter>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-excludedaccounts
     * 
     */
    @JsonProperty("ExcludedAccounts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-excludedaccounts")
    private List<CharSequence> excludedAccounts = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-organizationconformancepackname
     * 
     */
    @JsonIgnore
    public CharSequence getOrganizationConformancePackName() {
        return organizationConformancePackName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-organizationconformancepackname
     * 
     */
    @JsonIgnore
    public void setOrganizationConformancePackName(CharSequence organizationConformancePackName) {
        this.organizationConformancePackName = organizationConformancePackName;
    }

    public OrganizationConformancePack withOrganizationConformancePackName(CharSequence organizationConformancePackName) {
        this.organizationConformancePackName = organizationConformancePackName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templates3uri
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateS3Uri() {
        return templateS3Uri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templates3uri
     * 
     */
    @JsonIgnore
    public void setTemplateS3Uri(CharSequence templateS3Uri) {
        this.templateS3Uri = templateS3Uri;
    }

    public OrganizationConformancePack withTemplateS3Uri(CharSequence templateS3Uri) {
        this.templateS3Uri = templateS3Uri;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templatebody
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateBody() {
        return templateBody;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templatebody
     * 
     */
    @JsonIgnore
    public void setTemplateBody(CharSequence templateBody) {
        this.templateBody = templateBody;
    }

    public OrganizationConformancePack withTemplateBody(CharSequence templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3bucket
     * 
     */
    @JsonIgnore
    public CharSequence getDeliveryS3Bucket() {
        return deliveryS3Bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3bucket
     * 
     */
    @JsonIgnore
    public void setDeliveryS3Bucket(CharSequence deliveryS3Bucket) {
        this.deliveryS3Bucket = deliveryS3Bucket;
    }

    public OrganizationConformancePack withDeliveryS3Bucket(CharSequence deliveryS3Bucket) {
        this.deliveryS3Bucket = deliveryS3Bucket;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3keyprefix
     * 
     */
    @JsonIgnore
    public CharSequence getDeliveryS3KeyPrefix() {
        return deliveryS3KeyPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3keyprefix
     * 
     */
    @JsonIgnore
    public void setDeliveryS3KeyPrefix(CharSequence deliveryS3KeyPrefix) {
        this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
    }

    public OrganizationConformancePack withDeliveryS3KeyPrefix(CharSequence deliveryS3KeyPrefix) {
        this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters
     * 
     */
    @JsonIgnore
    public List<Property<OrganizationConformancePackConformancePackInputParameter>> getConformancePackInputParameters() {
        return conformancePackInputParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters
     * 
     */
    @JsonIgnore
    public void setConformancePackInputParameters(List<Property<OrganizationConformancePackConformancePackInputParameter>> conformancePackInputParameters) {
        this.conformancePackInputParameters = conformancePackInputParameters;
    }

    public OrganizationConformancePack withConformancePackInputParameters(List<Property<OrganizationConformancePackConformancePackInputParameter>> conformancePackInputParameters) {
        this.conformancePackInputParameters = conformancePackInputParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-excludedaccounts
     * 
     */
    @JsonIgnore
    public List<CharSequence> getExcludedAccounts() {
        return excludedAccounts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-excludedaccounts
     * 
     */
    @JsonIgnore
    public void setExcludedAccounts(List<CharSequence> excludedAccounts) {
        this.excludedAccounts = excludedAccounts;
    }

    public OrganizationConformancePack withExcludedAccounts(List<CharSequence> excludedAccounts) {
        this.excludedAccounts = excludedAccounts;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("organizationConformancePackName", organizationConformancePackName).append("templateS3Uri", templateS3Uri).append("templateBody", templateBody).append("deliveryS3Bucket", deliveryS3Bucket).append("deliveryS3KeyPrefix", deliveryS3KeyPrefix).append("conformancePackInputParameters", conformancePackInputParameters).append("excludedAccounts", excludedAccounts).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(organizationConformancePackName).append(excludedAccounts).append(templateBody).append(templateS3Uri).append(deliveryS3Bucket).append(conformancePackInputParameters).append(deliveryS3KeyPrefix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationConformancePack) == false) {
            return false;
        }
        OrganizationConformancePack rhs = ((OrganizationConformancePack) other);
        return new EqualsBuilder().append(organizationConformancePackName, rhs.organizationConformancePackName).append(excludedAccounts, rhs.excludedAccounts).append(templateBody, rhs.templateBody).append(templateS3Uri, rhs.templateS3Uri).append(deliveryS3Bucket, rhs.deliveryS3Bucket).append(conformancePackInputParameters, rhs.conformancePackInputParameters).append(deliveryS3KeyPrefix, rhs.deliveryS3KeyPrefix).isEquals();
    }

}
