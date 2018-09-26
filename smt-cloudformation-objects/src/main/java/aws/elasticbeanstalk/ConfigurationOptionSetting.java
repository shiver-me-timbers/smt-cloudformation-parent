
package aws.elasticbeanstalk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ConfigurationOptionSetting
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Namespace",
    "OptionName",
    "ResourceName",
    "Value"
})
public class ConfigurationOptionSetting {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-namespace
     * 
     */
    @JsonProperty("Namespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-namespace")
    private CharSequence namespace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-optionname
     * 
     */
    @JsonProperty("OptionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-optionname")
    private CharSequence optionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-resourcename
     * 
     */
    @JsonProperty("ResourceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-resourcename")
    private CharSequence resourceName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-value")
    private CharSequence value;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-namespace
     * 
     */
    public CharSequence getNamespace() {
        return namespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-namespace
     * 
     */
    public void setNamespace(CharSequence namespace) {
        this.namespace = namespace;
    }

    public ConfigurationOptionSetting withNamespace(CharSequence namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-optionname
     * 
     */
    public CharSequence getOptionName() {
        return optionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-optionname
     * 
     */
    public void setOptionName(CharSequence optionName) {
        this.optionName = optionName;
    }

    public ConfigurationOptionSetting withOptionName(CharSequence optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-resourcename
     * 
     */
    public CharSequence getResourceName() {
        return resourceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-resourcename
     * 
     */
    public void setResourceName(CharSequence resourceName) {
        this.resourceName = resourceName;
    }

    public ConfigurationOptionSetting withResourceName(CharSequence resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-value
     * 
     */
    public CharSequence getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-value
     * 
     */
    public void setValue(CharSequence value) {
        this.value = value;
    }

    public ConfigurationOptionSetting withValue(CharSequence value) {
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
        if ((other instanceof ConfigurationOptionSetting) == false) {
            return false;
        }
        ConfigurationOptionSetting rhs = ((ConfigurationOptionSetting) other);
        return new EqualsBuilder().append(namespace, rhs.namespace).append(resourceName, rhs.resourceName).append(optionName, rhs.optionName).append(value, rhs.value).isEquals();
    }

}
