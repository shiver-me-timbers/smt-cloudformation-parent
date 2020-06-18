
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
 * ConformancePack
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ConformancePackName",
    "DeliveryS3Bucket",
    "DeliveryS3KeyPrefix",
    "TemplateBody",
    "TemplateS3Uri",
    "ConformancePackInputParameters"
})
public class ConformancePack {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackname
     * 
     */
    @JsonProperty("ConformancePackName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackname")
    private CharSequence conformancePackName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3bucket
     * 
     */
    @JsonProperty("DeliveryS3Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3bucket")
    private CharSequence deliveryS3Bucket;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3keyprefix
     * 
     */
    @JsonProperty("DeliveryS3KeyPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3keyprefix")
    private CharSequence deliveryS3KeyPrefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatebody
     * 
     */
    @JsonProperty("TemplateBody")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatebody")
    private CharSequence templateBody;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templates3uri
     * 
     */
    @JsonProperty("TemplateS3Uri")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templates3uri")
    private CharSequence templateS3Uri;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters
     * 
     */
    @JsonProperty("ConformancePackInputParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters")
    private List<Property<ConformancePackConformancePackInputParameter>> conformancePackInputParameters = new ArrayList<Property<ConformancePackConformancePackInputParameter>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackname
     * 
     */
    @JsonIgnore
    public CharSequence getConformancePackName() {
        return conformancePackName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackname
     * 
     */
    @JsonIgnore
    public void setConformancePackName(CharSequence conformancePackName) {
        this.conformancePackName = conformancePackName;
    }

    public ConformancePack withConformancePackName(CharSequence conformancePackName) {
        this.conformancePackName = conformancePackName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3bucket
     * 
     */
    @JsonIgnore
    public CharSequence getDeliveryS3Bucket() {
        return deliveryS3Bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3bucket
     * 
     */
    @JsonIgnore
    public void setDeliveryS3Bucket(CharSequence deliveryS3Bucket) {
        this.deliveryS3Bucket = deliveryS3Bucket;
    }

    public ConformancePack withDeliveryS3Bucket(CharSequence deliveryS3Bucket) {
        this.deliveryS3Bucket = deliveryS3Bucket;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3keyprefix
     * 
     */
    @JsonIgnore
    public CharSequence getDeliveryS3KeyPrefix() {
        return deliveryS3KeyPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3keyprefix
     * 
     */
    @JsonIgnore
    public void setDeliveryS3KeyPrefix(CharSequence deliveryS3KeyPrefix) {
        this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
    }

    public ConformancePack withDeliveryS3KeyPrefix(CharSequence deliveryS3KeyPrefix) {
        this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatebody
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateBody() {
        return templateBody;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatebody
     * 
     */
    @JsonIgnore
    public void setTemplateBody(CharSequence templateBody) {
        this.templateBody = templateBody;
    }

    public ConformancePack withTemplateBody(CharSequence templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templates3uri
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateS3Uri() {
        return templateS3Uri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templates3uri
     * 
     */
    @JsonIgnore
    public void setTemplateS3Uri(CharSequence templateS3Uri) {
        this.templateS3Uri = templateS3Uri;
    }

    public ConformancePack withTemplateS3Uri(CharSequence templateS3Uri) {
        this.templateS3Uri = templateS3Uri;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters
     * 
     */
    @JsonIgnore
    public List<Property<ConformancePackConformancePackInputParameter>> getConformancePackInputParameters() {
        return conformancePackInputParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters
     * 
     */
    @JsonIgnore
    public void setConformancePackInputParameters(List<Property<ConformancePackConformancePackInputParameter>> conformancePackInputParameters) {
        this.conformancePackInputParameters = conformancePackInputParameters;
    }

    public ConformancePack withConformancePackInputParameters(List<Property<ConformancePackConformancePackInputParameter>> conformancePackInputParameters) {
        this.conformancePackInputParameters = conformancePackInputParameters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("conformancePackName", conformancePackName).append("deliveryS3Bucket", deliveryS3Bucket).append("deliveryS3KeyPrefix", deliveryS3KeyPrefix).append("templateBody", templateBody).append("templateS3Uri", templateS3Uri).append("conformancePackInputParameters", conformancePackInputParameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(conformancePackName).append(templateBody).append(deliveryS3Bucket).append(templateS3Uri).append(conformancePackInputParameters).append(deliveryS3KeyPrefix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConformancePack) == false) {
            return false;
        }
        ConformancePack rhs = ((ConformancePack) other);
        return new EqualsBuilder().append(conformancePackName, rhs.conformancePackName).append(templateBody, rhs.templateBody).append(deliveryS3Bucket, rhs.deliveryS3Bucket).append(templateS3Uri, rhs.templateS3Uri).append(conformancePackInputParameters, rhs.conformancePackInputParameters).append(deliveryS3KeyPrefix, rhs.deliveryS3KeyPrefix).isEquals();
    }

}
