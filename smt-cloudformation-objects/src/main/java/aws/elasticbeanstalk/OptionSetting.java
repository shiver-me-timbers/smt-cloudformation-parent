
package aws.elasticbeanstalk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * OptionSetting
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Namespace",
    "OptionName",
    "ResourceName",
    "Value"
})
public class OptionSetting {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-namespace
     * 
     */
    @JsonProperty("Namespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-namespace")
    private CharSequence namespace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-optionname
     * 
     */
    @JsonProperty("OptionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-optionname")
    private CharSequence optionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-elasticbeanstalk-environment-optionsetting-resourcename
     * 
     */
    @JsonProperty("ResourceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-elasticbeanstalk-environment-optionsetting-resourcename")
    private CharSequence resourceName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-value")
    private CharSequence value;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-namespace
     * 
     */
    public CharSequence getNamespace() {
        return namespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-namespace
     * 
     */
    public void setNamespace(CharSequence namespace) {
        this.namespace = namespace;
    }

    public OptionSetting withNamespace(CharSequence namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-optionname
     * 
     */
    public CharSequence getOptionName() {
        return optionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-optionname
     * 
     */
    public void setOptionName(CharSequence optionName) {
        this.optionName = optionName;
    }

    public OptionSetting withOptionName(CharSequence optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-elasticbeanstalk-environment-optionsetting-resourcename
     * 
     */
    public CharSequence getResourceName() {
        return resourceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-elasticbeanstalk-environment-optionsetting-resourcename
     * 
     */
    public void setResourceName(CharSequence resourceName) {
        this.resourceName = resourceName;
    }

    public OptionSetting withResourceName(CharSequence resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-value
     * 
     */
    public CharSequence getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-value
     * 
     */
    public void setValue(CharSequence value) {
        this.value = value;
    }

    public OptionSetting withValue(CharSequence value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("namespace", namespace).append("optionName", optionName).append("resourceName", resourceName).append("value", value).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(namespace).append(resourceName).append(optionName).append(value).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OptionSetting) == false) {
            return false;
        }
        OptionSetting rhs = ((OptionSetting) other);
        return new EqualsBuilder().append(namespace, rhs.namespace).append(resourceName, rhs.resourceName).append(optionName, rhs.optionName).append(value, rhs.value).isEquals();
    }

}
