
package aws.iam;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ServiceLinkedRole
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CustomSuffix",
    "Description",
    "AWSServiceName"
})
public class ServiceLinkedRole {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-customsuffix
     * 
     */
    @JsonProperty("CustomSuffix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-customsuffix")
    private CharSequence customSuffix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-awsservicename
     * 
     */
    @JsonProperty("AWSServiceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-awsservicename")
    private CharSequence aWSServiceName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-customsuffix
     * 
     */
    public CharSequence getCustomSuffix() {
        return customSuffix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-customsuffix
     * 
     */
    public void setCustomSuffix(CharSequence customSuffix) {
        this.customSuffix = customSuffix;
    }

    public ServiceLinkedRole withCustomSuffix(CharSequence customSuffix) {
        this.customSuffix = customSuffix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ServiceLinkedRole withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-awsservicename
     * 
     */
    public CharSequence getAWSServiceName() {
        return aWSServiceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-awsservicename
     * 
     */
    public void setAWSServiceName(CharSequence aWSServiceName) {
        this.aWSServiceName = aWSServiceName;
    }

    public ServiceLinkedRole withAWSServiceName(CharSequence aWSServiceName) {
        this.aWSServiceName = aWSServiceName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customSuffix", customSuffix).append("description", description).append("aWSServiceName", aWSServiceName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(aWSServiceName).append(customSuffix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceLinkedRole) == false) {
            return false;
        }
        ServiceLinkedRole rhs = ((ServiceLinkedRole) other);
        return new EqualsBuilder().append(description, rhs.description).append(aWSServiceName, rhs.aWSServiceName).append(customSuffix, rhs.customSuffix).isEquals();
    }

}
