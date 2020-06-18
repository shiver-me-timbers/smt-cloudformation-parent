
package shiver.me.timbers.aws.pinpoint;

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
 * PushTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GCM",
    "Baidu",
    "TemplateName",
    "ADM",
    "APNS",
    "TemplateDescription",
    "DefaultSubstitutions",
    "Default",
    "Tags"
})
public class PushTemplate {

    /**
     * PushTemplateAndroidPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html
     * 
     */
    @JsonProperty("GCM")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html")
    private Property<shiver.me.timbers.aws.pinpoint.PushTemplateAndroidPushNotificationTemplate> gCM;
    /**
     * PushTemplateAndroidPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html
     * 
     */
    @JsonProperty("Baidu")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html")
    private Property<shiver.me.timbers.aws.pinpoint.PushTemplateAndroidPushNotificationTemplate> baidu;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatename
     * 
     */
    @JsonProperty("TemplateName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatename")
    private CharSequence templateName;
    /**
     * PushTemplateAndroidPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html
     * 
     */
    @JsonProperty("ADM")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html")
    private Property<shiver.me.timbers.aws.pinpoint.PushTemplateAndroidPushNotificationTemplate> aDM;
    /**
     * PushTemplateAPNSPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html
     * 
     */
    @JsonProperty("APNS")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html")
    private Property<PushTemplateAPNSPushNotificationTemplate> aPNS;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatedescription
     * 
     */
    @JsonProperty("TemplateDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatedescription")
    private CharSequence templateDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-defaultsubstitutions
     * 
     */
    @JsonProperty("DefaultSubstitutions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-defaultsubstitutions")
    private CharSequence defaultSubstitutions;
    /**
     * PushTemplateDefaultPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html
     * 
     */
    @JsonProperty("Default")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html")
    private Property<PushTemplateDefaultPushNotificationTemplate> _default;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-tags")
    private Object tags;

    /**
     * PushTemplateAndroidPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.pinpoint.PushTemplateAndroidPushNotificationTemplate> getGCM() {
        return gCM;
    }

    /**
     * PushTemplateAndroidPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html
     * 
     */
    @JsonIgnore
    public void setGCM(Property<shiver.me.timbers.aws.pinpoint.PushTemplateAndroidPushNotificationTemplate> gCM) {
        this.gCM = gCM;
    }

    public PushTemplate withGCM(Property<shiver.me.timbers.aws.pinpoint.PushTemplateAndroidPushNotificationTemplate> gCM) {
        this.gCM = gCM;
        return this;
    }

    /**
     * PushTemplateAndroidPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.pinpoint.PushTemplateAndroidPushNotificationTemplate> getBaidu() {
        return baidu;
    }

    /**
     * PushTemplateAndroidPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html
     * 
     */
    @JsonIgnore
    public void setBaidu(Property<shiver.me.timbers.aws.pinpoint.PushTemplateAndroidPushNotificationTemplate> baidu) {
        this.baidu = baidu;
    }

    public PushTemplate withBaidu(Property<shiver.me.timbers.aws.pinpoint.PushTemplateAndroidPushNotificationTemplate> baidu) {
        this.baidu = baidu;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatename
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateName() {
        return templateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatename
     * 
     */
    @JsonIgnore
    public void setTemplateName(CharSequence templateName) {
        this.templateName = templateName;
    }

    public PushTemplate withTemplateName(CharSequence templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * PushTemplateAndroidPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.pinpoint.PushTemplateAndroidPushNotificationTemplate> getADM() {
        return aDM;
    }

    /**
     * PushTemplateAndroidPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html
     * 
     */
    @JsonIgnore
    public void setADM(Property<shiver.me.timbers.aws.pinpoint.PushTemplateAndroidPushNotificationTemplate> aDM) {
        this.aDM = aDM;
    }

    public PushTemplate withADM(Property<shiver.me.timbers.aws.pinpoint.PushTemplateAndroidPushNotificationTemplate> aDM) {
        this.aDM = aDM;
        return this;
    }

    /**
     * PushTemplateAPNSPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html
     * 
     */
    @JsonIgnore
    public Property<PushTemplateAPNSPushNotificationTemplate> getAPNS() {
        return aPNS;
    }

    /**
     * PushTemplateAPNSPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html
     * 
     */
    @JsonIgnore
    public void setAPNS(Property<PushTemplateAPNSPushNotificationTemplate> aPNS) {
        this.aPNS = aPNS;
    }

    public PushTemplate withAPNS(Property<PushTemplateAPNSPushNotificationTemplate> aPNS) {
        this.aPNS = aPNS;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatedescription
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateDescription() {
        return templateDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatedescription
     * 
     */
    @JsonIgnore
    public void setTemplateDescription(CharSequence templateDescription) {
        this.templateDescription = templateDescription;
    }

    public PushTemplate withTemplateDescription(CharSequence templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-defaultsubstitutions
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultSubstitutions() {
        return defaultSubstitutions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-defaultsubstitutions
     * 
     */
    @JsonIgnore
    public void setDefaultSubstitutions(CharSequence defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
    }

    public PushTemplate withDefaultSubstitutions(CharSequence defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
        return this;
    }

    /**
     * PushTemplateDefaultPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html
     * 
     */
    @JsonIgnore
    public Property<PushTemplateDefaultPushNotificationTemplate> getDefault() {
        return _default;
    }

    /**
     * PushTemplateDefaultPushNotificationTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html
     * 
     */
    @JsonIgnore
    public void setDefault(Property<PushTemplateDefaultPushNotificationTemplate> _default) {
        this._default = _default;
    }

    public PushTemplate withDefault(Property<PushTemplateDefaultPushNotificationTemplate> _default) {
        this._default = _default;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public PushTemplate withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("gCM", gCM).append("baidu", baidu).append("templateName", templateName).append("aDM", aDM).append("aPNS", aPNS).append("templateDescription", templateDescription).append("defaultSubstitutions", defaultSubstitutions).append("_default", _default).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(gCM).append(_default).append(templateName).append(templateDescription).append(baidu).append(aPNS).append(aDM).append(defaultSubstitutions).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PushTemplate) == false) {
            return false;
        }
        PushTemplate rhs = ((PushTemplate) other);
        return new EqualsBuilder().append(gCM, rhs.gCM).append(_default, rhs._default).append(templateName, rhs.templateName).append(templateDescription, rhs.templateDescription).append(baidu, rhs.baidu).append(aPNS, rhs.aPNS).append(aDM, rhs.aDM).append(defaultSubstitutions, rhs.defaultSubstitutions).append(tags, rhs.tags).isEquals();
    }

}
