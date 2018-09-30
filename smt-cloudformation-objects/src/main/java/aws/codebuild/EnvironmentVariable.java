
package aws.codebuild;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EnvironmentVariable
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Value",
    "Name"
})
public class EnvironmentVariable {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-value")
    private CharSequence value;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public EnvironmentVariable withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-value
     * 
     */
    public CharSequence getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-value
     * 
     */
    public void setValue(CharSequence value) {
        this.value = value;
    }

    public EnvironmentVariable withValue(CharSequence value) {
        this.value = value;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public EnvironmentVariable withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("value", value).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(type).append(value).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnvironmentVariable) == false) {
            return false;
        }
        EnvironmentVariable rhs = ((EnvironmentVariable) other);
        return new EqualsBuilder().append(name, rhs.name).append(type, rhs.type).append(value, rhs.value).isEquals();
    }

}
