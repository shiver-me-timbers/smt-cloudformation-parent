
package shiver.me.timbers.aws.cloudformation;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * Stack
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NotificationARNs",
    "Parameters",
    "Tags",
    "TemplateURL",
    "TimeoutInMinutes"
})
public class Stack {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-notificationarns
     * 
     */
    @JsonProperty("NotificationARNs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-notificationarns")
    private Set<CharSequence> notificationARNs = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-parameters")
    private Map<String, CharSequence> parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-templateurl
     * 
     */
    @JsonProperty("TemplateURL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-templateurl")
    private CharSequence templateURL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-timeoutinminutes
     * 
     */
    @JsonProperty("TimeoutInMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-timeoutinminutes")
    private Number timeoutInMinutes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-notificationarns
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getNotificationARNs() {
        return notificationARNs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-notificationarns
     * 
     */
    @JsonIgnore
    public void setNotificationARNs(Set<CharSequence> notificationARNs) {
        this.notificationARNs = notificationARNs;
    }

    public Stack withNotificationARNs(Set<CharSequence> notificationARNs) {
        this.notificationARNs = notificationARNs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-parameters
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-parameters
     * 
     */
    @JsonIgnore
    public void setParameters(Map<String, CharSequence> parameters) {
        this.parameters = parameters;
    }

    public Stack withParameters(Map<String, CharSequence> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Stack withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-templateurl
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateURL() {
        return templateURL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-templateurl
     * 
     */
    @JsonIgnore
    public void setTemplateURL(CharSequence templateURL) {
        this.templateURL = templateURL;
    }

    public Stack withTemplateURL(CharSequence templateURL) {
        this.templateURL = templateURL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-timeoutinminutes
     * 
     */
    @JsonIgnore
    public Number getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-timeoutinminutes
     * 
     */
    @JsonIgnore
    public void setTimeoutInMinutes(Number timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    public Stack withTimeoutInMinutes(Number timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("notificationARNs", notificationARNs).append("parameters", parameters).append("tags", tags).append("templateURL", templateURL).append("timeoutInMinutes", timeoutInMinutes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timeoutInMinutes).append(notificationARNs).append(parameters).append(tags).append(templateURL).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stack) == false) {
            return false;
        }
        Stack rhs = ((Stack) other);
        return new EqualsBuilder().append(timeoutInMinutes, rhs.timeoutInMinutes).append(notificationARNs, rhs.notificationARNs).append(parameters, rhs.parameters).append(tags, rhs.tags).append(templateURL, rhs.templateURL).isEquals();
    }

}
