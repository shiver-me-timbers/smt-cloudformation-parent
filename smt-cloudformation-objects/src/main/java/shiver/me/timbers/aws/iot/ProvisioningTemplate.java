
package shiver.me.timbers.aws.iot;

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
 * ProvisioningTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TemplateName",
    "Description",
    "Enabled",
    "ProvisioningRoleArn",
    "TemplateBody",
    "PreProvisioningHook",
    "Tags"
})
public class ProvisioningTemplate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatename
     * 
     */
    @JsonProperty("TemplateName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatename")
    private CharSequence templateName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-enabled")
    private CharSequence enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-provisioningrolearn
     * 
     */
    @JsonProperty("ProvisioningRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-provisioningrolearn")
    private CharSequence provisioningRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatebody
     * 
     */
    @JsonProperty("TemplateBody")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatebody")
    private CharSequence templateBody;
    /**
     * ProvisioningTemplateProvisioningHook
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html
     * 
     */
    @JsonProperty("PreProvisioningHook")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html")
    private Property<ProvisioningTemplateProvisioningHook> preProvisioningHook;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-tags")
    private List<Object> tags = new ArrayList<Object>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatename
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateName() {
        return templateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatename
     * 
     */
    @JsonIgnore
    public void setTemplateName(CharSequence templateName) {
        this.templateName = templateName;
    }

    public ProvisioningTemplate withTemplateName(CharSequence templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ProvisioningTemplate withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-enabled
     * 
     */
    @JsonIgnore
    public CharSequence getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-enabled
     * 
     */
    @JsonIgnore
    public void setEnabled(CharSequence enabled) {
        this.enabled = enabled;
    }

    public ProvisioningTemplate withEnabled(CharSequence enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-provisioningrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getProvisioningRoleArn() {
        return provisioningRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-provisioningrolearn
     * 
     */
    @JsonIgnore
    public void setProvisioningRoleArn(CharSequence provisioningRoleArn) {
        this.provisioningRoleArn = provisioningRoleArn;
    }

    public ProvisioningTemplate withProvisioningRoleArn(CharSequence provisioningRoleArn) {
        this.provisioningRoleArn = provisioningRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatebody
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateBody() {
        return templateBody;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-templatebody
     * 
     */
    @JsonIgnore
    public void setTemplateBody(CharSequence templateBody) {
        this.templateBody = templateBody;
    }

    public ProvisioningTemplate withTemplateBody(CharSequence templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * ProvisioningTemplateProvisioningHook
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html
     * 
     */
    @JsonIgnore
    public Property<ProvisioningTemplateProvisioningHook> getPreProvisioningHook() {
        return preProvisioningHook;
    }

    /**
     * ProvisioningTemplateProvisioningHook
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html
     * 
     */
    @JsonIgnore
    public void setPreProvisioningHook(Property<ProvisioningTemplateProvisioningHook> preProvisioningHook) {
        this.preProvisioningHook = preProvisioningHook;
    }

    public ProvisioningTemplate withPreProvisioningHook(Property<ProvisioningTemplateProvisioningHook> preProvisioningHook) {
        this.preProvisioningHook = preProvisioningHook;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-tags
     * 
     */
    @JsonIgnore
    public List<Object> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html#cfn-iot-provisioningtemplate-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public ProvisioningTemplate withTags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("templateName", templateName).append("description", description).append("enabled", enabled).append("provisioningRoleArn", provisioningRoleArn).append("templateBody", templateBody).append("preProvisioningHook", preProvisioningHook).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(provisioningRoleArn).append(preProvisioningHook).append(templateName).append(templateBody).append(description).append(enabled).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProvisioningTemplate) == false) {
            return false;
        }
        ProvisioningTemplate rhs = ((ProvisioningTemplate) other);
        return new EqualsBuilder().append(provisioningRoleArn, rhs.provisioningRoleArn).append(preProvisioningHook, rhs.preProvisioningHook).append(templateName, rhs.templateName).append(templateBody, rhs.templateBody).append(description, rhs.description).append(enabled, rhs.enabled).append(tags, rhs.tags).isEquals();
    }

}
